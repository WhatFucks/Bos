package com.hsq.entity;

import lombok.Data;

import java.io.Serializable;
@Data
/**
 * 定区客户信息表
 */
public class BasZoneCustomInfo implements Serializable {

    private Integer customcode;

    private String customname;

    private String mobileno;

    private String cityname;

    private String cstomaddress;

    private Integer zoneinfoid;

    private static final long serialVersionUID = 1L;
}
