import request from '@/utils/HcRequest'

export function findByStorageId(id) {
  return request({
    url: '/sorStorageDetails/findByStorageId',
    method: 'get',
    params: { id }
  })
}

export function getByWorkId(id) {
  return request({
    url: '/sorStorageDetails/getByWorkId',
    method: 'get',
    params: { id }
  })
}

export function getByWorkIdPackage(id) {
  return request({
    url: '/sorStorageDetails/getByWorkIdPackage',
    method: 'get',
    params: { id }
  })
}

export function getInfo(token) {
  return request({
    url: '/user/info',
    method: 'get',
    params: { token }
  })
}

export function logout() {
  return request({
    url: '/user/logout',
    method: 'post'
  })
}
