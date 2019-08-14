package com.lyb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SysUser{
    private List<SysRole> roles = new ArrayList<>();

    private Integer id; //用户编号 主键

    private String username; // 用户名

    private String password; // 密码

    private String salt; // 盐

    private String email; // 邮箱

    private String mobile;// 电话

    private Integer status; // 状态 0 可用 1 不可用

    private Integer deptId;// 部门编号

    private String createBy; // 创建人

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime; // 创建时间

    private String lastUpdateBy; // 最后更改人

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime; // 最后更改时间

    private Integer delFlag; // 是否删除 0 否 1 是

    private String introduction; // 描述

    private String avatar; // 头像

    private String userNo;// 工号

    private static final long serialVersionUID = 1L;

}