<template>
  <div class="app-container">

    <!--合包-->

      <el-form :model="dynamicValidateForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
        <el-form-item
          prop="email"
          label="合包号"
        >
          <el-input v-model="dynamicValidateForm.id" style="width: 120px;" placeholder="合包号" :disabled="true"></el-input>
          封签号:<el-input v-model="dynamicValidateForm.sealint" style="width: 120px;" placeholder="封签号" ></el-input>
          合包人:<el-select v-model="dynamicValidateForm.packageperson" placeholder="合包人" style="width: 120px;">
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
          <el-input v-model="dynamicValidateForm.destination" style="width: 120px;" placeholder="接收单位" ></el-input>
          计算到达地:<el-input v-model="dynamicValidateForm.reckondes" style="width: 120px;" placeholder="接收单位" ></el-input>
          送达时限:<el-date-picker v-model="dynamicValidateForm.timelimit" type="date" placeholder="选择日期"></el-date-picker>
        </el-form-item>
        <el-form-item
          prop="email"
          label="配载要求"
        >
          <el-select v-model="dynamicValidateForm.ask" placeholder="配载要求" style="width: 120px;">
          <el-option
            v-for="item in options"
            :key="item.value"
            :label="item.label"
            :value="item.value"
            >
          </el-option>
          </el-select>
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
              <td><el-input v-model="domain.id" placeholder="填写单号" style="width: 100px" @change="getByWork(domain)"></el-input></td>
              <td><el-input v-model="domain.warename" placeholder="商品名" style="width: 100px"></el-input></td>
              <td><el-input v-model="domain.ticket" placeholder="票数" style="width: 100px"></el-input></td>
              <td><el-input v-model="domain.cargoint" placeholder="件数" style="width: 120px"></el-input></td>
              <td><el-input v-model="domain.weight" placeholder="重量" style="width: 130px"></el-input></td>
              <td><el-input v-model="domain.volume" placeholder="体积" style="width: 120px"></el-input></td>
              <td><el-input v-model="domain.importanthints" placeholder="重要提示" style="width: 130px"></el-input></td>
              <el-button @click.prevent="removeDomain(domain)">删除该行</el-button>
            </el-form-item>
          </tr>
        </table>
        <el-form-item>
          <el-button type="primary" @click="submitForm('dynamicValidateForm')">提交</el-button>
          <el-button @click="addDomain">新增一行表单</el-button>
        </el-form-item>
      </el-form>



  </div>
</template>

<script>
  //insertPackage
  import { insertPackage } from '@/api/sor/package'
  import { getByWorkId } from '@/api/sor/storageDetails'
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
            value: ''
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
        console.debug(this.dynamicValidateForm)
        const somain=this.dynamicValidateForm.domains.filter(value => value.id == null)
        if(somain.length>0){

          this.$confirm('填写的信息不完整，将会自动列为异常监控，是否继续?', '提示', {
            confirmButtonText: '确定',
            cancelButtonText: '取消',
            type: 'warning'
          }).then(() => {
            this.$message({
              showClose: true,
              message: '请填写完整',
              type: 'warning'
            });
          })

        }else{
          insertPackage(this.dynamicValidateForm).then(response => {
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
      // 根据单号查询 信息
      getByWork(item){

        getByWorkId(item.id).then(response => {

          var index = this.dynamicValidateForm.domains.indexOf(item)
          if (index !== -1) {
            const domain={}
            console.debug(response.data.worck)
            domain.weight=response.data.worck.weight
            domain.cargoint=response.data.worck.total
            domain.importanthints=response.data.worck.stowageRequirements
            domain.id=item.id
            this.dynamicValidateForm.domains.splice(index, 1,domain)
          }

        })
      }
    }
  }
</script>

<style scoped>

</style>
