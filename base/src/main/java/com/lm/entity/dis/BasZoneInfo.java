package com.lm.entity.dis;

import com.hsq.entity.BasZoneCustomInfo;
import com.lyb.entity.SysDept;
import lombok.Data;

import java.io.Serializable;


@Data
public class BasZoneInfo implements Serializable {

    // 部门
    private SysDept dept;

    // 定区客户信息
    private BasZoneCustomInfo basInfo;
    private Integer id;

    private String zonecode;

    private String zonename;

    private Integer zonepeople;

    private String telphone;

    private Integer subordinateunit;

    private static final long serialVersionUID = 1L;

}
