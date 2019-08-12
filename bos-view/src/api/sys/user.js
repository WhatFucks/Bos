import request from '@/utils/request'

export function addUser(user) {
  return request({
    url: '/user/addUser',
    method: 'post',
    data: user
  })
}

export function startUser(id) {
  return request({
    url: '/user/startUser',
    method: 'post',
    data: { id }
  })
}

export function updateUser(user) {
  return request({
    url: '/user/updateUserByID',
    method: 'post',
    data: user
  })
}

export function deleteUser(id) {
  return request({
    url: '/user/deleteUserByID',
    method: 'post',
    data: { id }
  })
}

export function getUserList(page) {
    return request({
    url: '/user/getUserList',
    method: 'post',
    data: page
    // headers:{
    //   'Content-Type':'application/json'
    // }
  })
}
