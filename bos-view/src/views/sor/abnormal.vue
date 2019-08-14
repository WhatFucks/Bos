<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="storage.id" placeholder="异常号" style="width: 200px;" class="filter-item"/>
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
      <el-table-column label="异常编号" prop="id" sortable="custom" align="center" width="150px">
        <template slot-scope="scope">
          <span>{{ scope.row.id }}</span>
        </template>
      </el-table-column>
      <el-table-column label="发起时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.launchdate | parseTime('{y}-{m}-{d} {h}:{i}')}}</span>
        </template>
      </el-table-column>
      <el-table-column label="发起人" min-width="120px">
        <template slot-scope="{row}">
          <el-tag :type="warning"  effect="plain"><font color="black">{{row.launchperson}}</font>
          </el-tag>
        </template>
      </el-table-column>
      <el-table-column label="异常类型" min-width="120px">
        <template slot-scope="{row}">
          {{row.abnormaltype==1? '有货无单':'有单无货'}}
        </template>
      </el-table-column>
      <el-table-column label="交接单号" min-width="120px">
        <template slot-scope="{row}">
          {{row.transferint}}
        </template>
      </el-table-column>
      <el-table-column label="单号" min-width="120px">
        <template slot-scope="{row}">
          {{row.cargoint}}
        </template>
      </el-table-column>
      <el-table-column label="状态" min-width="150px">
        <template slot-scope="{row}">
          <el-tag :type="row.abostate==1?'success':'danger'" ><font color="black">{{row.abostate==1?'已处理':'未处理'}}</font>
          </el-tag>
        </template>
      </el-table-column>
    </el-table>


  </div>
</template>

<script>
  //
  import { listAll } from '@/api/sor/abnormal'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    components: { Pagination },
    data(){
      return {
        storage:{id:null},
        tag: {type: 'success', type2: 'danger'},
        list: null,
      }
    },
    created() {
      this.getlist();
    },
    methods: {
      getlist(storage){
        listAll().then(response => {
          this.list=response.data.listAll
        })
      }

    }
  }
</script>

<style scoped>

</style>
