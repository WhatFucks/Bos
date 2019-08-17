package com.lyb.entity;

import lombok.Data;

@Data
public class PacStockitem{
    private Integer id;

    private String warehouseno;

    private String goodscode;

    private String goodsname;

    private Integer storagenum;

    private Integer actualnum;

    private Float plannedprice;

    private String specifications;

    private Integer type;

    private Integer status;

    private static final long serialVersionUID = 1L;

}