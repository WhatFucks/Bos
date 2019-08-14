package com.lm.service.acc.impl;

import com.lm.entity.dis.BasZoneInfo;
import com.lm.mapper.dis.BasZoneInfoMapper;
import com.lm.service.acc.BasZoneInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasZoneInfoServiceImpl implements BasZoneInfoService {
    @Autowired
    private BasZoneInfoMapper basZoneInfoMapper;
    @Override
    public List<BasZoneInfo> list() {
        return basZoneInfoMapper.selectByExample(null);
    }

  @Override
  public BasZoneInfo ByIdSelect(Integer id) {
    return basZoneInfoMapper.ByIdSelect(id);
  }
}
