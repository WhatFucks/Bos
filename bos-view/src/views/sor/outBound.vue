<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="storage.id" placeholder="交接单号" style="width: 200px;" class="filter-item"/>
      <el-button class="filter-item" type="primary" icon="el-icon-search" >
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="success" icon="el-icon-circle-plus" @click="openInser">
        新增出库
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
          <span class="link-type">{{row.deliveryPersonUsername}}</span>
        </template>
      </el-table-column>
      <el-table-column label="出货时间" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{row.enterdate | parseTime('{y}-{m}-{d} {h}:{i}')}}</span>
        </template>
      </el-table-column>
      <el-table-column label="出货单位" min-width="130px">
        <template slot-scope="{row}">
          <span class="link-type">{{row.deliverycompany}}</span>
        </template>
      </el-table-column>
      <!--     自定义列-->
      <el-table-column label="操作" align="center" width="180" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button @click="TostorageDetail(row.id)" style="background: #4A9FF9;color: white" title="查看明细" icon="el-icon-search" circle></el-button>
          <el-button @click="updateTostorageDetail(row.id)" type="primary" title="修改出库信息" icon="el-icon-edit" circle></el-button>
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
        <el-table-column label="是否下环节入库" min-width="130px">
          <template slot-scope="{row}">
            <el-tag :type="row.state === 1 ? 'primary' : 'success'" disable-transitions><font color="red">{{row.isnextstorage==false?'否':'是'}}</font>
            </el-tag>
          </template>
        </el-table-column>
        <el-table-column label="是否二次入库" min-width="120px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.isdoublestorage==false?'否':'是' }}</span>
          </template>
        </el-table-column>
      </el-table>
    </el-dialog>


    <!--修改出库信息-->
    <el-dialog  title="修改出库信息" :visible.sync="dialogFormVisible3" close-on-press-escape  center style="width: 100%">
      <el-form :model="sorOutBoundForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
        <el-form-item
          prop="email"
          label="出库交接单号"
        >
          <el-input v-model="sorOutBoundForm.id" style="width: 120px;" placeholder="出库交接单号" :disabled="true"></el-input>
          线路资源:<el-input v-model="sorOutBoundForm.line" style="width: 120px;" placeholder="接货时间" :disabled="true"></el-input>
          交接单类型:<el-select v-model="sorOutBoundForm.handovertype" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in sorOutType"
            :key="item.id"
            :label="item.typeName"
            :value="item.id">
          </el-option>
        </el-select>
        </el-form-item>
        <el-form-item
          prop="email"
          label="出货单位"
        >
          <el-input v-model="sorOutBoundForm.deliverycompany" style="width: 120px;" placeholder="接收单位" ></el-input>
          出货人:<el-select v-model="sorOutBoundForm.deliveryperson" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in users"
            :key="item.id"
            :label="item.username"
            :value="item.id"
            :disabled="item.status==1? false:true">
          </el-option>
        </el-select>

          出货人:<el-select v-model="sorOutBoundForm.acceptperson" placeholder="请选择" style="width: 120px;">
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
          <el-button type="primary" @click="dialogFormVisible3 = false">取消</el-button>
        </el-form-item>
      </el-form>
    </el-dialog>


    <!--新增出库及出库详情-->
    <el-dialog  :visible.sync="dialogFormVisible" close-on-press-escape  center >

      <el-form :model="dynamicValidateForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
        <el-form-item
          prop="email"
          label="出库交接单"
        ><el-input v-model="dynamicValidateForm.id" style="width: 120px;" placeholder="出库交接单" :disabled="true"></el-input>
          交接类型: <el-select v-model="dynamicValidateForm.handovertype" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in sorOutType"
            :key="item.id"
            :label="item.typeName"
            :value="item.id">
          </el-option>
        </el-select>
          线路资源:<el-input v-model="dynamicValidateForm.line" style="width: 120px;" placeholder="线路资源" ></el-input>
<!--          物流方向:<el-input v-model="dynamicValidateForm.direction" placeholder="物流方向" style="width: 120px;"></el-input>-->
        </el-form-item>
        <el-form-item
          prop="email"
          label="出货单位"
        >
          <el-input v-model="dynamicValidateForm.deliverycompany" style="width: 120px;" placeholder="接收单位" ></el-input>
          接货人:<el-select v-model="dynamicValidateForm.acceptperson" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in users"
            :key="item.id"
            :label="item.username"
            :value="item.id"
            :disabled="item.status==1? false:true">
          </el-option>
        </el-select>
          出货人:<el-select v-model="dynamicValidateForm.deliveryperson" placeholder="请选择" style="width: 120px;">
          <el-option
            v-for="item in users"
            :key="item.id"
            :label="item.username"
            :value="item.id"
            :disabled="item.status==1? false:true">
          </el-option>
        </el-select>
        </el-form-item>

          <table>
            <tr>
              <el-form-item>
                <td width="130px"><font size="4">单号</font></td>
                <td width="130px"><font size="4">合包号</font></td>
                <td width="120px"><font size="4">重量</font></td>
                <td width="140px"><font size="4">下环节入库</font></td>
                <td width="130px"><font size="4">二次入库</font></td>
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
                <td><el-select v-model="domain.isnextstorage" placeholder="请选择">
                  <el-option
                    v-for="item in options3"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                  </el-option>
                </el-select></td>
                <td><el-select v-model="domain.isdoublestorage" placeholder="请选择">
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


  </div>
</template>

<script>
  //
  import { sorStoragelist,insertsorStorage,updateToSorOutBound,deleteTosoroutBound,ListToSorOutBoundType} from '@/api/sor/outBound'
  import { findByStorageId} from '@/api/sor/outBoundDetails'
  import { getByWorkId } from '@/api/sor/storageDetails'
  import { userlist } from '@/api/sor/storage'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    components: { Pagination },
    data(){
      return {
        tag: {type: 'success', type2: 'danger'},
        sorOutType:{},
        sorOutBoundForm:{},
        options: [{value: '0', label: '有单无货'}, {value: '1', label: '有货无单'}],
        options2: [{value: '0', label: '已处理'}, {value: '1', label: '未处理'}],
        options3: [{value: 'true', label: '是'},{value: 'false', label: '否'}],
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
          }],
        }
      }
    },
    created() {
      this.getlist();
    },
    methods: {
      getlist(){
        sorStoragelist(this.storage,this.listQuery.pageNum,this.listQuery.pageSize).then(response => {
          this.list=response.data.items
          this.total=response.data.total
        })
        userlist().then(response => {
          this.users=response.data.userlist
        })
        ListToSorOutBoundType().then(response => {
          this.sorOutType=response.data.ListToSorOutBoundType
        })

      },
      TostorageDetail(id){
        findByStorageId(id).then(response => {
          this.storageDetails=response.data.sorOutBoundlist
          console.debug(this.storageDetails)
          this.dialogFormVisible2 = true
        })
      },
      // 新增入库信息及入库详情
      submitForm(formName) {
        console.debug(this.dynamicValidateForm)
        const somain=this.dynamicValidateForm.domains.filter(value => value.id == null)
        if(somain.length>0){
          this.$confirm('填写的信息不完整,请继续填写', '提示', {
            confirmButtonText: '确定',
            cancelButtonText: '取消',
            type: 'warning'
          }).then(() => {
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
      // 删除出库
      deleteTostorageDetail(id){
        deleteTosoroutBound(id).then(response => {
          this.$notify({
            title: '提示',
            message: response.data.message,
            type: 'success'
          });
        })
      },
      // 修改出库信息
      updateTostorageDetail(id){
        const sorOutBoundToById=this.list.filter(value => value.id==id)
        this.sorOutBoundForm=sorOutBoundToById[0]
        this.dialogFormVisible3 = true
      },
      updateForm(){
        console.debug(this.sorOutBoundForm)
        updateToSorOutBound(this.sorOutBoundForm).then(response => {
          this.$notify({
            title: '提示',
            message: response.data.message,
            type: 'success'
          });
          this.sorOutBoundForm={}
          this.dialogFormVisible3 = false
        })
      },
      // 根据单号查询 信息
      getByWork(item){

        getByWorkId(item.id).then(response => {

          var index = this.dynamicValidateForm.domains.indexOf(item)
          if (index !== -1) {
            const domain={}
            domain.weight=response.data.worck.weight
            domain.id=item.id
            this.dynamicValidateForm.domains.splice(index, 1,domain)
          }

        })
      }
    }
  }
</script>

<style scoped>

</style>
