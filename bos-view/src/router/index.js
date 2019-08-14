import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'

/* Router Modules */

/**
 * 注意: 子菜单只有在 route children.length >= 1 才出现
 * 详情参见: https://panjiachen.github.io/vue-element-admin-site/guide/essentials/router-and-nav.html
 *
 * hidden: true                   如果设置为true，项目将不会显示在侧栏中(默认为false)
 * alwaysShow: true               如果设置为true，将始终显示根菜单
 *                                如果不总是设置show，当项目有多个子路由时，
 *                                它将成为嵌套模式，否则不显示根菜单
 * redirect: noRedirect           如果设置noRedirect，则不会在面包屑中重定向
 * name:'router-name'             名称由<keep-alive>(必须设置!!)使用
 * meta : {
    roles: ['admin','editor']    控制页面角色(可以设置多个角色)
    title: 'title'               名称显示在侧边栏和面包屑(推荐设置)
    icon: 'svg-name'             图标显示在侧栏中
    noCache: true                如果设置为true，页面将不会被缓存(默认为false)
    affix: true                  如果设置为true，则标记将附加在标记视图中
    breadcrumb: false            如果设置为false，则该项将隐藏在breadcrumb中(默认为true)
    activeMenu: '/example/list'  如果设置路径，侧栏将突出显示您设置的路径
  }
 */

/**
 * constantRoutes
 * 不需要验证的全局视图
 * 所有的角色都可以查看
 */

export const constantRoutes = [
  {
    path: '/redirect',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '/redirect/:path*',
        component: () => import('@/views/redirect/index')
      }
    ]
  },
  {
    path: '/login',
    component: () => import('@/views/login/index'),
    hidden: true
  },
  {
    path: '/auth-redirect',
    component: () => import('@/views/login/auth-redirect'),
    hidden: true
  },
  {
    path: '/404',
    component: () => import('@/views/error-page/404'),
    hidden: true
  },
  {
    path: '/401',
    component: () => import('@/views/error-page/401'),
    hidden: true
  },
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [
      {
        path: 'dashboard',
        component: () => import('@/views/dashboard/index'),
        name: '工作台',
        meta: { title: '工作台', icon: 'dashboard', affix: true }
      }
    ]
  }
]

/**
 * asyncRoutes
 * the routes that need to be dynamically loaded based on user roles
 */
export const asyncRoutes = [
  {
    path: '/permission',
    component: Layout,
    redirect: '/permission/page',
    alwaysShow: true, // will always show the root menu
    name: 'Permission',
    meta: {
      title: '系统管理',
      icon: 'example',
      roles: ['admin', 'dev'] // you can set roles in root nav
    },
    children: [
      {
        path: 'user',
        component: () => import('@/views/sys/user'),
        name: '用户管理',
        meta: { title: '用户管理', roles: ['admin', 'dev', 'test'] }
      },
      {
        path: 'role',
        component: () => import('@/views/sys/role'),
        name: '角色管理',
        meta: { title: '角色管理', roles: ['admin'] }
      },
      {
        path: 'menu',
        component: () => import('@/views/sys/menu'),
        name: '菜单管理',
        meta: { title: '菜单管理', roles: ['admin'] }
      },
      {
        path: 'dept',
        component: () => import('@/views/sys/dept'),
        name: '部门管理',
        meta: { title: '部门管理', roles: ['admin'] }
      }
    ]
  },
  {
    path: '/packagSet',
    component: Layout,
    alwaysShow: true,
    name: '包装设置',
    meta: {
      title: '包装设置',
      icon: 'clipboard',
      roles: ['admin', 'dev']
    },
    children: [
      {
        path: 'PackagingInformationInput',
        component: () => import('@/views/body/lyb/PackagingInformationInput'),
        name: '包装信息录入',
        meta: { title: '包装信息录入', roles: ['admin', 'dev'] }
      },
      {
        path: 'PackagingInformationInquiry',
        component: () => import('@/views/body/lyb/PackagingInformationInquiry'),
        name: '包装信息查询',
        meta: { title: '包装信息查询', roles: ['admin', 'dev'] }
      }
    ]
  },
  {
    path: '/ReturnGoodsManagement',
    component: Layout,
    name: '返货管理',
    meta: {
      title: '返货管理',
      icon: 'example',
      roles: ['admin', 'dev'] // you can set roles in root nav
    },
    children: [
      {
        path: 'ReturnApply',
        component: () => import('@/views/body/lyb/ReturnApply'),
        name: '返货申请',
        meta: { title: '返货申请', roles: ['admin', 'dev'] }
      },
      {
        path: 'ReturnApplyAffirm',
        component: () => import('@/views/body/lyb/ReturnApplyAffirm'),
        name: '返货申请确认',
        meta: { title: '返货申请确认', roles: ['admin', 'dev'] }
      },
      {
        path: 'CreateReturnInvoice',
        component: () => import('@/views/body/lyb/CreateReturnInvoice'),
        name: '生成返货单',
        meta: { title: '生成返货单', roles: ['admin', 'dev'] }
      }
    ]
  },
  // 胡侘
  {
    path: '/sor',
    component: Layout,
    redirect: '/sor/page',
    alwaysShow: true, // will always show the root menu
    name: 'sor',
    meta: {
      title: '分拣管理',
      icon: 'lock',
      roles: ['admin', 'editor'] // you can set roles in root nav
    },
    children: [
      {
        path: 'storage',
        component: () => import('@/views/sor/storage'),
        name: '入库',
        meta: {
          title: '入库',
          roles: ['admin'] // or you can only set roles in sub nav
        }
      },
      {
        path: 'outBound',
        component: () => import('@/views/sor/outBound'),
        name: '出库',
        meta: {
          title: '出库',
          // if do not set roles, means: this page does not require permission
          roles: ['dev', 'admin']
        }
      },
      {
        path: 'checkBound',
        component: () => import('@/views/sor/checkBound'),
        name: '盘库',
        meta: {
          title: '盘库',
          roles: ['dev', 'admin']
        }
      },
      {
        path: 'package',
        component: () => import('@/views/sor/package'),
        name: '合包',
        meta: {
          title: '合包',
          roles: ['admin']
        }
      },
      {
        path: 'unpack',
        component: () => import('@/views/sor/unpack'),
        name: '拆包',
        meta: {
          title: '拆包',
          roles: ['admin']
        }
      },
      {
        path: 'storageQuery',
        component: () => import('@/views/sor/storageQuery'),
        name: '出入库查询',
        meta: {
          title: '出入库查询',
          roles: ['admin']
        }
      }, {
        path: 'InventoryQuery',
        component: () => import('@/views/sor/InventoryQuery'),
        name: '库存查询',
        meta: {
          title: '库存查询',
          roles: ['dev']
        }
      }, {
        path: 'packageQuery',
        component: () => import('@/views/sor/packageQuery'),
        name: '合包查询',
        meta: {
          title: '合包查询',
          roles: ['admin']
        }
      }, {
        path: 'abnormal',
        component: () => import('@/views/sor/abnormal'),
        name: '单货异常查询',
        meta: {
          title: '单货异常查询',
          roles: ['admin']
        }
      }
    ]
  },
  // 404 page must be placed at the end !!!
  { path: '*', redirect: '/404', hidden: true }
]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
