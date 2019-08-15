package com.ljw.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class IaeDeparture implements Serializable {
    private SorCheckbounddetails sorCheckbounddetails=new SorCheckbounddetails();

    private String id;

    private String username;

    private String packingid;

    private Boolean transfer;

    private Integer actualcount;

    private String destination;

    private Integer warename;

    private Integer cargocount;

    private BigDecimal weight;

    private BigDecimal volume;

    private BigDecimal actualvolume;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date timelimit;

    private String ask;

    private String takecargoperson;

    private String tackcargoaddress;

    private Integer payment;

    private String importanthints;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date surplustime;

    private String entrustcompany;

    private static final long serialVersionUID = 1L;
}
