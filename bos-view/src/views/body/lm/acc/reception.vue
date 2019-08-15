<template>
  <div class="app-container">
    <div class="filter-container">
      业务通知单号：<el-input v-model="listQuery.BusinessNoticeNo" placeholder="业务通知单号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      客户编号：<el-input v-model="listQuery.CustomCode" placeholder="客户编号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">查询</el-button>
    </div>
    <div class="filter-container">
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-circle-plus-outline" @click="handleCreate">新单</el-button>
    </div>

    <el-table :data="list" style="width: 100%"> <!--sortable="custom"-->
      <el-table-column label="编号" align="center" type="index" width="50px" prop="id"></el-table-column>
      <el-table-column label="业务通知单号" align="center" prop="businessnoticeno" width="110px"></el-table-column>
      <el-table-column label="客户编号" align="center" prop="customcode" width="80px"></el-table-column>
      <el-table-column label="客户名称" align="center" prop="customname" width="85px"></el-table-column>
      <el-table-column label="联系人" align="center" prop="linkman" width="65px"></el-table-column>
      <el-table-column label="电话" align="center" prop="telphone" width="110px"></el-table-column>
      <el-table-column label="取件地址" align="center" prop="pickupaddress" width="180px"></el-table-column>
      <el-table-column label="取件城市" align="center" prop="pickupcity" width="80px"></el-table-column>
      <el-table-column label="到达城市" align="center" prop="arrivecity" width="80px"></el-table-column>
      <el-table-column label="品名" align="center" prop="productname" width="100px"></el-table-column>
      <el-table-column label="预约取件时间" align="center" prop="repickuptime"></el-table-column>
      <el-table-column label="编辑" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="ChaseSingle(row)">追单</el-button>
          <el-button type="primary" size="mini" @click="UpdateSingle(row)">改单</el-button>
          <el-button   size="mini" type="danger" @click="MeltSingle(row)">销单</el-button>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="center" label-width="120px" style="width: 735px; height: 300px">
        <el-col :span="12"><el-form-item label="业务通知单号:"><el-input  v-model="temp.businessnoticeno" id="businessnoticeno"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item label="电话:"><el-input  v-model="temp.telphone" @change="selectTel(temp.telphone)" ></el-input></el-form-item></el-col>
        <el-col :span="7"><el-form-item label="客户编号:"><el-input  v-model="temp.customcode"></el-input></el-form-item></el-col>
        <el-col :span="9"><el-form-item label="客户名称:"><el-input  v-model="temp.customname"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="联系人:"><el-input  v-model="temp.linkman"></el-input></el-form-item></el-col>
        <el-col :span="24"><el-form-item label="取件地址:">
          <el-select v-model="temp.pickupaddress" placeholder="请选择" style="width: 600px">
            <el-option v-for="item in adds" :key="item.value" :label="item.label" :value="item.value" :disabled="item.disabled"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="8"><el-form-item label="取件城市:">
          <el-select v-model="temp.pickupcity" placeholder="请选择">
            <el-option v-for="item in qjAdds" :key="item.value" :label="item.label" :value="item.value" :disabled="item.disabled"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="8"><el-form-item label="到达城市:">
          <el-select v-model="temp.arrivecity" placeholder="请选择">
            <el-option v-for="item in sjAdds" :key="item.value" :label="item.label" :value="item.value" :disabled="item.disabled"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="8"><el-form-item label="产品:">
          <el-select v-model="temp.product" placeholder="请选择">
            <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value" :disabled="item.disabled"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="12"><el-form-item label="品名:">
          <el-select v-model="temp.productname" placeholder="请选择">
            <el-option v-for="item in productnames" :key="item.value" :label="item.label" :value="item.value" :disabled="item.disabled"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="12"><el-form-item label="重量:"><el-input  v-model="temp.weight"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item label="体积:"><el-input  v-model="temp.volume"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item label="备注:"><el-input  v-model="temp.importanthints"></el-input></el-form-item></el-col>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">确认</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { list, add, ChaseSingle, UpdateSingle,MeltSingle,ByTelSelect} from '@/api/acc/reception'
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination
  import { getToken } from '@/utils/auth'

  export default {
    name: 'Reception',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        options: [{value: '手机', label: '手机'}, {value: '电脑', label: '电脑'}, {value: '饮料', label: '饮料'}, {value: '零食', label: '零食'}, {value: '服装', label: '服装'}],
        adds:[{value: '湖南省长沙市岳麓区枫林三路罗马国际公寓', label: '湖南省长沙市岳麓区枫林三路罗马国际公寓'},{value: '湖南省邵阳市双清区教育局10086号', label: '湖南省邵阳市双清区教育局10086号'},{value: '湖南省郑州市五道口职业技术学院', label: '湖南省郑州市五道口职业技术学院'}],
        qjAdds: [{value: '长沙市', label: '长沙市'},{value: '岳阳市', label: '岳阳市'},{value: '衡阳市', label: '衡阳市'},{value: '邵阳市', label: '邵阳市'},{value: '株洲市', label: '株洲市'}],
        sjAdds: [{value: '长沙市', label: '长沙市'},{value: '岳阳市', label: '岳阳市'},{value: '衡阳市', label: '衡阳市'},{value: '邵阳市', label: '邵阳市'},{value: '株洲市', label: '株洲市'}],
        productnames: [{value: '华为P30', label:'华为P30'},{value: '夏季短袖', label:'夏季短袖'},{value: '哇哈哈矿泉水', label:'哇哈哈矿泉水'},{value: '鼠标碟', label:'鼠标碟'}],
        value: '',
        tableKey: 0,
        list: null,
        total: 0,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 5,
          id: undefined,
          businessnoticeno: '',
        },
        temp: {
          id: undefined,
          businessnoticeno: '',
          customcode: '',
          customname: '',
          linkman: '',
          telphone: '',
          pickupcity: '',
          arrivecity: '',
          repickuptime: '',
          product: '',
          reservationtime: '',
          productname: '',
          weight: '',
          volume: '',
          importanthints: ''
        },
        dialogFormVisible: false,
        dialogStatus: '',
        title:'',
        rules: {
          BusinessNoticeNo: [{ required: true, message: '部门名称不能为空！并且长度为 2-5 位', trigger: 'blur' ,pattern: /^[\u4e00-\u9fa5a-zA-Z-z0-9]{2,5}$/, max: 5 }],
        },
      }
    },
    created() {
      this.getList()
    },
    methods: {
      // 根据电话查询
      selectTel(telphone){
        if(telphone!=null || telphone!=''){
          ByTelSelect(telphone).then(response => {
            this.temp.customcode = response.data.user.userNo
            this.temp.customname = response.data.user.email
            this.temp.linkman = response.data.user.username
          })
        }

      },
      // 查询所有
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          console.debug('最大编号'+response.data.MaxNo)
          this.temp.businessnoticeno = response.data.MaxNo
        })
        this.listLoading = false
      },
      // 查询按钮
      handleFilter() {
        this.listQuery.page = 1
        this.getList()
      },
      // 重置表单数据
      resetAcc() {
        this.temp= {
          id: undefined,
        }
      },
      // 单击添加 按钮
      handleCreate() {
        this.resetAcc()
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.title='添加'
        this.getList()
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 单击添加 确认
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
      // 追单
      ChaseSingle(row) {
        this.temp =  Object.assign({}, row)
        const tempData = Object.assign({},this.temp)
        tempData.lastUpdateBy=getToken()
        console.debug(tempData)
        ChaseSingle(tempData).then((response) => {
          this.$notify({
            title: response.data.title,
            message: response.data.message,
            duration: 2000
          })
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
      },
      // 改单
      UpdateSingle(row){
        this.temp =  Object.assign({}, row) // copy obj
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title='修改'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 改单确认按钮
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            tempData.lastUpdateBy=getToken()
            UpdateSingle(tempData).then((response) => {
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
      }
    }
  }
</script>
