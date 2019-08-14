// 班车设置表

import request from '@/utils/request'

export function add(basShuttleBus) {
  return request({
    url: '/basShuttleBus/add',
    method: 'post',
    params: basShuttleBus
  })
}

export function deleteById(id) {
  return request({
    url: '/basShuttleBus/deleteById ',
    method: 'post',
    data: { id }
  })
}

export function update(basShuttleBus) {
  return request({
    url: '/basShuttleBus/updateById',
    method: 'post',
    data: basShuttleBus
  })
}

export function list(query) {
  return request({
    url: '/basShuttleBus/list',
    method: 'post',
    params: query
  })
}

