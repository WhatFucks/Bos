<!--管理定区-->

<template>
  <div class="app-container">
    <div class="filter-container">
      <!--<el-input v-model="listQuery.name" placeholder="name" style="width: 200px;" class="filter-item" @keyup.enter.native="handleFilter" />
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="handleFilter">
        查询
      </el-button>-->
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
      <el-table-column label="定区编码" width="170px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.zonecode }}</span>
        </template>
      </el-table-column>
      <el-table-column label="定区名称" width="170px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.zonename }}</span>
        </template>
      </el-table-column>

      <el-table-column label="定区负责人" width="170px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.basInfo.customname }}</span>
        </template>
      </el-table-column>

      <el-table-column label="联系电话" width="170px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.telphone }}</span>
        </template>
      </el-table-column>
      <el-table-column label="所属单位" width="170px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.dept.name }}</span>
        </template>
      </el-table-column>

      <el-table-column label="操作" align="center" width="330" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
          <el-button class="filter-item" style="margin-left: 10px;" type="text" icon="el-icon-edit" @click="viewList(row)">
            查看客户信息
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />


                                                  <!--查看客户信息-->


    <el-dialog :title="title" :visible.sync="handledialog" customClass="customWidth">

      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate1(row)">
        添加
      </el-button>
      <div>

        <el-dialog :title="title" :visible.sync="dialogFormVisible1">
          <el-form ref="dataForm1" :rules="rules" :model="basZoneCustomInfo" label-position="left" label-width="110px"
                   style="width: 400px; margin-left:50px;">
            <el-form-item label="客户姓名" prop="customname">
              <el-input v-model="basZoneCustomInfo.customname" placeholder="请输入客户姓名"/>
            </el-form-item>
            <el-form-item label="手机号码" prop="mobileno">
              <el-input v-model="basZoneCustomInfo.mobileno" placeholder="请输入手机号码"/>
            </el-form-item>
            <el-form-item label="城市" prop="cityname">
              <el-input v-model="basZoneCustomInfo.cityname" placeholder="请输入城市"/>
            </el-form-item>
            <el-form-item label="客户地址" prop="cstomaddress">
              <el-input v-model="basZoneCustomInfo.cstomaddress" placeholder="请输入客户地址"/>
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
        <el-table-column label="ID" prop="id" sortable="custom" type="index" align="center" width="120">
        </el-table-column>
        <el-table-column label="客户编号" width="160px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.customcode }}</span>
          </template>
        </el-table-column>
        <el-table-column label="客户姓名" width="160px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.customname }}</span>
          </template>
        </el-table-column>

        <el-table-column label="手机号码" width="160px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.mobileno }}</span>
          </template>
        </el-table-column>

        <el-table-column label="城市" width="160px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.cityname }}</span>
          </template>
        </el-table-column>
        <el-table-column label="客户地址" width="160px" align="center">
          <template slot-scope="scope">
            <span>{{ scope.row.cstomaddress }}</span>
          </template>
        </el-table-column>
        <el-table-column label="操作" align="center" width="200" class-name="small-padding fixed-width">
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





    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <el-form ref="dataForm" :rules="rules" :model="basZoneInfo" label-position="left" label-width="110px" style="width: 400px; margin-left:50px;">
        <el-form-item label="定区编码" prop="zonecode">
          <el-input v-model="basZoneInfo.zonecode" placeholder="请输入定区编码"/>
        </el-form-item>
        <el-form-item label="定区名称" prop="zonename">
          <el-input v-model="basZoneInfo.zonename" placeholder="请输入定区名称"/>
        </el-form-item>
        <el-form-item label="联系电话" prop="telphone">
          <el-input v-model="basZoneInfo.telphone" placeholder="请输入联系电话"/>
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
  import { add, deleteById, update, list } from '@/api/body/hsq/zoneInfo'
  import { add2, delete2, update2, list2 } from '@/api/body/hsq/zonecustominfo'
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
        zid:'',
        handledialog: false,
        tableKey: 0,
        list: null,
        list2:'',
        total: 0,
        row:'',
        listLoading: true,
        listQuery: {
          page: 1,
          limit: 10,
          name: '',
        },
        basZoneInfo: {
          id: undefined,
          zonecode:'',
          zonename:'',
          telphone:'',
          zonepeople:'',
          subordinateunit:''
        },
        dialogFormVisible: false,
        dialogStatus: '',
        title: '添加',
        rules: {
          zonecode: [{ required: true, message: '定区编码不能为空', trigger: 'change' }],
          zonename: [{ required: true, message: '定区名称不能为空', trigger: 'change' }],
          telphone: [{ required: true, message: '联系电话不能为空', trigger: 'change' }]
        },
        basZoneCustomInfo: {
          zoneinfoid: undefined,
          customcode:'',
          customname:'',
          mobileno:'',
          cityname:'',
          cstomaddress:''
        },
        dialogFormVisible1: false,
        dialogStatus: '',
        title: '添加',
        rules: {
          customname: [{ required: true, message: '客户姓名不能为空', trigger: 'change' }],
          mobileno: [{ required: true, message: '手机号码不能为空', trigger: 'change' }],
          cityname: [{ required: true, message: '城市不能为空', trigger: 'change' }],
          cstomaddress: [{ required: true, message: '客户地址不能为空', trigger: 'change' }]
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
        this.basZoneInfo = {
          id: undefined,
          zonecode:'',
          zonename:'',
          telphone:'',
          zonepeople:'',
          subordinateunit:''
        },
          this.basZoneCustomInfo = {
            zoneinfoid: undefined,
            customcode:'',
            customname:'',
            mobileno:'',
            cityname:'',
            cstomaddress:''
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
            add(this.basZoneInfo).then(() => {
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
        this.basZoneInfo = Object.assign({}, row) // copy obj
        delete this.basZoneInfo.dept
        delete this.basZoneInfo.basInfo
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
            const tempData = Object.assign({},this.basZoneInfo)
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
      },


                                               /* 查看客户详情*/
      viewList(row,zoneinfoid) {
        if(zoneinfoid){
          list2(zoneinfoid).then(response => {
            this.list2 = response.data.items
          })
        }else {
          this.zid = row.id
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
        this.title = '添加定区客户信息'
        this.$nextTick(() => {
          this.$refs['dataForm1'].clearValidate()
        })
      },
      createData1(row) {
        this.$refs['dataForm1'].validate((valid) => {
          this.basZoneCustomInfo.zoneinfoid=this.zid
          if (valid) {
            add2(this.basZoneCustomInfo).then(() => {
              this.dialogFormVisible1 = false
              this.viewList(null,this.zid)
              this.$message({
                type: 'success',
                message: '添加成功'
              })

            })
          }
        })
      },
      handleUpdate1(row) {

        this.basZoneCustomInfo = Object.assign({}, row) // copy obj
        this.dialogStatus = 'update'
        this.dialogFormVisible1 = true
        this.title = '修改客户信息'
        this.$nextTick(() => {
          this.$refs['dataForm'].clearValidate()
        })
      },
      updateData1() {
        this.$refs['dataForm1'].validate((valid) => {
          if (valid) {
            const tempData = Object.assign({}, this.basZoneCustomInfo)
            update2(tempData).then(() => {
              this.dialogFormVisible1 = false
              this.$message({
                type: 'success',
                message: '修改成功'
              })
              this.viewList(null,this.zid)
            })
          }
        })
      },
      handleDelete1(row) {
        this.$confirm('确认删除该客户信息吗', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          delete2(row.customcode).then((res) => {
            this.$message({
              type: 'success',
              message: '删除成功!',
            })
            this.viewList(null,this.zid)
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

<style>
  .customWidth {
    width: 85%;
    height: 70%;
  }
</style>
