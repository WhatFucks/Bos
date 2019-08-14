// 定区明细

import request from '@/utils/request'

export function add2(basZoneCustomInfo) {
  return request({
    url: '/zonecustominfo/add2',
    method: 'post',
    params: basZoneCustomInfo
  })
}

export function delete2(id) {
  return request({
    url: '/zonecustominfo/delete2 ',
    method: 'post',
    data: { id }
  })
}

export function update2(basZoneCustomInfo) {
  return request({
    url: '/zonecustominfo/update2',
    method: 'post',
    data: basZoneCustomInfo
  })
}

export function list2(id) {
  return request({
    url: '/zonecustominfo/findByZid',
    method: 'post',
    params: { id }
  })
}
