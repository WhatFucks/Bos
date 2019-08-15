package com.hsq.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
/**
 * 收派标准表
 */
public class BasDeliveryStandard implements Serializable {

    //用户
    private SysUser user;

    //部门
    private SysDept dept;

    private Integer id;

    private String name;

    private BigDecimal minweight;

    private BigDecimal maxweight;

    private Integer operatorid;

    private Integer operationunitid;
    @JsonFormat(pattern = "yyyy-mm-dd HH:MM:SS" )
    @DateTimeFormat(pattern = "yyyy-mm-dd HH:MM:SS")
    private Date operationtime;

    private static final long serialVersionUID = 1L;
}
