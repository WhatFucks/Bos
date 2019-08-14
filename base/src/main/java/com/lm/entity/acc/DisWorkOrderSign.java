package com.lm.entity.acc;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class DisWorkOrderSign implements Serializable {
    private Integer id;

    private String workorderid;

    private String worksheetno;

    private Integer workordertype;

    private Integer signtype;

    private Integer courierint;

    private String couriername;

    private String recipient;

    private Integer signunit;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 将页面传过来的参数转换为后台的JAVA日期类型
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 后台的JAVA类型，转为JSON字符串
    private Date signtime;

    private Integer invalidatemark;

    private String abnormalmark;

    private Integer inputpersoncode;

    private Integer inputpersonid;

    private Integer inputid;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 将页面传过来的参数转换为后台的JAVA日期类型
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 后台的JAVA类型，转为JSON字符串
    private Date inputtime;

    private String applicationno;

    private String applicatioperson;

    private Date applicatiotime;

    private String applicatiounit;

    private String confirmationpersonname;

    private String cause;

    private String confirm;

    private String signformark;

    private Integer treatmentstate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(String workorderid) {
        this.workorderid = workorderid == null ? null : workorderid.trim();
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Integer getWorkordertype() {
        return workordertype;
    }

    public void setWorkordertype(Integer workordertype) {
        this.workordertype = workordertype;
    }

    public Integer getSigntype() {
        return signtype;
    }

    public void setSigntype(Integer signtype) {
        this.signtype = signtype;
    }

    public Integer getCourierint() {
        return courierint;
    }

    public void setCourierint(Integer courierint) {
        this.courierint = courierint;
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername == null ? null : couriername.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public Integer getSignunit() {
        return signunit;
    }

    public void setSignunit(Integer signunit) {
        this.signunit = signunit;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Integer getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(Integer invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public String getAbnormalmark() {
        return abnormalmark;
    }

    public void setAbnormalmark(String abnormalmark) {
        this.abnormalmark = abnormalmark == null ? null : abnormalmark.trim();
    }

    public Integer getInputpersoncode() {
        return inputpersoncode;
    }

    public void setInputpersoncode(Integer inputpersoncode) {
        this.inputpersoncode = inputpersoncode;
    }

    public Integer getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(Integer inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    public Integer getInputid() {
        return inputid;
    }

    public void setInputid(Integer inputid) {
        this.inputid = inputid;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    public String getApplicationno() {
        return applicationno;
    }

    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno == null ? null : applicationno.trim();
    }

    public String getApplicatioperson() {
        return applicatioperson;
    }

    public void setApplicatioperson(String applicatioperson) {
        this.applicatioperson = applicatioperson == null ? null : applicatioperson.trim();
    }

    public Date getApplicatiotime() {
        return applicatiotime;
    }

    public void setApplicatiotime(Date applicatiotime) {
        this.applicatiotime = applicatiotime;
    }

    public String getApplicatiounit() {
        return applicatiounit;
    }

    public void setApplicatiounit(String applicatiounit) {
        this.applicatiounit = applicatiounit == null ? null : applicatiounit.trim();
    }

    public String getConfirmationpersonname() {
        return confirmationpersonname;
    }

    public void setConfirmationpersonname(String confirmationpersonname) {
        this.confirmationpersonname = confirmationpersonname == null ? null : confirmationpersonname.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm == null ? null : confirm.trim();
    }

    public String getSignformark() {
        return signformark;
    }

    public void setSignformark(String signformark) {
        this.signformark = signformark == null ? null : signformark.trim();
    }

    public Integer getTreatmentstate() {
        return treatmentstate;
    }

    public void setTreatmentstate(Integer treatmentstate) {
        this.treatmentstate = treatmentstate;
    }
}
