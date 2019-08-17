<!--基础档案表-->

<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.name" placeholder="基础档案名称" style="width: 200px;" class="filter-item"
                @keyup.enter.native="handleFilter"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit"
                 @click="handleCreate">
        添加
      </el-button>

    </div>

    <div>

      <el-dialog :title="title" :visible.sync="dialogFormVisible">
        <el-form ref="dataForm" :rules="rules" :model="basBasicArchives" label-position="left" label-width="110px"
                 style="width: 400px; margin-left:50px;">
          <el-form-item label="基础档案名称" prop="name">
            <el-input v-model="basBasicArchives.name" placeholder="请输入基础档案名称"/>
          </el-form-item>
          <el-form-item label="档案是否分级" prop="grade">
            <!-- 分级选择 -->
            <el-radio-group v-model="basBasicArchives.grade">
              <el-radio label="1" value="1">是</el-radio>
              <el-radio label="0" value="0">否</el-radio>

            </el-radio-group>
          </el-form-item>

          <!--<el-form-item label="用户ID" prop="operatorid">
            <el-input v-model="basBasicArchives.operatorid" placeholder="请输入用户ID"/>
          </el-form-item>
          <el-form-item label="部门ID" prop="operationunitid">
            <el-input v-model="basBasicArchives.operationunitid" placeholder="请输入部门ID"/>
          </el-form-item>-->
          <el-form-item label="备注" prop="remarks">
            <el-input v-model="basBasicArchives.remarks" placeholder="请输入备注"/>
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

    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="基础档案编号" prop="id" sortable="custom" type="index" align="center" width="110">
      </el-table-column>
      <el-table-column label="基础档案名称" width="140px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="档案是否分级" width="120px" align="center">
        <template slot-scope="scope">
          <span v-if="scope.row.grade==false">否</span>
          <span v-else>是</span>
        </template>
      </el-table-column>

      <el-table-column label="操作人员" width="130px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.user.username }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作单位" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.dept.name }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作时间" width="170px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.operationtime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="备注" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.remarks }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="280" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
          <el-button class="filter-item" style="margin-left: 10px;" type="text" icon="el-icon-edit" @click="viewList(row)">
            查看列表
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit"
                @pagination="getList"/>


    <!--                                查看列表                                             -->
    <el-dialog :title="title" :visible.sync="handledialog" customClass="customWidth">

      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate1(row)">
        添加
      </el-button>
      <div>

        <el-dialog :title="title" :visible.sync="dialogFormVisible1">
          <el-form ref="dataForm1" :rules="rules" :model="basicArchivesEntry" label-position="left" label-width="110px"
                   style="width: 400px; margin-left:50px;">
            <el-form-item label="基础档案名称" prop="name">
              <el-input v-model="basicArchivesEntry.name" placeholder="请输入基础档案名称"/>
            </el-form-item>
            <el-form-item label="上级编码" prop="mnemoniccode">
              <el-input v-model="basicArchivesEntry.mnemoniccode" placeholder="请输入上级编码"/>
            </el-form-item>
            <el-form-item label="档案是否封存" prop="available">
              <!-- 分级选择 -->
              <el-radio-group v-model="basicArchivesEntry.available">
                <el-radio label="1" value="1">是</el-radio>
                <el-radio label="0" value="0">否</el-radio>

              </el-radio-group>
            </el-form-item>
            <el-form-item label="备注" prop="remarks">
                <el-input v-model="basicArchivesEntry.remarks" placeholder="请输入备注"/>
            </el-form-item>
          </el-form>
          <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisible1 = false">
              取消
            </el-button>
            <el-button type="primary" @click="dialogStatus==='create1'?createData1():updateData1()">
              确定
            </el-button>
          </div>

        </el-dialog>
      </div>
      <el-table
        :key="tableKey"
        v-loading="listLoading"
        :data="list2"
        border
        fit
        highlight-current-row
        style="width: 100%;"
      >
        <el-table-column label="ID" prop="id" sortable="custom" type="index" align="center" width="100">
        </el-table-column>
        <el-table-column label="基础档案名称" width="110px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.name }}</span>
          </template>
        </el-table-column>
        <el-table-column label="上级编码" width="110px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.mnemoniccode }}</span>
          </template>
        </el-table-column>
        <el-table-column label="封存标志" width="100px" align="center">
          <template slot-scope="scope">
<!--            <span v-if="scope.row.available==false">否</span>-->
<!--            <span v-else>是</span>-->
            <span v-if="scope.row.available==false">否</span>
            <span v-else>是</span>
          </template>
        </el-table-column>

        <el-table-column label="操作人员" width="110px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.user.username }}</span>
          </template>
        </el-table-column>

        <el-table-column label="操作单位" width="110px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.dept.name }}</span>
          </template>
        </el-table-column>
        <el-table-column label="操作时间" width="150px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.operationtime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
          </template>
        </el-table-column>
        <el-table-column label="备注" width="120px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.remarks }}</span>
          </template>
        </el-table-column>
        <el-table-column label="操作" align="center" width="180" class-name="small-padding fixed-width">
          <template slot-scope="{row}">
            <el-button type="primary" size="mini" @click="handleUpdate1(row)">
              修改
            </el-button>
            <el-button size="mini" type="danger" @click="handleDelete1(row)">
              删除
            </el-button>
          </template>
        </el-table-column>
      </el-table>

    </el-dialog>
  </div>
</template>

<script>
  import {add, deleteById, updateById, list, selectByName} from '@/api/body/hsq/basicArchives'
  import {addBas, deleteBasById, updateBas, list2} from '@/api/body/hsq/basicArchivesEntry'
  import waves from '@/directive/waves' // waves directive
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination

  export default {
    name: 'ComplexTable',
    components: {Pagination},
    directives: {waves},
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
        pid:'',
        handledialog: false,
        tableKey: 0,
        list: null,
        list2: null,
        total: 0,
        id:'',
        row:'',
        listLoading: false,
        listQuery: {
          page: 1,
          limit: 10,
          name: '',
        },
        basBasicArchives: {
          id: undefined,
          name: '',
          grade: '',
          operatorid: '',
          operationunitid: '',
          remarks: ''
        },
        uname: '',
        dialogFormVisible: false,
        dialogStatus: '',
        title: '添加基础档案',
        rules: {
          name: [{required: true, message: '基础档案名称不能为空', trigger: 'change'}],
          remarks: [{required: true, message: '备注不能为空', trigger: 'change'}]
        },

        //   查看列表
        basicArchivesEntry: {
          parentid: undefined,
          name: '',
          mnemoniccode: '',
          available: '',
          operatorid: '',
          operationunitid: '',
          remarks: ''
        },
        uname: '',
        dialogFormVisible1: false,
        dialogStatus: '',
        title: '添加基础档案',
        rules: {
          name: [{required: true, message: '基础档案名称不能为空', trigger: 'change'}],
          mnemoniccode: [{required: true, message: '上级编码不能为空', trigger: 'change'}],
          remarks: [{required: true, message: '备注不能为空', trigger: 'change'}]
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
          console.debug(this.list)
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
        this.basBasicArchives = {
          id: undefined,
          name: '',
          grade: '',
          remarks: ''
        },
          //  查看列表
          this.basicArchivesEntry = {
            parentid: undefined,
            name: '',
            mnemoniccode: '',
            available: '',
            remarks: ''
          }
      },
      handleCreate() {
        this.resetTemp()
        this.dialogStatus = 'create'
        this.dialogFormVisible = true
        this.title = '添加基础档案'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      createData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            selectByName(this.basBasicArchives.name).then(response => {
              if (response.data.flag) {
                add(this.basBasicArchives).then(() => {
                  this.dialogFormVisible = false
                  this.$message({
                    type: 'success',
                    message: '添加成功'

                  })

                  this.getList()
                })
              } else {
                this.$message({
                  type: 'error',
                  message: '基础档案名称已存在，请重新输入'
                })
              }
            })
          }
        })
      },
      handleUpdate(row) {

        this.basBasicArchives = Object.assign({}, row) // copy obj
        // console.debug(row)
        if (this.basBasicArchives.grade == false) {
          this.basBasicArchives.grade = '0'
        } else {
          this.basBasicArchives.grade = '1'
        }
        delete this.basBasicArchives.user
        delete this.basBasicArchives.dept
        this.uname = this.basBasicArchives.name
        this.dialogStatus = 'update'
        this.dialogFormVisible = true
        this.title = '修改基础档案'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.basBasicArchives)
            var na = tempData.name
            if (this.uname == tempData.name) {
              na = ''
            }
            selectByName(na).then(response => {
              if (response.data.flag) {
                delete tempData.basBasicArchivesEntry
                updateById(tempData).then(() => {
                  this.dialogFormVisible = false
                  this.$message({
                    type: 'success',
                    message: '修改成功'
                  })
                  this.getList()
                })
              } else {
                this.$message({
                  type: 'error',
                  message: '基础档案名称已存在，请重新输入'
                })
              }
            })
          }
        })
      },
      handleDelete(row) {
        this.$confirm('确认删除该基础档案吗', '提示', {
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
      },

      viewList(row,parentid) {
        if(parentid){
          list2(parentid).then(response => {
            this.list2 = response.data.items
          })
        }else {
          this.pid = row.id
          list2(row.id).then(response => {
            this.list2 = response.data.items
          })
        }
        this.listLoading = true
        this.listLoading = false
        this.handledialog = true
      },
      handleCreate1() {
        this.resetTemp()
        this.dialogStatus = 'create1'
        this.dialogFormVisible1 = true
        this.title = '添加基础档案明细'
        this.$nextTick(() => {
          this.$refs['dataForm1'].clearValidate()
        })
      },
      createData1(row) {
        this.$refs['dataForm1'].validate((valid) => {
          this.basicArchivesEntry.parentid=this.pid
          if (valid) {
                addBas(this.basicArchivesEntry).then(() => {
                 /* console.debug('------')
                  console.debug(this.pid)*/
                  this.dialogFormVisible1 = false
                  this.viewList(null,this.pid)
                  this.$message({
                    type: 'success',
                    message: '添加成功'
                  })

                })
          }
        })
      },
      handleUpdate1(row) {

        this.basicArchivesEntry = Object.assign({}, row) // copy obj
        if (this.basicArchivesEntry.available == false) {
          this.basicArchivesEntry.available = '0'
        } else {
          this.basicArchivesEntry.available = '1'
        }
        delete this.basicArchivesEntry.user
        delete this.basicArchivesEntry.dept
        this.dialogStatus = 'update'
        this.dialogFormVisible1 = true
        this.title = '修改基础档案'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData1() {
        this.$refs['dataForm1'].validate((valid) => {
          this.basicArchivesEntry.parentid=this.pid
          if (valid) {
            const tempData = Object.assign({}, this.basicArchivesEntry)
                updateBas(tempData).then(() => {
                  this.dialogFormVisible1 = false
                  this.$message({
                    type: 'success',
                    message: '修改成功'
                  })
                  this.viewList(null,this.pid)
                })
          }
        })
      },
      handleDelete1(row) {
        this.$confirm('确认删除该基础档案吗', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          deleteBasById(row.id).then((res) => {
            this.$message({
              type: 'success',
              message: '删除成功!',
            })
            this.viewList(null,this.pid)
          })
        }).catch((err) => {
          this.$message({
            type: 'info',
            message: err
          })
        })
        console.log(index, row)
      },
    }
  }
</script>
<style>
  .customWidth {
    width: 85%;
    height: 70%;
  }
</style>
