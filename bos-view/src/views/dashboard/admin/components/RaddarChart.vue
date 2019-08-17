<template>
  <div id="myChart" :style="{width: '300px', height: '300px'}"></div>
</template>
<script>
  import {echartsSmall } from '@/api/reportforms/reportforms'
  export default {
    name: 'hello',
    data () {
      return {
        dataOe:[],
        msg: 'Welcome to Your Vue.js App'
      }
    },
    mounted(){
      this.drawLine();
    },
    created(){
      this.getSmall();
    },
    methods: {
      getSmall() {
        echartsSmall().then(response => {
          this.dataOe= response.data.dataSmall
          this.drawLine()
        })

      },
      drawLine(){
        console.debug(2222222222)
        // 基于准备好的dom，初始化echarts实例
        let myChart = this.$echarts.init(document.getElementById('myChart'))
        // 绘制图表
        myChart.setOption({
          title: { text: '一月到五月的小件员数量' },
          tooltip: {},
          xAxis: {
            data: ["一月","二月","三月","四月","五月"]
          },
          yAxis: {},
          series: [{
            name: '小件员',
            type: 'bar',
            data:this.dataOe
          }]
        });
      }
    }
  }
</script>
