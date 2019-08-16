<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.name" placeholder="输入角色名..." style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
<!--      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">-->
<!--        添加-->
<!--      </el-button>-->
    </div>
    <!-- 分配权限的对话框 -->
    <el-dialog :title="menuDialog.title" :visible.sync="menuDialog.isShow" center>
      <div align="center">
        <el-transfer
          style="text-align: left; display: inline-block"
          v-model="roleMenuList"
          filterable
          :titles="['权限列表', '已有权限']"
          filter-placeholder="请输入权限名称"
          :data="menuList">
        </el-transfer>
      </div>
      <div slot="footer" class="dialog-footer">
        <el-button @click="menuDialog.isShow = false">
          取消
        </el-button>
        <el-button type="primary" @click="allotMenus">
          确定
        </el-button>
      </div>
    </el-dialog>

    <el-tooltip class="item" effect="dark" content="双击角色数据即可分配权限！" placement="top">
    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      @row-dblclick="getMenus"
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="编号" type="index" align="center" width="60">
      </el-table-column>
      <el-table-column label="角色名称" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="备注" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.remark }}</span>
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
            <el-button size="mini" type="danger" @click="startRole(row.id)">
              启用
            </el-button>
          </div>
        </template>
      </el-table-column>
    </el-table>
    </el-tooltip>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize" :page-sizes="[5,10,15,20]" @pagination="getList" />

    <el-dialog :title="dialogTitle" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="80px" style="width: 400px; margin-left:50px;">
        <el-form-item label="角色名称" prop="name">
          <el-input v-model="temp.name" placeholder="请输入角色名称..."/>
        </el-form-item>
        <el-form-item label="备注" prop="remark">
          <el-input v-model="temp.remark" type="textarea" :autosize="{ minRows: 2, maxRows: 4}" show-password placeholder="请输入备注..."/>
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
  import { allotMenus,getMenus } from "@/api/sys/menu";
  import { startRole,rolePaging, addRole, updateRole, deleteRole} from "@/api/sys/role"
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination'

  export default {
    name: 'roleTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        menuDialog:{
          isShow: false,
          title: "分配权限"
        },
        dialogTitle:"添加角色信息", // 对话框标题
        tableKey: 0,
        list: null, // 需要显示的数据集合
        total: 0, // 总记录数
        listLoading: true, //是否显示加载动画
        listQuery: {
          pageNum: 1, // 当前页
          pageSize: 5,// 每页显示多少条,
          name: ""
        },
        temp: { // 对话框绑定的对象
          id: undefined,
          name: undefined,
          remark: undefined
        },
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 对话框的状态 用于添加和修改对话框之间的切换
        rules: { // 校验规则
          name: [{ required: true, message: '请填写角色名！', trigger: 'change' }]
        },
        menuList: [],
        roleMenuList: []
      }
    },
    created() {
      this.getList()
    },
    methods: {
      allotMenus () {// 分配权限
        if(this.roleMenuList.length > 0){
          this.listLoading = true
          allotMenus(this.temp.id,this.roleMenuList).then((res) => {
            this.listLoading = false
            this.menuDialog.isShow = false
            if(res.data.success){
              this.$message({
                center: true,
                message: '已成功分配！',
                type: 'success'
              })
            }else{
              this.$message({
                center: true,
                message: '分配失败！',
                type: 'warning'
              })
            }
          }).catch((err) => {
            this.listLoading = false
            this.menuDialog.isShow = false
            this.$message({
              center: true,
              message: '分配权限出错啦！',
              type: 'error'
            })
          })
        }else{
          this.$alert("请选择需要分配的权限！","温馨提示")
        }
      },
      getMenus (row, column, event) { // 获取权限列表
        this.menuDialog.isShow = true
        this.listLoading = true
        getMenus(row.id).then((res) => {
          console.debug(res)
          this.menuList = res.data.menuList
          this.temp.id = row.id
          this.roleMenuList = []
          for(var i=0;i<res.data.roleMenuList.length;i++){
            this.roleMenuList.push(res.data.roleMenuList[i].key)
          }
          console.debug(this.menuList)
          console.debug(this.roleMenuList)
          this.listLoading = false
        }).catch((err) => {
          this.listLoading = false
          this.$message({
            center: true,
            message: '获取菜单列表失败！',
            type: 'info'
          });
        })
      },
      startRole (id) {
        this.$confirm("确认重新启用该角色吗？","温馨提示").then(_ => {
          this.listLoading = true
          startRole(id).then((res) => {
            const success = res.data.success
            if(success  === true){
              this.listLoading = false
              this.$message({
                center: true,
                message: '已启用！',
                type: 'success'
              });
              this.getList()
            }else{
              this.listLoading = false
              this.$message({
                center: true,
                message: '启用失败！',
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
      },
      getList() { // 获取角色列表
        this.listLoading = true
        rolePaging(this.listQuery).then(response => {
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
          remark: undefined
        }
      },
      handleCreate() { // 弹出添加用户信息对话框
        // 清空表单所绑定的对象
        this.resetTemp()
        // 改变对话框的状态
        this.dialogStatus = 'create'
        // 改变对话框标题
        this.dialogTitle = '添加角色信息'
        // 显示对话框
        this.dialogFormVisible = true
        // 清空表单校验信息
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() { // 添加角色信息
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            addRole(this.temp).then((res) => {
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
      handleUpdate(row) { // 弹出修改角色信息对话框
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "编辑角色信息"
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() { // 修改角色
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            updateRole(tempData).then((res) => {
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
      handleDelete(id) { // 删除角色
        this.$confirm("确认删除该角色吗？","温馨提示").then(_ => {
          this.listLoading = true
          deleteRole(id).then((res) => {
            const success = res.data.success
            if(success  === true){
              this.listLoading = false
              this.$message({
                center: true,
                message: '删除成功！',
                type: 'success'
              });
              this.getList()
            }else{
              this.listLoading = false
              this.$message({
                center: true,
                message: '删除失败！',
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
      }
    }
  }
</script>
