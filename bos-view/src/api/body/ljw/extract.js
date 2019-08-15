import request from '@/utils/request'
// 提货查询
export function list(data) {
  return request({
    url: '/extract/list',
    method: 'post',
    data
  })
}

// 提货监控
export function Iaelist(data) {
  return request({
    url: '/extract/IaeList',
    method: 'post',
    data
  })
}

export function add(data) {
  return request({
    url: '/extract/add',
    method: 'post',
    data
  })
}
