import request from '@/utils/request'

// --------查看列表

export function addBas(basBasicArchivesEntry) {
  return request({
    url: '/basBasicArchivesEntry/addBas',
    method: 'post',
    params: basBasicArchivesEntry
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

export function updateBas(basBasicArchivesEntry) {
  return request({
    url: '/basBasicArchivesEntry/updateBasById',
    method: 'post',
    data: basBasicArchivesEntry
  })
}

export function list2(id) {
  return request({
    url: '/basBasicArchivesEntry/findByPid',
    method: 'post',
    params: { id }
  })
}
