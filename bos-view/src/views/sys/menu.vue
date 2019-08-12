<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.name" placeholder="输入菜单名..." style="width: 200px;" class="filter-item"/>
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
      <el-table-column label="菜单名称" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="所属上级" fit="true" align="center">
        <template slot-scope="scope">
          <div v-for="(menu,index) in menuList" :key="index">
            <span v-if="scope.row.parentId == menu.id">{{ menu.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="访问路径" fit="true" align="center">
        <template slot-scope="scope">
            <span v-if="scope.row.url != null">{{ scope.row.url }}</span>
            <span v-else>暂无</span>
        </template>
      </el-table-column>
      <el-table-column label="类型" fit="true" align="center">
        <template slot-scope="scope">
          <span v-if="scope.row.type==0">目录</span>
          <span v-if="scope.row.type==1">菜单</span>
          <span v-if="scope.row.type==2">按钮</span>
        </template>
      </el-table-column>
      <el-table-column label="授权" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.perms }}</span>
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
            <el-button type="primary" size="mini" @click="lookMenu(row)">
              查看
            </el-button>
            <el-button size="mini" type="danger" @click="startMenu(row.id)">
              启用
            </el-button>
          </div>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize" :page-sizes="[5,10,15,20]" @pagination="getList" />

    <el-dialog :title="dialogTitle" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="80px" style="width: 400px; margin-left:50px;">
        <el-form-item label="菜单名称" prop="name">
          <el-input v-model="temp.name" placeholder="请输入菜单名..."/>
        </el-form-item>
        <el-form-item label="所属上级" prop="parentId">
          <el-select v-model="temp.parentId">
            <el-option v-for="menu in menuList" :key="menu.id" :label="menu.name" :value="menu.id"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="菜单类型" prop="type">
          <el-select v-model="temp.type">
            <el-option v-for="perm in permList" :key="perm.id" :label="perm.name" :value="perm.id"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="访问路径" prop="url">
          <el-input v-model="temp.url" placeholder="请输入访问路径..."/>
        </el-form-item>
        <el-form-item label="授权" prop="perms">
          <el-input v-model="temp.perms" type="text" placeholder="请输入授权..."/>
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
    <el-dialog :title="dialogTitle" :visible.sync="menuDialog" v-model="temp">
      <div align="center">

      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { startMenu, getMenuList, addMenu, updateMenu, deleteMenu} from "@/api/sys/menu";
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination'

  export default {
    name: 'menuTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        menuDialog: false,
        dialogTitle:"添加菜单", // 对话框标题
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
          url: undefined,
          perms: undefined,
          type: undefined,
          icon: undefined
        },
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 对话框的状态 用于添加和修改对话框之间的切换
        rules: { // 校验规则

        },
        menuList: [],
        permList: [{id: 0, name: "目录"},{id: 1, name: "菜单"},{id: 2, name: "按钮"}]
      }
    },
    created() {
      this.getList()
      this.getDeptList()
    },
    methods: {
      startMenu (id) {
        this.$confirm("确认重新启用该菜单吗？","温馨提示").then(_ => {
          this.listLoading = true
          startMenu(id).then((res) => {
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
      lookMenu (row) { // 查看菜单详细信息
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "菜单详细信息"
        this.menuDialog = true
      },
      getList() { // 获取菜单列表
        this.listLoading = true
        getMenuList( this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          this.menuList = response.data.menuList
          const menu = {id: 0,name:"最高级"}
          this.menuList.push(menu)
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
          url: undefined,
          perms: undefined,
          type: undefined,
          icon: undefined
        }
      },
      handleCreate() { // 弹出添加菜单信息对话框
        // 清空表单所绑定的对象
        this.resetTemp()
        // 改变对话框的状态
        this.dialogStatus = 'create'
        // 改变对话框标题
        this.dialogTitle = '添加菜单'
        // 显示对话框
        this.dialogFormVisible = true
        // 清空表单校验信息
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() { // 添加菜单信息
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            addMenu(this.temp).then((res) => {
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
      handleUpdate(row) { // 弹出修改菜单信息对话框
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "编辑菜单"
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() { // 修改菜单
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            updateMenu(tempData).then((res) => {
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
      handleDelete(id) { // 删除菜单
        this.$confirm("确认删除该菜单吗？","温馨提示").then(_ => {
          this.listLoading = true
          deleteMenu(id).then((res) => {
            if(res.data.msg != undefined){
              this.listLoading = false
              this.$message({
                center: true,
                message: res.data.msg,
                type: 'warning'
              });
            }else{
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
