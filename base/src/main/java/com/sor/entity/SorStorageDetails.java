package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class SorStorageDetails implements Serializable {
    private String id;

    private String packageid;

    private Long weight;

    private String outboundid;

    private Integer state;

    private String stateName; //状态名称：0：中转入库 1：二转入库 2：初始入库 3：有货无单

    private String storageid;


    private static final long serialVersionUID = 1L;


}