<template>
  <div class="app-container">
    <!--查询条件-->
    <div class="filter-container">
      <div>
        入库单号：
        <el-input v-model="listQuery.warehouseno" clearable placeholder="请输入入库单号..." style="width: 200px;" class="filter-item"/>
        货物名称：
        <el-input v-model="listQuery.goodsname" clearable placeholder="请输入入库单号..." style="width: 200px;" class="filter-item"/>
        当前状态：
        <el-select v-model="listQuery.status" clearable placeholder="请选择状态...">
          <el-option value="1" label="正常"></el-option>
          <el-option value="2" label="作废"></el-option>
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
      <el-table-column label="序号" type="index" align="center" fit="true">
      </el-table-column>
      <el-table-column label="入库单号" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.warehouseno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="货物编码" fit="true" align="center">
        <template slot-scope="scope">
          <span class="link-type">{{ scope.row.goodscode }}</span>
        </template>
      </el-table-column>
      <el-table-column label="货物名称" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.goodsname }}</span>
        </template>
      </el-table-column>
      <el-table-column label="入库数量" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.storagenum }}</span>
        </template>
      </el-table-column>
      <el-table-column label="实际数量" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.actualnum }}</span>
        </template>
      </el-table-column>
      <el-table-column label="计划价格" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.plannedprice }}</span>
        </template>
      </el-table-column>
      <el-table-column label="规格" fit="true" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.specifications }}</span>
        </template>
      </el-table-column>
      <el-table-column label="状态" fit="true" align="center">
        <template slot-scope="scope">
          <span v-if="scope.row.status === 1">正常</span>
          <span v-else>作废</span>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize" :page-sizes="[5,10,15,20]" @pagination="getList" />
  </div>
</template>

<script>
  import { getPacStockItemList} from "@/api/body/pacStockItem"
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination'
  import { getDeptList} from "@/api/sys/dept"

  export default {
    name: 'pacStockItemTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        tableKey: 0,
        list: null, // 需要显示的数据集合
        total: 0, // 总记录数
        listLoading: true, //是否显示加载动画
        listQuery: {
          pageNum: 1, // 当前页
          pageSize: 5, // 每页显示多少条,
          warehouseno: '',
          goodsname: '',
          status: ''
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      getList() { // 获取包装信息列表
        this.listLoading = true
        getPacStockItemList(this.listQuery).then(response => {
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
