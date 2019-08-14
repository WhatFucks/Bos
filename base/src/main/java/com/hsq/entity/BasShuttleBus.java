package com.hsq.entity;

import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
/**
 * 班车设置表
 */
public class BasShuttleBus implements Serializable {

    //用户
    private SysUser user;

    //部门
    private SysDept dept;

    // 线路类型表
    private LogTrack logTrack;

    private Integer id;

    private Integer linetype;

    private Integer lineid;

    private String licenseplateint;

    private String carrier;

    private String models;

    private String driver;

    private String telephone;

    private Integer ton;

    private String remarks;

    private Integer operatorid;

    private Integer operationunitid;

    private Date operationtime;

    private static final long serialVersionUID = 1L;
}
