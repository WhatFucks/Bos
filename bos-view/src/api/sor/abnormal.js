import request from '@/utils/request'

export function insertToSorAbnormal(sorAbnormal) {
  return request({
    url: '/sorAbnormal/insertToSorAbnormal',
    method: 'post',
    data: sorAbnormal
  })
}

export function getInfo(token) {
  return request({
    url: '/user/info',
    method: 'get',
    params: { token }
  })
}

export function listAll() {
  return request({
    url: '/sorAbnormal/listAll',
    method: 'get'
  })
}
