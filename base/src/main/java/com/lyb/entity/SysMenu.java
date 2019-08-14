package com.lyb.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SysMenu {
    private Integer id; // 编号

    private String name;// 菜单名

    private Integer parentId;// 上级ID

    private String url; // 菜单URL,类型：1.普通页面（如用户管理， /sys/user） 2.嵌套完整外部页面，以http(s)开头的链接 3.嵌套服务器页面，使用iframe:前缀+目标URL(如SQL监控， iframe:/druid/login.html, iframe:前缀会替换成服务器地址)

    private String perms; // 授权(多个用逗号分隔，如：sys:user:add,sys:user:edit)

    private Integer type; // 类型   0：目录   1：菜单   2：按钮

    private String icon; // 图标

    private Integer orderNum; // 排序

    private String createBy; // 创建人

    private Date createTime; // 创建时间

    private String lastUpdateBy; // 最后更改人

    private Date lastUpdateTime; // 最后更改时间

    private Integer delFlag; // 状态 0 正常 -1 已删除

    private static final long serialVersionUID = 1L;
}