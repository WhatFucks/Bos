<!--区域设置表-->

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
      <el-table-column label="序号" prop="id" sortable="custom" type="index" align="center" width="80">
      </el-table-column>
      <el-table-column label="省份" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.province }}</span>
        </template>
      </el-table-column>
      <el-table-column label="城市" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.city }}</span>
        </template>
      </el-table-column>
      <el-table-column label="区(县)" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.county }}</span>
        </template>
      </el-table-column>
      <el-table-column label="邮政编码" width="100px" align="center">
        <template slot-scope="scope">
                    <span>{{ scope.row.postalcode }}</span>
        </template>
      </el-table-column>
      <el-table-column label="简码" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.simplecode }}</span>
        </template>
      </el-table-column>
      <el-table-column label="城市编码" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.citycode }}</span>
        </template>
      </el-table-column>
        <el-table-column label="性质" width="100px" align="center" :formatter="natureStr">

        </el-table-column>
        <el-table-column label="所属区域" width="100px" align="center" :formatter="theareaStr">

        </el-table-column>

      <el-table-column label="操作人员" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.user.username }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作单位" width="100px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.dept.name }}</span>
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
      <el-form :inline="true" ref="dataForm" :rules="rules" :model="basArea" class="demo-form-inline">
        <el-form-item label="省份" prop="province">
          <el-input v-model="basArea.province" placeholder="请输入省份"/>
        </el-form-item>
        <el-form-item label="城市" prop="city">
          <el-input v-model="basArea.city" placeholder="请输入城市"/>
        </el-form-item>
        <el-form-item label="区(县)" prop="county">
          <el-input v-model="basArea.county" placeholder="请输入区(县)"/>
        </el-form-item>
        <el-form-item label="邮政编码" prop="postalcode">
          <el-input v-model="basArea.postalcode" placeholder="请输入邮政编码"/>
        </el-form-item>
        <el-form-item label="简码" prop="simplecode">
          <el-input v-model="basArea.simplecode" placeholder="请输入简码"/>
        </el-form-item>
        <el-form-item label="城市编码" prop="citycode">
          <el-input v-model="basArea.citycode" placeholder="请输入城市编码"/>
        </el-form-item>
        <el-form-item label="性质" prop="nature">
          <template>
            <el-select v-model="basArea.nature" placeholder="请选择">
              <el-option
                v-for="item in options"
                :key="item.value"
                :label="item.label"
                :value="item.value">
              </el-option>
            </el-select>
          </template>
        </el-form-item>
        <el-form-item label="所属区域" prop="thearea">
          <template>
            <el-select v-model="basArea.thearea" placeholder="请选择">
              <el-option
                v-for="item in options1"
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
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确定
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  // import { fetchList, fetchPv, createArticle, updateArticle } from '@/api/article'
  import { add, deleteById, update, list } from '@/api/body/hsq/area'
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
          label: '省级'
        }, {
          value: 2,
          label: '市辖市'
        }, {
          value: 3,
          label: '直辖市'
        }, {
          value: 4,
          label: '县级'
        }, {
          value: 5,
          label: '地级'
        },{
          value: 6,
          label: '省会'
        }],
        options1: [{
          value: 1,
          label: '东北区'
        }, {
          value: 2,
          label: '华东区'
        }, {
          value: 3,
          label: '华南区'
        }, {
          value: 4,
          label: '西北区'
        }, {
          value: 5,
          label: '华中区'
        },{
          value: 6,
          label: '西南区'
        },{
          value: 7,
          label: '华北区'
        }],
        tableKey: 0,
        list: null,
        total: 0,
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 10,
          name: '',
        },
        basArea: {
          id: undefined,
          province:'',
          city:'',
          county:'',
          postalcode:'',
          simplecode:'',
          citycode:'',
          nature:'',
          thearea:''
        },
        uname:'',
        dialogFormVisible: false,
        dialogStatus: '',
        title: '添加',
        rules: {
          province: [{ required: true, message: '省份不能为空', trigger: 'change' }],
          city: [{ required: true, message: '城市不能为空', trigger: 'change' }],
          county: [{ required: true, message: '区(县)不能为空', trigger: 'change' }],
          postalcode: [{ required: true, message: '邮政编码不能为空', trigger: 'change' }],
          simplecode: [{ required: true, message: '简码不能为空', trigger: 'change' }],
          citycode: [{ required: true, message: '城市编码不能为空', trigger: 'change' }],
        }
      }
    },
    created() {
      this.getList()
    },
    methods: {
      natureStr(val){
        if(val.nature==1){
          return '省级'
        }else if(val.nature==2){
          return '市辖市'
        }else if (val.nature==3){
          return '直辖市'
        }else if(val.nature==4){
          return '县级'
        }else if(val.nature==5){
          return '地级'
        }else{
          return '省会'
        }
      },
      theareaStr(val){
        if(val.thearea==1){
          return '东北区'
        }else if(val.thearea==2){
          return '华东区'
        }else if (val.thearea==3){
          return '华南区'
        }else if(val.thearea==4){
          return '西北区'
        }else if(val.thearea==5){
          return '华中区'
        }else if(val.thearea==6){
          return '西南区'
        }else {
          return '华北区'
        }
      },
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
        this.basArea = {
          id: undefined,
          province:'',
          city:'',
          county:'',
          postalcode:'',
          simplecode:'',
          citycode:'',
          nature:'',
          thearea:''
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
            add(this.basArea).then(() => {
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
        this.basArea = Object.assign({}, row) // copy obj

        delete this.basArea.user
        delete this.basArea.dept
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
            const tempData = Object.assign({},this.basArea)
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
        this.$confirm('确认删除选中记录吗', '提示', {
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

