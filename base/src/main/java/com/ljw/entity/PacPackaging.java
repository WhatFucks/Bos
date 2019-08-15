package com.ljw.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
public class PacPackaging implements Serializable {
    private Integer id;

    private String itemcode;

    private String itemname;

    private Float plannedprice;

    private String specifications;

    private Integer type;

    private String measurementunit;

    private Integer status;

    private Integer operatorid;

    private String operationunitid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date operationtime;

    private Integer invalidatejobint;

    private String invalidatename;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date invalidatetime;

    private static final long serialVersionUID = 1L;

}
