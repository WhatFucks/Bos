import request from '@/utils/request'

export function addDept(dept) {
  return request({
    url: '/dept/addDept',
    method: 'post',
    data: dept
  })
}

export function updateDept(dept) {
  return request({
    url: '/dept/updateDeptByID',
    method: 'post',
    data: dept
  })
}

export function deleteDept(id) {
  return request({
    url: '/dept/deleteDeptByID',
    method: 'post',
    data: { id }
  })
}

export function getDeptList() {
  return request({
    url: '/dept/findAllDept',
    method: 'post'
  })
}

export function getDeptList2() {
  return request({
    url: '/dept/findAllDept2',
    method: 'post'
  })
}

export function deptPaging(page) {
  return request({
    url: '/dept/deptPaging',
    method: 'post',
    data: page
  })
}
