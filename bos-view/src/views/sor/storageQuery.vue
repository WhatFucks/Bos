<template>
  <el-tabs v-model="activeName"  type="border-card" @tab-click="handleClick">
    <el-tab-pane label="入库查询" >

      <!--  数据表格-->
      <el-table
        :data="list"
        border
        fit
        highlight-current-row
        style="width: 100%;"
      >
        <el-table-column fixed label="序号" width="50" align="center">
          <template scope="scope"><span>{{scope.$index + 1}} </span></template></el-table-column>
        <el-table-column label="入库交接单" prop="id" sortable="custom" align="center" width="150px">
          <template slot-scope="scope">
            <span>{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column label="接货时间" width="150px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.acceptdate | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
          </template>
        </el-table-column>
        <el-table-column label="接货人" min-width="150px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.acceptusername }}</span>
          </template>
        </el-table-column>
        <el-table-column label="接收单位" min-width="150px">
          <template slot-scope="{row}">
            <el-tag :type="tag.type" ><font color="black">{{row.acceptcompany}}</font>
            </el-tag>
          </template>
        </el-table-column>
        <el-table-column label="发货人" min-width="150px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.deliveryusername }}</span>
          </template>
        </el-table-column>
        <el-table-column label="发货单位" min-width="150px">
          <template slot-scope="{row}">
            <el-tag :type="tag.type2" ><font color="black">{{row.deliverycompany}}</font>
            </el-tag>
          </template>
        </el-table-column>
        <font color="red" v-model="weight1"></font>
      </el-table>
      <span>统计 <font color="red">{{weight2}}(吨)</font></span>
      <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
      <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize"  />
    </el-tab-pane>



    <el-tab-pane label="出库查询"  name="second">

      <!--  数据表格-->
      <el-table
        :data="list2"
        border
        fit
        highlight-current-row
        style="width: 100%;"
      >
        <el-table-column fixed label="序号" width="50" align="center">
          <template scope="scope"><span>{{scope.$index + 1}} </span></template></el-table-column>
        <el-table-column label="出库交接单" prop="id" sortable="custom" align="center" width="150px">
          <template slot-scope="scope">
            <span>{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column label="交接单类型" width="120px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.typeName }}</span>
          </template>
        </el-table-column>
        <el-table-column label="线路资源" min-width="120px">
          <template slot-scope="{row}">
            <el-tag :type="tag.type2" ><font color="black">{{ row.line }}</font>
            </el-tag>
          </template>
        </el-table-column>
        <el-table-column label="接货人" min-width="90px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.acceptPersonUsername }}</span>
          </template>
        </el-table-column>
        <el-table-column label="出货人" min-width="130px">
          <template slot-scope="{row}">
            {{row.deliveryPersonUsername}}
          </template>
        </el-table-column>
        <el-table-column label="出货时间" min-width="150px">
          <template slot-scope="{row}">
            {{row.enterdate | parseTime('{y}-{m}-{d} {h}:{i}')}}
          </template>
        </el-table-column>
        <el-table-column label="出货单位" min-width="130px">
          <template slot-scope="{row}">
            {{row.deliverycompany}}
          </template>
        </el-table-column>
      </el-table>
     <span>统计 <font color="red">{{weight1}}(吨)</font></span>
      <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
      <pagination v-show="total2>0" :total="total2" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize"  />

    </el-tab-pane>



  </el-tabs>
</template>
<script>
  import { list,userlist,getByWeights } from '@/api/sor/storage'
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
        list(this.storage,this.listQuery.pageNum,this.listQuery.pageSize).then(response => {
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
