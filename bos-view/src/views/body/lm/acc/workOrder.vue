<template>
  <div class="app-container">
    <!--<div class="filter-container">
      工作单号：<el-input v-model="listQuery.workSheetNo" placeholder="工作单号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      客户单号：<el-input v-model="listQuery.wsJobNo" placeholder="客户编号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">查询</el-button>
    </div>-->
    <el-table :data="list" style="width: 100%"> <!--sortable="custom"-->
      <el-table-column label="编号" align="center" type="index" width="50px"></el-table-column>
      <el-table-column label="工作单号" align="center" prop="workSheetNo" width="110px"></el-table-column>
      <el-table-column label="客户单号" align="center" prop="wsJobNo" width="85px"></el-table-column>
      <el-table-column label="产品" align="center" prop="productTime" width="85px"></el-table-column>
      <el-table-column label="到达地" align="center" prop="destination" width="85px"></el-table-column>
      <el-table-column label="业务通知单号" align="center" prop="woBusinessNoticeNo" width="110px"></el-table-column>
      <el-table-column label="取货人工号" align="center" prop="userno" width="100px"></el-table-column>
      <el-table-column label="取货人姓名" align="center" prop="username" width="105px"></el-table-column>
      <el-table-column label="寄件人" align="center" prop="customName" width="85px"></el-table-column>
      <el-table-column label="收件人" align="center" prop="linkman" width="100px"></el-table-column>
      <el-table-column label="取货时间" align="center" prop="woPickupTime" width="155px"></el-table-column>
      <el-table-column label="编辑" align="center"  class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="UpdateSingle(row)">详情</el-button>
          <!--<el-button type="primary" size="mini" @click="ChaseSingle(row)">追单</el-button>
          <el-button   size="mini" type="danger" @click="MeltSingle(row)">销单</el-button>-->
        </template>
      </el-table-column>-
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="center" label-width="120px" style="width: 735px; height: 200px">
        <el-col :span="8"><el-form-item label="工作单号:"><el-input  v-model="temp.workSheetNo"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="客户单号:"><el-input  v-model="temp.wsJobNo" @change="selectTel(temp.telphone)" ></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="产品:"><el-input  v-model="temp.productTime" ></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="到达地:"><el-input  v-model="temp.destination" @change="selectTel(temp.telphone)" ></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="业务通知单号:"><el-input  v-model="temp.woBusinessNoticeNo" ></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="取货人工号:"><el-input  v-model="temp.userno" @change="selectTel(temp.telphone)" ></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="取货人姓名:"><el-input  v-model="temp.username" @change="selectTel(temp.telphone)" ></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="寄件人:"><el-input  v-model="temp.customName" ></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="收件人:"><el-input  v-model="temp.linkman" @change="selectTel(temp.telphone)" ></el-input></el-form-item></el-col>
      </el-form>
    </el-dialog>
  </div>
</template>

<script>
  import { list, add, ChaseSingle, UpdateSingle,MeltSingle} from '@/api/acc/accworkorder'
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination
  import { getToken } from '@/utils/auth'

  export default {
    name: 'WorkOrder',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        tableKey: 0,
        list: null,
        total: 0,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 5,
          wsJobNo: '',
          workSheetNo: ''
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
      // 详情
      UpdateSingle(row){
        this.temp =  Object.assign({}, row) // copy obj
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title='详情'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
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
        this.getList()
      },
      // 重置表单数据
      resetAcc() {
        this.temp= {
          id: undefined,
          BusinessNoticeNo: '',
          parentStr:'',
        }
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
