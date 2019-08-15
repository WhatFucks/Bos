import request from '@/utils/request'
// 入库查询
export function list(data) {
  return request({
    url: '/stockljw/list',
    method: 'post',
    data
  })
}
// 入库添加
export function insertpacking(data) {
  return request({
    url: '/stockljw/insert',
    method: 'post',
    data
  })
}
// 入库修改
export function updatepacking(data) {
  return request({
    url: '/stockljw/update',
    method: 'post',
    data
  })
}
// 入库详情查询
export function StockItemList(warehouseno) {
  return request({
    url: '/stockljw/itemsList',
    method: 'get',
    params: { warehouseno }
  })
}

