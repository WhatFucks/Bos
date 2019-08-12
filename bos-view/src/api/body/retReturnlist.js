import request from '@/utils/request'

export function addRetReturnlist(ret) {
  return request({
    url: '/retReturnlist/addRetReturnlist',
    method: 'post',
    data: ret
  })
}

export function updateRetReturnlist(stock) {
  return request({
    url: '/retReturnlist/updateRetReturnlist',
    method: 'post',
    data: stock
  })
}

export function deleteRetReturnlist(id) {
  return request({
    url: '/retReturnlist/deleteRetReturnlist',
    method: 'post',
    data: { id }
  })
}

export function getRetReturnlist(query) {
  return request({
    url: '/retReturnlist/getRetReturnlist',
    method: 'post',
    data: query
  })
}

export function refuse(id) {
  return request({
    url: '/retReturnlist/refuse',
    method: 'post',
    data: { id }
  })
}

export function confirm(id) {
  return request({
    url: '/retReturnlist/confirm',
    method: 'post',
    data: { id }
  })
}
