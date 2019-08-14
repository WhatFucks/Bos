package com.hsq.service.impl;

import com.hsq.entity.BasZoneCustomInfo;
import com.hsq.entity.BasZoneCustomInfoExample;
import com.hsq.mapper.BasZoneCustomInfoMapper;
import com.hsq.service.BasZoneCustomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BasZoneCustomInfoServiceImpl implements BasZoneCustomInfoService {

    @Autowired
    private BasZoneCustomInfoMapper basZoneCustomInfoMapper;

    @Override
    public BasZoneCustomInfo findById(Integer id) {
        return basZoneCustomInfoMapper.selectByPrimaryKey(id);
    }


    @Override
    public Map findByZid(Integer id) {
        Map<String,Object> map = new HashMap<>();
        BasZoneCustomInfoExample example = new BasZoneCustomInfoExample();
        example.createCriteria().andZoneinfoidEqualTo(id);
        List<BasZoneCustomInfo> list =  basZoneCustomInfoMapper.selectByExample(example);
        map.put("items",list);
        return map;
    }


    @Override
    public void deleteById(Integer customcode) {
        basZoneCustomInfoMapper.deleteByPrimaryKey(customcode);
    }

    @Override
    public void add2(BasZoneCustomInfo basZoneCustomInfo) {
        basZoneCustomInfoMapper.insertSelective(basZoneCustomInfo);
    }

    @Override
    public void update2(BasZoneCustomInfo basZoneCustomInfo) {
        basZoneCustomInfoMapper.updateByPrimaryKeySelective(basZoneCustomInfo);
    }

}
