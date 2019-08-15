<!--取派设置表-->

<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.name" placeholder="name" style="width: 200px;" class="filter-item" @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">
        查询
      </el-button>
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
      <el-table-column label="ID" prop="id" sortable="custom" type="index" align="center" width="80">
      </el-table-column>
      <el-table-column label="员工工号" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.empno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="员工姓名" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.empname }}</span>
        </template>
      </el-table-column>
      <el-table-column label="手机号码" width="120px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.mobileno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="PDA标志" width="100px" align="center">
        <template slot-scope="scope">
<!--          <span>{{ scope.row.pda }}</span>-->
          <span v-if="scope.row.pda==false">不使用</span>
          <span v-else>使用</span>
        </template>
      </el-table-column>
      <el-table-column label="作废标记" width="100px" align="center">
        <template slot-scope="scope">
<!--          <span>{{ scope.row.invalidatemark }}</span>-->
          <span v-if="scope.row.invalidatemark==false">作废</span>
          <span v-else>不作废</span>
        </template>
      </el-table-column>
      <el-table-column label="收派重量" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.standardkg }}</span>
        </template>
      </el-table-column>
      <el-table-column label="收派长度" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.standardlength }}</span>
        </template>
      </el-table-column>

      <el-table-column label="类型" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.type }}</span>
        </template>
      </el-table-column>

      <el-table-column label="所属单位" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.dept.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="车型" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.models }}</span>
        </template>
      </el-table-column>
      <el-table-column label="车牌号" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.plateint }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="180" class-name="small-padding fixed-width">
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
      <el-form :inline="true" ref="dataForm" :rules="rules" :model="basSubstitute" class="demo-form-inline">
        <el-form-item label="员工工号" prop="empno">
          <el-input v-model="basSubstitute.empno" placeholder="请输入员工工号"/>
        </el-form-item>
        <el-form-item label="员工姓名" prop="empname">
          <el-input v-model="basSubstitute.empname" placeholder="请输入员工姓名"/>
        </el-form-item>
        <el-form-item label="手机号码" prop="mobileno">
          <el-input v-model="basSubstitute.mobileno" placeholder="请输入手机号码"/>
        </el-form-item>
        <el-form-item label="PDA标志" prop="pda">
<!--          <el-input v-model="basSubstitute.pda" placeholder="请输入PDA标志"/>-->
          <el-radio-group v-model="basSubstitute.pda">
            <el-radio  label="1" value="1">使用</el-radio>
            <el-radio label="0" value="0">不使用</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="作废标记" prop="invalidatemark">
<!--          <el-input v-model="basSubstitute.invalidatemark" placeholder="请输入作废标记"/>-->
          <el-radio-group v-model="basSubstitute.invalidatemark">
          <el-radio  label="1" value="1">不作废</el-radio>
          <el-radio label="0" value="0">作废</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="收派重量" prop="standardkg">
          <el-input v-model="basSubstitute.standardkg" placeholder="请输入收派重量"/>
        </el-form-item>
        <el-form-item label="收派长度" prop="standardlength">
          <el-input v-model="basSubstitute.standardlength" placeholder="请输入收派长度"/>
        </el-form-item>
        <el-form-item label="类型" prop="type">
          <el-input v-model="basSubstitute.type" placeholder="请输入类型"/>
        </el-form-item>
        <el-form-item label="车型" prop="models">
          <el-input v-model="basSubstitute.models" placeholder="请输入车型"/>
        </el-form-item>
        <el-form-item label="车牌号" prop="plateint">
          <el-input v-model="basSubstitute.plateint" placeholder="请输入车牌号"/>
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
  import { add, deleteById, update, list } from '@/api/body/hsq/substitute'
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
        tableKey: 0,
        list: null,
        total: 0,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 10,
          name: '',
        },
        basSubstitute: {
          id: undefined,
          empno:'',
          empname:'',
          mobileno:'',
          pda:'',
          invalidatemark:'',
          standardkg:'',
          standardlength:'',
          type:'',
          models: '',
          plateint: '',
          subordinateunit:''

        },
        uname:'',
        dialogFormVisible: false,
        dialogStatus: '',
        title: '添加取派',
        rules: {
          empno: [{ required: true, message: '员工工号不能为空', trigger: 'change' }],
          empname: [{ required: true, message: '员工姓名不能为空', trigger: 'change' }],
          mobileno: [{ required: true, message: '手机号码不能为空', trigger: 'change' }],
        //  pda: [{ required: true, message: 'PDA不能为空', trigger: 'change' }],
        //  invalidatemark: [{ required: true, message: '是否作废不能为空', trigger: 'change' }],
          type: [{ required: true, message: '类型不能为空', trigger: 'change' }],
          models: [{ required: true, message: '车型不能为空', trigger: 'change' }],
          plateint: [{ required: true, message: '车牌号不能为空', trigger: 'change' }],
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.row
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
        this.basSubstitute = {
          id: undefined,
          empno:'',
          empname:'',
          mobileno:'',
          pda:'',
          invalidatemark:'',
          type:'',
          models: '',
          plateint: ''
        }
      },
      handleCreate() {
        this.resetTemp()
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.title = '添加取派'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
                add(this.basSubstitute).then(() => {
                  this.dialogFormVisible = false
                  this.$message({
                    type:'success',
                    message:'添加成功'
                  })
                  this.getList()
                })
          }
        })
      },
      handleUpdate(row) {
        this.basSubstitute = Object.assign({}, row) // copy obj

        if(this.basSubstitute.pda==false){
          this.basSubstitute.pda='0'
        }else{
          this.basSubstitute.pda='1'
        }
        if(this.basSubstitute.invalidatemark==false){
          this.basSubstitute.invalidatemark='0'
        }else{
          this.basSubstitute.invalidatemark='1'
        }
        delete this.basSubstitute.dept
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title = '修改取派'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({},this.basSubstitute)
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
        this.$confirm('确认删除该取派吗', '提示', {
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


