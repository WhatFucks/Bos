package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SorPackage implements Serializable {
    private String id;

    private Integer packageperson;// 合包人id

    private String peroName;// 合包人Name

    private String sealint;

    private String destination;

    private String reckondes;

    private Date timelimit;

    private Integer ticketsum;

    private Integer cargosum;

    private Long weightsum;

    private Long volumesum;

    private Boolean state=false;

    private Integer ask;

    private List<SorPackageDetails> domains;

    private static final long serialVersionUID = 1L;


}