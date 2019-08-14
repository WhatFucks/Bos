import request from '@/utils/request'
// 入库详情添加
export function insertitem(data) {
  return request({
    url: '/item/insert',
    method: 'post',
    data: data
  })
}
// 入库详情修改
export function updateitem(data) {
  return request({
    url: '/item/update',
    method: 'post',
    data
  })
}
