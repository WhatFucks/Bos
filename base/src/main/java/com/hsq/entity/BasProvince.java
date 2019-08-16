package com.hsq.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class BasProvince implements Serializable {
    private Integer id;

    private String name;

    private Integer parentid;

    private Integer number;

    private static final long serialVersionUID = 1L;
}
