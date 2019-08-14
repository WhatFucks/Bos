package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class SorPackageDetails implements Serializable {
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

    private String packageId;

    private static final long serialVersionUID = 1L;

}