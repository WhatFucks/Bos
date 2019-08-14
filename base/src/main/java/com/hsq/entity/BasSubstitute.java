package com.hsq.entity;

import com.lyb.entity.SysDept;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
/**
 * 取派设置表
 */
public class BasSubstitute implements Serializable {


    //部门
    private SysDept dept;

    private Integer id;

    private String empno;

    private String empname;

    private String mobileno;

    private String type;

    private Boolean pda;

    private BigDecimal standardkg;

    private BigDecimal standardlength;

    private String models;

    private String plateint;

    private Boolean invalidatemark;

    private Integer subordinateunit;

    private static final long serialVersionUID = 1L;
}
