import request from '@/utils/request'
// 出库查询
export function list(data) {
  return request({
    url: '/stockout/list',
    method: 'post',
    data: data
  })
}
// 添加出库单
export function insertstockout(data) {
  return request({
    url: '/stockout/insert',
    method: 'post',
    data: data
  })
}
// 修改出库单
export function updatestockout(data) {
  return request({
    url: '/stockout/update',
    method: 'post',
    data
  })
}

