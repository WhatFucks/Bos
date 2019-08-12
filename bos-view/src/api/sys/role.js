import request from '@/utils/request'

export function addRole(role) {
  return request({
    url: '/role/addRole',
    method: 'post',
    data: role
  })
}

export function updateRole(role) {
  return request({
    url: '/role/updateRoleByID',
    method: 'post',
    data: role
  })
}

export function startRole(id) {
  return request({
    url: '/role/startRole',
    method: 'post',
    data: { id }
  })
}

export function deleteRole(id) {
  return request({
    url: '/role/deleteRoleByID',
    method: 'post',
    data: { id }
  })
}

export function getRoleList() {
  return request({
    url: '/role/getRoleList',
    method: 'post'
  })
}
export function rolePaging(page) {
  return request({
    url: '/role/rolePaging',
    method: 'post',
    data: page
  })
}

export function getRoles(id) {
  return request({
    url: '/role/getRoles',
    method: 'post',
    data: { id }
  })
}
export function allotRoles(uid,rids) {
  return request({
    url: '/role/allotRoles',
    method: 'post',
    data: {uid,rids}
  })
}
