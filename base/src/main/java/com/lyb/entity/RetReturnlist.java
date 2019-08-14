package com.lyb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class RetReturnlist {
    private AccWorksheet accWorksheet;// 返货对应的工作单

    private Integer id;

    private String applicationno;

    private String worksheetno;

    private Integer returntype;

    private String apremark;

    private Integer aploss;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date entrytime;

    private Integer receivegunit;

    private Integer invalidatesign;

    private Integer returnunit;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date recordingtime;

    private Integer entryunit;

    private String personname;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date confirmationtime;

    private Integer confirmationunit;

    private String confirmationpersonname;

    private Integer treatmentstate;

    private Integer apreturnstatus;

    private Integer identificationsign;

    private String handlingopinions;

    private String denialtype;

    private static final long serialVersionUID = 1L;
}