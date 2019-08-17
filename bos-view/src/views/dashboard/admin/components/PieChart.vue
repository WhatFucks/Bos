<template>
  <div>
    <div id="chart_example" :style="{width: '300px', height: '300px'}"></div>
  </div>
</template>

<script>
  // 首先要 cnpm install echarts
  import echarts from 'echarts'
  import 'echarts/map/js/china.js';  //引入中国地图

  export default {
    mounted() {
      let myChart = echarts.init(document.getElementById('chart_example'));

      /**
       * 中国地图
       * 必须引入china.js
       * https://www.cnblogs.com/ldlx-mars/p/9242250.html
       * map配置
       * https://echarts.baidu.com/option.html#series-map.map
       * 高亮颜色
       * https://www.cnblogs.com/xianwen/p/6045454.html
       */
      let option = {
        series: [{
          type: 'map',
          // mapType: 'china'// mapType或者map都可以
          map: 'china',
        }]
      };


      myChart.setOption(option);
    }
  }
</script>

<style scoped>
  #chart_example {
    width: 50%;
    height: 500px;
    border: 1px solid red;
    margin: 0 auto;
  }
</style>
