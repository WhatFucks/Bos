<template>
  <div>
    <div class="filter-charts">
      <el-switch v-model="typeBoolean" active-color="#00B5FF" inactive-color="#7ED321" active-text="柱状" inactive-text="折线"></el-switch>
      <el-button style="margin-left: 50px; margin-bottom: 20px" type="primary" @click="handleSure">确定</el-button>
    </div>
    <div class="two-charts">
      <div id="chartOne" class="chart"></div>
      <div id="chartTwo" class="chart"></div>
    </div>
  </div>
</template>

<script>
  import echarts from 'echarts'
  export default {
    props:["dataOe","dataTo","dataDay"],
    data () {
      return {
        myChartOne: null,
        myChartTwo: null,
        date: '',
        typeBoolean: true
      }
    },
    computed: {
      type: function () {
        return this.typeBoolean ? 'bar' : 'line'
      }
    },
    created(){
      this.getH()
    },
    methods: {
      getH(){
        this.initCharts()
        this.handleSure()
      },
      initCharts () {
        this.myChartOne = echarts.init(document.getElementById('chartOne'))
        this.myChartTwo = echarts.init(document.getElementById('chartTwo'))
        this.myChartOne.setOption({
          title: {text: this.date},
          legend: {
            data: ['失败', '成功'],
            right: 10
          },
          grid: {
            top: 120
          },
          yAxis: [
            {
              name: '小件员取件失败',
              type: 'value',
              axisLine: {
                show: false
              },
              axisTick: {
                show: false
              },
              axisLabel: {
                color: '#666',
                fontSize: 12
              }
            },
            {
              name: '小件员取件成功',
              type: 'value',
              axisLine: {
                show: false
              },
              axisTick: {
                show: false
              },
              axisLabel: {
                color: '#666',
                fontSize: 12
              }
            }
          ],
          xAxis: {
            axisTick: {
              show: false
            },
            axisLabel: {
              color: '#666',
              fontSize: 12,
              margin: 12
            },
            data:['一月','二月','三月','四月','五月']
          },
          series: [
            {
              name: '失败',
              yAxisIndex: 0,
              data: [],
              type: 'bar',
              color: '#00B5FF'
            },
            {
              name: '成功',
              yAxisIndex: 1,
              data: [],
              type: 'bar',
              color: '#7ED321'
            }
          ]
        })
        this.myChartTwo.setOption({
          title: {text: this.date},
          legend: {
            data: ['失败', '成功'],
            right: 10
          },
          grid: {
            top: 120
          },
          yAxis: [
            {
              name: '小件员取件成功',
              type: 'value',
              axisLine: {
                show: false
              },
              axisTick: {
                show: false
              },
              axisLabel: {
                color: '#666',
                fontSize: 12
              }
            },
            {
              name: '小件员取件失败',
              type: 'value',
              axisLine: {
                show: false
              },
              axisTick: {
                show: false
              },
              axisLabel: {
                color: '#666',
                fontSize: 12
              }
            }
          ],
          xAxis: {
            axisTick: {
              show: false
            },
            axisLabel: {
              color: '#666',
              fontSize: 12,
              margin: 12
            },
            data:['一月','二月','三月','四月','五月']
          },
          series: [
            {
              name: '失败',
              yAxisIndex: 0,
              data: [],
              type: 'bar',
              color: '#00B5FF'
            },
            {
              name: '成功',
              yAxisIndex: 1,
              data: [],
              type: 'bar',
              color: '#7ED321'
            }
          ]
        })
        this.myChartOne.showLoading()
        this.myChartTwo.showLoading()
      },

      handleSure () {
        var newSeries = []
        if (this.typeBoolean) {
          newSeries = [
            {
              name: '失败',
              type: this.type,
              color: '#00B5FF'
            },
            {
              name: '成功',
              type: this.type,
              color: '#7ED321'
            }
          ]
        } else {
          newSeries = [
            {
              name: '失败',
              type: this.type,
              color: '#00B5FF',
              symbolSize: 6,
              lineStyle: {
                width: 4
              }
            },
            {
              name: '成功',
              type: this.type,
              color: '#7ED321',
              symbolSize: 6,
              lineStyle: {
                width: 4
              }
            }
          ]
        }
        this.myChartOne.setOption({
          title: {
            text: this.date
          },
          series: [{...newSeries[0], data: this.dataTo}, {...newSeries[1], data: this.dataOe}]
        })
        this.myChartTwo.setOption({
          title: {
            text: this.date
          },
          series: [{...newSeries[0], data: this.dataTo}, {...newSeries[1], data: this.dataOe}]
        })
      }
    },
    mounted () {
      this.initCharts()
      var $this = this
      setTimeout(function () {
        $this.myChartOne.setOption({
          series: [
            {
              name: '失败',
              data: $this.dataOe
            },
            {
              name: '成功',
              data: $this.dataTo
            }
          ]
        })
        $this.myChartTwo.setOption({
          series: [
            {
              name: '失败',
              data: $this.dataTo
            },
            {
              name: '成功',
              data: $this.dataOe
            }
          ]
        })
        $this.myChartOne.hideLoading()
        $this.myChartTwo.hideLoading()
      }, 1000)
    }
  }
</script>

<style scoped lang="scss">

  .filter-charts {
    border: 1px solid rgba(255, 255, 255, 0.2)
  }
  .two-charts {
    display: flex;
    display: -webkit-flex;
    flex-wrap: wrap;
    .chart {
      height: 300px;
      @media screen and (min-width:){
        height: 500px;
      }
      width: 50%;
      min-width: 300px;
      padding-top: 20px
    }
  }
</style>
