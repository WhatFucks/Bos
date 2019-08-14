package com.sor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
public class SorCheckBound implements Serializable {
    private String id;

    private Integer scanid;

    private Integer cargosum;

    private String checkperson;

    private String checkName;

    private Date checkdate;

    private String checkcompany;

    private static final long serialVersionUID = 1L;

    private List<SorCheckBoundDetails> domains;

}