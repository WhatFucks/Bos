import request from '@/utils/request'

export function list(sorPackage, pageSize, pageNum) {
  return request({
    url: '/sorPackage/packageList',
    method: 'get',
    params: { sorStorage: sorPackage, pageNum: pageNum, pageSize: pageSize }
  })
}

export function insertPackage(sorPackage) {
  return request({
    url: '/sorPackage/insertPackage',
    method: 'post',
    data: sorPackage
  })
}

export function userlist() {
  return request({
    url: '/storage/userselect',
    method: 'get'
  })
}

export function detailListById(id) {
  return request({
    url: '/sorPackageDetail/detailListById',
    method: 'get',
    params: { id }
  })
}

export function queryAllById(id) {
  return request({
    url: '/sorPackage/queryAllById',
    method: 'get',
    params: { id }
  })
}

export function chaiCheck(id) {
  return request({
    url: '/sorPackage/chaiCheck',
    method: 'get',
    params: { id }
  })
}
