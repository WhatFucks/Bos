package com.lj.entity.reportforms;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Smallpart implements Serializable {
    private Integer id;

    private Integer smallpartcount;

    private Date smallparttime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}