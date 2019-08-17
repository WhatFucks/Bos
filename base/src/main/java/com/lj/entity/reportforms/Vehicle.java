package com.lj.entity.reportforms;

import lombok.Data;

import java.io.Serializable;

@Data
public class Vehicle implements Serializable {
    private Integer id;

    private String vehiclename;

    private Integer vehicleint;

    private static final long serialVersionUID = 1L;

}