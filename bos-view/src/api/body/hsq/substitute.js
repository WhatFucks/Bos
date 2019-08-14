// 取派设置表
import request from '@/utils/request'

export function add(basSubstitute) {
  return request({
    url: '/substitute/add',
    method: 'post',
    params: basSubstitute
  })
}

export function deleteById(id) {
  console.debug(id)
  return request({
    url: '/substitute/deleteById ',
    method: 'post',
    data: { id }
  })
}

export function update(basSubstitute) {
  return request({
    url: '/substitute/updateById',
    method: 'post',
    data: basSubstitute
  })
}

export function list(query) {
  return request({
    url: '/substitute/list',
    method: 'get',
    params: query
  })
}

