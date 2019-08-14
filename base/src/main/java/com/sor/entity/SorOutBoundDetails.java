package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class SorOutBoundDetails implements Serializable {
    private String id;

    private String packageid;

    private Long weight;

    private Long volume;

    private Date scandate;

    private Boolean isscan;

    private Boolean isnextstorage;

    private Boolean isdoublestorage;

    private String sorOutBoundId;


    private static final long serialVersionUID = 1L;

}