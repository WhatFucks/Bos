<template>
  <div class="app-container">
    <div class="filter-container">
      录入人姓名：<el-input v-model="listQuery.businessnoticeno" placeholder="请输入录入人姓名" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      工作单号：<el-input v-model="listQuery.customcode" placeholder="请输入工作单号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">查询</el-button>
    </div>
    <div>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-circle-plus-outline" @click="handleCreate">添加</el-button>
    </div>
    <el-table :data="list" style="width: 100%"> <!--sortable="custom"-->
      <el-table-column label="序号" align="center" type="index" width="50px" prop="id"></el-table-column>
      <el-table-column label="工作单ID" align="center" prop="workorderid" width="110px"></el-table-column>
      <el-table-column label="工作单号" align="center" prop="worksheetno" width="100px"></el-table-column>
      <el-table-column label="工作单类型" align="center" prop="workordertype" width="100px" :formatter="workordertypes"></el-table-column>
      <el-table-column label="签收类型" align="center" prop="signtype" width="100px" :formatter="signtypes"></el-table-column>
      <el-table-column label="录入单位" align="center" prop="inputid" width="120px" :formatter="inputids"></el-table-column>
      <el-table-column label="录入人编码" align="center" prop="inputpersoncode" width="110px"></el-table-column>
      <el-table-column label="录入人姓名" align="center" prop="inputpersonid" width="100px" :formatter="inputpersonids"></el-table-column>
      <el-table-column label="签收人" align="center" prop="recipient"width="100px"></el-table-column>
      <el-table-column label="派送员工姓名" align="center" prop="couriername"width="105px"></el-table-column>
      <el-table-column label="编辑" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">修改</el-button>
          <el-button type="primary" size="mini" @click="handleSelect(row)">详情</el-button>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-width="120px" style="width: 700px; margin-left:0px; height: 200px">
        <el-col :span="8"><el-form-item label="工作单号:"><el-input  v-model="temp.workorderid"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="工作单类型:">
          <el-select v-model="temp.workordertype" placeholder="请选择">
            <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="8"><el-form-item label="签收类型:">
          <el-select v-model="temp.signtype" placeholder="请选择">
            <el-option v-for="item in signtypeAll" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="8"><el-form-item label="签收人:"><el-input  v-model="temp.recipient"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="派送员工号:"><el-input  v-model="temp.courierint"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="派送员名称:"><el-input  v-model="temp.couriername"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="录入人:">
          <el-select v-model="temp.inputpersonid" placeholder="请选择">
            <el-option v-for="item in lururen" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="10"><el-form-item label="录入单位:">
          <el-select v-model="temp.inputid" placeholder="请选择">
            <el-option v-for="item in lurudanwei" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">确认</el-button>
      </div>
    </el-dialog>
    <el-dialog :title="title" :visible.sync="dialogFormVisibles">
      <el-form ref="dataForms" :rules="rules" :model="temp" label-width="120px" style="width: 700px; margin-left:0px; height: 200px">
        <el-col :span="8"><el-form-item label="工作单号:"><el-input  v-model="temp.workorderid"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="工作单类型:">
          <el-select v-model="temp.workordertype" placeholder="请选择">
            <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="8"><el-form-item label="签收类型:">
          <el-select v-model="temp.signtype" placeholder="请选择">
            <el-option v-for="item in lururen" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="8"><el-form-item label="签收人:"><el-input  v-model="temp.recipient"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="派送员工号:"><el-input  v-model="temp.courierint"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="派送员名称:"><el-input  v-model="temp.couriername"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="录入人:">
          <el-select v-model="temp.inputpersonid" placeholder="请选择">
            <el-option v-for="item in lururen" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="10"><el-form-item label="录入单位:">
          <el-select v-model="temp.inputid" placeholder="请选择">
            <el-option v-for="item in lurudanwei" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
      </el-form>
    </el-dialog>
  </div>
</template>

<script>
  import { list,add,update } from '@/api/dis/workordersign'
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
        options: [{value: 1, label: '返单'},{value: 2, label: '调单'},{value: 3, label: '正常单据'}],
        signtypeAll: [{value: 1, label: '正常签收'},{value: 2, label: '反向签收'}],
        lururen: [{value: 1, label: 'admin'},{value: 2, label: 'liming'}],
        lurudanwei: [{value: 1, label: '长沙分公司'},{value: 2, label: '天心区分公司'},{value: 3, label: '岳麓分公司'},],
        value: '',
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
        },
        temp: {
          workorderid: '',
          workordertype: '',
          signtype:'',
          recipient: '',
          courierint: '',
          couriername:'',
          inputpersonid: '',
          inputid:'',
        },
        dialogFormVisible: false,
        dialogFormVisibles: false,
        dialogStatus: '',
        title:'',
      }
    },
    created() {
      this.getList()
    },
    methods: {
      // 重置部门表单数据
      resetuser() {
        this.temp = {
          workorderid: '',
          workordertype: '',
          signtype:'',
          recipient: '',
          courierint: '',
          couriername:'',
          inputpersonid: '',
          inputid:'',
        }
      },
      // 新增按钮
      handleCreate() {
        this.resetuser()
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.title='添加'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 添加对话框里，点击确定，执行添加操作
      createData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.temp.createBy=getToken()
            add(this.temp).then((response) => {
              if(response.data.title=='成功'){
                this.list.unshift(this.temp)
                this.dialogFormVisible = false
                this.getList()
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
      // 修改
      handleUpdate(row){
        this.temp =  Object.assign({}, row) // copy obj
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title='修改'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 修改对话框里，点击确定，执行添加操作
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            tempData.lastUpdateBy=getToken()
            update(tempData).then((response) => {
              if(response.data.title=='成功'){
                this.dialogFormVisible = false
                this.getList()
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
      // 详情
      handleSelect(row){
        this.temp =  Object.assign({}, row) // copy obj
        this.dialogFormVisibles = true
        this.title='详情'
        this.$nextTick(() => {
          this.$refs['dataForms'].clearValidate()
        })
      },
      //  =返单2=调单 3=正常单据
      workordertypes(row, column){
        switch(row.workordertype){
          case 1:return '返单';break;
          case 2:return '调单';break;
          case 3:return '正常单据';break;
          default:return '未知';
        }
      },
      // 签收类型
      signtypes(row,column){
        switch(row.signtype){
          case 1:return '正常签收';break;
          default:return '反向签收';
        }
      },
      // 录入单位
      inputids(row,column){
        switch(row.inputid){
          case 1:return '长沙分公司';break;
          case 2:return '天心区分公司';break;
          case 3:return '岳麓区分公司';break;
          default:return 'BosXt';
        }
      },
      // 录入人姓名
      inputpersonids(val){
        if(val.inputpersonid=1){return "admin"}
        else{return "lm"}
      },
      // 查询所有
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          console.debug(response)
          this.list = response.data.items
          this.total = response.data.total
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
      }
    }
  }
</script>
