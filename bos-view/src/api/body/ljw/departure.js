import request from '@/utils/request'
// 出港配载查询
export function list(data) {
  return request({
    url: '/departure/list',
    method: 'post',
    data
  })
}
