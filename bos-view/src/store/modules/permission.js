// 导入了全部的路由asyncRoutes：需要角色校验的,constantRoutes:不需要校验的
import { asyncRoutes, constantRoutes } from '@/router'

/**
 * 使用meta.roles来 根据角色确定当前用户是否具有权限
 * @param roles admin
 * @param route ['admin','dev','test']
 */
function hasPermission(roles, route) {
  if (route.meta && route.meta.roles) {
    return roles.some(role => route.meta.roles.includes(role))
  } else {
    return true
  }
}

/**
 * 通过递归过滤 asyncRoutes
 * @param routes asyncRoutes 全部的菜单所在的路由文件对象
 * @param roles ['admin','dev'] 角色权限数组
 */
export function filterAsyncRoutes(routes, roles) {
  const res = []
  // 循环所有的路由数组
  routes.forEach(route => {
    const tmp = { ...route }
    // 判断是否具有权限
    if (hasPermission(roles, tmp)) {
      // 如果有子集
      if (tmp.children) {
        // 子集传递过去，递归调用，继续过滤
        tmp.children = filterAsyncRoutes(tmp.children, roles)
      }
      // 将有的权限添加到要返回的对象里
      res.push(tmp)
    }
  })

  return res
}

const state = {
  routes: [],
  addRoutes: []
}

const mutations = {
  SET_ROUTES: (state, routes) => {
    state.addRoutes = routes
    state.routes = constantRoutes.concat(routes)
  }
}

const actions = {
  // 动态生成路由的方法
  generateRoutes({ commit }, roles) {
    return new Promise(resolve => {
      // 可以访问的路由对象
      let accessedRoutes
      // 如果路由里含有admin角色权限
      // if (roles.includes('admin')) {
      //   // 当前可以访问的路由为所有需要校验的异步路由集合
      //   accessedRoutes = asyncRoutes || []
      // } else {
      // }
      accessedRoutes = filterAsyncRoutes(asyncRoutes, roles)
      commit('SET_ROUTES', accessedRoutes)
      resolve(accessedRoutes)
    })
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions
}
