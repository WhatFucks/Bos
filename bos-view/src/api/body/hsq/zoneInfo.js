// 管理定区

import request from '@/utils/request'

export function add(basZoneInfo) {
  return request({
    url: '/zoneInfo/add',
    method: 'post',
    params: basZoneInfo
  })
}

export function deleteById(id) {
  console.debug(id)
  return request({
    url: '/zoneInfo/deleteById ',
    method: 'post',
    data: { id }
  })
}

export function update(basZoneInfo) {
  return request({
    url: '/zoneInfo/updateById',
    method: 'post',
    data: basZoneInfo
  })
}

export function list(query) {
  return request({
    url: '/zoneInfo/list',
    method: 'get',
    params: query
  })
}
