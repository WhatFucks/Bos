package com.lm.entity.acc;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AccWorkOrder implements Serializable {
    private Integer id;

    private String businessnoticeno;

    private String CustomNo;

    private String jobno;

    private Integer jobtype;

    private Integer pickupstatus;

    private Integer shortmessageint;

    private Date workgenerationtime;

    private Integer aftersinglenum;

    private Integer smallmembernum;

    private Integer pickupunit;

    private Date pickuptime;

    private String sortingcode;

    private static final long serialVersionUID = 1L;

}