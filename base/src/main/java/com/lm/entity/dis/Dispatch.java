package com.lm.entity.dis;

import lombok.Data;

@Data
public class Dispatch {
    private String JobType;
    private String JobNo;
    private Integer ShortMessageInt;
    private String AwBusinessNoticeNo;
    private String WorkGenerationTime;
    private String SendAddress;
    private String Linkman;
    private String TelPhone;
    private Integer AfterSingleNum;
    private Integer PickupUnit;
}
