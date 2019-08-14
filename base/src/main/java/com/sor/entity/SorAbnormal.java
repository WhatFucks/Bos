package com.sor.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@Data
public class SorAbnormal implements Serializable {
    private String id="EC"+new Date().getTime();
    @DateTimeFormat(pattern = "yyyy-MM-dd ")
    private Date launchdate=new Date();

    private String launchperson;

    private String launchcompany;

    private Integer abnormaltype;

    private String transferint;

    private String cargoint;

    private String packageint;

    private String hedgeabnint;

    private Integer abostate;
@DateTimeFormat(pattern = "yyyy-MM-dd ")
    private Date handledate;

    private static final long serialVersionUID = 1L;


}