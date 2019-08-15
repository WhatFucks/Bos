import request from '@/utils/request'
// 提货管理查询
export function list(data) {
  return request({
    url: '/arrival/list',
    method: 'post',
    data
  })
}
