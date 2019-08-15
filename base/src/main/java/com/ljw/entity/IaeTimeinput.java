package com.ljw.entity;

import java.io.Serializable;
import java.util.Date;

public class IaeTimeinput implements Serializable {
    private Integer id;

    private String inputtype;

    private String port;

    private Boolean demand;

    private String vehicleint;

    private String waybillid;

    private Date expectarrivaldate;

    private Date expectdeparturedate;

    private Date actualarrivaldate;

    private Date actualdeparturedate;

    private String start;

    private Integer carriers;

    private String remarks;

    private Integer inputperson;

    private Date inputdate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public Boolean getDemand() {
        return demand;
    }

    public void setDemand(Boolean demand) {
        this.demand = demand;
    }

    public String getVehicleint() {
        return vehicleint;
    }

    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    public Date getExpectarrivaldate() {
        return expectarrivaldate;
    }

    public void setExpectarrivaldate(Date expectarrivaldate) {
        this.expectarrivaldate = expectarrivaldate;
    }

    public Date getExpectdeparturedate() {
        return expectdeparturedate;
    }

    public void setExpectdeparturedate(Date expectdeparturedate) {
        this.expectdeparturedate = expectdeparturedate;
    }

    public Date getActualarrivaldate() {
        return actualarrivaldate;
    }

    public void setActualarrivaldate(Date actualarrivaldate) {
        this.actualarrivaldate = actualarrivaldate;
    }

    public Date getActualdeparturedate() {
        return actualdeparturedate;
    }

    public void setActualdeparturedate(Date actualdeparturedate) {
        this.actualdeparturedate = actualdeparturedate;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public Integer getCarriers() {
        return carriers;
    }

    public void setCarriers(Integer carriers) {
        this.carriers = carriers;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getInputperson() {
        return inputperson;
    }

    public void setInputperson(Integer inputperson) {
        this.inputperson = inputperson;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }
}