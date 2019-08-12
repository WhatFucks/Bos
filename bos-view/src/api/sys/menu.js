import request from '@/utils/request'

export function addMenu(menu) {
  return request({
    url: '/menu/addMenu',
    method: 'post',
    data: menu
  })
}

export function updateMenu(menu) {
  return request({
    url: '/menu/updateMenu',
    method: 'post',
    data: menu
  })
}

export function deleteMenu(id) {
  return request({
    url: '/menu/deleteMenu',
    method: 'post',
    data: { id }
  })
}

export function startMenu(id) {
  return request({
    url: '/menu/startMenu',
    method: 'post',
    data: { id }
  })
}

export function getMenuList(page) {
  return request({
    url: '/menu/findAllMenu',
    method: 'post',
    data: page
  })
}
export function getMenus (id) {
  return request({
    url: '/menu/getMenus',
    method: 'post',
    data: { id }
  })
}
export function allotMenus(rid,mids) {
  return request({
    url: '/menu/allotMenus',
    method: 'post',
    data: { rid,mids }
  })
}
