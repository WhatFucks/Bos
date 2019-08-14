import request from '@/utils/request'

export function insert(accworksheet) {
  return request({
    url: '/accworksheet/insert',
    method: 'post',
    data: accworksheet
  })
}

