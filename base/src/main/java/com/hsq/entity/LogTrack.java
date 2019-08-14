package com.hsq.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 线路类型表
 */
@Data
public class LogTrack implements Serializable {
    private Integer id;

    private String linetype;

    private String linename;

    private String logisticscar;

    private Boolean linestate;

    private String nodename;

    private Date starttime;

    private Date arrivaltime;

    private String carint;

    private String nextnodeload;

    private String describe;

    private static final long serialVersionUID = 1L;
}
