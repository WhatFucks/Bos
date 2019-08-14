import request from '@/utils/request'

export function list(listquery) {
  return request({
    url: '/dis/selectDispatch',
    method: 'post',
    data: listquery
  })
}
export function resend(dispatch) {
  return request({
    url: '/dis/resend',
    method: 'post',
    data: dispatch
  })
}
export function transfers(temp) {
  return request({
    url: '/dis/transfers',
    method: 'post',
    data: temp
  })
}

