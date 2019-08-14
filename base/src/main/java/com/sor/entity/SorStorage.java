package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SorStorage implements Serializable {
    private String id="RK"+new Date().getTime();

    private Date acceptdate = new Date();

    private Integer acceptperson;

    private String acceptcompany;

    private Integer deliveryperson;

    private String deliverycompany;

    private String acceptusername;

    private String deliveryusername;

    private List<SorStorageDetails> domains;

    private static final long serialVersionUID = 1L;

}