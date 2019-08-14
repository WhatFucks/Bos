package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SorOutBound implements Serializable {
    private String id;

    private Integer handovertype;

    private String typeName;

    private String line;

    private Integer direction;

    private Integer acceptperson;

    private Integer carriers;

    private Integer deliveryperson;

    private Date deliverydate = new Date();

    private String deliverycompany;

    private Integer enterperson;

    private Date enterdate=new Date();

    private String acceptPersonUsername;

    private String deliveryPersonUsername;

    private List<SorOutBoundDetails> domains;

    private static final long serialVersionUID = 1L;


}