package com.ljw.entity;

import java.io.Serializable;
import java.util.Date;

public class SorPackagedetails implements Serializable {
    private String id;

    private String warename;

    private String destination;

    private Integer ticket;

    private Integer actualcargoint;

    private Integer cargoint;

    private Long weight;

    private Long volume;

    private Date service;

    private String importanthints;

    private String ask;

    private String inputtype;

    private String packageid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getActualcargoint() {
        return actualcargoint;
    }

    public void setActualcargoint(Integer actualcargoint) {
        this.actualcargoint = actualcargoint;
    }

    public Integer getCargoint() {
        return cargoint;
    }

    public void setCargoint(Integer cargoint) {
        this.cargoint = cargoint;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Date getService() {
        return service;
    }

    public void setService(Date service) {
        this.service = service;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }
}