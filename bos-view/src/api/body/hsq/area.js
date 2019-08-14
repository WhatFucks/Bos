// 区域设置表

import request from '@/utils/request'

export function add(basArea) {
  return request({
    url: '/basarea/add',
    method: 'post',
    params: basArea
  })
}

export function deleteById(id) {
  console.debug(id)
  return request({
    url: '/basarea/deleteById ',
    method: 'post',
    data: { id }
  })
}

export function update(basArea) {
  return request({
    url: '/basarea/updateById',
    method: 'post',
    data: basArea
  })
}

export function list(query) {
  return request({
    url: '/basarea/list',
    method: 'get',
    params: query
  })
}
