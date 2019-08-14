import request from '@/utils/request'

export function pageList(sorCheckBound, pageSize, pageNum) {
  return request({
    url: '/sorCheckBound/list',
    method: 'get',
    params: { sorCheckBound: sorCheckBound, pageNum: pageNum, pageSize: pageSize }
  })
}

export function detailList(id) {
  return request({
    url: '/sorCheckBoundDetails/detailList',
    method: 'get',
    params: { id }
  })
}

export function updateCheckBound(sorCheckBound) {
  return request({
    url: '/sorCheckBound/updateCheckBound',
    method: 'post',
    data: sorCheckBound
  })
}

export function deleteCheckBound(id) {
  return request({
    url: '/sorCheckBound/deleteCheckBound',
    method: 'get',
    params: { id }
  })
}
export function insertCheckBound(sorCheckBound) {
  return request({
    url: '/sorCheckBound/insertCheckBound',
    method: 'post',
    data: sorCheckBound
  })
}

export function typeList() {
  return request({
    url: '/sorCheckBoundDetails/typeList',
    method: 'get'
  })
}
