import request from '@/utils/request'

export function add(businessadmissibility) {
  return request({
    url: '/acc/add',
    method: 'post',
    data: businessadmissibility
  })
}
export function ChaseSingle(businessadmissibility) {
  return request({
    url: '/acc/ChaseSingle',
    method: 'post',
    data: businessadmissibility
  })
}
export function UpdateSingle(businessadmissibility) {
  return request({
    url: '/acc/UpdateSingle',
    method: 'post',
    data: businessadmissibility
  })
}
export function MeltSingle(businessadmissibility) {
  return request({
    url: '/acc/MeltSingle',
    method: 'post',
    params: businessadmissibility
  })
}
export function list(listquery) {
  return request({
    url: '/accworkorder/list',
    method: 'post',
    data: listquery
  })
}
export function AllBh(list) {
  return request({
    url: '/accworkorder/SortingCodeAll',
    method: 'post',
    data: list
  })
}
