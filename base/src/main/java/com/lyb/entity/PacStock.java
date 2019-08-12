package com.lyb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class PacStock {
    private Integer id;

    private String warehouseno;

    private Integer reservoirtype;

    private String transport;

    private String subordinateunit;

    private String drawerno;

    private String drawername;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date drawertime;

    private String remark;

    private Integer status;

    private static final long serialVersionUID = 1L;
}