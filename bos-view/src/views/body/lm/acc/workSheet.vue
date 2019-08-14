<template>
  <div class="app-container">
    <el-dialog title="业务通知单号" :visible.sync="dialogFormVisible" width="70%">
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="center" label-width="200px" style="width: 850px; height: 150px">
        <el-col :span="12"><el-form-item prop="worksheetno" label="工作单号:"><el-input  v-model="temp.worksheetno" placeholder="请输入工作单号"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item prop="destination" label="到达地:"><el-input  v-model="temp.destination" placeholder="请输入到达地"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item prop="producttime" label="产品:"><el-input  v-model="temp.producttime" placeholder="请输入产品"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item prop="total" label="总件数:"><el-input  v-model="temp.total" placeholder="请输入总件数"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item prop="weight" label="重量:"><el-input  v-model="temp.weight" placeholder="请输入重量"></el-input></el-form-item></el-col>
        <el-col :span="12"><el-form-item prop="stowagerequirements" label="配载要求:"><el-input  v-model="temp.stowagerequirements" placeholder="配载要求"></el-input></el-form-item></el-col>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="createData()">保存</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import { insert } from '@/api/acc/accworksheet'
  import waves from '@/directive/waves' // waves directive
  import { parseTime } from '@/utils'
  import Pagination from '@/components/Pagination' // secondary package based on el-pagination
  import { getToken } from '@/utils/auth'

  export default {
    name: 'WorkSheet',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        temp: {
          worksheetno: '',
          destination: '',
          producttime: '',
          total: '',
          weight: '',
          stowagerequirements: '',
        },
        dialogFormVisible: true,
        rules: {
          worksheetno: [{ required: true, message: '工作单号：输入不正确.请重新输入', trigger: 'blur', pattern: /^[a-zA-Z-z0-9]{2,10}$/ }],
          destination: [{ required: true, message: '到达地：输入不正确.请重新输入', trigger: 'blur',pattern: /^[a-zA-Z-z0-9\u4e00-\u9fa5]{2,10}$/ }],
          producttime: [{ required: true, message: '产品：输入不正确.请重新输入', trigger: 'blur' ,pattern: /^[a-zA-Z-z0-9\u4e00-\u9fa5]{2,10}$/ }],
          total: [{ required: true, message: '总件数：输入不正确.请重新输入', trigger: 'blur',pattern:/^[1-9]\d{0,4}$/} ],
          weight: [{ required: true, message: '重量：输入不正确.请重新输入', trigger: 'blur', pattern:/^[0-9]\d{0,4}$/}],
          stowagerequirements: [{ required: true, message: '配载要求：输入不正确.请重新输入', trigger: 'blur'}]
        },
      }
    },
    methods: {
      // 单击添加 确认
      createData() {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.temp.createBy=getToken()
            insert(this.temp).then((response) => {
              this.dialogFormVisible = false
              this.$notify({
                title: response.data.title,
                message: response.data.message,
                duration: 2000
              })
            })
          }
        })
      }
    }
  }
</script>
