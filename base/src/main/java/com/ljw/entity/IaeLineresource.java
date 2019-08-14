package com.ljw.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class IaeLineresource implements Serializable {
    private String id;

    private String resourcetype;

    private String port;

    private Integer demand;

    private String vehicleint;

    private String capacity;

    private String waybillid;

    private String carrier;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expectarrivaldate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expectdeparturedate;

    private Integer ticket;

    private Integer cargo;

    private BigDecimal weight;

    private BigDecimal volume;

    private String handleperson;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date handledate;

    private Integer enterperson;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enterdate;

    private String entercompany;

    private Integer acceptperson;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acceptdate;

    private String acceptcompany;

    private String abnormalremarks;

    private String workint;

    private Integer transfer;

    private Integer actualcount;

    private String destination;

    private String warename;

    private BigDecimal actualvolume;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date timelimit;

    private String ask;

    private String takecargoperson;

    private String tackcargoaddress;

    private Integer payment;

    private String specialensure;

    private Integer deliverytype;

    private String importanthints;


    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date surplustime;

    private static final long serialVersionUID = 1L;


}
