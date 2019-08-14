// 管理分区

import request from '@/utils/request'

export function add(basPartition) {
  return request({
    url: '/baspartition/add',
    method: 'post',
    params: basPartition
  })
}

export function deleteById(id) {
  console.debug(id)
  return request({
    url: '/baspartition/deleteById ',
    method: 'post',
    data: { id }
  })
}

export function update(basPartition) {
  return request({
    url: '/baspartition/updateById',
    method: 'post',
    data: basPartition
  })
}

export function list(query) {
  return request({
    url: '/baspartition/list',
    method: 'get',
    params: query
  })
}

