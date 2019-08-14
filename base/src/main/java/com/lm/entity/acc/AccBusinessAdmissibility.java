package com.lm.entity.acc;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccBusinessAdmissibility implements Serializable {
    private Integer id;

    private String businessnoticeno;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 将页面传过来的参数转换为后台的JAVA日期类型
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 后台的JAVA类型，转为JSON字符串
    private Date reservationtime;

    private String customname;

    private String pickupcity;

    private String product;

    private String productname;

    private String pickupaddress;

    private String customcode;

    private String linkman;

    private String telphone;

    private BigDecimal weight;

    private BigDecimal volume;

    private String importanthints;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 将页面传过来的参数转换为后台的JAVA日期类型
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 后台的JAVA类型，转为JSON字符串
    private Date repickuptime;

    private String arrivecity;

    private Integer pickerinfo;

    private String sendaddress;

    private Integer processingunit;

    private Integer notificationsource;

    private Integer customnomodifyflag;

    private String singletype;

    private Integer packagesnum;

    private Double actualweight;

    private Double billingweight;

    private Float packingfee;

    private Integer actualpacking;

    private static final long serialVersionUID = 1L;

}