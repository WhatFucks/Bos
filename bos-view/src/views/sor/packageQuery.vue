<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="storage.id" placeholder="合包号" style="width: 200px;" class="filter-item"/>
      <el-button class="filter-item" type="primary" @click="getlist(storage)" icon="el-icon-search" >
        查询
      </el-button>
    </div>
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
      <el-table-column label="合包号" prop="id" sortable="custom" align="center" width="150px">
        <template slot-scope="scope">
          <span>{{ scope.row.id }}</span>
        </template>
      </el-table-column>
      <el-table-column label="合包人" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.peroName}}</span>
        </template>
      </el-table-column>
      <el-table-column label="封签号" min-width="150px">
        <template slot-scope="{row}">
          <el-tag :type="tag.type" ><font color="black">{{row.sealint}}</font>
          </el-tag>
        </template>
      </el-table-column>
      <el-table-column label="到达地" min-width="120px">
        <template slot-scope="{row}">
          {{row.destination}}
        </template>
      </el-table-column>
      <el-table-column label="计算到达地" min-width="120px">
        <template slot-scope="{row}">
          {{row.reckondes}}
        </template>
      </el-table-column>
      <el-table-column label="送达时限" min-width="120px">
        <template slot-scope="{row}">
          {{row.timelimit}}
        </template>
      </el-table-column>
      <el-table-column label="是否被拆包" min-width="80px">
        <template slot-scope="{row}">
          <el-tag :type="tag.type2" ><font color="black">{{row.state==false?'否':'是'}}</font>
          </el-tag>
        </template>
        <!--     自定义列-->
      </el-table-column>
      <el-table-column label="操作" align="center" width="150px" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button @click="TostorageDetail(row.id)" style="background: #4A9FF9;color: white" title="查看明细" icon="el-icon-search" circle></el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize"  />




    <!--查看交接单详情-->
    <el-dialog  :visible.sync="dialogFormVisible2" close-on-press-escape  center  style="width: 100%; height: 70%">
      <el-table
        :data="storageDetails"
        border
        fit
        highlight-current-row
        style="width: 100%;"
      >
        <el-table-column fixed label="序号" width="50" align="center">
          <template scope="scope"><span>{{scope.$index + 1}} </span></template></el-table-column>
        <el-table-column label="单号" prop="id" sortable="custom" align="center" width="110px">
          <template slot-scope="scope">
            <span>{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column label="商品名" width="110px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.warename }}</span>
          </template>
        </el-table-column>
        <el-table-column label="重量" min-width="75px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.weight }}</span>
          </template>
        </el-table-column>
        <el-table-column label="件数" min-width="75px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.cargoint }}</span>
          </template>
        </el-table-column>
        <el-table-column label="体积" min-width="75px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.volume }}</span>
          </template>
        </el-table-column>
        <el-table-column label="重要提示" min-width="110px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.importanthints }}</span>
          </template>
        </el-table-column>
      </el-table>
    </el-dialog>


  </div>
</template>

<script>
  //
  import { list,detailListById } from '@/api/sor/package'
  import { insertsorStorage,userlist } from '@/api/sor/storage'
  import { findByStorageId } from '@/api/sor/storageDetails'
  import { insertToSorAbnormal } from '@/api/sor/abnormal'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    components: { Pagination },
    data(){
      return {
        tag: {type: 'success', type2: 'danger'},
        options: [{value: '0', label: '有单无货'}, {value: '1', label: '有货无单'}],
        options2: [{value: '0', label: '已处理'}, {value: '1', label: '未处理'}],
        options3: [{value: '0', label: '中转入库'}, {value: '1', label: '二次入库'},{value: '2', label: '初始入库'},{value: '3', label: '有货无单'}],
        dialogFormVisible2: false,
        dialogFormVisible3: false,
        list: null,
        dialogFormVisible: false,
        storage: {id: null},
        storageDetails: [],
        total: 0,
        listQuery: {
          pageNum: 1,
          pageSize: 10
        },
        users:[],
        sorAbnormal: {
          launchdate: null,
          abnormaltype: null,
          abostate: null,
          cargoint: null,
          packageint: null,
          transferint: null,
          hedgeAbnInt: null,
          launchperson: null,
          launchcompany: null,
          handledate: null
        },
        dynamicValidateForm: {
          domains: [{
            value: ''
          }],
        }
      }
    },
    created() {
      this.getlist();
    },
    methods: {
      getlist(storage){
        list(this.storage,this.listQuery.pageNum,this.listQuery.pageSize).then(response => {
          this.list=response.data.items
          this.total=response.data.total
        })
        userlist().then(response => {
          this.users=response.data.userlist
        })
      },
      TostorageDetail(id){
        detailListById(id).then(response => {
        this.storageDetails=response.data.listById
        console.debug(this.storageDetails)
        this.dialogFormVisible2 = true
      })
  },
    }
  }
</script>

<style scoped>

</style>
