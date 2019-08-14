package com.hsq.entity;

import lombok.Data;

import java.io.Serializable;
@Data
/**
 * 关联地址表
 */
public class BasAssociatedAddress implements Serializable {
    private Integer id;

    private String zonecode;

    private String city;

    private String customaddress;

    private Integer associatedpartitions;

    private static final long serialVersionUID = 1L;
}
