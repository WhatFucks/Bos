package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.*;
import com.ljw.mapper.IaeArrivalMapper;
import com.ljw.service.IaeArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IaeArrivalServiceImpl implements IaeArrivalService {

    @Autowired
    private IaeArrivalMapper iaeArrivalMapper;
    @Override
    public Map<String,Object> select(String id,String workaddress, Integer page, Integer limit){
        Map<String,Object> map=new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        IaeArrivalExample example=new IaeArrivalExample();
        IaeArrivalExample.Criteria criteria=example.createCriteria();
        if (id!=null && id.trim()!=""){
            criteria.andIdLike("%"+id+"%");
        }
        if (workaddress!=null && workaddress.trim()!=""){
            criteria.andWorkaddressLike("%"+workaddress+"%");
        }
        List<IaeArrival> list=iaeArrivalMapper.selectByExample(example);
        if (list!=null){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return map;
    }
}
