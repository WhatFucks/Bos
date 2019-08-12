import request from '@/utils/request'

export function getPacStockItemList(query) {
  return request({
    url: '/pacStockitem/getPacStockItemList',
    method: 'post',
    data: query
  })
}
