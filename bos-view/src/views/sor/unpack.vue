<template>
  <div class="app-container">

    <!--拆包-->

    <el-form :model="dynamicValidateForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
      <el-form-item
        prop="email"
        label="合包号"
      >
        <el-input @change="queryPackage" v-model="dynamicValidateForm.id" style="width: 120px;" placeholder="合包号" ></el-input>
        封签号:<el-input v-model="dynamicValidateForm.sealint" style="width: 120px;" placeholder="封签号" :disabled="true"></el-input>
        合包人:<el-select v-model="dynamicValidateForm.packageperson" placeholder="拆包人" style="width: 120px;" :disabled="true">
        <el-option
          v-for="item in users"
          :key="item.id"
          :label="item.username"
          :value="item.id"
          :disabled="item.status==1? false:true">
        </el-option>
      </el-select>
      </el-form-item>
      <el-form-item
        prop="email"
        label="到达地"
      >
        <el-input :disabled="true" v-model="dynamicValidateForm.destination" style="width: 120px;" placeholder="接收单位" ></el-input>
        计算到达地:<el-input :disabled="true" v-model="dynamicValidateForm.reckondes" style="width: 120px;" placeholder="接收单位" ></el-input>
        送达时限:<el-date-picker :disabled="true" v-model="dynamicValidateForm.timelimit" type="date" placeholder="选择日期"></el-date-picker>
      </el-form-item>
      <table>
        <tr>
          <el-form-item>
            <td width="130px"><font size="4">单号</font></td>
            <td width="130px"><font size="4">商品名</font></td>
            <td width="120px"><font size="4">票数</font></td>
            <td width="120px"><font size="4">件数</font></td>
            <td width="120px"><font size="4">重量</font></td>
            <td width="120px"><font size="4">体积</font></td>
            <td width="120px"><font size="4">重要提示</font></td>
          </el-form-item>
        </tr>
        <tr>
          <el-form-item
            v-for="(domain, index) in dynamicValidateForm.domains"
            :label="'单号' + (index+1)+':'"
            :key="domain.key"
            :prop="'domains.' + index + '.value'"
          >
            <td><el-input :disabled="true" v-model="domain.id" placeholder="填写单号" style="width: 100px"></el-input></td>
            <td><el-input :disabled="true" v-model="domain.warename" placeholder="商品名" style="width: 100px"></el-input></td>
            <td><el-input :disabled="true" v-model="domain.ticket" placeholder="票数" style="width: 100px"></el-input></td>
            <td><el-input :disabled="true" v-model="domain.cargoint" placeholder="件数" style="width: 120px"></el-input></td>
            <td><el-input :disabled="true" v-model="domain.weight" placeholder="重量" style="width: 130px"></el-input></td>
            <td><el-input :disabled="true" v-model="domain.volume" placeholder="体积" style="width: 120px"></el-input></td>
            <td><el-input :disabled="true" v-model="domain.importanthints" placeholder="重要提示" style="width: 130px"></el-input></td>
          </el-form-item>
        </tr>
      </table>
      <el-form-item>
        <el-button type="primary" @click="submitForm('dynamicValidateForm')">拆包</el-button>
      </el-form-item>
    </el-form>



  </div>
</template>

<script>
  //insertPackage
  import { insertPackage,queryAllById,chaiCheck } from '@/api/sor/package'
  import { list,insertsorStorage,userlist } from '@/api/sor/storage'
  import Pagination from '@/components/Pagination' // 分页组件
  export default {
    components: { Pagination },
    data(){
      return {
        tag: {type: 'success', type2: 'danger'},
        options: [{value: '0', label: '无'},{value: '1', label: '禁航空铁路'}, {value: '2', label: '禁航空'}],
        options2: [{value: '0', label: '已拆包'}, {value: '1', label: '未拆包'}],
        dialogFormVisible: true,
        storageDetails: [],
        total: 0,
        users:[],
        dynamicValidateForm: {
          domains: [{
          }],
        }
      }
    },
    created() {
      this.getlist();
    },
    methods: {
      getlist(){
        userlist().then(response => {
          this.users=response.data.userlist
        })
      },
      // 新增合包信息及合包详情
      submitForm(formName) {
        if(this.dynamicValidateForm.domains==[] || this.dynamicValidateForm.id==null || this.dynamicValidateForm.domains.id==null){
          this.$confirm('确定要拆包，是否继续?', '提示', {
            confirmButtonText: '拆包',
            cancelButtonText: '取消',
            type: 'warning'
          }).then(() => {
            this.$message({
              showClose: true,
              message: '请输入合包号，我们将自动检查',
              type: 'warning'
            });
          })

        }else{
          chaiCheck(this.dynamicValidateForm.id).then(response => {
            this.$notify({
              title: '提示',
              message: response.data.message,
              type: 'success'
            });
            this.dialogFormVisible = false
            this.dynamicValidateForm.domains =[]
          })
        }

      },
      openInser(){
        this.dialogFormVisible = true
        this.dynamicValidateForm= {domains: [{value: ''}],
        }
      },

      removeDomain(item) {
        var index = this.dynamicValidateForm.domains.indexOf(item)
        if (index !== -1) {
          this.dynamicValidateForm.domains.splice(index, 1)
        }
      },
      addDomain() {
        this.dynamicValidateForm.domains.push({
          value: '',
          key: Date.now()
        });
      },
      queryPackage(){
        queryAllById(this.dynamicValidateForm.id).then(response => {
          if(response.data.dynamicValidateForm==null){
            this.$message({
              showClose: true,
              message: '没有该合包号或已拆包',
              type: 'warning'
            });
            this.dynamicValidateForm.id=null
          }else{
            this.dynamicValidateForm=response.data.dynamicValidateForm
          }
        })
      }
    }
  }
</script>

<style scoped>

</style>
