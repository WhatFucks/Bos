package com.ljw.entity;

import java.io.Serializable;

public class PacInventory implements Serializable {
    private Integer id;

    private String goodsnumber;

    private String goodsname;

    private Integer stocknum;

    private Float plannedprice;

    private String specifications;

    private Integer type;

    private String measure;

    private Float money;

    private String affiliatedunit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(String goodsnumber) {
        this.goodsnumber = goodsnumber == null ? null : goodsnumber.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getStocknum() {
        return stocknum;
    }

    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
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

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getAffiliatedunit() {
        return affiliatedunit;
    }

    public void setAffiliatedunit(String affiliatedunit) {
        this.affiliatedunit = affiliatedunit == null ? null : affiliatedunit.trim();
    }
}