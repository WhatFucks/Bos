package com.lyb.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class AccWorksheet {
    private Integer id;

    private String worksheetno;

    private String jobno;

    private String destination;

    private String producttime;

    private Integer total;

    private BigDecimal weight;

    private String stowagerequirements;

    private static final long serialVersionUID = 1L;
}