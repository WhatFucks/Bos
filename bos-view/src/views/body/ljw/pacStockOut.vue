<template>
  <div class="app-container">
    <div class="filter-container">
      出库单号:
      <el-input v-model="listQuery.warehouseorderno" placeholder="请输入出库单号" style="width: 200px;" class="filter-item"/>
      出库类型:
      <template>
        <el-select v-model="listQuery.warehousetype" clearable placeholder="请选择出库类型" >
          <el-option
            v-for="item in listType"
            :key="item.value"
            :label="item.label"
            :value="item.value">
          </el-option>
        </el-select>
      </template>
      <!--      <el-input v-model="listQuery.itemname" placeholder="请输入物品名称" style="width: 200px;" class="filter-item"/>-->
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        搜索
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        添加
      </el-button>
    </div>
    <!--  数据表格-->
    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="序号" prop="id"  type="index" sortable="custom" align="center" width="80">
      </el-table-column>

      <el-table-column label="出库单号" align="center" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.warehouseorderno }}</span>
        </template>
      </el-table-column>

      <el-table-column label="出库类型" align="center" min-width="150px" :formatter="getTypeList">

      </el-table-column>

      <el-table-column label="运输单号"  width="150px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.transportationorderno }}</span>
        </template>
      </el-table-column>

      <el-table-column label="所属单位" align="center" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.affiliatedunit }}</span>
        </template>
      </el-table-column>

      <el-table-column label="下发单位" width="150px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.issuedbytheunit }}</span>
        </template>
      </el-table-column>

<!--      <el-table-column label="经办人单位" width="150px" align="center">-->
<!--        <template slot-scope="{row}">-->
<!--          <span class="link-type">{{ row.handlingunit }}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->

<!--      <el-table-column label="经办人姓名" width="150px" align="center">-->
<!--        <template slot-scope="{row}">-->
<!--          <span class="link-type">{{ row.handlingname}}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->

      <el-table-column label="客户名称" width="150px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.customname }}</span>
        </template>
      </el-table-column>

<!--      <el-table-column label="领用时间" width="150px" align="center">-->
<!--        <template slot-scope="scope">-->
<!--          <span>{{ scope.row.recipienttime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>-->
<!--        </template>-->
<!--      </el-table-column>-->

      <!-- 自定义列-->
      <el-table-column label="操作" align="center" width="200" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" style="width: 80px" type="info" @click="handleList(row)">
            查看明细
          </el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />

    <el-dialog :title="title" :visible.sync="dialogVisible" width="90%" >
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <div>
        <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="insertCreate">
          添加明细
        </el-button>
      </div>
      <br>

      <el-table
        :key="tableKey"
        v-loading="listLoading"
        :data="OutItemList"
        border
        fit
        highlight-current-row
        style="width: 100%;"
      >

        <el-table-column label="序号" prop="id"  type="index" sortable="custom" align="center" width="80"></el-table-column>

        <el-table-column label="货物编码" align="center" min-width="150px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.goodscode }}</span>
          </template>
        </el-table-column>

        <el-table-column label="货物名称" align="center" min-width="150px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.goodsname }}</span>
          </template>
        </el-table-column>

        <el-table-column label="出库数量"  width="150px" align="center">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.storageoutnum }}</span>
          </template>
        </el-table-column>

        <el-table-column label="实际数量" align="center" min-width="150px">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.actualnum }}</span>
          </template>
        </el-table-column>

        <el-table-column label="计划价格" width="150px" align="center">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.plannedprice }}</span>
          </template>
        </el-table-column>

        <el-table-column label="规格" width="150px" align="center">
          <template slot-scope="{row}">
            <span class="link-type">{{ row.specifications }}</span>
          </template>
        </el-table-column>

        <el-table-column label="类型" width="150px" align="center" :formatter="getItemTypeList">
        </el-table-column>

        <!-- 自定义列-->
        <el-table-column label="操作" align="center" width="200" class-name="small-padding fixed-width">
          <template slot-scope="{row}">
            <el-button size="mini" style="width: 80px" type="info" @click="updateCreate(row)">
              编辑
            </el-button>

          </template>
        </el-table-column>
      </el-table>
    </el-dialog>

    <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
      visible.sync 对话框是否显示
    -->
    <!--  入库管理添加修改的dialog
    -->
    <el-dialog :title="title" :visible.sync="dialogFormVisible" customClass="customWidth">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px" style="width: 200px; margin-left:50px;">

              <el-form-item label="出库类型" prop="warehousetype" label-width="100px" maxlength="8" >
                <template>
                  <el-select v-model="temp.warehousetype" placeholder="请选择出库类型"  style="width: 300px;" >
                    <el-option
                      v-for="item in listType"
                      :key="item.value"
                      :label="item.label"
                      :value="item.value">
                    </el-option>
                  </el-select>
                </template>
              </el-form-item>

              <el-form-item label="下发单位" prop="issuedbytheunit" label-width="100px" maxlength="8">
                <template>
                  <el-select v-model="temp.issuedbytheunit" placeholder="请选择经下发单位"  style="width: 300px;" >
                    <el-option
                      v-for="item in Allunits"
                      :key="item.value"
                      :label="item.label"
                      :value="item.value">
                    </el-option>
                  </el-select>
                </template>
              </el-form-item>

              <el-form-item label="运输单号" prop="transportationorderno" label-width="100px">
                <el-input v-model="temp.transportationorderno" placeholder="请输入运输单号" style="width: 300px" :disabled="true"  />
              </el-form-item>

              <el-form-item label="客户编号" prop="customcode" label-width="100px">
                <el-input v-model="temp.customcode" placeholder="请输入客户编号" style="width: 300px" />
              </el-form-item>

              <el-form-item label="客户姓名" prop="customname" label-width="100px" maxlength="8">
                <el-input v-model="temp.customname" placeholder="请输入客户姓名" style="width: 300px" />
              </el-form-item>

              <el-form-item label="开单人工号" prop="billingjobnumber" label-width="100px" maxlength="8" >
                <el-input v-model="temp.billingjobnumber" placeholder="请输入开单人工号" style="width: 300px" :readonly="true"/>
              </el-form-item>

              <el-form-item label="开单人姓名" prop="billingname" label-width="100px" maxlength="8" >
                <el-input v-model="temp.billingname" placeholder="请输入开单人姓名" style="width: 300px" :readonly="true"/>
              </el-form-item>

              <el-form-item label="所属单位" prop="affiliatedunit" label-width="100px">
                <el-input v-model="temp.affiliatedunit" placeholder="请输入所属单位" style="width: 300px" :readonly="true"/>
              </el-form-item>

              <el-form-item label="经办人单位" prop="handlingunit" label-width="100px" maxlength="8" >
                <template>
                  <el-select v-model="temp.handlingunit" placeholder="请选择经办人单位"  style="width: 300px;" >
                    <el-option
                      v-for="item in Allunits"
                      :key="item.value"
                      :label="item.label"
                      :value="item.value">
                    </el-option>
                  </el-select>
                </template>
              </el-form-item>

              <el-form-item label="经办人姓名" prop="handlingname" label-width="100px" maxlength="8">
                <el-input v-model="temp.handlingname" placeholder="请输入经办人姓名" style="width: 300px" />
              </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>

        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确认
        </el-button>
      </div>
    </el-dialog>
    <!-- 查看详情里添加修改的dialog -->
    <el-dialog :title="title" :visible.sync="dialogStockitemVisible" customClass="customWidth">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px" style="width: 200px; margin-left:50px;">

        <el-form-item label="货物编码" prop="goodscode" label-width="100px">
          <el-input v-model="temptwo.goodscode" placeholder="请输入货物编码" style="width: 300px" />
        </el-form-item>

        <el-form-item label="货物名称" prop="goodsname" label-width="100px" maxlength="8">
          <el-input v-model="temptwo.goodsname" placeholder="请输入货物名称" style="width: 300px" />
        </el-form-item>

        <el-form-item label="出库数量" prop="storageoutnum" label-width="100px">
          <el-input v-model="temptwo.storageoutnum" placeholder="请输入出库数量" style="width: 300px" />
        </el-form-item>

        <el-form-item label="实际数量" prop="actualnum" label-width="100px" maxlength="8">
          <el-input v-model="temptwo.actualnum" placeholder="请输入实际数量" style="width: 300px" />
        </el-form-item>

        <el-form-item label="计划价格" prop="plannedprice" label-width="100px" maxlength="8">
          <el-input v-model="temptwo.plannedprice" placeholder="请输入计划价格" style="width: 300px" />
        </el-form-item>

        <el-form-item label="规格" prop="specifications" label-width="100px" maxlength="8">
          <template>
            <el-select v-model="temptwo.specifications" placeholder="请选择规格"  style="width: 300px;" >
              <el-option
                v-for="item in SetList"
                :key="item.value"
                :label="item.specifications"
                :value="item.specifications">
              </el-option>
            </el-select>
          </template>
        </el-form-item>

<!--        <el-form-item label="规格" prop="specifications" label-width="100px" maxlength="8">-->
<!--          <el-input v-model="temptwo.specifications" placeholder="请输入规格" style="width: 300px" />-->
<!--        </el-form-item>-->

        <el-form-item label="类型" prop="type" label-width="100px" maxlength="8" >
          <template>
            <el-select v-model="temptwo.type" placeholder="请选择类型"  style="width: 300px;" >
              <el-option
                v-for="item in listType"
                :key="item.value"
                :label="item.label"
                :value="item.value">
              </el-option>
            </el-select>
          </template>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <el-button type="primary" @click="dialogitemStatus==='create'?createitemData():updateitemData()">
          确认
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { Specificationslist } from '@/api/body/ljw/packaging'
  import { list, insertstockout, updatestockout, } from '@/api/body/ljw/stockout'
  import {  OutItemlists,insertoutitem, updateoutitem} from '@/api/body/ljw/stockoutitem'
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import {getToken} from '@/utils/auth'
  import Pagination from '@/components/Pagination'
  export default {
    name: 'userTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        listType:[
          {
            value:1,label:'调拨出库'
          },
          {
            value:2,label:'下发出库'
          },
          {
            value:3,label:'盘亏调整'
          },
          {
            value:4,label:'核销出库'
          },
          {
            value:5,label:'领用出库'
          }
        ],
        OutItemList:[],
        menu:[],
        uid:'',
        ulist:'',
        tableKey: 0,
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 20, // 分页需要的每页显示多少条
          warehouseno: ''

        },
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          deptId:'',
          affiliatedunit:'',
          warehouseorderno:'',
          warehousetype: '',
          createTime: new Date(),
          transportationorderno: '',
          affiliatedunit:'',
          issuedbytheunit:'',
          handlingunit:'',
          handlingname:'',
          customcode:'',
          customname:'',
          recipientjobnumber: '',
          recipientname: '',
          recipienttime:'',
          billingjobnumber:'',
          billingname:'',
          billingtime:''
        },
        temptwo: { // 添加详情、修改时绑定的表单数据
          id: undefined,
          warehouseorderno:'',
          goodscode:'',
          goodsname: '',
          createTime: new Date(),
          storagenum: '',
          actualnum:'',
          plannedprice:'',
          specifications:'',
          type:''
        },
        title: '', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogVisible: false,
        dialogStockitemVisible:false,
        dialogStatus: '', // 表示表单是添加还是修改的
        dialogitemStatus: '',
        //验证
        rules: {
          // customcode: [{ required: true, message: '客户编号必填', trigger: 'blur' }],
          // customname: [{ required: true, message: '客户姓名必填', trigger: 'blur' }],
          // handlingname: [{ required: true, message: '经办人姓名必填', trigger: 'blur' }],
          // goodscode: [{ required: true, message: '货物编码必填', trigger: 'blur' }],
          // goodsname: [{ required: true, message: '货物名称必填', trigger: 'blur' }],
          // storageoutnum: [{ required: true, message: '出库数量必填', trigger: 'blur' }],
          // actualnum: [{ required: true, message: '实际数量必填', trigger: 'blur' }],
          // plannedprice: [{ required: true, message: '计划价格必填', trigger: 'blur' }],
          // specifications: [{ required: true, message: '规格必填', trigger: 'blur' }]
        },
        wno: '',
        deptList:[],
        HGI:'',
        Allunits:[
          {
            value:'长沙总部',label:'长沙总部'
          },
          {
            value:'成都分部',label:'成都分部'
          },
          {
            value:'衡阳分部',label:'衡阳分部'
          },
          {
            value:'宜宾分部',label:'宜宾分部'
          },
          {
            value:'温州总部',label:'温州总部'
          },
          {
            value:'长沙分部',label:'长沙分部'
          },
          {
            value:'广州分部',label:'广州分部'
          },
          {
            value:'惠州分部',label:'惠州分部'
          },
          {
            value:'佛山分部',label:'佛山分部'
          },
          {
            value:'技术部',label:'技术部'
          },
          {
            value:'宣传部',label:'宣传部'
          },
          {
            value:'市场部',label:'市场部'
          },
          {
            value:'销售部',label:'销售部'
          }
        ],
        menu:'',
        SetList:[]
      }
    },
    // 创建实例时的钩子函数
    created() {
      this.getList()
      this.getGuiList()
    },
    methods: {
      getGuiList(){
        Specificationslist().then(res =>{
          this.SetList=res.data.SetList
        })
      },
      //出库类型
      getTypeList(row){
        if (row.warehousetype==1) {
          return '调拨出库'
        }
        if (row.warehousetype==2) {
          return '下发出库'
        }
        if (row.warehousetype==3) {
          return '盘亏调整'
        }
        if (row.warehousetype==4) {
          return '核销出库'
        }
        if (row.warehousetype==5) {
          return '领用出库'
        }
      },
      //入库详情类型
      getItemTypeList(row){
        if (row.type==1) {
          return '调拨出库'
        }
        if (row.type==2) {
          return '下发出库'
        }
        if (row.type==3) {
          return '盘亏调整'
        }
        if (row.type==4) {
          return '核销出库'
        }
        if (row.type==5) {
          return '领用出库'
        }
      },
      // 去后台取数据的
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          console.debug(response)
          this.list = response.data.items
          this.total = response.data.total
          this.uid = response.data.uid
          this.ulist = response.data.ulist
          this.menu=response.data.menu
          this.HGI=response.data.HGI
          this.menu=response.data.menu
          // this.temp.transport = response.data.MaxNo
        })
        this.listLoading = false
      },
      //查看详情里添加详情
      insertCreate(){
        // 重置表单数据
        this.resetTemp()
        // 点击确定时，是执行添加操作
        this.dialogitemStatus = 'create'
        this.title="添加"
        //打开添加详情对话框
        this.dialogStockitemVisible=true
        this.$nextTick(() => {
          // 表单清除验证
          this.$refs['dataForm'].clearValidate()
        })
      },
      //点击确定执行添加详情操作
      createitemData(){
        this.$refs['dataForm'].validate((valid) => {
          // 所有的校验都通过
          if (valid) {
            //将入出库表的warehouseno赋给详情的warehouseno
            this.temptwo.warehouseorderno = this.wno
            // 调用api里的sys里的user.js的ajax方法
            insertoutitem(this.temptwo).then((res) => {
              // 关闭对话框
              this.dialogStockitemVisible = false
              //刷新
              // this.handleList(row)
              // 显示一个通知
              this.$notify({
                title: res.data.title,
                message: res.data.message,
                type: res.data.type,
                duration: 2000
              })
            })
          }
        })
      },
      //显示修改详情对话框
      updateCreate(row){
        // 将row里面与temp里属性相同的值，进行copy
        this.temptwo = Object.assign({}, row) // copy obj
        console.debug("-----------------------------")
        // 将对话框里的确定点击时，改为执行修改操作
        this.dialogitemStatus = 'update'
        // 修改标题
        this.title = '修改'
        // 显示修改对话框
        this.dialogStockitemVisible = true
        this.$nextTick(() => {
          // 清除校验
          this.$refs['dataForm'].clearValidate()
        })
      },
      //点击确定执行修改操作
      updateitemData(){
        this.$refs['dataForm'].validate((valid) => {
          // 表单校验通过
          if (valid) {
            // 将temp拷贝到tempData
            const tempData = Object.assign({}, this.temptwo)
            console.debug(tempData)
            // 进行ajax提交
            updateoutitem(tempData).then((response) => {
              // 提交完毕，关闭对话框
              this.dialogStockitemVisible = false
              //刷新
             // this.handleList(row)
              // 显示通知
              this.$notify({
                title: response.data.title,
                message: response.data.message,
                type: response.data.type,
                duration: 2000
              })
            })
          }
        })
      },
      //查询出库详情
      handleList(row) {
        //打开出库详情对话框
        this.dialogVisible=true
        this.title = '出库详情'
        OutItemlists(row.warehouseorderno).then(response=>{
          this.OutItemList=response.data.OutItemList
        })
        this.wno = row.warehouseorderno
        this.listLoading = false
      },
      // 重置表单数据
      resetTemp() {
        this.temp = {
          id: undefined,
          name: '',
          // introduction: '',
          createTime: new Date(),
          createBy: '',
          remark: ''
        }
      },
      // 显示添加的对话框
      handleCreate () {
        // 重置表单数据
        this.resetTemp()
        // 点击确定时，是执行添加操作
        this.dialogStatus = 'create'
        this.title="添加"
        // 显示对话框
        this.dialogFormVisible = true
        this.temp.billingname =this.ulist
        this.temp.billingjobnumber=this.uid
        this.temp.affiliatedunit =this.menu
        this.temp.transportationorderno = this.HGI
        this.getList()
        this.$nextTick(() => {
          // 表单清除验证
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 添加对话框里，点击确定，执行添加操作
      createData() {
        // 表单校验
        this.$refs['dataForm'].validate((valid) => {
          // 所有的校验都通过
          if (valid) {
            // 调用api里的sys里的user.js的ajax方法
            insertstockout(this.temp).then((res) => {
              // 关闭对话框
              this.dialogFormVisible = false
              //刷新
              this.getList()
              // 显示一个通知
              this.$notify({
                title: res.data.title,
                message: res.data.message,
                type: res.data.type,
                duration: 2000
              })
            })
          }
        })
      },
      // 显示修改对话框
      handleUpdate(row) {
        // 将row里面与temp里属性相同的值，进行copy
        this.temp = Object.assign({}, row) // copy obj
        // 将对话框里的确定点击时，改为执行修改操作
        this.dialogStatus = 'update'
        // 修改标题
        this.title = '修改'
        // 显示修改对话框
        this.dialogFormVisible = true
        this.$nextTick(() => {
          // 清除校验
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 执行修改操作
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          // 表单校验通过
          if (valid) {
            // 将temp拷贝到tempData
            const tempData = Object.assign({}, this.temp)
            console.debug(tempData)
            // 进行ajax提交
            updatestockout(tempData).then((response) => {
              // 提交完毕，关闭对话框
              this.dialogFormVisible = false
              //刷新
              this.getList()
              // 显示通知
              this.$notify({
                title: response.data.title,
                message: response.data.message,
                type: response.data.type,
                duration: 2000
              })
            })
          }
        })
      }
    }
  }
</script>
<style>
  .customWidth{
    width:40%;
  }
</style>
