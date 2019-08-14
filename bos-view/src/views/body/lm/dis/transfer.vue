<template>
  <div class="app-container">
    <div class="filter-container">
      来电电话：<el-input v-model="listQuery.TelPhone" placeholder="请输入来电电话" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      工单号：<el-input v-model="listQuery.JobNo" placeholder="请输入工单号" style="width: 200px;" class="filter-item" clearable @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">查询</el-button>
    </div>
    <el-table :data="list" style="width: 100%"> <!--sortable="custom"-->
      <el-table-column label="编号" align="center" type="index" width="50px"></el-table-column>
      <el-table-column label="工单号" align="center" prop="jobNo" width="110px"></el-table-column>
      <el-table-column label="短信序号" align="center" prop="shortMessageInt" width="85px"></el-table-column>
      <el-table-column label="业务通知单号" align="center" prop="awBusinessNoticeNo" width="110px"></el-table-column>
      <el-table-column label="收件地址" align="center" prop="sendAddress" width="160px"></el-table-column>
      <el-table-column label="联系人" align="center" prop="linkman" width="120px"></el-table-column>
      <el-table-column label="联系电话" align="center" prop="telPhone" width="110px"></el-table-column>
      <el-table-column label="追单次数" align="center" prop="afterSingleNum"width="85px"></el-table-column>
      <el-table-column label="处理单位" align="center" prop="pickupUnit"width="95px" :formatter="ifendcase"></el-table-column>
      <el-table-column label="工单生成时间" align="center" prop="workGenerationTime" width="115px"></el-table-column>
      <el-table-column label="编辑" align="center" width="230" class-name="small-padding fixed-width" >
        <template slot-scope="{row}">
          <el-button type="info" size="mini" @click="TurnSingle(row)">转单</el-button>
          <el-button type="success"  size="mini"@click="Resend(row)">重发</el-button>
        </template>
      </el-table-column>
    </el-table>
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="100px" style="width: 80%; margin-left:80px;">
        <!--<el-form-item label="转入方式" prop="name">
          <el-radio-group v-model="radio">
            <el-radio  label="zonecode" v-if="showcode">定区编码</el-radio>
            <el-radio  label="smallPart" v-if="showsmallPart">小件员工号</el-radio>
          </el-radio-group>
        </el-form-item>
        <template >
          <el-select v-model="temp.zonecode" placeholder="请选择定区编码" >
            <el-option v-for="item in zoneList" :key="item.id" :label="item.zonecode" :value="item.id"></el-option>
          </el-select>
          <el-select v-model="temp.empno" placeholder="请选择小件员工号">
            <el-option v-for="item in smallPartList" :key="item.id" :label="item.empno" :value="item.id"></el-option>
          </el-select>
        </template>-->
        <el-tabs type="border-card" style="width: 66%;height: 100px">
          <el-tab-pane label="定区编码">
            <el-select v-model="temp.zonecode" placeholder="请选择定区编码" >
              <el-option v-for="item in zoneList" :key="item.id" :label="item.zonecode" :value="item.id"></el-option>
            </el-select>
          </el-tab-pane>
          <el-tab-pane label="小件员工号">
            <el-select v-model="temp.empno" placeholder="请选择小件员工号">
              <el-option v-for="item in smallPartList" :key="item.id" :label="item.empno" :value="item.id"></el-option>
            </el-select>
          </el-tab-pane>
        </el-tabs>
        <!--<el-form-item label="转入目标" prop="remark" :visible.sync="DingXiangBianMa"><el-input v-model="temp.remark"/></el-form-item>
        <el-form-item label="转入" ><el-input v-model="temp.remark"/></el-form-item>-->
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="updateData()">确认</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { list, add, ChaseSingle, transfers,resend} from '@/api/dis/transfer'
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination
  import { getToken } from '@/utils/auth'
  export default {
    name: 'Transfer',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        showcode: true, // 编码
        showsmallPart: true,
        code:  true,
        smallPart: false,
        radio: '1',
        tableKey: 0,
        list: null,
        zoneList: null,
        smallPartList: null,
        total: 0,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 5,
          JobNo: '',
          TelPhone: ''
        },
        temp: {
          zonecode:null,
          empno:null
        },
        dialogFormVisible: false,
        DingXiangBianMa: false,
        title:'',
      }
    },
    created() {
      this.getList()
    },
    methods: {
      // 单选按钮 变化
      toolShowCoding(val){
        console.debug(val);
      },
      toolShowSmallParts(){
        alert(2)
      },
      // 处理单位
      ifendcase(val){
        if(val.casestatus=1){return "BOSS集团"}
        else if (val.casestatus=2){return "北京分公司"}
        else if (val.casestatus=3){return "上海分公司"}
      },
      // 查询所有
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          this.zoneList = response.data.zoneList
          this.smallPartList = response.data.smallPartList
        })
        this.listLoading = false
      },
      // 查询按钮
      handleFilter() {
        this.getList()
      },
      // 重置表单数据
      resetAcc() {
        this.temp= {

        }
      },
      // 转单
      TurnSingle(row) {
        this.dialogFormVisible = true
        this.title='转单'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 转单操作
      updateData(){
        transfers(this.temp).then((response) => {
          this.$notify({
            title: response.data.title,
            message: response.data.message,
            duration: 2000
          })
        })
      },
      //重发
      Resend(row){
        this.temp =  Object.assign({}, row)
        const tempData = Object.assign({},this.temp)
        tempData.lastUpdateBy=getToken()
        resend(tempData).then((response) => {
          this.$notify({
            title: response.data.title,
            message: response.data.message,
            duration: 2000
          })
        })
      }
    }
  }
</script>
