import request from '@/utils/request'

export function affirm(temp) {
  console.debug(temp)
  return request({
    url: '/disdispatchhistory/affirm',
    method: 'post',
    data: temp
  })
}

export function back(temp) {
  return request({
    url: '/disdispatchhistory/back',
    method: 'post',
    data: temp
  })
}

export function UpdateSingle(businessadmissibility) {
  return request({
    url: '/acc/UpdateSingle',
    method: 'post',
    data: businessadmissibility
  })
}

export function list(listquery) {
  return request({
    url: '/acc/lists',
    method: 'post',
    data: listquery
  })
}
