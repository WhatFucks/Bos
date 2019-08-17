import request from '@/utils/request'

export function selectByPid(pid) {
  return request({
    url: '/basProvince/selectByPid',
    method: 'post',
    data: { pid }
  })
}
