package com.ljw.entity;

import java.io.Serializable;

public class PacStockoutitem implements Serializable {
    private Integer id;

    private String warehouseorderno;

    private String goodscode;

    private String goodsname;

    private Integer storageoutnum;

    private Integer actualnum;

    private Float plannedprice;

    private String specifications;

    private Integer type;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehouseorderno() {
        return warehouseorderno;
    }

    public void setWarehouseorderno(String warehouseorderno) {
        this.warehouseorderno = warehouseorderno == null ? null : warehouseorderno.trim();
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode == null ? null : goodscode.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getStorageoutnum() {
        return storageoutnum;
    }

    public void setStorageoutnum(Integer storageoutnum) {
        this.storageoutnum = storageoutnum;
    }

    public Integer getActualnum() {
        return actualnum;
    }

    public void setActualnum(Integer actualnum) {
        this.actualnum = actualnum;
    }

    public Float getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(Float plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}