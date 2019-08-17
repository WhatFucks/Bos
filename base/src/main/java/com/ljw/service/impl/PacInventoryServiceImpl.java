package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.PacInventory;
import com.ljw.entity.PacInventoryExample;
import com.ljw.mapper.PacInventoryMapper;
import com.ljw.service.PacInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class PacInventoryServiceImpl implements PacInventoryService {
    @Autowired
    private PacInventoryMapper pacInventoryMapper;
    @Override
    public Map<String,Object> select(String goodsnumber, String goodsname, Integer page, Integer limit){
        Map<String,Object> map=new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        PacInventoryExample example=new PacInventoryExample();
        PacInventoryExample.Criteria criteria=example.createCriteria();
        if (goodsnumber!=null && goodsnumber.trim()!=""){
            criteria.andGoodsnumberLike("%"+goodsnumber+"%");
        }
        if (goodsname!=null && goodsname.trim()!=""){
            criteria.andGoodsnameLike("%"+goodsname+"%");
        }
        List<PacInventory> list=pacInventoryMapper.selectByExample(example);
        if (list.size()>0){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return  map;
    }
    @Override
    public void insert(PacInventory pacInventory){
        pacInventoryMapper.insert(pacInventory);
    }
    @Override
    public PacInventory Listinventory(String goodsName){
        return pacInventoryMapper.Listinventory(goodsName);
    }
    @Override
    public void update(PacInventory pacInventory){
        pacInventoryMapper.updateByPrimaryKey(pacInventory);
    }
}
