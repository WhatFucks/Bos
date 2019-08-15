<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.name" placeholder="输入用户名..." style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        添加
      </el-button>
    </div>
    <!-- 分配角色的对话框 -->
    <el-dialog :title="roleDialog.title" :visible.sync="roleDialog.isShow" center>
      <div align="center">
        <el-transfer
          style="text-align: left; display: inline-block"
          v-model="userRoleList"
          filterable
          :titles="['角色列表', '已有角色']"
          filter-placeholder="请输入角色名称"
          :data="roleList">
        </el-transfer>
      </div>
      <div slot="footer" class="dialog-footer">
        <el-button @click="roleDialog.isShow = false">
          取消
        </el-button>
        <el-button type="primary" @click="allotRoles">
          确定
        </el-button>
      </div>
    </el-dialog>
    <el-tooltip class="item" effect="dark" content="双击用户数据即可分配角色！" placement="top">
    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      @row-dblclick="getRoles"
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="编号" type="index" align="center" width="60">
      </el-table-column>
      <el-table-column label="工号" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.userNo }}</span>
        </template>
      </el-table-column>
      <el-table-column label="用户名" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.username }}</span>
        </template>
      </el-table-column>
      <el-table-column label="邮箱" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.email }}</span>
        </template>
      </el-table-column>
      <el-table-column label="电话" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.mobile }}</span>
        </template>
      </el-table-column>
      <el-table-column label="状态" width="100" align="center">
        <template slot-scope="scope">
          <span style="color:red;" v-if="scope.row.delFlag==0">正常</span>
          <span style="color:red;" v-else>已删除</span>
        </template>
      </el-table-column>
      <el-table-column label="创建时间" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.createTime | parseTime('{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" width="150" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <div v-if="row.delFlag == 0">
            <el-button type="primary" size="mini" @click="handleUpdate(row)">编辑</el-button>
            <el-button size="mini" type="danger" @click="handleDelete(row.id)">删除</el-button>
          </div>
          <div v-else>
            <el-button type="primary" size="mini" @click="lookUser(row)">
              查看
            </el-button>
            <el-button size="mini" type="danger" @click="startUser(row.id)">
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
        <el-form-item label="用户名称" prop="username">
          <el-input v-model="temp.username" placeholder="请输入用户名..."/>
        </el-form-item>
        <el-form-item label="用户密码" prop="password">
          <el-input v-model="temp.password" type="password" minlength="6" show-password placeholder="请输入密码..."/>
        </el-form-item>
        <el-form-item label="联系电话" prop="mobile">
          <el-input v-model="temp.mobile" placeholder="请输入联系电话..."/>
        </el-form-item>
        <el-form-item label="电子邮箱" prop="email">
          <el-input v-model="temp.email" type="email" placeholder="请输入电子邮箱..."/>
        </el-form-item>
        <el-form-item label="个人描述" prop="introduction">
          <el-input v-model="temp.introduction" type="textarea" placeholder="请输入......" />
        </el-form-item>
        <el-form-item label="所属部门" prop="deptId">
          <el-select v-model="temp.deptId" placeholder="请选择" style="width: 320px;">
            <el-option-group
              v-for="group in deptList"
              :key="group.id"
              :label="group.name">
              <el-option-group
                v-for="item in group.children"
                :key="item.id"
                :label="item.name"
                :value="item.id">
                <el-option
                  v-for="m in item.children"
                  :key="m.id"
                  :label="m.name"
                  :value="m.id">
                </el-option>
              </el-option-group>
            </el-option-group>
          </el-select>
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
    <el-dialog :title="dialogTitle" :visible.sync="userDialog" v-model="temp">
        <div align="center">
          <table>
            <tr>
              <td>用户名：</td>
              <td>{{temp.username}}</td>
              <td>密码：</td>
              <td>{{temp.password}}</td>
              <td>联系电话：</td>
              <td>{{temp.mobile}}</td>
            </tr>
            <tr>
              <td>密码：</td>
              <td>{{temp.password}}</td>
            </tr>
          </table>
        </div>
    </el-dialog>
  </div>
</template>

<script>
  import {allotRoles,getRoles} from "@/api/sys/role";
  import {getDeptList} from "@/api/sys/dept";
  import { startUser, getUserList, addUser, updateUser, deleteUser } from '@/api/sys/user'
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination'
  export default {
    name: 'userTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        userRoleList: [],
        roleList: [],
        roleDialog: {
          title: "分配角色",
          isShow: false
        },
        userDialog: false,
        dialogTitle:"添加用户信息", // 对话框标题
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
          avatar: undefined,
          delFlag: undefined,
          deptId: undefined,
          email: undefined,
          id: undefined,
          introduction: undefined,
          mobile: undefined,
          password: undefined,
          username: undefined
        },
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 对话框的状态 用于添加和修改对话框之间的切换
        rules: { // 校验规则
          username: [{ required: true, message: '请填写用户名！', trigger: 'change' }],
          password: [{ required: true, message: '请填写密码！', trigger: 'change' }],
          mobile: [{ required: true, message: '请填写电话号码！', trigger: 'change' }],
          email: [{ type:'email',required: true, message: '请填写电子邮箱！', trigger: 'change' }]
          // timestamp: [{ type: 'date', required: true, message: 'timestamp is required', trigger: 'change' }],
        },
        deptList: []
      }
    },
    created() {
      this.getList()
      this.getDeptList()
    },
    methods: {
      allotRoles () { // 分配
        if(this.userRoleList.length > 0){
          allotRoles(this.temp.id,this.userRoleList).then((res) => {
            if(res.data.success === true){
              this.roleDialog.isShow = false
              this.$message({
                center: true,
                message: '已成功分配！',
                type: 'success'
              })
            }else{
              this.roleDialog.isShow = false
              this.$message({
                center: true,
                message: '分配失败！',
                type: 'warning'
              })
            }
          }).catch((err) => {
            this.roleDialog.isShow = false
            this.$message({
              center: true,
              message: '分配角色出错啦！',
              type: 'error'
            })
          })
        }else{
          this.$alert("请选择需要分配的角色！","温馨提示")
        }
      },
      getRoles (row, column, event) { //查询所有的角色与用户已有角色
        this.listLoading = true
        getRoles(row.id).then((res) => {
          this.roleList = res.data.roleList
          this.temp.id = row.id // 分配需要的用户ID
          this.userRoleList = []
          for(var i=0;i<res.data.userRoleList.length;i++){
            this.userRoleList.push(res.data.userRoleList[i].key)
          }
          this.listLoading = false
        }).catch((err) => {
          this.listLoading = false
          this.$message({
            center: true,
            message: '获取角色列表出错！',
            type: 'error'
          })
        })
        this.roleDialog.isShow = true
      },
      startUser (id) {
        this.$confirm("确认重新启用该用户吗？","温馨提示").then(_ => {
          this.listLoading = true
          startUser(id).then((res) => {
            const success = res.data.success
            if(success  === true){
              this.listLoading = false
              this.$message({
                center: true,
                message: '已启用！',
                type: 'success'
              })
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
      lookUser (row) { // 查看用户详细信息
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "用户详细信息"
        this.userDialog = true
      },
      getDeptList () { // 获取部门列表
        getDeptList().then((res) => {
          this.deptList = res.data.items
        }).catch((err) => {
          this.$message({
            center: true,
            message: '获取部门列表出错！',
            type: 'error'
          });
        })
      },
      getList() { // 获取用户列表
        this.listLoading = true
        getUserList(this.listQuery).then(response => {
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
          avatar: undefined,
          delFlag: undefined,
          deptId: undefined,
          email: undefined,
          id: undefined,
          introduction: undefined,
          mobile: undefined,
          password: undefined,
          username: undefined
        }
      },
      handleCreate() { // 弹出添加用户信息对话框
        // 清空表单所绑定的对象
        this.resetTemp()
        // 改变对话框的状态
        this.dialogStatus = 'create'
        // 改变对话框标题
        this.dialogTitle = '添加用户信息'
        // 显示对话框
        this.dialogFormVisible = true
        // 清空表单校验信息
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() { // 添加用户信息
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            addUser(this.temp).then((res) => {
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
                  type: 'warning'
                });
              }
            })
          }
        })
      },
      handleUpdate(row) { // 弹出修改用户信息对话框
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "编辑用户信息"
        this.dialogStatus = 'update'
        this.temp.password = '******'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() { // 修改用户
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            updateUser(tempData).then((res) => {
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
      handleDelete(id) { // 删除用户
        this.$confirm("确认删除该用户吗？","温馨提示").then(_ => {
          this.listLoading = true
          deleteUser(id).then((res) => {
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
