<!--收派标准表-->

<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.name" placeholder="收派标准名称" style="width: 200px;" class="filter-item" @keyup.enter.native="handleFilter" />
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
      <el-table-column label="收派标准名称" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="最小重量" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.minweight }}</span>
        </template>
      </el-table-column>
      <el-table-column label="最大重量" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.maxweight }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作人员" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.user.username }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作单位" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.dept.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.operationtime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="230" class-name="small-padding fixed-width">
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
      <el-form ref="dataForm" :rules="rules" :model="basDeliveryStandard" label-position="left" label-width="110px" style="width: 400px; margin-left:50px;">
        <el-form-item label="收派标准名称" prop="name">
          <el-input v-model="basDeliveryStandard.name" placeholder="请输入收派标准名称"/>
        </el-form-item>
        <el-form-item label="最小重量" prop="minweight">
          <el-input v-model="basDeliveryStandard.minweight" placeholder="请输入最小重量"/>
        </el-form-item>
        <el-form-item label="最大重量" prop="maxweight">
          <el-input v-model="basDeliveryStandard.maxweight" placeholder="请输入最大重量"/>
        </el-form-item>
       <!-- <el-form-item label="用户ID" prop="operatorid">
          <el-input v-model="basDeliveryStandard.operatorid" placeholder="请输入用户ID"/>
        </el-form-item>
        <el-form-item label="部门ID" prop="operationunitid">
          <el-input v-model="basDeliveryStandard.operationunitid" placeholder="请输入部门ID"/>
        </el-form-item>-->
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
  import { add, deleteById, update, list, selectByName } from '@/api/body/hsq/deliveryStandard'
  import waves from '@/directive/waves' // waves directive
  //import { parseTime } from '@/utils'
  //import { getToken } from '@/utils/auth'
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
        basDeliveryStandard: {
          id: undefined,
          name: '',
          minweight: '',
          maxweight:'',
          operatorid:'',
          operationunitid:''
        },
        uname:'',
        dialogFormVisible: false,
        dialogStatus: '',
        title: '添加收派标准',
        rules: {
          name: [{ required: true, message: '收派标准名称不能为空', trigger: 'change' }],
          minweight: [{ required: true, message: '最小重量不能为空', trigger: 'change' }],
          maxweight: [{ required: true, message: '最大重量不能为空', trigger: 'change' }]
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      getList() {
        /*debugger*/
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list = response.data.row
          console.debug(this.list)
          this.total = response.data.total
          // Just to simulate the time of the request
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
        this.basDeliveryStandard = {
          id: undefined,
          name: '',
          minweight: '',
          maxweight:''
        }
      },
      handleCreate() {
        this.resetTemp()
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.title = '添加收派标准'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            selectByName(this.basDeliveryStandard.name).then(response => {
              if (response.data.flag){
                add(this.basDeliveryStandard).then(() => {
                  this.dialogFormVisible = false
                  this.$message({
                    type:'success',
                    message:'添加成功'

                  })

                  this.getList()
                })
              }else {
                this.$message({
                  type:'error',
                  message:'收派标准名称已存在，请重新输入'
                })
              }
            })
          }
        })
      },
      handleUpdate(row) {
        this.basDeliveryStandard = Object.assign({}, row) // copy obj
        delete this.basDeliveryStandard.user
        delete this.basDeliveryStandard.dept
        this.uname = this.basDeliveryStandard.name
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title = '修改收派标准'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({},this.basDeliveryStandard)
            console.debug('1111111111111111111111111')
            console.debug(tempData)
            var na = tempData.name
            if (this.uname==tempData.name){
              na=''
            }
            selectByName(na).then(response =>{
              if (response.data.flag) {
                update(tempData).then(() => {
                  this.dialogFormVisible = false
                  this.$message({
                    type: 'success',
                    message: '修改成功'
                  })
                  this.getList()
                })
              }else {
                this.$message({
                  type:'error',
                  message:'收派标准名称已存在，请重新输入'
                })
              }
            })
          }
        })
      },
      handleDelete(row) {
        this.$confirm('确认删除该收派标准名称吗', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          console.debug(row.id)
          /*if (row.name==getToken()) {
            this.$message({
              type: 'error',
              message: '用户不能自己删自己!'
            })
          }else {*/
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
