import request from '@/utils/request'

export function sorStoragelist(sorStorage, pageSize, pageNum) {
  return request({
    url: '/sorOutBound/list',
    method: 'get',
    params: { sorStorage: sorStorage, pageNum: pageNum, pageSize: pageSize }
  })
}

export function insertsorStorage(sorOutBound) {
  return request({
    url: '/sorOutBound/insertsorStorage',
    method: 'post',
    data: sorOutBound
  })
}

export function updateToSorOutBound(sorOutBound) {
  return request({
    url: '/sorOutBound/updateToSorOutBound',
    method: 'post',
    data: sorOutBound
  })
}

export function deleteTosoroutBound(id) {
  return request({
    url: '/sorOutBound/deleteTosoroutBound',
    method: 'get',
    params: { id }
  })
}
export function ListToSorOutBoundType() {
  return request({
    url: '/sorOutBound/ListToSorOutBoundType',
    method: 'get'
  })
}
