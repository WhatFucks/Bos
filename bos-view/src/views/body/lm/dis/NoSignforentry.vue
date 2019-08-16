<template>
  <div class="app-container">
    <div class="filter-container">
      工作单号：<el-input v-model="listQuery.customcode" placeholder="请输入工作单号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      申请单号：<el-input v-model="listQuery.businessnoticeno" placeholder="请输入申请单号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">查询</el-button>
    </div>
    <el-table :data="list" style="width: 100%"> <!--sortable="custom"-->
      <el-table-column label="序号" align="center" type="index" width="50px" prop="id"></el-table-column>
      <el-table-column label="工作单号" align="center" prop="worksheetno" width="110px"></el-table-column>
      <el-table-column label="申请单号" align="center" prop="applicationno" width="100px"></el-table-column>
      <el-table-column label="签收时间" align="center" prop="signtime" width="100px" :formatter="workordertypes"></el-table-column>
      <el-table-column label="签收状态" align="center" prop="signtype" width="100px" :formatter="signtypes"></el-table-column>
      <el-table-column label="签收单位" align="center" prop="inputid" width="105px" :formatter="inputids"></el-table-column>
      <el-table-column label="申请人" align="center" prop="applicatioperson" width="100px"></el-table-column>
      <el-table-column label="申请时间" align="center" prop="applicatiotime" width="100px"></el-table-column>
      <el-table-column label="申请单位" align="center" prop="applicatiounit"width="100px"></el-table-column>
      <el-table-column label="确认人" align="center" prop="confirmationpersonname"width="105px"></el-table-column>
      <el-table-column label="编辑" align="center" width="300" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleCreate(row)">新增</el-button>
          <el-button type="primary" size="mini" @click="handleAffirm (row.id)">确认</el-button>
          <el-button type="primary" size="mini" @click="handleDelect(row.id)">作废</el-button>
          <el-button type="primary" size="mini" @click="handleParticulars(row)">详情</el-button>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-width="120px" style="width: 700px; margin-left:0px; height: 234px">
        <el-col :span="8"><el-form-item label="工作单号:"><el-input  v-model="temp.worksheetno"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="申请单号:"><el-input  v-model="temp.applicationno"></el-input></el-form-item></el-col>
        <el-col :span="24"><el-form-item label="申请原因:"><el-input  v-model="temp.cause"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="签收状态:">
          <el-select v-model="temp.signtype" placeholder="请选择">
            <el-option v-for="item in signtypeAll" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="9"><el-form-item label="签收单位:">
          <el-select v-model="temp.inputid" placeholder="请选择">
            <el-option v-for="item in inputidAll" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="7"><el-form-item label="申请人:"><el-input  v-model="temp.couriername"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="申请时间:"><el-input  v-model="temp.applicatiotime"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="申请单位:"><el-input  v-model="temp.applicatiounit"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="确认人:"><el-input  v-model="temp.applicatioperson"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="确认时间:"><el-input  v-model="temp.applicatiotime"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="确认状态:"><el-input  v-model="temp.confirm"></el-input></el-form-item></el-col>
        <el-col :span="24"><el-form-item label="原因:"><el-input  v-model="temp.cause"></el-input></el-form-item></el-col>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">确认</el-button>
      </div>
    </el-dialog>
    <el-dialog :title="title" :visible.sync="dialogForms">
      <el-form ref="dataForms" :rules="rules" :model="temp" label-width="120px" style="width: 700px; margin-left:0px; height: 321px">
        <el-col :span="8"><el-form-item label="工作单号:"><el-input  v-model="temp.worksheetno"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="申请单号:"><el-input  v-model="temp.applicationno"></el-input></el-form-item></el-col>
        <el-col :span="24"><el-form-item label="申请原因:"><el-input  v-model="temp.cause"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="签收状态:">
          <el-select v-model="temp.signtype" placeholder="请选择">
            <el-option v-for="item in signtypeAll" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="9"><el-form-item label="签收单位:">
          <el-select v-model="temp.inputid" placeholder="请选择">
            <el-option v-for="item in inputidAll" :key="item.value" :label="item.label" :value="item.value"></el-option>
          </el-select>
        </el-form-item></el-col>
        <el-col :span="7"><el-form-item label="申请人:"><el-input  v-model="temp.couriername"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="申请时间:"><el-input  v-model="temp.applicatiotime"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="申请单位:"><el-input  v-model="temp.applicatiounit"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="确认人:"><el-input  v-model="temp.applicatioperson"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="确认时间:"><el-input  v-model="temp.applicatiotime"></el-input></el-form-item></el-col>
        <el-col :span="8"><el-form-item label="确认状态:"><el-input  v-model="temp.confirm"></el-input></el-form-item></el-col>
        <el-col :span="24"><el-form-item label="原因:"><el-input  v-model="temp.cause"></el-input></el-form-item></el-col>
      </el-form>
    </el-dialog>
  </div>
</template>

<script>
  import { list,add,update,affirm,deletes } from '@/api/dis/workordersign'
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
        inputidAll: [{value: 1, label: '长沙总公司'},{value: 2, label: '岳麓区分公司'},{value: 3, label: '天心区分公司'}],
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
          confirm:'',
          applicatiotime: '',
          Confirmthecause: '',
          applicatiounit: '',
          worksheetno: '',
          applicationno: '',
          workorderid:'',
          signtype: '',
          inputid: '',
          couriername:'',
          inputpersonid: '',
          applicatioperson: '',
          ConfirmtheTime: new Date(),
          cause: '',
        },
        dialogFormVisible: false,
        dialogForms: false,
        dialogStatus: '',
        title:'',
      }
    },
    created() {
      this.getList()
    },
    methods: {
      // 确认
      handleAffirm(id){
        this.$confirm('你确认要进行确认操作嘛, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          affirm(id).then((response) => {
            this.getList()
            this.$message({
              type: 'success',
              message: '确认成功!'
            });
          })
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消确认成功'
          });
        });
      },
      //  作废
      handleDelect(id){
        deletes(id).then((response) => {
          this.getList()
          this.$message({
            type: 'success',
            message: '确认成功!'
          });
        })
      },
      // 详情
      handleParticulars(row){
        this.temp =  Object.assign({}, row) // copy obj
        this.dialogStatus = 'update'
        this.dialogForms = true
        this.title='详情'
        this.$nextTick(() => {
          this.$refs['dataForms'].clearValidate()
        })
      },
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
      handleCreate(row) {
        this.temp =  Object.assign({}, row) // copy obj
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title='新增'
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
      // 修改操作
      updateData(){
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
      signtypes(val){
        if(val.signtype=1){return "正常签收"}
        else {return "反向签收"}
      },
      // 录入单位
      inputids(row){
        switch(row.inputid){
          case 1:return '长沙总公司';break;
          case 2:return '天心区分公司';break;
          case 3:return '岳麓区分公司';break;
          default:return '未知';
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
