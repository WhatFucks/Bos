package com.lm.entity.acc;

import java.io.Serializable;
import java.util.Date;

public class DisDispatchHistory implements Serializable {
    private Integer id;

    private Integer dispatchsequence;

    private Integer transferredunit;

    private Integer operatorid;

    private Integer operationunitid;

    private Date operationtime;

    private String remark;

    private Integer status;

    private String reason;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDispatchsequence() {
        return dispatchsequence;
    }

    public void setDispatchsequence(Integer dispatchsequence) {
        this.dispatchsequence = dispatchsequence;
    }

    public Integer getTransferredunit() {
        return transferredunit;
    }

    public void setTransferredunit(Integer transferredunit) {
        this.transferredunit = transferredunit;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public Integer getOperationunitid() {
        return operationunitid;
    }

    public void setOperationunitid(Integer operationunitid) {
        this.operationunitid = operationunitid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}