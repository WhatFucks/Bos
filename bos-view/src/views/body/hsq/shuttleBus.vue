<!--班车设置表-->

<template>
  <div class="app-container">
    <div class="filter-container">
<!--      <el-input v-model="listQuery.name" placeholder="name" style="width: 200px;" class="filter-item" @keyup.enter.native="handleFilter" />-->
<!--      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">-->
<!--        查询-->
<!--      </el-button>-->
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        添加
      </el-button>
    </div>

    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="ID" prop="id" sortable="custom" type="index" align="center" width="60">
      </el-table-column>
      <el-table-column prop="linetype"  label="线路类型" width="90px" align="center" :formatter="linetypeStr">
<!--        <template slot-scope="scope">-->
<!--          <span>{{ scope.row.linetype }}</span>-->
<!--&lt;!&ndash;          <span v-if="scope.row.linetype=='1'">全部</span>&ndash;&gt;-->
<!--&lt;!&ndash;          <span v-if="scope.row.linetype=='2'">干线</span>&ndash;&gt;-->
<!--&lt;!&ndash;          <span v-if="scope.row.linetype=='3'">周边</span>&ndash;&gt;-->
<!--&lt;!&ndash;          <span v-if="scope.row.linetype=='4'">省内</span>&ndash;&gt;-->
<!--&lt;!&ndash;          <span v-if="scope.row.linetype=='5'">临时</span>&ndash;&gt;-->
<!--&lt;!&ndash;          <span v-if="scope.row.linetype=='6'">市内</span>&ndash;&gt;-->

<!--        </template>-->
      </el-table-column>
      <el-table-column label="线路名称" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.logTrack.linename }}</span>
        </template>
      </el-table-column>
      <el-table-column label="车牌号" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.licenseplateint }}</span>
        </template>
      </el-table-column>

      <el-table-column label="承运商" width="80px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.carrier }}</span>
        </template>
      </el-table-column>

      <el-table-column label="车型" width="80px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.models }}</span>
        </template>
      </el-table-column>
      <el-table-column label="司机" width="80px" align="center">
      <template slot-scope="scope">
        <span>{{ scope.row.driver }}</span>
      </template>
      </el-table-column>
      <el-table-column label="电话" width="120px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.telephone }}</span>
        </template>
      </el-table-column>
      <el-table-column label="吨控" width="70px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.ton }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作人员" width="90px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.user.username }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作单位" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.dept.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作时间" width="140px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.operationtime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="160" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />

    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="shuttleBus" label-position="left" label-width="110px" style="width: 400px; margin-left:50px;">
        <el-form-item label="线路类型" prop="linetype">
          <!--<el-input v-model="shuttleBus.linetype" placeholder="请输入线路类型"/>-->
<!--          <el-dropdown-item v-model="shuttleBus.linetype">全部</el-dropdown-item>-->
<!--          <el-dropdown-item v-model="shuttleBus.linetype">干线</el-dropdown-item>-->
<!--          <el-dropdown-item v-model="shuttleBus.linetype">周边</el-dropdown-item>-->
<!--          <el-dropdown-item v-model="shuttleBus.linetype">省内</el-dropdown-item>-->
<!--          <el-dropdown-item v-model="shuttleBus.linetype">临时</el-dropdown-item>-->
<!--          <el-dropdown-item v-model="shuttleBus.linetype">市内</el-dropdown-item>-->
          <template>
            <el-select v-model="shuttleBus.linetype" placeholder="请选择">
              <el-option
                v-for="item in options"
                :key="item.value"
                :label="item.label"
                :value="item.value">
              </el-option>
            </el-select>
          </template>
        </el-form-item>
        <el-form-item label="车牌号" prop="licenseplateint">
          <el-input v-model="shuttleBus.licenseplateint" placeholder="请输入车牌号"/>
        </el-form-item>
        <el-form-item label="承运商" prop="carrier">
          <el-input v-model="shuttleBus.carrier" placeholder="请输入承运商"/>
        </el-form-item>
         <el-form-item label="车型" prop="models">
           <el-input v-model="shuttleBus.models" placeholder="请输入车型"/>
         </el-form-item>
         <el-form-item label="司机" prop="driver">
           <el-input v-model="shuttleBus.driver" placeholder="请输入司机"/>
         </el-form-item>
        <el-form-item label="电话" prop="telephone">
          <el-input v-model="shuttleBus.telephone" placeholder="请输入电话"/>
        </el-form-item>
        <el-form-item label="吨控" prop="ton">
          <el-input v-model="shuttleBus.ton" placeholder="请输入吨控"/>
        </el-form-item>
        <el-form-item label="备注" prop="ton">
          <el-input v-model="shuttleBus.remarks" placeholder="请输入备注"/>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确定
        </el-button>
      </div>

    </el-dialog>
  </div>
</template>

<script>
  // import { fetchList, fetchPv, createArticle, updateArticle } from '@/api/article'
  import { add, deleteById, update, list } from '@/api/body/hsq/shuttleBus'
  import waves from '@/directive/waves' // waves directive
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination

  export default {
    name: 'ComplexTable',
    components: { Pagination },
    directives: { waves },
    filters: {
      statusFilter(status) {
        const statusMap = {
          published: 'success',
          draft: 'info',
          deleted: 'danger'
        }
        return statusMap[status]
      },
      typeFilter(type) {
        return calendarTypeKeyValue[type]
      }
    },
    data() {
      return {
        options: [{
          value: 1,
          label: '全部'
        }, {
          value: 2,
          label: '干线'
        }, {
          value: 3,
          label: '周边'
        }, {
          value: 4,
          label: '省内'
        }, {
          value: 5,
          label: '临时'
        },{
          value: 6,
          label: '市内'
        }],

        tableKey: 0,
        list: null,
        total: 0,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 10
        },
        shuttleBus: {
          id: undefined,
          linetype: '',
          lineid:'',
          licenseplateint: '',
          carrier:'',
          models:'',
          driver:'',
          telephone:'',
          ton:'',
          OperatorID:'',
          OperationUnitID:''
        },
        dialogFormVisible: false,
        dialogStatus: '',
        title: '添加',
        rules: {
          linetype: [{ required: true, message: '线路类型不能为空', trigger: 'change' }],
          licenseplateint: [{ required: true, message: '车牌号不能为空', trigger: 'change' }],
          carrier: [{ required: true, message: '承运商不能为空', trigger: 'change' }],
          models: [{ required: true, message: '车型不能为空', trigger: 'change' }],
          driver: [{ required: true, message: '司机不能为空', trigger: 'change' }],
          telephone: [{ required: true, message: '电话不能为空', trigger: 'change' }],
          ton: [{ required: true, message: '吨控不能为空', trigger: 'change' }],
          remarks: [{ required: true, message: '备注不能为空', trigger: 'change' }]
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      linetypeStr(val){
        if(val.linetype==1){
          return '全部'
        }else if(val.linetype==2){
          return '干线'
        }else if (val.linetype==3){
          return '周边'
        }else if(val.linetype==4){
          return '省内'
        }else if(val.linetype==5){
          return '临时'
        }else{
          return '市内'
        }
      },
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          console.debug(this.listQuery)
          this.list = response.data.row
          /*console.debug("---------------------")
           console.debug(this.list)
          console.debug("---------------------")*/
          this.total = response.data.total
          setTimeout(() => {
            this.listLoading = false
          }, 1.5 * 1000)
        })
      },
      handleFilter() {
        this.listQuery.page = 1
        this.getList()
      },
      resetTemp() {
        this.shuttleBus = {
          id: undefined,
          linetype: '',
          licenseplateint: '',
          carrier:'',
          models:'',
          driver:'',
          telephone:'',
          ton:'',
          remarks:''
        }
      },
      handleCreate() {
        this.resetTemp()
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.title = '添加'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
                add(this.shuttleBus).then(() => {
                  this.dialogFormVisible = false
                  this.$message({
                    type:'success',
                    message:'添加成功'
                  })
                  this.getList()
                })
              }else {
                this.$message({
                  type: 'success',
                  message: '添加失败'
                })
              }
        })
      },
      handleUpdate(row) {
        this.shuttleBus = Object.assign({}, row) // copy obj
        delete this.shuttleBus.user
        delete this.shuttleBus.dept
        delete this.shuttleBus.logTrack
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title = '修改'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() {
        // alert("1")
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({},this.shuttleBus)
                update(tempData).then(() => {
                  this.dialogFormVisible = false
                  this.$message({
                    type: 'success',
                    message: '修改成功'
                  })
                  this.getList()
                })
          }
        })
      },
      handleDelete(row) {
        this.$confirm('确认删除该线路吗', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          console.debug(row.id)
          deleteById(row.id).then((res) => {
            this.getList()
            this.$message({
              type: 'success',
              message: '删除成功!'
            })
          })
          // }
        }).catch((err) => {
          this.$message({
            type: 'info',
            message: err
          })
        })
        console.log(index, row)
      }
    }
  }
</script>

