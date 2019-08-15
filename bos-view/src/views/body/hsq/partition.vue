<!--管理分区-->

<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.province" placeholder="省份" style="width: 200px;" class="filter-item" @keyup.enter.native="handleFilter" />
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
      <el-table-column label="分拣编码" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.sortingcode }}</span>
        </template>
      </el-table-column>
      <el-table-column label="定区编码" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.zonecode }}</span>
        </template>
      </el-table-column>
      <el-table-column label="省份" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.province }}</span>
        </template>
      </el-table-column>

      <el-table-column label="城市" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.city }}</span>
        </template>
      </el-table-column>

      <el-table-column label="区(县)" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.county }}</span>
        </template>
      </el-table-column>
      <el-table-column label="关键地区" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.keyword }}</span>
        </template>
      </el-table-column>
      <el-table-column label="起始号" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.startint }}</span>
        </template>
      </el-table-column>
      <el-table-column label="终止号" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.terminateint }}</span>
        </template>
      </el-table-column>
      <el-table-column label="单双号" width="110px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.sdint }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="200" class-name="small-padding fixed-width">
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
      <el-form :inline="true" ref="dataForm" :rules="rules" :model="basArea" class="demo-form-inline">
        <el-form-item label="分拣编码" prop="sortingcode">
          <el-input v-model="basPartition.sortingcode" placeholder="请输入分拣编码"/>
        </el-form-item>
        <el-form-item label="定区编码" prop="zonecode">
          <el-input v-model="basPartition.zonecode" placeholder="请输入定区编码"/>
        </el-form-item>
        <el-form-item label="省份" prop="province">
          <el-input v-model="basPartition.province" placeholder="请输入省份"/>
        </el-form-item>
         <el-form-item label="城市" prop="city">
           <el-input v-model="basPartition.city" placeholder="请输入城市"/>
         </el-form-item>
         <el-form-item label="区(县)" prop="county">
           <el-input v-model="basPartition.county" placeholder="请输入区(县)"/>
         </el-form-item>
        <el-form-item label="关键地区" prop="keyword">
          <el-input v-model="basPartition.keyword" placeholder="请输入关键地区"/>
        </el-form-item>
        <el-form-item label="起始号" prop="startint">
          <el-input v-model="basPartition.startint" placeholder="请输入起始号"/>
        </el-form-item>
        <el-form-item label="终止号" prop="terminateint">
          <el-input v-model="basPartition.terminateint" placeholder="请输入终止号"/>
        </el-form-item>
        <el-form-item label="单双号" prop="sdint">
          <el-input v-model="basPartition.sdint" placeholder="请输入单双号"/>
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
  import { add, deleteById, update, list, selectByName } from '@/api/body/hsq/partition'
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
        basPartition: {
          id: undefined,
          sortingcode: '',
          zonecode:'',
          province:'',
          city: '',
          county:'',
          keyword:'',
          startint:'',
          terminateint: '',
          sdint:''
        },
        dialogFormVisible: false,
        dialogStatus: '',
        title: '添加',
        rules: {
          sortingcode: [{ required: true, message: '分拣编码不能为空', trigger: 'change' }],
          zonecode: [{ required: true, message: '定区编码不能为空', trigger: 'change' }],
          province: [{ required: true, message: '省份不能为空', trigger: 'change' }],
          city: [{ required: true, message: '城市不能为空', trigger: 'change' }],
          county: [{ required: true, message: '区(县)不能为空', trigger: 'change' }],
          keyword: [{ required: true, message: '关键地区不能为空', trigger: 'change' }],
          startint: [{ required: true, message: '起始号不能为空', trigger: 'change' }],
          terminateint: [{ required: true, message: '终止号不能为空', trigger: 'change' }],
          sdint: [{ required: true, message: '单双号不能为空', trigger: 'change' }]
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
          // console.debug(this.list)
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
        this.basPartition = {
          id: undefined,
          sortingcode: '',
          zonecode:'',
          province:'',
          city: '',
          county:'',
          keyword:'',
          startint:'',
          terminateint: '',
          sdint:''
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
                add(this.basPartition).then(() => {
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
        this.basPartition = Object.assign({}, row) // copy obj
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title = '修改'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({},this.basPartition)
            console.debug(tempData)
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
        this.$confirm('确认删除吗', '提示', {
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

