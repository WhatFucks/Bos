package com.hsq.entity;

import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
@Data
/**
 * 区域设置表
 */
public class BasArea implements Serializable {

    // 用户表连接
    private SysUser user;

    // 部门表连接
    private SysDept dept;

    private Integer id;

    private String province;

    private String city;

    private String county;

    private Integer postalcode;

    private String simplecode;

    private String citycode;

    private String entryunitid;

    private String complementunitid;

    private Integer nature;

    private Integer thearea;

    private static final long serialVersionUID = 1L;
}
