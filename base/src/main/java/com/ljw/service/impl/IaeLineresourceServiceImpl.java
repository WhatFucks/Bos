package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.IaeLineresource;
import com.ljw.entity.IaeLineresourceExample;
import com.ljw.mapper.IaeLineresourceMapper;
import com.ljw.service.IaeLineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IaeLineresourceServiceImpl implements IaeLineresourceService {
    @Autowired
    private IaeLineresourceMapper iaeLineresourceMapper;
    @Override
    public Map<String,Object> select(String id, String port, Integer page, Integer limit){
        Map<String,Object> map=new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        IaeLineresourceExample example=new IaeLineresourceExample();
        IaeLineresourceExample.Criteria criteria=example.createCriteria();
        if(id!=null && id.trim()!=""){
            criteria.andIdLike("%"+id+"%");
        }
        if (port!=null&& port.trim()!=""){
            criteria.andPortLike("%"+port+"%");
        }
        List<IaeLineresource> list=iaeLineresourceMapper.selectByExample(example);
        if (list.size()>0){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return  map;
    }
    @Override
    public IaeLineresource findById(String id){
        return iaeLineresourceMapper.selectByPrimaryKey(id);
    }
}
