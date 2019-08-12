<template>
  <div class="app-container">
    <!--查询条件-->
    <div class="filter-container">
      <div>
        工作单号：
        <el-input v-model="listQuery.worksheetno" clearable placeholder="请输入工作单号..." style="width: 200px;" class="filter-item"/>
        当前状态：
        <el-select v-model="listQuery.invalidatesign" clearable placeholder="请选择状态...">
          <el-option value=1 label="正常"></el-option>
          <el-option value=2 label="作废"></el-option>
        </el-select>
        执行状态：
        <el-select v-model="listQuery.apreturnstatus" clearable placeholder="请选择执行状态...">
          <el-option v-for="item in select3" :key="item.value" :value="item.value" :label="item.name"></el-option>
        </el-select>
        申请状态：
        <el-select v-model="listQuery.treatmentstate" clearable placeholder="请选择申请状态...">
          <el-option v-for="item in select1" :key="item.value" :value="item.value" :label="item.name"></el-option>
        </el-select>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-search" @click="getList">
          查询
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
      <el-table-column label="工作单号" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.worksheetno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="确认时间" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.confirmationtime | parseTime('{y}-{m}-{d} {h}:{i}:{s}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="确认单位" fit="true" align="center">
        <template slot-scope="scope">
          <div v-for="dept in deptList" :key="dept.id">
            <span v-show="scope.row.confirmationunit === dept.id">{{ dept.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="确认人" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.confirmationpersonname }}</span>
        </template>
      </el-table-column>
      <el-table-column label="返货处理状态" fit="true" align="center">
        <template slot-scope="scope">
          <span v-show="scope.row.treatmentstate === 1">未确认</span>
          <span v-show="scope.row.treatmentstate === 2">同意返货</span>
          <span v-show="scope.row.treatmentstate === 3">已拒绝</span>
          <span v-show="scope.row.treatmentstate === 4">同意转发</span>
        </template>
      </el-table-column>
      <el-table-column label="申请信息" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.apremark }}</span>
        </template>
      </el-table-column>
      <el-table-column label="处理信息" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.handlingopinions }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" width="220" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <div v-if="row.treatmentstate === 1 & row.invalidatesign === 1">
            <el-button size="mini" type="danger" @click="ret(row)">返货</el-button>
            <el-button size="mini" type="warning" @click="refuse(row)">拒绝</el-button>
          </div>
          <div v-else>
            <el-button type="info" size="mini">无操作</el-button>
          </div>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize" :page-sizes="[5,10,15,20]" @pagination="getList" />
  </div>
</template>

<script>
  import { getRetReturnlist,refuse,confirm } from '@/api/body/retReturnlist'
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
          {value: 1,name:"未执行"},
          {value: 2,name:"已转发"},
          {value: 3,name:"已反货"}
        ],
        tableKey: 0,
        list: null, // 需要显示的数据集合
        total: 0, // 总记录数
        listLoading: true, //是否显示加载动画
        listQuery: {
          pageNum: 1, // 当前页
          pageSize: 5, // 每页显示多少条,
          worksheetno: '', // 工作单号
          invalidatesign: '', // 是否作废
          treatmentstate: '', // 返货处理状态
          apreturnstatus: '' // 返货执行状态
        },
        deptList: []
      }
    },
    created() {
      this.getList()
      this.getDeptList()
    },
    methods: {
      ret (row) { // 确认返货
        this.$confirm("您确认返货吗？","温馨提示").then(_ => {
          this.listLoading = true
          confirm(row.id).then((res) => {
            this.listLoading = false
            if(res.data.success === true){
              this.$message({
                center: true,
                message: '确认返货成功！',
                type: 'success'
              });
            }else{
              this.$message({
                center: true,
                message: '确认返货失败！',
                type: 'warning'
              });
            }
            this.getList()
          }).catch((err) => {
            this.listLoading = false
            this.$message('系统繁忙，请稍后再试！','温馨提示')
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
      refuse (row) { // 拒绝返货
        this.$confirm("您确认拒绝该返货申请吗？","温馨提示").then(_ => {
          refuse(row.id).then((res) => {
            this.listLoading = false
            if(res.data.success === true){
              this.$message({
                center: true,
                message: '拒绝返货成功！',
                type: 'success'
              });
            }else{
              this.$message({
                center: true,
                message: '拒绝返货失败！',
                type: 'warning'
              });
            }
            this.getList()
          }).catch((err) => {
            this.listLoading = false
            this.$message('系统繁忙，请稍后再试！','温馨提示')
          })
        }).catch(_ => {
          this.$message({
            center: true,
            message: '用户取消操作！',
            type: 'warning'
          });
        })
      },
      getDeptList () {
        this.listLoading = true
        getDeptList2().then((res) => {
          this.listLoading = false
          this.deptList = res.data.items
        }).catch((err) => {
          this.listLoading = false
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
      }
    }
  }
</script>
