<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="storage.id" placeholder="交接单号" style="width: 200px;" class="filter-item"/>
      <el-button class="filter-item" type="primary" icon="el-icon-search" >
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="success" icon="el-icon-circle-plus" @click="openInser">
        新增入库
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="warning" icon="el-icon-question" @click="dialogFormVisible3 = true">
        新增异常记录
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
      <!--     自定义列-->
      <el-table-column label="操作" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button @click="TostorageDetail(row.id)" style="background: #4A9FF9;color: white" title="查看明细" icon="el-icon-search" circle></el-button>
          <el-button @click="updateTostorageDetail(row.id)" type="primary" title="修改入库信息" icon="el-icon-edit" circle></el-button>
          <el-button @click="deleteTostorageDetail(row.id)"type="danger"  title="删除" icon="el-icon-delete" circle></el-button>
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
        <el-table-column label="单号" prop="id" sortable="custom" align="center" width="120px">
          <template slot-scope="scope">
            <span>{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column label="合包号" width="120px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.packageid }}</span>
          </template>
        </el-table-column>
        <el-table-column label="重量" min-width="75px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.weight }}</span>
          </template>
        </el-table-column>
        <el-table-column label="关联出单号" min-width="130px">
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
    </el-dialog>

    <!--新增异常信息-->
    <el-dialog  title="新增异常信息" :visible.sync="dialogFormVisible3" close-on-press-escape  center style="width: 100%">
      <table style="width: 98%;margin: 1px auto;text-align: center;">
        <tr>
          <td> 异常编号:<el-input style="width: 110px;" placeholder="新增异常编号"  :disabled="true"></el-input></td>
          <td> 异常类型: <el-select v-model="sorAbnormal.abnormaltype" style="width: 150px;">
            <el-option v-for="item in options"
                       :key="item.value"
                       :label="item.label"
                       :value="item.value"></el-option>
          </el-select></td>
          <td>状态:<el-select v-model="sorAbnormal.abostate" style="width: 150px"><el-option v-for="item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option></el-select></td>
        </tr>
        <tr>
          <td> 单号  ：<el-input v-model="sorAbnormal.cargoint" style="width: 120px;" placeholder="请输入单号" @change="sorAbnormalGetId(sorAbnormal.cargoint)"></el-input></td>
          <td> 合包号:<el-input v-model="sorAbnormal.packageint" style="width: 150px;" placeholder="请输入合包号"></el-input></td>
          <td> 交接单号:<el-input v-model="sorAbnormal.transferint" style="width: 120px;" placeholder="请输入交接号"></el-input></td>
        </tr>
        <tr>
          <td> 对冲号:<el-input v-model="sorAbnormal.hedgeAbnInt" style="width: 120px;" placeholder="请输入对冲异常号"></el-input></td>
          <td> 异常记录人:<el-select v-model="sorAbnormal.launchperson" placeholder="请选择" style="width: 120px;">
            <el-option
              v-for="item in users"
              :key="item.id"
              :label="item.username"
              :value="item.username"
              :disabled="item.status==1? false:true">
            </el-option>
          </el-select></td>
          <td>记录时间:
          <el-date-picker
            v-model="sorAbnormal.launchdate"
            align="right"
            type="date"
            placeholder="记录时间"
            style="width: 150px;"
            >
          </el-date-picker>
          </td>
        </tr>
        <tr>
          <td> </td>
          <td><el-button @click="dialogFormVisible3 = false">取消</el-button> <el-button type="primary" @click="insertSorAbnormal">新增</el-button></td>

          <td> </td>
        </tr>
      </table>
    </el-dialog>


    <!--新增入库及入库详情-->
    <el-dialog  :visible.sync="dialogFormVisible" close-on-press-escape  center >

      <el-form :model="dynamicValidateForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
        <el-form-item
          prop="email"
          label="交接单号"
        >
          <el-input v-model="dynamicValidateForm.id" style="width: 120px;" placeholder="入库交接单号" :disabled="true"></el-input>
          接货时间:<el-input v-model="dynamicValidateForm.acceptdate" style="width: 120px;" placeholder="接货时间" :disabled="true"></el-input>
          接货人:<el-select v-model="dynamicValidateForm.acceptperson" placeholder="请选择" style="width: 120px;">
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
          label="接收单位"
        >
          <el-input v-model="dynamicValidateForm.acceptcompany" style="width: 120px;" placeholder="接收单位" ></el-input>
          发货人:<el-select v-model="dynamicValidateForm.deliveryperson" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in users"
            :key="item.id"
            :label="item.username"
            :value="item.id"
            :disabled="item.status==1? false:true">
          </el-option>
        </el-select>
          发货单位:<el-input v-model="dynamicValidateForm.deliverycompany" style="width: 120px;" placeholder="发货单位" ></el-input>
        </el-form-item>
       <table>
         <tr>
         <el-form-item>
           <td width="130px"><font size="4">单号</font></td>
           <td width="130px"><font size="4">合包号</font></td>
           <td width="120px"><font size="4">重量</font></td>
           <td width="140px"><font size="4">出库交接单</font></td>
           <td width="130px"><font size="4">状态</font></td>
         </el-form-item>
         </tr>
          <tr>
        <el-form-item
          v-for="(domain, index) in dynamicValidateForm.domains"
          :label="'单号' + (index+1)+':'"
          :key="domain.key"
          :prop="'domains.' + index + '.value'"
        >
          <td><el-input v-model="domain.id" placeholder="填写单号" @change="getByWork(domain)"></el-input></td>
          <td><el-input v-model="domain.packageid" placeholder="合包号"></el-input></td>
          <td><el-input v-model="domain.weight" placeholder="重量"></el-input></td>
          <td><el-input v-model="domain.outboundid" placeholder="出库交接单"></el-input></td>
          <td><el-select v-model="domain.state" placeholder="请选择">
            <el-option
              v-for="item in options3"
              :key="item.value"
              :label="item.label"
              :value="item.value">
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


    <!--修改出库信息-->
    <el-dialog  title="修改出库信息" :visible.sync="dialogFormVisible4" close-on-press-escape  center style="width: 100%">
      <el-form :model="sorOutBoundForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
        <el-form-item
          prop="email"
          label="入库交接单号"
        >
          <el-input v-model="sorOutBoundForm.id" style="width: 120px;" placeholder="入库交接单号" :disabled="true"></el-input>
          发货单位:<el-input v-model="sorOutBoundForm.deliverycompany" style="width: 120px;" placeholder="发货单位" ></el-input>
          接收单位<el-input v-model="sorOutBoundForm.acceptcompany" style="width: 120px;" placeholder="接收单位" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item
          prop="email"
          label="出货单位"
        >
          <el-input v-model="sorOutBoundForm.deliverycompany" style="width: 120px;" placeholder="接收单位" ></el-input>
          接货人:<el-select v-model="sorOutBoundForm.acceptperson" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in users"
            :key="item.id"
            :label="item.username"
            :value="item.id"
            :disabled="item.status==1? false:true">
          </el-option>
        </el-select>

          发货人:<el-select v-model="sorOutBoundForm.deliveryperson" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in users"
            :key="item.id"
            :label="item.username"
            :value="item.id"
            :disabled="item.status==1? false:true">
          </el-option>
        </el-select>

        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="updateForm('dynamicValidateForm')">修改</el-button>
          <el-button type="primary" @click="dialogFormVisible4 = false">取消</el-button>
        </el-form-item>
      </el-form>
    </el-dialog>


  </div>
</template>

<script>
  //
  import { list,insertsorStorage,userlist,deleteSorStorage,updateSorStorage } from '@/api/sor/storage'
  import { findByStorageId,getByWorkId } from '@/api/sor/storageDetails'
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
        dialogFormVisible4:false,
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
        sorOutBoundForm:{id:null},
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
        list(this.storage,this.listQuery.pageNum,this.listQuery.pageSize).then(response => {
          this.list=response.data.items
          this.total=response.data.total
        })
        userlist().then(response => {
          this.users=response.data.userlist
        })
      },
      TostorageDetail(id){
        findByStorageId(id).then(response => {
          this.storageDetails=response.data.storageDetail
          console.debug(this.storageDetails)
          this.dialogFormVisible2 = true
        })
      },
      // 新增异常
      insertSorAbnormal(){
        console.debug(this.sorAbnormal)
        insertToSorAbnormal(this.sorAbnormal).then(response => {
          this.$notify({
            title: '提示',
            message: response.data.message,
            type: 'success'
          });
          this.sorAbnormal={}
          this.dialogFormVisible3 = false
        })
      },
      // 新增入库信息及入库详情
      submitForm(formName) {
        console.debug(this.dynamicValidateForm)
        const somain=this.dynamicValidateForm.domains.filter(value => value.id == null)
        if(somain.length>0){

          this.$confirm('填写的信息不完整，将会自动列为异常监控，是否继续?', '提示', {
            confirmButtonText: '确定',
            cancelButtonText: '取消',
            type: 'warning'
          }).then(() => {
            insertsorStorage(this.dynamicValidateForm).then(response => {
              this.$notify({
                title: '提示',
                message: response.data.message,
                type: 'success'
              });
              this.dialogFormVisible = false
              this.getlist()
              this.dynamicValidateForm.domains =[]
            })
          })
        }else{
          insertsorStorage(this.dynamicValidateForm).then(response => {
            this.$notify({
              title: '提示',
              message: response.data.message,
              type: 'success'
            });
            this.dialogFormVisible = false
            this.getlist()
            this.dynamicValidateForm.domains =[]
          })
        }


      },
      openInser(){
        this.dialogFormVisible = true
        this.dynamicValidateForm= {domains: [{value: ''}],
        }
      },
      // 删除一行
      removeDomain(item) {
        var index = this.dynamicValidateForm.domains.indexOf(item)
        if (index !== -1) {
          this.dynamicValidateForm.domains.splice(index, 1)
        }
      },
      // 添加一行
      addDomain() {
        this.dynamicValidateForm.domains.push({
          value: '',
          key: Date.now()
        });
      },
      // 根据id过滤入库信息，给表单
      updateTostorageDetail(id){
        const sorOutBoundToById=this.list.filter(value => value.id==id)
        this.sorOutBoundForm=sorOutBoundToById[0]
        this.dialogFormVisible4 = true
      },
      // 修改入库信息
      updateForm(){
        updateSorStorage(this.sorOutBoundForm).then(response => {
          this.$notify({
            title: '提示',
            message: response.data.message,
            type: 'success'
          });
          this.dialogFormVisible4 = false
          this.getlist()
        })
      },
      // 根据id删除
      deleteTostorageDetail(id){
        this.$confirm('删除后数据将永久删除，请谨慎选择?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          deleteSorStorage(id).then(response => {
            this.$notify({
              title: '提示',
              message: response.data.message,
              type: 'success'
            });
          })
          this.getlist()
        })
      },
      // 根据单号查询 信息
      getByWork(item){

        getByWorkId(item.id).then(response => {

          var index = this.dynamicValidateForm.domains.indexOf(item)
          if (index !== -1) {
            const domain={}
            domain.weight=response.data.worck.weight
            domain.packageid=response.data.worck.jobNo
            domain.outboundid=response.data.worck.stowageRequirements
            domain.id=item.id
            this.dynamicValidateForm.domains.splice(index, 1,domain)
          }

        })
      },
      // 异常单号查询单号信息
      sorAbnormalGetId(id){
        getByWorkId(id).then(response => {

            const domain={}
            domain.weight=response.data.worck.weight
            this.sorAbnormal.packageint=response.data.worck.jobNo
          this.sorAbnormal.transferint=response.data.worck.stowageRequirements
            domain.id=item.id
            this.dynamicValidateForm.domains.splice(index, 1,domain)

        })
      }
    }
  }
</script>

<style scoped>

</style>
