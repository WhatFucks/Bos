<template>
  <div class="app-container">
    <!--查询条件-->
    <div class="filter-container">
      <div>
        申请单号：
        <el-input v-model="listQuery.applicationno" clearable placeholder="请输入申请单号..." style="width: 200px;" class="filter-item"/>
        工作单号：
        <el-input v-model="listQuery.worksheetno" clearable placeholder="请输入工作单号..." style="width: 200px;" class="filter-item"/>
        当前状态：
        <el-select v-model="listQuery.invalidatesign" clearable placeholder="请选择状态...">
          <el-option value=1 label="正常"></el-option>
          <el-option value=2 label="作废"></el-option>
        </el-select>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-search" @click="getList">
          查询
        </el-button>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
          添加
        </el-button>
      </div>
    </div>
    <!--数据表格-->
    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="序号" type="index" align="center" width="60">
      </el-table-column>
      <el-table-column label="申请单号" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.applicationno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="工作单号" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.worksheetno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="返货类型" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.returntype }}</span>
        </template>
      </el-table-column>
      <el-table-column label="破损丢失件数" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.aploss }}</span>
        </template>
      </el-table-column>
      <el-table-column label="接收单位" width="100" align="center">
        <template slot-scope="scope">
          <div v-for="dept in deptList" :key="dept.id">
            <span v-show="scope.row.receivegunit === dept.id">{{ dept.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="作废标志" fit="true" align="center">
        <template slot-scope="scope">
          <span v-if="scope.row.invalidatesign === 2">是</span>
          <span v-else>否</span>
        </template>
      </el-table-column>
      <el-table-column label="返货单位" width="100" align="center">
        <template slot-scope="scope">
          <div v-for="dept in deptList" :key="dept.id">
            <span v-show="scope.row.returnunit === dept.id">{{ dept.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="录入单位" width="100" align="center">
        <template slot-scope="scope">
          <div v-for="dept in deptList" :key="dept.id">
            <span v-show="scope.row.entryunit === dept.id">{{ dept.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="录入人" width="100" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.personname }}</span>
        </template>
      </el-table-column>
      <el-table-column label="进港时间" width="100" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.entrytime | parseTime('{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" width="150" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
            <el-button type="primary" size="mini" @click="handleUpdate(row)">编辑</el-button>
            <el-button size="mini" type="danger" @click="deleteReturn(row)">作废</el-button>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize" :page-sizes="[5,10,15,20]" @pagination="getList" />

    <el-dialog :title="dialogTitle" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="80px" style="width: 400px; margin-left:50px;">
        <el-form-item label="申请单号" v-show="disabled">
          <el-input v-model="temp.applicationno" placeholder="请输入申请单号......" :disabled="disabled"/>
        </el-form-item>
        <el-form-item label="工作单号">
          <el-input v-model="temp.worksheetno" placeholder="请输入工作单号......" :disabled="disabled"/>
        </el-form-item>
        <el-form-item label="返货类型">
          <el-select v-model="temp.returntype" placeholder="请选择原因">
            <el-option v-for="item in select2" :key="item.value" :label="item.name" :value="item.value"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="申请备注">
          <el-input v-model="temp.apremark" type="textarea" placeholder="请输入申请备注......" />
        </el-form-item>
        <el-form-item label="破损丢失件数">
          <el-input v-model="temp.aploss" placeholder="请输入破损丢失件数......" />
        </el-form-item>
        <el-form-item label="处理意见">
          <el-input v-model="temp.handlingopinions" type="textarea" placeholder="请输入处理意见......" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确定
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { getRetReturnlist, addRetReturnlist,updateRetReturnlist,deleteRetReturnlist } from '@/api/body/retReturnlist'
  import { getDeptList2} from "@/api/sys/dept";
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination'

  export default {
    name: 'returnApplyTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        disabled: false,
        select1: [
          {value: 1,name:"未确认"},
          {value: 2,name:"同意返货"},
          {value: 3,name:"拒绝"},
          {value: 3,name:"同意转发"}
          ],
        select2: [
          {value: 1,name:"原因一"},
          {value: 2,name:"原因二"},
          {value: 3,name:"原因三"}
        ],
        select3: [
          {value: 1,name:"无"},
          {value: 2,name:"已转发"},
          {value: 3,name:"已反货"}
        ],
        dialogTitle:"添加返货申请", // 对话框标题
        tableKey: 0,
        list: null, // 需要显示的数据集合
        total: 0, // 总记录数
        listLoading: true, //是否显示加载动画
        listQuery: {
          pageNum: 1, // 当前页
          pageSize: 5, // 每页显示多少条,
          applicationno: '', // 申请单号
          worksheetno: '', // 工作单号
          invalidatesign: '', // 是否作废
        },
        temp: { // 对话框绑定的对象
          accWorksheet: {
            destination: '',
            id: '',
            jobno: '',
            producttime: '',
            stowagerequirements: '',
            total: '',
            weight: '',
            worksheetno: ''
          },
          id: '',
          applicationno: '',
          worksheetno: '',
          returntype: '',
          apremark: '',
          aploss: '',
          entrytime: '',
          receivegunit: '',
          invalidatesign: '',
          returnunit: '',
          recordingtime: '',
          entryunit: '',
          personname: '',
          confirmationtime: '',
          confirmationunit: '',
          confirmationpersonname: '',
          treatmentstate: '',
          apreturnstatus: '',
          identificationsign: '',
          handlingopinions: '',
          denialtype: ''
        },
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 对话框的状态 用于添加和修改对话框之间的切换
        rules: { // 校验规则

        },
        deptList: []
      }
    },
    created() {
      this.getList()
      this.getDeptList()
    },
    methods: {
      getDeptList () {
        getDeptList2().then((res) => {
          this.deptList = res.data.items
        }).catch((err) => {
          console.debug("获取部门信息出错")
        })
      },
      getList() {
        this.listLoading = true
        getRetReturnlist(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          this.listLoading = false;
        }).catch((err) => {
          this.listLoading = false
          this.$message.error('系统繁忙，请稍后再试！');
        })
      },
      resetTemp() {
        this.temp = {
          accWorksheet: {
            destination: '',
            id: '',
            jobno: '',
            producttime: '',
            stowagerequirements: '',
            total: '',
            weight: '',
            worksheetno: ''
          },
          id: '',
          applicationno: '',
          worksheetno: '',
          returntype: '',
          apremark: '',
          aploss: '',
          entrytime: '',
          receivegunit: '',
          invalidatesign: '',
          returnunit: '',
          recordingtime: '',
          entryunit: '',
          personname: '',
          confirmationtime: '',
          confirmationunit: '',
          confirmationpersonname: '',
          treatmentstate: '',
          apreturnstatus: '',
          identificationsign: '',
          handlingopinions: '',
          denialtype: ''
        }
      },
      handleCreate() { // 弹出添加对话框
        // 清空表单所绑定的对象
        this.resetTemp()
        // 改变对话框的状态
        this.dialogTitle = '添加返货申请'
        this.dialogStatus = 'create'
        // 显示对话框
        this.dialogFormVisible = true
        this.disabled = false
        // 清空表单校验信息
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() { // 添加
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$delete(this.temp,'accWorksheet')
            addRetReturnlist(this.temp).then((res) => {
              if(res.data.success === true){
                this.getList()
                this.dialogFormVisible = false
                this.$message({
                  center: true,
                  message: '录入成功！',
                  type: 'success'
                });
              }else{
                this.$message({
                  center: true,
                  message: '录入失败！',
                  type: 'warning'
                });
              }
            })
          }
        })
      },
      handleUpdate(row) {
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "编辑返货申请"
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.disabled = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() { // 修改用户
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            this.$delete(tempData,'accWorksheet')
            updateRetReturnlist(tempData).then((res) => {
              if(res.data.success === true){
                this.getList()
                this.dialogFormVisible = false
                this.$message({
                  center: true,
                  message: '修改成功！',
                  type: 'success'
                });
              }else{
                this.$message({
                  center: true,
                  message: '修改失败！',
                  type: 'success'
                });
              }
            })
          }
        })
      },
      deleteReturn (row) {
        if(row.invalidatesign == 1){
          this.$confirm("确认作废该申请单吗？","温馨提示").then(_ => {
            this.listLoading = true
            deleteRetReturnlist(row.id).then((res) => {
              const success = res.data.success
              if(success  === true){
                this.listLoading = false
                this.$message({
                  center: true,
                  message: '已作废！',
                  type: 'success'
                });
                this.getList()
              }else{
                this.listLoading = false
                this.$message({
                  center: true,
                  message: '作废失败！',
                  type: 'warning'
                });
              }
            }).catch((err) => {
              this.listLoading = false
              this.$message.error('系统繁忙，请稍后再试！');
            })
          }).catch(_ => {
            this.listLoading = false
            this.$message({
              center: true,
              message: '用户取消操作！',
              type: 'warning'
            });
          })
        }else{
          this.$message({
            center: true,
            message: '当前返货单已作废！',
            type: 'warning'
          });
        }

      }
    }
  }
</script>
