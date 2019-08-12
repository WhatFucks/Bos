<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.name" placeholder="输入部门名..." style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        添加
      </el-button>
    </div>

    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="编号" type="index" align="center" width="60">
      </el-table-column>
      <el-table-column label="部门名称" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="上级名称" fit="true" align="center">
        <template slot-scope="scope">
          <div v-for="(item,index) in deptList" :key="index">
            <span v-if="scope.row.parentId === item.id">{{ item.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="创建人" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.createBy }}</span>
        </template>
      </el-table-column>
      <el-table-column label="创建时间" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.createTime | parseTime('{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="状态" width="100" align="center">
        <template slot-scope="scope">
          <span style="color:red;" v-if="scope.row.delFlag==0">正常</span>
          <span style="color:red;" v-else>已删除</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" width="150" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <div v-if="row.delFlag == 0">
            <el-button type="primary" size="mini" @click="handleUpdate(row)">
              编辑
            </el-button>
            <el-button size="mini" type="danger" @click="handleDelete(row.id)">
              删除
            </el-button>
          </div>
          <div v-else>
            <el-button type="primary" size="mini">
              查看
            </el-button>
            <el-button size="mini" type="danger">
              启用
            </el-button>
          </div>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize" :page-sizes="[5,10,15,20]" @pagination="getList" />

    <el-dialog :title="dialogTitle" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="80px" style="width: 400px; margin-left:50px;">
        <el-form-item label="部门名称" prop="name">
          <el-input v-model="temp.name" placeholder="请输入部门名..."/>
        </el-form-item>
        <el-form-item label="所属上级" prop="parentId">
          <span>
            <el-select v-model="temp.parentId" clearable placeholder="请选择">
              <el-option
                v-for="item in deptList"
                :key="item.id"
                :label="item.name"
                :value="item.id">
              </el-option>
            </el-select>
          </span>
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
  import { getDeptList2,getDeptList, addDept, deleteDept, updateDept, deptPaging } from "@/api/sys/dept";
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination

  export default {
    name: 'deptTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        dialogTitle:"添加部门信息", // 对话框标题
        tableKey: 0,
        list: null, // 需要显示的数据集合
        total: 0, // 总记录数
        listLoading: true, //是否显示加载动画
        listQuery: {
          pageNum: 1, // 当前页
          pageSize: 5, // 每页显示多少条,
          name: ""
        },
        temp: { // 对话框绑定的对象
          id: undefined,
          name: undefined,
          parentId: undefined,
          delFlag: undefined
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
      this.getDeptList2()
    },
    methods: {
      getDeptList2(){
        getDeptList2().then((res) => {
          this.deptList = res.data.items
        }).catch((err) => {
          console.debug("获取部门列表出错。")
        })
      },
      getList() {
        this.listLoading = true
        deptPaging(this.listQuery).then(response => {
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
          id: undefined,
          name: undefined,
          parentId: undefined,
          delFlag: undefined
        }
      },
      handleCreate() { // 弹出添加用户信息对话框
        // 清空表单所绑定的对象
        this.resetTemp()
        // 改变对话框的状态
        this.dialogStatus = 'create'
        // 改变对话框标题
        this.dialogTitle = '添加部门信息'
        // 显示对话框
        this.dialogFormVisible = true
        // 清空表单校验信息
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() { // 添加部门信息
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            addDept(this.temp).then((res) => {
              if(res.data.success === true){
                this.getList()
                this.dialogFormVisible = false
                this.$message({
                  center: true,
                  message: '添加成功！',
                  type: 'success'
                });
              }else{
                this.$message({
                  center: true,
                  message: '添加失败！',
                  type: 'success'
                });
              }
            })
          }
        })
      },
      handleUpdate(row) { // 弹出修改部门信息对话框
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "编辑部门信息"
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() { // 修改部门
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            updateDept(tempData).then((res) => {
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
      handleDelete(id) { // 删除部门
        this.$confirm("确认删除该部门吗？","温馨提示").then(_ => {
          this.listLoading = true
          deleteDept(id).then((res) => {
            console.debug(res)
            this.getList()
            this.listLoading = false
            const msg = res.data.msg
            if(msg != undefined){
              this.$message({
                center: true,
                message: res.data.msg,
                type: 'warning'
              });
            }else{
              const success = res.data.success
              if(success === true){
                this.$message({
                  center: true,
                  message: "删除成功！",
                  type: 'success'
                });
              }else{
                this.$message({
                  center: true,
                  message: "删除失败！",
                  type: 'error'
                });
              }
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
      }
    }
  }
</script>
