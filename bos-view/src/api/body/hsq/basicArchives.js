// 基础档案表

import request from '@/utils/request'

export function add(basicArchives) {
  return request({
    url: '/basBasicArchives/add',
    method: 'post',
    params: basicArchives
  })
}

export function deleteById(id) {
  console.debug(id)
  return request({
    url: '/basBasicArchives/deleteById ',
    method: 'post',
    data: { id }
  })
}

export function updateById(basicArchives) {
  return request({
    url: '/basBasicArchives/updateById',
    method: 'post',
    data: basicArchives
  })
}

export function list(query) {
  return request({
    url: '/basBasicArchives/list',
    method: 'get',
    params: query
  })
}

export function selectByName(dname) {
  return request({
    url: '/basBasicArchives/selectByName',
    method: 'post',
    data: { dname }
  })
}

