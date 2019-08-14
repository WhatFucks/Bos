import request from '@/utils/HcRequest'

export function list(sorStorage, pageSize, pageNum) {
  return request({
    url: '/storage/list',
    method: 'get',
    params: { sorStorage: sorStorage, pageNum: pageNum, pageSize: pageSize }
  })
}

export function insertsorStorage(dynamicValidateForm) {
  return request({
    url: '/storage/insertsorStorage',
    method: 'post',
    data: dynamicValidateForm
  })
}

export function userlist() {
  return request({
    url: '/storage/userselect',
    method: 'get'
  })
}

export function getByWeights() {
  return request({
    url: '/storage/getByWeights',
    method: 'get'
  })
}

export function deleteSorStorage(id) {
  return request({
    url: '/storage/deleteSorStorage',
    method: 'post',
    params: { id }
  })
}

export function updateSorStorage(sorStorage) {
  return request({
    url: '/storage/updateSorStorage',
    method: 'post',
    data: sorStorage
  })
}

export function queryStorageDetail(sorStorage, pageSize, pageNum) {
  return request({
    url: '/sorStorageDetails/queryStorageDetail',
    method: 'get',
    params: { sorStorage: sorStorage, pageNum: pageNum, pageSize: pageSize }
  })
}
