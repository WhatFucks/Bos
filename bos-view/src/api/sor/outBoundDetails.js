import request from '@/utils/request'

export function findByStorageId(id) {
  return request({
    url: '/sorOutBoundDetails/list',
    method: 'get',
    params: { id }
  })
}

export function deleteTostorage(id) {
  return request({
    url: '/user/info',
    method: 'get',
    params: { id }
  })
}

export function logout() {
  return request({
    url: '/user/logout',
    method: 'post'
  })
}
