package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.*;
import com.ljw.mapper.IaeDepartureMapper;
import com.ljw.mapper.SorCheckbounddetailsMapper;
import com.ljw.service.IaeDepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IaeDepartureServiceImpl implements IaeDepartureService {
    @Autowired
    private IaeDepartureMapper iaeDepartureMapper;
    @Autowired
    private SorCheckbounddetailsMapper sorCheckbounddetailsMapper;
    @Override
    public Map<String,Object> select(String id, String destination, Integer page, Integer limit){
        Map<String,Object> map=new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        IaeDepartureExample example=new IaeDepartureExample();
        IaeDepartureExample.Criteria criteria=example.createCriteria();

        SorCheckbounddetailsExample sorCheckbounddetailsExample=new SorCheckbounddetailsExample();
        SorCheckbounddetailsExample.Criteria criteria1=sorCheckbounddetailsExample.createCriteria();
        if (id!=null&&id.trim()!=""){
            criteria.andIdLike("%"+id+"%");
        }
        if (destination!=null&&destination.trim()!=""){
            criteria.andDestinationLike("%"+destination+"%");
        }
        List<IaeDeparture> list=iaeDepartureMapper.selectByExample(example);
        for (IaeDeparture i:list){
            SorCheckbounddetails Sorlist=sorCheckbounddetailsMapper.selectById(i.getId());
            List<String> ulist= iaeDepartureMapper.selectusername(new Long(Sorlist.getStorageperson()));
            for (String u:ulist){
                i.setUsername(u);
            }
            i.setSorCheckbounddetails(Sorlist);
        }
        if (list.size()>0){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return map;
    }
    @Override
    public List<SorCheckbounddetails> list(String sid){
        SorCheckbounddetailsExample example=new SorCheckbounddetailsExample();
        SorCheckbounddetailsExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(sid);
        List<SorCheckbounddetails> list=sorCheckbounddetailsMapper.selectByExample(example);
        if (list.size()>0){
            return list;
        }
        return null;
    }
    @Override
    public List<String> selectusername(Long id){
        return iaeDepartureMapper.selectusername(id);
    }
}
