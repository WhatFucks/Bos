package com.lm.service.acc;

import com.lm.entity.dis.BasZoneInfo;

import java.util.List;

public interface BasZoneInfoService {
    //查询所有
    List<BasZoneInfo> list();
    // 根据id 查询
    BasZoneInfo ByIdSelect(Integer id);
}
