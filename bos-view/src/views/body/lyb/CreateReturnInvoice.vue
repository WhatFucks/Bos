<template>
  <div class="app-container">
    <!--查询条件-->
    <div class="filter-container">
      <div>
        工作单号：
        <el-input v-model="listQuery.worksheetno" clearable placeholder="请输入工作单号..." style="width: 200px;"
                  class="filter-item"/>
        当前状态：
        <el-select v-model="listQuery.invalidatesign" clearable placeholder="请选择状态...">
          <el-option value=1 label="正常"></el-option>
          <el-option value=2 label="作废"></el-option>
        </el-select>
        执行状态：
        <el-select v-model="listQuery.apreturnstatus" clearable placeholder="请选择执行状态...">
          <el-option v-for="item in select3" :key="item.value" :value="item.value" :label="item.name"></el-option>
        </el-select>
        处理状态：
        <el-select v-model="listQuery.treatmentstate" clearable placeholder="请选择处理状态...">
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
      <el-table-column label="品名" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.accWorksheet.producttime }}</span>
        </template>
      </el-table-column>
      <el-table-column label="件数" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.accWorksheet.total }}</span>
        </template>
      </el-table-column>
      <el-table-column label="体积" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.accWorksheet.weight }}</span>
        </template>
      </el-table-column>
      <el-table-column label="到达地" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.accWorksheet.destination }}</span>
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
      <el-table-column label="返货确认单位" fit="true" align="center">
        <template slot-scope="scope">
          <div v-for="dept in deptList" :key="dept.id">
            <span v-show="scope.row.confirmationunit === dept.id">{{ dept.name }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="返货确认人" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.confirmationpersonname }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="220" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
            <el-button size="mini" type="danger" @click="particular(row)">详细</el-button>
            <el-button size="mini" type="warning" @click="deleteRetReturnlist(row)">作废</el-button>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize"
                :page-sizes="[5,10,15,20]" @pagination="getList"/>
    <el-dialog title="反货单详情" :visible.sync="dialogFormVisible" center>
      <el-row :gutter="20">
        <el-col :span="6">
          <div class="grid-content bg-purple-light" align="center">返货单状态：</div>
        </el-col>
        <el-col :span="6">
          <div class="grid-content bg-purple" align="center">
            <span v-show="temp.treatmentstate === 1">未确认</span>
            <span v-show="temp.treatmentstate === 2">同意返货</span>
            <span v-show="temp.treatmentstate === 3">已拒绝</span>
            <span v-show="temp.treatmentstate === 4">同意转发</span>
          </div>
        </el-col>
        <el-col :span="6">
          <div class="grid-content bg-purple-light" align="center"></div>
        </el-col>
        <el-col :span="6">
          <div class="grid-content bg-purple" align="center"></div>
        </el-col>
      </el-row>

      <span slot="footer" class="dialog-footer">
          <el-button @click="dialogFormVisible = false">返 回</el-button>
     </span>
    </el-dialog>
  </div>
</template>

<script>
  import {getRetReturnlist, deleteRetReturnlist} from '@/api/body/retReturnlist'
  import {getDeptList2} from "@/api/sys/dept"
  import waves from '@/directive/waves' // waves directive
  import {parseTime} from '@/utils'
  import Pagination from '@/components/Pagination'

  export default {
    name: 'returnApplyTable',
    components: {Pagination},
    directives: {waves},
    data() {
      return {
        select1: [
          {value: 1, name: "未确认"},
          {value: 2, name: "同意返货"},
          {value: 3, name: "拒绝"},
          {value: 3, name: "同意转发"}
        ],
        select2: [
          {value: 1, name: "原因一"},
          {value: 2, name: "原因二"},
          {value: 3, name: "原因三"}
        ],
        select3: [
          {value: 1, name: "待返货"},
          {value: 2, name: "已转发"},
          {value: 3, name: "已反货"}
        ],
        dialogFormVisible: false,
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
        deptList: [],
        temp: {
          accWorksheet: {
            destination: '',
            id: '',
            jobno: '',
            producttime: '',
            stowagerequirements: '',
            total: '',
            weight: '',
            worksheetno: '',
          },
          aploss: '',
          applicationno: '',
          apremark: '',
          apreturnstatus: '',
          confirmationpersonname: '',
          confirmationtime: '',
          confirmationunit: '',
          denialtype: '',
          entrytime: '',
          entryunit: '',
          handlingopinions: '',
          id: '',
          identificationsign: '',
          invalidatesign: '',
          personname: '',
          receivegunit: '',
          recordingtime: '',
          returntype: '',
          returnunit: '',
          treatmentstate: '',
          worksheetno: ''
        }
      }
    },
    created() {
      this.getList()
      this.getDeptList()
    },
    methods: {
      particular (row) {
        this.temp = Object.assign({}, row)
        console.debug(this.temp)
        this.dialogFormVisible = true
      },
      deleteRetReturnlist (row) {
        if(row.invalidatesign == 1){
          this.$confirm("您确定作废该返货单吗？","温馨提示").then(_ => {
            this.listLoading = true
            deleteRetReturnlist(row.id).then((res) => {
              this.listLoading = false
              if(res.data.success === true){
                this.$message({
                  center: true,
                  message: '已作废！',
                  type: 'success'
                });
              }else{
                this.$message({
                  center: true,
                  message: '作废失败！',
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
        }else{
          this.$message({
            center: true,
            message: '当前返货单已作废！',
            type: 'warning'
          });
        }
      },
      getDeptList() {
        this.listLoading = true
        getDeptList2().then((res) => {
          this.listLoading = false
          this.deptList = res.data.items
        }).catch((err) => {
          this.listLoading = false
          this.$message.error('获取部门信息出错！');
        })
      },
      getList() {
        this.listLoading = true
        getRetReturnlist(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          this.listLoading = false
        }).catch((err) => {
          this.listLoading = false
          this.$message.error('系统繁忙，请稍后再试！');
        })
      }
    }
  }
</script>
<style>
  .el-row {
    margin-bottom: 20px;
  &:last-child {
     margin-bottom: 0;
   }
  }
  .el-col {
    border-radius: 4px;
  }
  .bg-purple-dark {
    background: #99a9bf;
  }
  .bg-purple {
    background: #d3dce6;
  }
  .bg-purple-light {
    background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }
</style>
