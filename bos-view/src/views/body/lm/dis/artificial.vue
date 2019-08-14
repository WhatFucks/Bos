<template>
  <div class="app-container">
    <div class="filter-container">
      通知单号：<el-input v-model="listQuery.businessnoticeno" placeholder="请输入通知单号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      客户编号：<el-input v-model="listQuery.customcode" placeholder="请输入客户编号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">查询</el-button>
    </div>
    <el-table :data="list" style="width: 100%"> <!--sortable="custom"-->
      <el-table-column label="编号" align="center" type="index" width="50px"></el-table-column>
      <el-table-column label="通知单号" align="center" prop="businessnoticeno" width="110px"></el-table-column>
      <el-table-column label="预约收件时间" align="center" prop="reservationtime" width="85px"></el-table-column>
      <el-table-column label="客户名称" align="center" prop="customname" width="100px"></el-table-column>
      <el-table-column label="取件地址" align="center" prop="pickupaddress" width="100px"></el-table-column>
      <el-table-column label="客户编号" align="center" prop="customcode" width="120px"></el-table-column>
      <el-table-column label="电话" align="center" prop="telphone" width="110px"></el-table-column>
      <el-table-column label="重量" align="center" prop="weight" width="85px"></el-table-column>
      <el-table-column label="体积" align="center" prop="volume"width="85px"></el-table-column>
      <el-table-column label="重要提示	" align="center" prop="importanthints"width="95px" :formatter="ifendcase"></el-table-column>
      <el-table-column label="到达城市	" align="center" prop="arrivecity"width="95px" ></el-table-column>
      <el-table-column label="编辑" align="center" width="230" class-name="small-padding fixed-width" >
        <template slot-scope="{row}">
          <el-button type="info" size="mini" @click="TurnSingle(row)">分配</el-button>
          <el-button type="success" size="mini" @click="SendBack()">退回</el-button>
          <el-button type="info"  size="mini"@click="MeltSingle(row)">销单</el-button>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm"  :model="temp" label-position="left" label-width="80px" style="width: 40%; margin-left:100px;" >
        <el-form-item label="所属单位" prop="deptId">
          <el-select v-model="temp.deptId" placeholder="请选择所属单位">
            <el-option v-for="item in deptList" :key="item.id" :label="item.name" :value="item.id"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="分栋编码" prop="sortingCode">
          <el-select v-model="temp.sortingCode" placeholder="请选择分栋编码">
            <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="affirma">确认</el-button>
      </div>
    </el-dialog>

    <el-dialog :title="title" :visible.sync="dialogForm">
      <el-form ref="dataForms"  :model="temp" label-position="left" label-width="80px" style="width: 40%; margin-left:100px;" >
        <el-form-item label="退回原因" prop="reason">
          <el-input v-model="temp.reason" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="ReasonAffirma">确认</el-button>
      </div>
    </el-dialog>

  </div>
</template>

<script>
  import { list, listarr, ChaseSingle, MeltSingle,affirm,back} from '@/api/dis/artificial'
  import { AllDept} from '@/api/sys/dept'
  import { AllBh} from '@/api/acc/accworkorder'
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination
  import { getToken } from '@/utils/auth'

  export default {
    name: 'Transfer',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        dialogForm: false,
        options: [{value: '1', label: 'FDBM1001'},{value: '2', label: 'FDBM1002'},{value: '3', label: 'FDBM1003'},
          {value: '4', label: 'FDBM1004'},{value: '5', label: 'FDBM1005'},],
        value: '',
        deptList: null,
        SortingCodeList: null,
        coding: true, // 编码
        smallParts: false, // 小件员
        radio: '1',
        tableKey: 0,
        list: null,
        zoneList: null,
        smallPartList: null,
        total: 0,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 5,
          businessnoticeno: '',
          customcode: ''
        },
        temp: {
          deptId: '',
          sortingCode: '',
          tel:'',
          id:'',
          reason: ''
        },
        dialogFormVisible: false,
        DingXiangBianMa: false,
        title:'',
      }
    },
    created() {
      this.getList()
      this.getGroupDept()
      this.getSortingCode()
    },
    methods: {
      // 单选按钮 变化
      changeHandler(value) {
        var v = value;
        console.log('改变之后的值是:' + value)
      },
      // 处理单位
      ifendcase(val){
        if(val.casestatus=1){return "BOSS集团"}
        else if (val.casestatus=2){return "北京分公司"}
        else if (val.casestatus=3){return "上海分公司"}
      },
      // 获取所以的分栋编码
      getSortingCode(){
        AllBh().then((response) =>{
          this.SortingCodeList = response.data.AllFdbm()
        })
      },
      // 获得部门信息
      getGroupDept(){
        AllDept().then((response) => {
          this.deptList = response.data.AllDept
        })
      },
      // 查询所有
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          console.debug(response)
          this.list = response.data.items
          this.total = response.data.total
         /* this.zoneList = response.data.zoneList
          this.smallPartList = response.data.smallPartList*/
        })
        this.listLoading = false
      },
      // 查询按钮
      handleFilter() {
        this.getList()
      },
      // 重置表单数据
      resetAcc() {
        this.temp= {
        }
      },
      // 单击分配按钮
      TurnSingle(row) {
        this.temp.id=row.businessnoticeno
        this.temp.tel=row.telphone
        this.dialogFormVisible = true
        this.title='分配'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      //确认
      affirma(row){
        affirm(this.temp).then((response) => {
          this.$notify({
            title: response.data.title,
            message: response.data.message,
            duration: 2000
          })
          this.dialogFormVisible =false;
        })
      },
      // 点击 退回按钮
      SendBack(row){
        this.dialogForm = true
        this.title='返回'
        this.$nextTick(() => {
          this.$refs['dataForms'].clearValidate()
        })
      },
      // 退回操作
      ReasonAffirma(){
        this.$refs['dataForms'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            tempData.lastUpdateBy=getToken()
            back(tempData).then((response) => {
              if(response.data.title=='成功'){
                this.dialogForm = false
              }
              this.$notify({
                title: response.data.title,
                message: response.data.message,
                duration: 2000
              })
            })
          }
        })
      },
      // 销单
      MeltSingle(row){
        this.temp =  Object.assign({}, row)
        const tempData = Object.assign({},this.temp)
        tempData.lastUpdateBy=getToken()
        MeltSingle(tempData).then((response) => {
          this.getList()
          this.$notify({
            title: response.data.title,
            message: response.data.message,
            duration: 2000
          })
        })
      }
    }
  }
</script>
