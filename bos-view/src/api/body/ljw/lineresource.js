import request from '@/utils/request'
// 出港配载查询
export function list(data) {
  return request({
    url: '/lineresource/list',
    method: 'post',
    data
  })
}

export function LinList(id) {
  return request({
    url: '/lineresource/listitems',
    method: 'post',
    params: { id }
  })
}
