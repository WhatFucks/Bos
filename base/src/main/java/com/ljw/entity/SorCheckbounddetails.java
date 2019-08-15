package com.ljw.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SorCheckbounddetails implements Serializable {
    private List<IaeDeparture> depList=new ArrayList<>();

    private String id;

    private String packageid;

    private Integer cargocount;

    private Long weight;

    private Long volume;

    private Integer cargotype;

    private String direction;

    private Integer storageperson;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date storagedate;

    private String checkid;

    private static final long serialVersionUID = 1L;

}
