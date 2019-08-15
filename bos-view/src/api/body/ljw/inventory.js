import request from '@/utils/request'
// 库存查询
export function list(data) {
  return request({
    url: '/tory/list',
    method: 'post',
    data
  })
}
