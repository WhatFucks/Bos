<template>
  <div>
    <echart :dataOe ="dataOe" :dataTo="dataTo" :dataDay="dataDay" />
  </div>
</template>

<script>
 import Echart from '@/components/TwoEcharts'
 import {echartsList } from '@/api/reportforms/reportforms'
  export default {
    name: 'Charts',
      data () {
        return {
            dataOe: [],
            dataTo: [],
            dataThree:[],
            dataDay:[],
            typeBoolean: true,
            date: ''
        }
      },
    mounted() {
     this.getList()
    },
    methods:{
      getList() {
        echartsList().then(response => {
          this.dataOe= response.data.dataOne
          this.dataTo=response.data.dataTwo
          this.dataDay=response.data.dataDay
        })

      },
    },
    computed: {
      type: function () {
        return this.typeBoolean ? 'bar' : 'line'
      }
    },
    components: {
      Echart
    }
  }
</script>

<style scoped lang="scss">
  .filter-charts {
    border: 1px solid rgba(155, 155, 155, 0.2)
  }
</style>
