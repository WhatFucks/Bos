// 收派标准表
import request from '@/utils/request'

export function add(deliveryStandard) {
  return request({
    url: '/bas/add',
    method: 'post',
    params: deliveryStandard
  })
}

export function deleteById(id) {
  console.debug(id)
  return request({
    url: '/bas/deleteById ',
    method: 'post',
    data: { id }
  })
}

export function update(deliveryStandard) {
  return request({
    url: '/bas/updateById',
    method: 'post',
    data: deliveryStandard
  })
}

export function list(query) {
  return request({
    url: '/bas/list',
    method: 'get',
    params: query
  })
}

export function selectByName(dname) {
  return request({
    url: '/bas/selectByName',
    method: 'post',
    data: { dname }
  })
}
