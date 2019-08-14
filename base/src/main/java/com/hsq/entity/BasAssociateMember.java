package com.hsq.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
/**
 * 关联小件员表
 */
public class BasAssociateMember implements Serializable {
    private Integer id;

    private String zonecode;

    private String empno;

    private String empname;

    private BigDecimal standardkg;

    private BigDecimal standardlength;

    private Date standardtime;

    private Integer subordinateunit;

    private String type;

    private static final long serialVersionUID = 1L;


}
