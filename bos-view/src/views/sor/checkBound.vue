<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="storage.id" placeholder="盘库单号" style="width: 200px;" class="filter-item"/>
      <el-button class="filter-item" type="primary" icon="el-icon-search" >
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="success" icon="el-icon-circle-plus" @click="openInser">
        新增盘库
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
      <el-table-column label="盘库单号" prop="id" sortable="custom" align="center" width="150px">
        <template slot-scope="scope">
          <span>{{ scope.row.id }}</span>
        </template>
      </el-table-column>
      <el-table-column label="盘库时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.checkdate | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="扫描设备号" min-width="120px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.scanid }}</span>
        </template>
      </el-table-column>
      <el-table-column label="总件数" min-width="120px" align="center">
        <template slot-scope="{row}">
          <el-tag :type="tag.type" ><font color="black">{{row.cargosum}}</font>
          </el-tag>
        </template>
      </el-table-column>
      <el-table-column label="盘库人" min-width="150px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.checkName }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作单位" min-width="150px" align="center">
        <template slot-scope="{row}">
          <el-tag :type="tag.type2" ><font color="black">{{row.checkcompany}}</font>
          </el-tag>
        </template>
      </el-table-column>
      <!--     自定义列-->
      <el-table-column label="操作" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button @click="TostorageDetail(row.id)" style="background: #409EFF;color: white" title="查看明细" icon="el-icon-search" circle></el-button>
          <el-button @click="updateTostorageDetail(row.id)" type="primary" title="修改盘库信息" icon="el-icon-edit" circle></el-button>
          <el-button @click="deleteTostorageDetail(row.id)"type="danger"  title="删除" icon="el-icon-delete" circle></el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.pageNum" :limit.sync="listQuery.pageSize"  />

    <!--查看盘库详情-->
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
        <el-table-column label="工作单号" prop="id" sortable="custom" align="center" width="120px">
          <template slot-scope="scope">
            <span>{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column label="扫描设备号" width="75px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.packageid }}</span>
          </template>
        </el-table-column>
        <el-table-column label="件数" min-width="75px" align="center">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.cargocount }}</span>
          </template>
        </el-table-column>
        <el-table-column label="重量" min-width="75px" align="center">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.weight }}</span>
          </template>
        </el-table-column>
        <el-table-column label="类型" min-width="100px" align="center">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.typeName }}</span>
          </template>
        </el-table-column>
        <el-table-column label="入库人" min-width="100px" align="center">
          <template slot-scope="{row}">
            <font color="red">{{row.personName}}</font>
          </template>
        </el-table-column>
      </el-table>
    </el-dialog>

    <!--修改盘库信息-->
    <el-dialog  title="修改盘库信息" :visible.sync="dialogFormVisible3" close-on-press-escape  center style="width: 100%">
      <table style="width: 98%;margin: 1px auto;text-align: center;">
        <tr>
          <td> 盘库编号:<el-input style="width: 110px;" placeholder="盘库编号" v-model="sorAbnormal.id"  :disabled="true"></el-input></td>
          <td> 盘库人: <el-select v-model="sorAbnormal.checkperson" style="width: 150px;">
            <el-option
              v-for="item in users"
              :key="item.id"
              :label="item.username"
              :value="item.id"
              :disabled="item.status==1? false:true"></el-option>
          </el-select></td>
          <td>总件数:<el-input v-model="sorAbnormal.cargosum" style="width: 120px;" placeholder="总件数"></el-input></td>
        </tr>
        <tr>
          <td> 操作单位  ：<el-input v-model="sorAbnormal.checkcompany" style="width: 120px;" placeholder="操作单位"></el-input></td>
          <td> 盘库时间:<el-input v-model="sorAbnormal.checkdate" style="width: 150px;" placeholder="盘库时间"></el-input></td>
          <td> </td>
        </tr>

        <tr>
          <td> </td>
          <td><el-button @click="dialogFormVisible3 = false">取消</el-button> <el-button type="primary" @click="insertSorAbnormal">修改</el-button></td>

          <td> </td>
        </tr>
      </table>
    </el-dialog>


    <!--新增盘库及盘库详情-->
    <el-dialog  :visible.sync="dialogFormVisible" close-on-press-escape  center >

      <el-form :model="dynamicValidateForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
        <el-form-item
          prop="email"
          label="盘库单号"
        >
          <el-input v-model="dynamicValidateForm.id" style="width: 120px;" placeholder="盘库单号" :disabled="true"></el-input>
          扫描设备号:<el-input v-model="dynamicValidateForm.scanid" style="width: 120px;" placeholder="接货时间" :disabled="true"></el-input>
          盘库人:<el-select v-model="dynamicValidateForm.checkperson" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in users"
            :key="item.id"
            :label="item.username"
            :value="item.id"
            :disabled="item.status==1? false:true">
          </el-option>
        </el-select>
        </el-form-item>
        <el-form-item
          prop="email"
          label="总件数"
        >
          <el-input v-model="dynamicValidateForm.cargosum" style="width: 120px;" placeholder="总件数" ></el-input>
          盘库时间: <el-input v-model="dynamicValidateForm.storagedate" type="date" style="width: 120px;" placeholder="盘库时间"  ></el-input>
          操作单位:<el-input v-model="dynamicValidateForm.checkcompany" style="width: 120px;" placeholder="操作单位" ></el-input>
        </el-form-item>
        <table>
          <tr>
            <el-form-item>
              <td width="130px"><font size="4">工作单号</font></td>
              <td width="130px"><font size="4">件数</font></td>
              <td width="120px"><font size="4">重量</font></td>
              <td width="140px"><font size="4">方向</font></td>
              <td width="130px"><font size="4">类型</font></td>
            </el-form-item>
          </tr>
          <tr>
            <el-form-item
              v-for="(domain, index) in dynamicValidateForm.domains"
              :label="'单号' + (index+1)+':'"
              :key="domain.key"
              :prop="'domains.' + index + '.value'"
            >
              <td><el-input v-model="domain.id" placeholder="填写单号"></el-input></td>
              <td><el-input v-model="domain.cargocount" placeholder="合包号"></el-input></td>
              <td><el-input v-model="domain.weight" placeholder="重量"></el-input></td>
              <td><el-input v-model="domain.direction" placeholder="方向"></el-input></td>
              <td><el-select v-model="domain.cargotype" placeholder="请选择">
                <el-option
                  v-for="item in options3"
                  :key="item.id"
                  :label="item.name"
                  :value="item.id">
                </el-option>
              </el-select></td>

              <el-button @click.prevent="removeDomain(domain)">删除该行</el-button>
            </el-form-item>
          </tr>
        </table>
        <el-form-item>
          <el-button type="primary" @click="submitForm('dynamicValidateForm')">提交</el-button>
          <el-button @click="addDomain">新增一行表单</el-button>
          <el-button type="primary" @click="dialogFormVisible = false">取消</el-button>
        </el-form-item>
      </el-form>

    </el-dialog>


  </div>
</template>

<script>
  //
  import { list,insertsorStorage,userlist } from '@/api/sor/storage'

  import { pageList,detailList,insertCheckBound,deleteCheckBound,updateCheckBound,typeList } from '@/api/sor/checkBound'

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
      getlist(){
        pageList(this.storage,this.listQuery.pageNum,this.listQuery.pageSize).then(response => {
          this.list=response.data.items
          this.total=response.data.total
        })
        userlist().then(response => {
          this.users=response.data.userlist
        })
        typeList().then(response => {
          this.options3=response.data.typeList
        })
      },
      TostorageDetail(id){
        detailList(id).then(response => {
          this.storageDetails=response.data.listById
          console.debug(this.storageDetails)
          this.dialogFormVisible2 = true
        })
      },
      // 修改盘库信息
      insertSorAbnormal(){
        updateCheckBound(this.sorAbnormal).then(response => {
          this.$notify({
            title: '提示',
            message: response.data.message,
            type: 'success'
          });
          this.getlist();
          this.dialogFormVisible3= false
        })
      },
      // 新增盘库信息及盘库详情
      submitForm(formName) {
        console.debug(this.dynamicValidateForm)
        const somain=this.dynamicValidateForm.domains.filter(value => value.id == null)
        if(somain.length>0){

          this.$confirm('填写的信息不完整，请继续填写！', '提示', {
            confirmButtonText: '确定',
            cancelButtonText: '取消',
            type: 'warning'
          }).then(() => {

          })
        }else{
          insertCheckBound(this.dynamicValidateForm).then(response => {
            this.$notify({
              title: '提示',
              message: response.data.message,
              type: 'success'
            });
            this.dialogFormVisible = false
            this.dynamicValidateForm.domains =[]
            this.getlist()
          })
        }

      },
      openInser(){
        this.dialogFormVisible = true
        this.dynamicValidateForm= {domains: [{value: ''}],
        }
      },

      removeDomain(item) {
        var index = this.dynamicValidateForm.domains.indexOf(item)
        if (index !== -1) {
          this.dynamicValidateForm.domains.splice(index, 1)
        }
      },
      addDomain() {
        this.dynamicValidateForm.domains.push({
          value: '',
          key: Date.now()
        });
      },
      // 修改盘库信息
      updateTostorageDetail(id){
        const ds=this.list.filter(value => value.id ==id)
        this.sorAbnormal=ds[0]
        this.dialogFormVisible3= true
      },
      // 删除
      deleteTostorageDetail(id){
        deleteCheckBound(id).then(response => {
          this.$notify({
            title: '提示',
            message: response.data.message,
            type: 'success'
          });
          this.getlist();
        })
      }
    }
  }
</script>

<style scoped>

</style>
