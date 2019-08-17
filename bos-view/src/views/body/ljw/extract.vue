<template>

  <el-tabs v-model="activeName" @tab-click="handleClick">
    <el-tab-pane label="提货查询" name="first">

      <div class="app-container">
        <div class="filter-container">
          出港单位
          <el-input v-model="listQuery.id" placeholder="请输入出港单位" style="width: 200px;" class="filter-item"/>
          航班车次
          <el-input v-model="listQuery.vehicleint" placeholder="请输入航班车次" style="width: 200px;" class="filter-item"/>
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

          <el-table-column label="出港单位" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.id }}</span>
            </template>
          </el-table-column>

          <el-table-column label="航班车次" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.vehicleint }}</span>
            </template>
          </el-table-column>

          <el-table-column label="运输方式"  width="150px" align="center">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.transportway }}</span>
            </template>
          </el-table-column>

          <el-table-column label="货票号"  width="150px" align="center">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.waybillid }}</span>
            </template>
          </el-table-column>

          <el-table-column label="预计到港时间" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.estimatedate }}</span>
            </template>
          </el-table-column>

          <el-table-column label="件数" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.cargon }}</span>
            </template>
          </el-table-column>

          <!--      <el-table-column label="类型" width="150px" align="center" :formatter="getTypeList">-->
          <!--      </el-table-column>-->

          <el-table-column label="重要提示" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.importanthints }}</span>
            </template>
          </el-table-column>

          <!--      <el-table-column label="所属单位" align="center" min-width="150px">-->
          <!--        <template slot-scope="{row}">-->
          <!--          <span class="link-type">{{ row.affiliatedunit }}</span>-->
          <!--        </template>-->
          <!--      </el-table-column>-->

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

            <el-form-item label="出港单位" prop="id" label-width="100px" maxlength="8" >
              <template>
                <el-select v-model="temp.id" placeholder="请选择类型"  style="width: 300px;" >
                  <el-option
                    v-for="item in Allunits"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                  </el-option>
                </el-select>
              </template>
            </el-form-item>

            <el-form-item label="航班车次" prop="vehicleint" label-width="100px">
              <el-input v-model="temp.vehicleint" placeholder="请输入物品名称" style="width: 300px" />
            </el-form-item>

            <el-form-item label="运输方式" prop="transportway" label-width="100px" maxlength="8" >
              <template>
                <el-select v-model="temp.transportway" placeholder="请选择类型"  style="width: 300px;" >
                  <el-option
                    v-for="item in listType"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                  </el-option>
                </el-select>
              </template>
            </el-form-item>

            <el-form-item label="货票号" prop="waybillid" label-width="100px">
              <el-input v-model="temp.waybillid" placeholder="请输入物品名称" style="width: 300px" />
            </el-form-item>

            <el-form-item label="件数" prop="cargon" label-width="100px" maxlength="8">
              <el-input v-model="temp.cargon" placeholder="请输入计划价格" style="width: 300px" />
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

    </el-tab-pane>
    <el-tab-pane label="提货监控" name="second">

      <div class="app-container">
        <div class="filter-container">
          <el-input v-model="listQuery2.id" placeholder="请输入工作单位" style="width: 200px;" class="filter-item"/>
          <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
            搜索
          </el-button>
        </div>
        <!--  数据表格-->
        <el-table
          :key="tableKey"
          v-loading="listLoading"
          :data="lists"
          border
          fit
          highlight-current-row
          style="width: 100%;"
        >
          <el-table-column label="序号" prop="id"  type="index" sortable="custom" align="center" width="80">
          </el-table-column>

          <el-table-column label="工作单号" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.id }}</span>
            </template>
          </el-table-column>

          <el-table-column label="入库时间" align="center" min-width="150px">
            <template slot-scope="scope">
              <span>{{ scope.row.sorCheckbounddetails.storagedate | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
            </template>
          </el-table-column>

          <el-table-column label="到达地" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.destination }}</span>
            </template>
          </el-table-column>

          <el-table-column label="收货地址"  width="150px" align="center">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.tackcargoaddress }}</span>
            </template>
          </el-table-column>

          <el-table-column label="实际件数" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.cargocount }}</span>
            </template>
          </el-table-column>

          <el-table-column label="送达时限" align="center" min-width="150px">
            <template slot-scope="{row}">
              <span class="link-type">{{ row.timelimit }}</span>
            </template>
          </el-table-column>


        </el-table>
        <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
        <pagination v-show="total>0" :total="total" :page.sync="listQuery2.page" :limit.sync="listQuery.limit" @pagination="getList" />

        <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
          visible.sync 对话框是否显示
        -->
        <el-dialog :title="title" :visible.sync="dialogFormVisible">
          <!--
              rules:校验规则
              model:数据绑定
          -->
          <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px" style="width: 200px; margin-left:50px;">

            <el-form-item label="航班车次" prop="vehicleint" label-width="100px" maxlength="8">
              <el-input v-model="temp.vehicleint" placeholder="请输入物品编码" style="width: 300px" />
            </el-form-item>

            <el-form-item label="货票号" prop="waybillid" label-width="100px">
              <el-input v-model="temp.waybillid" placeholder="请输入物品名称" style="width: 300px" />
            </el-form-item>

            <el-form-item label="件数" prop="cargon" label-width="100px" maxlength="8">
              <el-input v-model="temp.cargon" placeholder="请输入计划价格" style="width: 300px" />
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

    </el-tab-pane>
  </el-tabs>


</template>

<script>
  import { list,Iaelist,add } from '@/api/body/ljw/extract'
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
        uid: '',
        ulist: '',
        ZXC: '',
        tableKey: 0,
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 20, // 分页需要的每页显示多少条
          id: '',
          vehicleint: ''
        },
        listQuery2: {
          page: 1, // 分页需要的当前页
          limit: 20, // 分页需要的每页显示多少条
          id: ''
        },
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          vehicleint: '',
          cargon: '',
          waybillid: '',
          vehicleint: ''
        },
        lists: [],
        title: '添加', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 表示表单是添加还是修改的
        rules: {
          // sex: [{ required: true, message: '性别必须选', trigger: 'change' }],
          id: [{required: true, message: '出港单位必选', trigger: 'blur'}],
          vehicleint: [{ required: true, message: '航班车次必填', trigger: 'blur' }],
          waybillid: [{ required: true, message: '货票号必填', trigger: 'blur' }],
          // createTime: [{ type: 'date', required: true, message: '必须选择一个时间', trigger: 'change' }],
          cargon: [{ required: true, message: '件数必填', trigger: 'blur' }],
          transportway: [{ required: true, message: '运输方式必选', trigger: 'blur' }]
        },
        listType: [{
          value: '航空', label: '航空'
        }, {
          value: '铁路', label: '铁路'
        }, {
          value: '货车', label: '货车'
        }, {
          value: '零担', label: '零担'
        }, {
          value: '周边物流', label: '周边物流'
        }, {
          value: '临时发车', label: '临时发车'
        }],
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
        ]
      }
    },
    // 创建实例时的钩子函数
    created() {
      this.getList()
      this.getIaeList()
    },
    methods: {
      // 去后台取数据的
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.items
          this.total = response.data.total
          console.debug("工作党")
          this.temp.id = response.data.ZXC
        })
        this.listLoading = false
      },
      getIaeList() {
        Iaelist(this.listQuery2).then(response =>{
          console.debug("这是监控")
          this.lists=response.data.items
          console.debug(response.data.items)
        })
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
            add(this.temp).then((res) => {
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
          // if (row.name!=this.temp.name) {
          // ajax去后台删除
          deletepacking(row.id).then(()=>{
            this.getList()
            this.$notify({
              title: '成功',
              message: '删除成功',
              type: 'success',
              duration: 2000
            })
          })
        })
      }
    }
  }
</script>
