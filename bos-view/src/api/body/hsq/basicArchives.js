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

export function update(basicArchives) {
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

// --------查看列表

export function addBas(basicArchives) {
  return request({
    url: '/basBasicArchivesEntry/addBas',
    method: 'post',
    params: basicArchives
  })
}

export function deleteBasById(id) {
  console.debug(id)
  return request({
    url: '/basBasicArchivesEntry/deleteBasById ',
    method: 'post',
    data: { id }
  })
}

export function updateBas(basicArchives) {
  return request({
    url: '/basBasicArchivesEntry/updateBasById',
    method: 'post',
    data: basicArchives
  })
}

export function all(query) {
  return request({
    url: '/basBasicArchivesEntry/all',
    method: 'get',
    params: query
  })
}

export function selectBasByName(dname) {
  return request({
    url: '/basBasicArchivesEntry/selectBasByName',
    method: 'post',
    data: { dname }
  })
}

