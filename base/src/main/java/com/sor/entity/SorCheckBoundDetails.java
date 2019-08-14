package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class SorCheckBoundDetails implements Serializable {
    private String id;

    private String packageid=this.typeName;

    private Integer cargocount;

    private Long weight;

    private Long volume;

    private Integer cargotype;// 类型

    private String typeName;

    private String direction;

    private Integer storageperson;

    private String personName;

    private Date storagedate;

    private String checkId;

    private static final long serialVersionUID = 1L;


}