import request from '@/utils/request'
// 包装材料查询
export function list(data) {
  return request({
    url: '/packaging/list',
    method: 'post',
    data
  })
}
// 包装材料添加
export function insertpacking(data) {
  return request({
    url: '/packaging/insert',
    method: 'post',
    data
  })
}
// 包装材料修改
export function updatepacking(data) {
  return request({
    url: '/packaging/update',
    method: 'post',
    data
  })
}
// 包装材料作废
export function deletepacking(id) {
  return request({
    url: '/packaging/delete',
    method: 'get',
    params: { id }
  })
}

// 规格
export function Specificationslist() {
  return request({
    url: '/packaging/Specificationslist',
    method: 'post'
  })
}
