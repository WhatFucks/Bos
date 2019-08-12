package com.lyb.entity;

import java.io.Serializable;
import java.util.Date;

public class PacStockout implements Serializable {
    private Integer id;

    private String warehouseorderno;

    private Integer warehousetype;

    private String transportationorderno;

    private String affiliatedunit;

    private String issuedbytheunit;

    private String handlingunit;

    private String handlingname;

    private String customcode;

    private String customname;

    private String recipientjobnumber;

    private String recipientname;

    private Date recipienttime;

    private String billingjobnumber;

    private String billingname;

    private Date billingtime;

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

    public Integer getWarehousetype() {
        return warehousetype;
    }

    public void setWarehousetype(Integer warehousetype) {
        this.warehousetype = warehousetype;
    }

    public String getTransportationorderno() {
        return transportationorderno;
    }

    public void setTransportationorderno(String transportationorderno) {
        this.transportationorderno = transportationorderno == null ? null : transportationorderno.trim();
    }

    public String getAffiliatedunit() {
        return affiliatedunit;
    }

    public void setAffiliatedunit(String affiliatedunit) {
        this.affiliatedunit = affiliatedunit == null ? null : affiliatedunit.trim();
    }

    public String getIssuedbytheunit() {
        return issuedbytheunit;
    }

    public void setIssuedbytheunit(String issuedbytheunit) {
        this.issuedbytheunit = issuedbytheunit == null ? null : issuedbytheunit.trim();
    }

    public String getHandlingunit() {
        return handlingunit;
    }

    public void setHandlingunit(String handlingunit) {
        this.handlingunit = handlingunit == null ? null : handlingunit.trim();
    }

    public String getHandlingname() {
        return handlingname;
    }

    public void setHandlingname(String handlingname) {
        this.handlingname = handlingname == null ? null : handlingname.trim();
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode == null ? null : customcode.trim();
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public String getRecipientjobnumber() {
        return recipientjobnumber;
    }

    public void setRecipientjobnumber(String recipientjobnumber) {
        this.recipientjobnumber = recipientjobnumber == null ? null : recipientjobnumber.trim();
    }

    public String getRecipientname() {
        return recipientname;
    }

    public void setRecipientname(String recipientname) {
        this.recipientname = recipientname == null ? null : recipientname.trim();
    }

    public Date getRecipienttime() {
        return recipienttime;
    }

    public void setRecipienttime(Date recipienttime) {
        this.recipienttime = recipienttime;
    }

    public String getBillingjobnumber() {
        return billingjobnumber;
    }

    public void setBillingjobnumber(String billingjobnumber) {
        this.billingjobnumber = billingjobnumber == null ? null : billingjobnumber.trim();
    }

    public String getBillingname() {
        return billingname;
    }

    public void setBillingname(String billingname) {
        this.billingname = billingname == null ? null : billingname.trim();
    }

    public Date getBillingtime() {
        return billingtime;
    }

    public void setBillingtime(Date billingtime) {
        this.billingtime = billingtime;
    }
}