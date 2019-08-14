package com.lm.entity.acc;

import lombok.Data;

import java.util.Date;

@Data
public class Acc {
    private String WorkSheetNo;
    private String WsJobNo;
    private String ProductTime;
    private String Destination;
    private String WoBusinessNoticeNo;
    private Integer uid;
    private String username;
    private Date WoPickupTime;
    private String CustomName;
    private String Linkman;
}
