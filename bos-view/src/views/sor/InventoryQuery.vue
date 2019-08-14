<template>
  <div>
    <!--查看交接单详情-->
      <el-table
        :data="list"
        border
        fit
        highlight-current-row
        style="width: 100%;"
      >
        <el-table-column fixed label="序号" width="50" align="center">
          <template scope="scope"><span>{{scope.$index + 1}} </span></template></el-table-column>
        <el-table-column label="单号" prop="id" sortable="custom" align="center" width="180px">
          <template slot-scope="scope">
            <span>{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column label="合包号" width="180px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.packageid }}</span>
          </template>
        </el-table-column>
        <el-table-column label="重量" min-width="75px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.weight }}</span>
          </template>
        </el-table-column>
        <el-table-column label="关联出库交接单号" min-width="130px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.outboundid }}</span>
          </template>
        </el-table-column>
        <el-table-column label="状态" min-width="120px">
          <template slot-scope="{row}">
            <el-tag :type="row.state === 1 ? 'primary' : 'success'" disable-transitions><font color="red">{{row.stateName}}</font>
            </el-tag>
          </template>
        </el-table-column>
      </el-table>
  <span>统计<font color="red">{{weight1}}(吨)</font></span>
      <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
      <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize"  />
</div>
</template>
<script>
  import { list,userlist,getByWeights,queryStorageDetail } from '@/api/sor/storage'
  import { sorStoragelist} from '@/api/sor/outBound'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    components: { Pagination },
    data() {
      return {
        weight1:0.0,
        weight2:0.0,
        activeName: 'second',
        total: 0,
        total2: 0,
        list: null,
        list2: null,
        tag: {type: 'success', type2: 'danger'},
        users:[],
        listQuery: {
          pageNum: 1,
          pageSize: 10
        }
      };
    },
    created() {
      this.getlist();
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      },
      getlist(){
        queryStorageDetail(this.storage,this.listQuery.pageNum,this.listQuery.pageSize).then(response => {
          this.list=response.data.items
          this.total=response.data.total
        })
        getByWeights().then(response => {
          this.weight1=response.data.outWeights
          this.weight2=response.data.storWeights
          console.debug(this.weight2);
        })
        sorStoragelist(this.storage,this.listQuery.pageNum,this.listQuery.pageSize).then(response => {
          this.list2=response.data.items
          this.total2=response.data.total
        })
        userlist().then(response => {
          this.users=response.data.userlist
        })
      },

    },

  };
</script>
