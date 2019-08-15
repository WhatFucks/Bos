<template>
  <div class="app-container">
    <div class="filter-container">
      入库单号:
      <el-input v-model="listQuery.warehouseno" placeholder="请输入入库单号" style="width: 200px;" class="filter-item"/>
      入库类型:
      <template>
        <el-select v-model="listQuery.reservoirtype" clearable placeholder="请选择入库类型" >
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

      <el-table-column label="入库单号" align="center" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.warehouseno }}</span>
        </template>
      </el-table-column>

      <el-table-column label="入库类型" align="center" min-width="150px" :formatter="getTypeList">

      </el-table-column>

      <el-table-column label="运输单号"  width="150px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.transport }}</span>
        </template>
      </el-table-column>

      <el-table-column label="所属单位" align="center" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.subordinateunit }}</span>
        </template>
      </el-table-column>

      <el-table-column label="备注" width="150px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.remark }}</span>
        </template>
      </el-table-column>

      <!-- 自定义列-->
      <el-table-column label="操作" align="center" width="200" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" style="width: 80px" type="info" @click="handleList(row.warehouseno)">
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
        :data="ItemsList"
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

        <el-table-column label="入库数量"  width="150px" align="center">

          <template slot-scope="{row}">
            <span class="link-type">{{ row.storagenum }}</span>
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

        <el-form-item label="入库类型" prop="reservoirtype" label-width="100px" maxlength="8" >
          <template>
            <el-select v-model="temp.reservoirtype" clearable  placeholder="请选择入库类型"  style="width: 300px;" >
              <el-option
                v-for="item in listType"
                :key="item.value"
                :label="item.label"
                :value="item.value">
              </el-option>
            </el-select>
          </template>
        </el-form-item>

        <el-form-item label="运输单号" prop="transport" label-width="100px">
          <el-input v-model="temp.transport" placeholder="请输入运输单号" style="width: 300px"  :disabled="true"/>
        </el-form-item>

        <el-form-item label="所属单位" prop="subordinateunit" label-width="100px" maxlength="8">
          <el-input v-model="temp.subordinateunit" placeholder="请输入所属单位" style="width: 300px" />
        </el-form-item>

        <el-form-item label="开单人工号" prop="drawerno" label-width="100px">
          <el-input v-model="temp.drawerno" placeholder="请输入开单人工号" style="width: 300px" />
        </el-form-item>

        <el-form-item label="开单人姓名" prop="drawername" label-width="100px" maxlength="8">
          <el-input v-model="temp.drawername" placeholder="请输入开单人姓名" style="width: 300px" />
        </el-form-item>

        <el-form-item label="备注" prop="remark" label-width="100px" maxlength="8">
          <el-input
            type="textarea"
            :rows="4"
            style="width: 300px"
            placeholder="请输入内容"
            v-model="temp.remark" >
          </el-input>
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

        <el-form-item label="入库数量" prop="storagenum" label-width="100px">
          <el-input v-model="temptwo.storagenum" placeholder="请输入入库数量" style="width: 300px" />
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
  import { list, insertpacking, updatepacking, StockItemList } from '@/api/body/ljw/stock'
  import {  insertitem, updateitem} from '@/api/body/ljw/stockItem'
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
            value:1,label:'初期库存'
          },
          {
            value:2,label:'调拨入库'
          },
          {
            value:3,label:'下发入库'
          },
          {
            value:4,label:'盘盈调整'
          }
        ],
        ItemsList:[],
        Dept:'',
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
          reservoirtype:'',
          transport: '',
          createTime: new Date(),
          subordinateunit: '',
          drawerno:'',
          drawername:'',
          remark:'',
          status:'',
          warehouseno:'',
          goodscode:'',
          goodsname: '',
          storagenum: '',
          actualnum:'',
          plannedprice:'',
          specifications:'',
          type:''
        },
        temptwo: { // 添加详情、修改时绑定的表单数据
          id: undefined,
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
        dialogitemStatus:'',
        //验证
        rules: {
          // goodscode: [{ required: true, message: '货物编码必填', trigger: 'blur' }],
          // goodsname: [{ required: true, message: '货物名称必填', trigger: 'blur' }],
          // storagenum: [{ required: true, message: '入库数量必填', trigger: 'blur' }],
          // actualnum: [{ required: true, message: '实际数量必填', trigger: 'blur' }],
          // plannedprice: [{ required: true, message: '计划价格必填', trigger: 'blur' }],
          // specifications: [{ required: true, message: '规格必填', trigger: 'blur' }],
          // type: [{ required: true, message: '类型必选', trigger: 'change' }],
          //
          // reservoirtype: [{ required: true, message: '入库类型必填', trigger: 'blur' }],
          // transport: [{ required: true, message: '运输单号必填', trigger: 'blur' }],
          // subordinateunit: [{ required: true, message: '所属单位必填', trigger: 'blur' }],
          // drawerno: [{ required: true, message: '开单人工号必填', trigger: 'blur' }],
          // drawername: [{ required: true, message: '开单人姓名必填', trigger: 'blur' }]
      },
        wno: '',
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
        //入库类型
      getTypeList(row){
        if (row.reservoirtype==1) {
          return '初期库存'
        }
        if (row.reservoirtype==2) {
          return '调拨入库'
        }
        if (row.reservoirtype==3) {
          return '下发入库'
        }
        if (row.reservoirtype==4) {
          return '盘盈调整'
        }
      },
      //入库详情类型
      getItemTypeList(row){
        if (row.type==1) {
          return '初期库存'
        }
        if (row.type==2) {
          return '调拨入库'
        }
        if (row.type==3) {
          return '下发入库'
        }
        if (row.type==4) {
          return '盘盈调整'
        }
      },
      // 去后台取数据的
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          this.uid = response.data.uid
          this.ulist= response.data.ulist
          this.temp.transport = response.data.MaxNo
          this.Dept=response.data.Dept
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
            //将入库表的warehouseno赋给详情的warehouseno
            this.temptwo.warehouseno = this.wno
            // 调用api里的sys里的user.js的ajax方法
            insertitem(this.temptwo).then((res) => {
              // 关闭对话框
              this.dialogStockitemVisible = false
              //刷新
              // this.handleList(warehouseno)
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
        console.debug(this.temptwo)
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
            updateitem(tempData).then((response) => {
              // 提交完毕，关闭对话框
              this.dialogStockitemVisible = false
              //刷新
              //this.handleList(warehouseno)
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
      //查询入库详情
      handleList(warehouseno) {
        //打开入库详情对话框
        this.dialogVisible=true
        this.title = '入库详情'
         StockItemList(warehouseno).then(response=>{
           this.ItemsList=response.data.ItemsList
         })
        this.wno = warehouseno
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
        this.temp.drawername=this.ulist
        this.temp.drawerno=this.uid
        this.temp.subordinateunit=this.Dept
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
            insertpacking(this.temp).then((res) => {
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
            this.temp.lastUpdateBy=getToken()
            const tempData = Object.assign({}, this.temp)
            console.debug(tempData)
            // 进行ajax提交
            updatepacking(tempData).then((response) => {
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
