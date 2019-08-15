import request from '@/utils/request'
// 查询出库详情
export function OutItemlists(warehouseorderno) {
  return request({
    url: '/outitem/list',
    method: 'post',
    data: { warehouseorderno }
  })
}
// 出库详情添加
export function insertoutitem(data) {
  return request({
    url: '/outitem/insert',
    method: 'post',
    data: data
  })
}
// 出库详情修改
export function updateoutitem(data) {
  return request({
    url: '/outitem/update',
    method: 'post',
    data
  })
}
