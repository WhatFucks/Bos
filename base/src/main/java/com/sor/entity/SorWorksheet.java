package com.sor.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SorWorksheet {
    private Integer id;
    private String workSheetNo;// 工作单号
    private String jobNo;
    private String destination; // 到达地
    private String productTime; // 到达时限
    private Integer Total; // 总件数
    private BigDecimal weight; // 重量
    private String stowageRequirements; // 配载要求
}
