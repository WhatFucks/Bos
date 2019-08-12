<template>
  <div class="app-container">
    <!--查询条件-->
    <div class="filter-container">
      <div>
        入库单号：
        <el-input v-model="listQuery.warehouseno" clearable placeholder="请输入入库单号..." style="width: 200px;" class="filter-item"/>
        运输单号：
        <el-input v-model="listQuery.transport" clearable placeholder="请输入运输单号..." style="width: 200px;" class="filter-item"/>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-search" @click="getList">
          查询
        </el-button>
      </div>
      <div>
        入库类型：
        <el-select v-model="listQuery.reservoirtype" clearable placeholder="请选择入库类型...">
          <el-option v-for="type in rkType" :key="type.value" :value="type.name" :label="type.name"></el-option>
        </el-select>
        当前状态：
        <el-select v-model="listQuery.status" clearable placeholder="请选择状态...">
          <el-option value="1" label="正常"></el-option>
          <el-option value="2" label="作废"></el-option>
        </el-select>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
          录入
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
      <el-table-column label="入库单号" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.warehouseno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="入库类型" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type" v-if="scope.row.reservoirtype === 1">初期库存</span>
          <span class="link-type" v-if="scope.row.reservoirtype === 2">调拨入库</span>
          <span class="link-type" v-if="scope.row.reservoirtype === 3">下发入库</span>
          <span class="link-type" v-if="scope.row.reservoirtype === 4">盘盈调整</span>
        </template>
      </el-table-column>
      <el-table-column label="运输单号" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.transport }}</span>
        </template>
      </el-table-column>
      <el-table-column label="所属单位" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.subordinateunit }}</span>
        </template>
      </el-table-column>
      <el-table-column label="开单人工号" width="100" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.drawerno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="开单人姓名" width="100" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.drawername }}</span>
        </template>
      </el-table-column>
      <el-table-column label="开单时间" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.drawertime | parseTime('{y}-{m}-{d} {h}:{i}:{s}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="备注" width="100" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.remark }}</span>
        </template>
      </el-table-column>
      <el-table-column label="状态" width="100" align="center">
        <template slot-scope="scope">
          <span v-if="scope.row.status === 1">正常</span>
          <span v-else>作废</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" width="150" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
            <el-button type="primary" size="mini" @click="handleUpdate(row)">编辑</el-button>
<!--            <el-button size="mini" type="danger" @click="showPacStock(row)">明细</el-button>-->
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize" :page-sizes="[5,10,15,20]" @pagination="getList" />

    <el-dialog :title="dialogTitle" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="80px" style="width: 400px; margin-left:50px;">
        <el-form-item label="入库类型">
          <el-select v-model="temp.reservoirtype" prop="reservoirtype" clearable placeholder="请选择入库类型...">
            <el-option v-for="type in rkType" :key="type.value" :value="type.name" :label="type.name"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="所属部门" prop="subordinateunit">
          <el-select v-model="temp.subordinateunit" placeholder="请选择部门..." >
            <el-option-group
              v-for="group in deptList"
              :key="group.id"
              :label="group.name">
              <el-option-group
                v-for="item in group.children"
                :key="item.id"
                :label="item.name"
                :value="item.name">
                <el-option
                  v-for="m in item.children"
                  :key="m.id"
                  :label="m.name"
                  :value="m.name">
                </el-option>
              </el-option-group>
            </el-option-group>
          </el-select>
        </el-form-item>
        <el-form-item label="包装备注" prop="introduction">
          <el-input v-model="temp.remark" type="textarea" placeholder="请输入包装备注......" />
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
  import { getPacStockList, addPacStock,updatePacStock } from "@/api/body/pacStock"
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination'
  import { getDeptList} from "@/api/sys/dept"

  export default {
    name: 'pacStockTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        rkType:[
          { value:1, name:"初期库存"},
          { value:2, name:"调拨入库"},
          { value:3, name:"下发入库"},
          { value:4, name:"盘盈调整"}
          ],
        pacStock:{title: '包装详细信息',isShow: false},
        dialogTitle:"录入包装信息", // 对话框标题
        tableKey: 0,
        list: null, // 需要显示的数据集合
        total: 0, // 总记录数
        listLoading: true, //是否显示加载动画
        listQuery: {
          pageNum: 1, // 当前页
          pageSize: 5, // 每页显示多少条,
          warehouseno: '',
          reservoirtype: '',
          transport: '',
          subordinateunit: '',
          drawerno: '',
          drawertime: '',
          remark: '',
          status: ''
        },
        temp: { // 对话框绑定的对象
          id: '',
          warehouseno: '',
          reservoirtype: '',
          transport: '',
          subordinateunit: '',
          drawerno: '',
          drawertime: '',
          remark: '',
          status: ''
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
        getDeptList().then((res) => {
          this.deptList = res.data.items
        }).catch((err) => {
          this.$message.error('获取部门列表失败！');
        })
      },
      getList() { // 获取包装信息列表
        this.listLoading = true
        getPacStockList(this.listQuery).then(response => {
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
          id: '',
          warehouseno: '',
          reservoirtype: '',
          transport: '',
          subordinateunit: '',
          drawerno: '',
          drawertime: '',
          remark: '',
          status: ''
        }
      },
      handleCreate() { // 弹出添加对话框
        // 清空表单所绑定的对象
        this.resetTemp()
        // 改变对话框的状态
        this.dialogStatus = 'create'
        // 显示对话框
        this.dialogFormVisible = true
        // 清空表单校验信息
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() { // 添加
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            addPacStock(this.temp).then((res) => {
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
      handleUpdate(row) { // 弹出修改用户信息对话框
        this.temp = Object.assign({}, row) // copy obj
        this.dialogTitle = "编辑包装信息"
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() { // 修改用户
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.temp)
            updatePacStock(tempData).then((res) => {
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
      }
    }
  }
</script>
