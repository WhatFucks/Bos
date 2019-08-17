import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'

/* Router Modules */

/**
 * 注意: 子菜单只有在 route children.length >= 1 才出现
 * 详情参见: https://panjiachen.github.io/vue-element-系统管理员-site/guide/essentials/router-and-nav.html
 *
 * hidden: true                   如果设置为true，项目将不会显示在侧栏中(默认为false)
 * alwaysShow: true               如果设置为true，将始终显示根菜单
 *                                如果不总是设置show，当项目有多个子路由时，
 *                                它将成为嵌套模式，否则不显示根菜单
 * redirect: noRedirect           如果设置noRedirect，则不会在面包屑中重定向
 * name:'router-name'             名称由<keep-alive>(必须设置!!)使用
 * meta : {
    roles: ['系统管理员','editor']    控制页面角色(可以设置多个角色)
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
    alwaysShow: true, // will always show the root menu
    name: 'Permission',
    meta: {
      title: '系统管理',
      icon: 'user',
      roles: ['系统管理员', '总经理'] // you can set roles in root nav
    },
    children: [
      {
        path: 'user',
        component: () => import('@/views/sys/user'),
        name: '用户管理',
        meta: { title: '用户管理', roles: ['系统管理员', '总经理'] }
      },
      {
        path: 'role',
        component: () => import('@/views/sys/role'),
        name: '角色管理',
        meta: { title: '角色管理', roles: ['系统管理员', '总经理'] }
      },
      {
        path: 'menu',
        component: () => import('@/views/sys/menu'),
        name: '权限管理',
        meta: { title: '权限管理', roles: ['系统管理员', '总经理'] }
      },
      {
        path: 'dept',
        component: () => import('@/views/sys/dept'),
        name: '部门管理',
        meta: { title: '部门管理', roles: ['系统管理员', '总经理'] }
      }
    ]
  },
  //  hsq  基础数据
  {
    path: '/recordHsq',
    component: Layout,
    alwaysShow: true, // 总是显示总菜单
    name: '基础档案',
    meta: {
      title: '基础档案',
      icon: 'form',
      roles: ['系统管理员', '总经理', '基础管理员'] // 可以在根导航中设置角色
    },
    children: [
      {
        path: 'basicArchives',
        component: () => import('@/views/body/hsq/basicArchives'),
        name: '基础档案设置',
        meta: { title: '基础档案设置', roles: ['系统管理员', '总经理', '基础管理员'] }
      },
      {
        path: 'deliveryStandard',
        component: () => import('@/views/body/hsq/deliveryStandard'),
        name: '收派标准',
        meta: { title: '收派标准', roles: ['系统管理员', '总经理', '基础管理员'] }
      },
      {
        path: 'shuttleBus',
        component: () => import('@/views/body/hsq/shuttleBus'),
        name: '班车设置',
        meta: { title: '班车设置', roles: ['系统管理员', '总经理', '基础管理员'] }
      },
      {
        path: 'substitute',
        component: () => import('@/views/body/hsq/substitute'),
        name: '取派员设置',
        meta: { title: '取派员设置', roles: ['系统管理员', '总经理', '基础管理员'] }
      },
      {
        path: 'area',
        component: () => import('@/views/body/hsq/area'),
        name: '区域设置',
        meta: { title: '区域设置', roles: ['系统管理员', '总经理', '基础管理员'] }
      },
      {
        path: 'partition',
        component: () => import('@/views/body/hsq/partition'),
        name: '管理分区',
        meta: { title: '管理分区', roles: ['系统管理员', '总经理', '基础管理员'] }
      },
      {
        path: 'zoneInfo',
        component: () => import('@/views/body/hsq/zoneInfo'),
        name: '管理定区',
        meta: { title: '管理定区', roles: ['系统管理员', '总经理', '基础管理员'] }
      }
    ]
  },
  // Li.明
  {
    path: '/record',
    component: Layout,
    redirect: '/record/page',
    alwaysShow: true, // will always show the root menu
    name: '受理',
    meta: {
      title: '受理',
      icon: 'peoples',
      roles: ['系统管理员', '总经理', '受理调度员'] // you can set roles in root nav
    },
    children: [
      {
        path: 'recordset',
        component: () => import('@/views/body/lm/acc/reception'),
        name: '业务受理',
        meta: { title: '业务受理', roles: ['系统管理员', '总经理', '受理调度员'] }
      },
      {
        path: 'pick',
        component: () => import('@/views/body/lm/acc/workSheet'),
        name: '工作单快速录入',
        meta: { title: '工作单快速录入', roles: ['系统管理员', '总经理', '受理调度员'] }
      },
      {
        path: 'bus',
        component: () => import('@/views/body/lm/acc/workOrder'),
        name: ' 工作单查询',
        meta: { title: ' 工作单查询', roles: ['系统管理员', '总经理', '受理调度员'] }
      }
    ]
  },
  {
    path: '/dispatch',
    component: Layout,
    redirect: '/dispatch/page',
    alwaysShow: true, // will always show the root menu
    name: '调度',
    meta: {
      title: '调度',
      icon: 'skill',
      roles: ['系统管理员', '总经理', '受理调度员'] // you can set roles in root nav
    },
    children: [
      {
        path: 'recordset',
        component: () => import('@/views/body/lm/dis/transfer'),
        name: '查台转单',
        meta: { title: '查台转单', roles: ['系统管理员', '总经理', '受理调度员'] }
      },
      {
        path: 'pick',
        component: () => import('@/views/body/lm/dis/artificial'),
        name: '人工调度',
        meta: { title: '人工调度', roles: ['系统管理员', '总经理', '受理调度员'] }
      },
      {
        path: 'sig',
        component: () => import('@/views/body/lm/dis/Signforentry'),
        name: ' 签收录入',
        meta: { title: ' 签收录入', roles: ['系统管理员', '总经理', '受理调度员'] }
      },
      {
        path: 'nosig',
        component: () => import('@/views/body/lm/dis/NoSignforentry'),
        name: ' 取消签收申请录入',
        meta: { title: ' 取消签收申请录入', roles: ['系统管理员', '总经理', '受理调度员'] }
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
      roles: ['系统管理员', '总经理', '包装管理员']
    },
    children: [
      {
        path: 'PackagingInformationInput',
        component: () => import('@/views/body/lyb/PackagingInformationInput'),
        name: '包装信息录入',
        meta: { title: '包装信息录入', roles: ['系统管理员', '总经理', '包装管理员'] }
      },
      {
        path: 'PackagingInformationInquiry',
        component: () => import('@/views/body/lyb/PackagingInformationInquiry'),
        name: '包装信息查询',
        meta: { title: '包装信息查询', roles: ['系统管理员', '总经理', '包装管理员'] }
      }
    ]
  },
  // 廖嘉威
  {
    path: '/pac',
    component: Layout,
    redirect: '/pac',
    alwaysShow: true, // will always show the root menu
    name: 'pac',
    meta: {
      title: '包装材料管理',
      icon: 'table',
      roles: ['系统管理员', '总经理', '包装管理员'] // you can set roles in root nav
    },
    children: [
      {
        path: 'packaging',
        component: () => import('@/views/body/ljw/packaging'),
        name: 'packaging',
        meta: { title: '包装材料物品管理', roles: ['系统管理员', '总经理', '包装管理员'] }
      },
      {
        path: 'stock',
        component: () => import('@/views/body/ljw/PacStock'),
        name: 'stock',
        meta: { title: '入库管理', roles: ['系统管理员', '总经理', '包装管理员'] }
      },
      {
        path: 'stockout',
        component: () => import('@/views/body/ljw/pacStockOut'),
        name: 'stockout',
        meta: { title: '出库管理', roles: ['系统管理员', '总经理', '包装管理员'] }
      },
      {
        path: 'stockItem',
        component: () => import('@/views/body/ljw/inventory'),
        name: 'stockItem',
        meta: { title: '库存管理', roles: ['系统管理员', '总经理', '包装管理员'] }
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
      icon: 'list',
      roles: ['系统管理员', '总经理', '分拣管理员'] // you can set roles in root nav
    },
    children: [
      {
        path: 'storage',
        component: () => import('@/views/sor/storage'),
        name: '入库',
        meta: {
          title: '入库',
          roles: ['系统管理员', '总经理', '分拣管理员'] // or you can only set roles in sub nav
        }
      },
      {
        path: 'outBound',
        component: () => import('@/views/sor/outBound'),
        name: '出库',
        meta: {
          title: '出库',
          // if do not set roles, means: this page does not require permission
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      },
      {
        path: 'checkBound',
        component: () => import('@/views/sor/checkBound'),
        name: '盘库',
        meta: {
          title: '盘库',
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      },
      {
        path: 'package',
        component: () => import('@/views/sor/package'),
        name: '合包',
        meta: {
          title: '合包',
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      },
      {
        path: 'unpack',
        component: () => import('@/views/sor/unpack'),
        name: '拆包',
        meta: {
          title: '拆包',
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      },
      {
        path: 'storageQuery',
        component: () => import('@/views/sor/storageQuery'),
        name: '出入库查询',
        meta: {
          title: '出入库查询',
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      }, {
        path: 'InventoryQuery',
        component: () => import('@/views/sor/InventoryQuery'),
        name: '库存查询',
        meta: {
          title: '库存查询',
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      }, {
        path: 'packageQuery',
        component: () => import('@/views/sor/packageQuery'),
        name: '合包查询',
        meta: {
          title: '合包查询',
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      }, {
        path: 'abnormal',
        component: () => import('@/views/sor/abnormal'),
        name: '单货异常查询',
        meta: {
          title: '单货异常查询',
          roles: ['系统管理员', '总经理', '分拣管理员']
        }
      }
    ]
  },
  {
    path: '/ReturnGoodsManagement',
    component: Layout,
    name: '返货管理',
    meta: {
      title: '返货管理',
      icon: 'link',
      roles: ['系统管理员', '总经理', '返货管理员'] // you can set roles in root nav
    },
    children: [
      {
        path: 'ReturnApply',
        component: () => import('@/views/body/lyb/ReturnApply'),
        name: '返货申请',
        meta: { title: '返货申请', roles: ['系统管理员', '总经理', '返货管理员'] }
      },
      {
        path: 'ReturnApplyAffirm',
        component: () => import('@/views/body/lyb/ReturnApplyAffirm'),
        name: '返货申请确认',
        meta: { title: '返货申请确认', roles: ['系统管理员', '总经理', '返货管理员'] }
      },
      {
        path: 'CreateReturnInvoice',
        component: () => import('@/views/body/lyb/CreateReturnInvoice'),
        name: '返货单信息查询',
        meta: { title: '返货单信息查询', roles: ['系统管理员', '总经理', '返货管理员'] }
      }
    ]
  },
  {
    path: '/iae',
    component: Layout,
    redirect: '/iae',
    alwaysShow: true, // will always show the root menu
    name: 'iae',
    meta: {
      title: '进出港管理',
      icon: 'tree',
      roles: ['系统管理员', '总经理', '进出港管理员'] // you can set roles in root nav
    },
    children: [
      {
        path: 'departure',
        component: () => import('@/views/body/ljw/departure'),
        name: 'departure',
        meta: { title: '出港配载', roles: ['系统管理员', '总经理', '进出港管理员'] }
      },
      {
        path: 'extract',
        component: () => import('@/views/body/ljw/extract'),
        name: 'extract',
        meta: { title: '提货管理', roles: ['系统管理员', '总经理', '进出港管理员'] }
      },
      {
        path: 'arrival',
        component: () => import('@/views/body/ljw/arrival'),
        name: 'arrival',
        meta: { title: '进港分单', roles: ['系统管理员', '总经理', '进出港管理员'] }
      },
      {
        path: 'lineResource',
        component: () => import('@/views/body/ljw/lineresource'),
        name: 'lineResource',
        meta: { title: '出港配载查询', roles: ['系统管理员', '总经理', '进出港管理员'] }
      }
    ]
  },
  // lj 罗晶
  {
    path: '/logistics',
    component: Layout,
    redirect: '/logistics',
    alwaysShow: true, // will always show the root menu
    name: 'logistics',
    meta: {
      title: '大物流管理',
      icon: 'tree-table',
      roles: ['系统管理员', '总经理', '物流管理员']// you can set roles in root nav
    },
    children: [
      {
        path: 'logistics',
        component: () => import('@/views/body/sj/logistics/logisticscontrol'),
        name: 'logistics',
        meta: { title: '大物流发货对照表', roles: ['系统管理员', '总经理', '物流管理员'] }
      }
    ]
  },
  {
    path: '/reportforms',
    component: Layout,
    redirect: '/chart/reportforms',
    alwaysShow: true, // will always show the root menu
    name: 'chart',
    meta: {
      title: '报表',
      icon: 'chart',
      roles: ['系统管理员', '总经理', '基础管理员', '包装管理员', '返货管理员', '分拣管理员', '受理调度员', '物流管理员', '进出港管理员'] // you can set roles in root nav
    },
    children: [
      {
        path: 'statement',
        component: () => import('@/views/body/sj/reportforms/reportforms'),
        name: 'statement',
        meta: { title: '报表', roles: ['系统管理员', '总经理', '基础管理员', '包装管理员', '返货管理员', '分拣管理员', '受理调度员', '物流管理员', '进出港管理员'] }
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
