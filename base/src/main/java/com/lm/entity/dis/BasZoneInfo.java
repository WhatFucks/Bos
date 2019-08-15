package com.lm.entity.dis;

import com.hsq.entity.BasZoneCustomInfo;
import com.lyb.entity.SysDept;
import lombok.Data;

import java.io.Serializable;
@Data
public class BasZoneInfo implements Serializable {
    private SysDept dept;
    private BasZoneCustomInfo basInfo;
    private Integer id;

    private String zonecode;

    private String zonename;

    private Integer zonepeople;

    private String telphone;

    private Integer subordinateunit;

    private static final long serialVersionUID = 1L;

}