package com.hsq.entity;

import lombok.Data;

import java.io.Serializable;
@Data
/**
 * 分区表
 */
public class BasPartition implements Serializable {
    private Integer id;

    private String province;

    private String city;

    private String county;

    private String zonecode;

    private String keyword;

    private Integer startint;

    private Integer terminateint;

    private Integer sdint;

    private String sortingcode;

    private static final long serialVersionUID = 1L;
}
