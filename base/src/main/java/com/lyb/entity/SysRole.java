package com.lyb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SysRole {
    private List<SysMenu> menus = new ArrayList<>();

    private Integer id; // 角色编号 主键

    private String name; // 角色名称

    private String remark; // 备注

    private String createBy; // 创建人

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime; // 创建时间

    private String lastUpdateBy; // 最后更改人

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime; // 最后更改时间

    private Integer delFlag; // 是否删除 0 是 1 否

    private static final Long serialVersionUID = 1L;
}