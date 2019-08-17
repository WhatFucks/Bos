package com.ljw.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PacStock implements Serializable {
    private List<PacStockitem> stockitems=new ArrayList<>();

    private Integer id;

    private String warehouseno;

    private Integer reservoirtype;

    private String transport;

    private String subordinateunit;

    private String drawerno;

    private String drawername;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date drawertime;

    private String remark;

    private Integer status;


    private static final long serialVersionUID = 1L;


}
