import request from '@/utils/request'

export function list(listquery) {
  return request({
    url: '/workordersign/list',
    method: 'post',
    data: listquery
  })
}
export function add(workordersign) {
  return request({
    url: '/workordersign/add',
    method: 'post',
    params: workordersign
  })
}
export function update(workordersign) {
  return request({
    url: '/workordersign/update',
    method: 'post',
    data: workordersign
  })
}
export function affirm(id) {
  return request({
    url: '/workordersign/affirm',
    method: 'post',
    params: { id }
  })
}
export function deletes(id) {
  return request({
    url: '/workordersign/deletes',
    method: 'post',
    params: { id }
  })
}
