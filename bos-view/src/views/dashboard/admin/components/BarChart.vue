<template>
  <!--为echarts准备一个具备大小的容器dom-->
  <div id="main" style="width: 300px;height: 300px;"></div>
</template>
<script>
  import echarts from 'echarts'
  import {vehicleList } from '@/api/reportforms/reportforms'
  export default {
    name: '',
    data() {
      console.debug("222222666"+this.opinionData)
      return {
        charts: '',
        /*  opinion: ["1", "3", "3", "4", "5"],*/
        opinionData: []
      }
    },
    methods: {
      getList(){
        vehicleList().then(response => {
          this.opinionData= response.data.vehicle
          this.drawLine('main')
        })

      },
      drawLine(id) {
        this.charts = echarts.init(document.getElementById(id))
        this.charts.setOption({
          tooltip: {
            trigger: 'axis'
          },
          legend: {
            data: ['近七日车辆使用']
          },
          grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
          },

          toolbox: {
            feature: {
              saveAsImage: {}
            }
          },
          xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ["周一","周二","周三","周四","周五"]

          },
          yAxis: {
            type: 'value'
          },

          series: [{
            name: '近七日车辆使用',
            type: 'line',
            stack: '总量',
            data: this.opinionData
          }]
        })
      }
    },
    //调用
    mounted() {
      this.getList();
      this.$nextTick(function() {
        this.drawLine('main')
      })
    }
  }
</script>
<style scoped>
  * {
    margin: 0;
    padding: 0;
    list-style: none;
  }
</style>
