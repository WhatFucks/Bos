<template>
  <div class="app-container">
    <div class="filter-container">
      物品编码:
      <el-input v-model="listQuery.itemcode" placeholder="请输入物品编码" style="width: 200px;" class="filter-item"/>
      物品名称:
      <el-input v-model="listQuery.itemname" placeholder="请输入物品名称" style="width: 200px;" class="filter-item"/>
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
        <!--        <template slot-scope="scope">-->
        <!--          <span>{{ scope.row.id }}</span>-->
        <!--        </template>-->
      </el-table-column>

      <el-table-column label="物品编码" align="center" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.itemcode }}</span>
        </template>
      </el-table-column>

      <el-table-column label="物品名称" align="center" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.itemname }}</span>
        </template>
      </el-table-column>

      <el-table-column label="计划价格"  width="150px" align="center">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.plannedprice }}</span>
        </template>
      </el-table-column>

      <el-table-column label="规格" align="center" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.specifications }}</span>
        </template>
      </el-table-column>

      <el-table-column label="类型" width="150px" align="center" :formatter="getTypeList">
<!--        <template slot-scope="{row}">-->
<!--          <span class="link-type">{{ row.type }}</span>-->
<!--        </template>-->
      </el-table-column>
      <!-- 自定义列-->
      <el-table-column label="操作" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            作废
          </el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />

    <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
      visible.sync 对话框是否显示
    -->
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px" style="width: 200px; margin-left:50px;">
        <!--        数据校验要求prop值和temp.属性名一致
        <el-form-item label="性别" prop="sex">
          <el-select v-model="temp.sex" class="filter-item" placeholder="请选择">
            <el-option v-for="item in sexList" :key="item.key" :label="item.lable" :value="item.key" />
          </el-select>
        </el-form-item>-->

        <el-form-item label="物品编码" prop="itemcode" label-width="100px" maxlength="8">
          <el-input v-model="temp.itemcode" :disabled="true" placeholder="请输入物品编码" style="width: 300px" />
        </el-form-item>

        <el-form-item label="物品名称" prop="itemname" label-width="100px">
          <el-input v-model="temp.itemname" placeholder="请输入物品名称" style="width: 300px" />
        </el-form-item>

        <el-form-item label="计划价格" prop="plannedprice" label-width="100px" maxlength="8">
          <el-input v-model="temp.plannedprice" placeholder="请输入计划价格" style="width: 300px" />
        </el-form-item>

<!--        <el-form-item label="规格" prop="specifications" label-width="100px">-->
<!--          <el-input v-model="temp.specifications" placeholder="请输入规格" style="width: 300px" />-->
<!--        </el-form-item>-->

        <el-form-item label="规格" prop="type" label-width="100px" maxlength="8">
          <template>
            <el-select v-model="temp.specifications" placeholder="请选择规格"  style="width: 300px;" >
              <el-option
                v-for="item in SetList"
                :key="item.value"
                :label="item.specifications"
                :value="item.specifications">
              </el-option>
            </el-select>
          </template>
        </el-form-item>

        <el-form-item label="类型" prop="type" label-width="100px" maxlength="8">
          <template>
            <el-select v-model="temp.type" placeholder="请选择类型"  style="width: 300px;" >
              <el-option
                v-for="item in TypeList"
                :key="item.value"
                :label="item.label"
                :value="item.value">
              </el-option>
            </el-select>
          </template>
        </el-form-item>

        <el-form-item label="操作人员工号" prop="operatorid" label-width="100px">
          <el-input v-model="temp.operatorid" placeholder="请输入操作人员工号" style="width: 300px;":readonly="true"  />
        </el-form-item>

        <el-form-item label="操作人姓名" prop="name" label-width="100px" maxlength="8">
          <el-input v-model="temp.operationunitid" placeholder="请输入操作人姓名" style="width: 300px" :readonly="true"/>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <!--
          dialogStatus==='create'?createData():updateData()
          dialogStatus需要我们根据情况去改变
        -->
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确认
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { list, insertpacking, updatepacking, deletepacking, Specificationslist } from '@/api/body/ljw/packaging'
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
        TypeList:[
          {
            value:1,label:'电子产品'
          },
          {
            value:2,label:'生活用品'
          }
        ],
        uid:'',
        ulist:'',
        tableKey: 0,
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 20, // 分页需要的每页显示多少条
          itemname: '',
          itemcode:''

        },
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          itemcode:'',
          itemname: '',
          createTime: new Date(),
          plannedprice: '',
          specifications:'',
          type:'',
          measurementunit:'',
          status:'',
          username:'',
          operationunitid:'',
          operatorid:''
        },
        title: '添加', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 表示表单是添加还是修改的
        rules: {
          plannedprice: [{ required: true, message: '计划价格必填', trigger: 'blur' }],
          itemname: [{ required: true, message: '物品名称必填', trigger: 'blur' }],
          specifications: [{ required: true, message: '规格必填', trigger: 'blur' }]
          // type: [{ required: true, message: '类型必选', trigger: 'blur' }],
          // createTime: [{ type: 'date', required: true, message: '必须选择一个时间', trigger: 'change' }],
          // lastUpdateTime: [{ required: true, message: 'Email必填', trigger: 'blur' }]
        },
        SetList:[]
      }
    },
    // 创建实例时的钩子函数
    created() {
      this.getList()
      this.DeptList()
      this.getSetList()
    },
    methods: {
      getSetList(){
        Specificationslist().then((response)=>{
          this.SetList=response.data.SetList
          console.debug("这是规格")
          console.debug(response.data.SetList)
        })
      },
      getTypeList(row){
        if (row.type==1) {
          return '电子产品'
        }
        if (row.type==2){
          return '生活用品'
        }
      },
      // 去后台取数据的
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          this.uid = response.data.uid
          this.temp.operationunitid= response.data.ulist
          this.temp.itemcode = response.data.MaxNo
        })
        this.listLoading = false
      },
      DeptList() {
        // allremar().then(response=>{
        //   this.options=response.data.options
        // })
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
        this.temp.operatorid=this.uid
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
      },
      handleDelete(row) {
        // 先弹确认取消框
        this.$confirm('此操作将永久作废【'+row.itemname+'】, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(()=>{
            // ajax去后台删除
            deletepacking(row.id).then((response)=>{
              this.getList()
              this.$notify({
                title: response.data.title,
                message: response.data.message,
                type: response.data.type,
                duration: 2000
              })
            })
          // }else {
          //   this.$notify({
          //     title: '提示',
          //     message: '不能删除当前角色!',
          //     type: 'warning',
          //     duration: 2000
          //   })
          // }
        })
      }
    }
  }
</script>
