package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.*;
import com.ljw.mapper.IaeDepartureMapper;
import com.ljw.mapper.IaeExtractMapper;
import com.ljw.mapper.SorCheckbounddetailsMapper;
import com.ljw.service.IaeExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IaeExtractServiceImpl implements IaeExtractService {

    @Autowired
    private IaeExtractMapper iaeExtractMapper;
    @Autowired
    private IaeDepartureMapper iaeDepartureMapper;
    @Autowired
    private SorCheckbounddetailsMapper sorCheckbounddetailsMapper;
    @Override
    public Map<String,Object> select(String id, String vehicleint, Integer page, Integer limit){
        Map<String,Object> map =new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        IaeExtractExample example =new IaeExtractExample();
        IaeExtractExample.Criteria criteria=example.createCriteria();
        if (id!=null && id.trim()!=""){
            criteria.andIdLike("%"+id+"%");
        }
        if (vehicleint!=null && vehicleint.trim()!=""){
            criteria.andVehicleintLike("%"+vehicleint+"%");
        }
        List<IaeExtract> list =iaeExtractMapper.selectByExample(example);
        if (list.size()>0){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return map;
    }
    @Override
    public Map<String,Object> selectIae(String id, Integer page, Integer limit){
        Map<String,Object> map=new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        IaeDepartureExample example=new IaeDepartureExample();
        IaeDepartureExample.Criteria criteria=example.createCriteria();
        if(id!=null&&id.trim()!=""){
            criteria.andIdLike("%"+id+"%");
        }
        List<IaeDeparture> list=iaeDepartureMapper.selectByExample(example);
        for (IaeDeparture i:list){
            SorCheckbounddetails Sorlist=sorCheckbounddetailsMapper.selectById(i.getId());
//            List<String> ulist= iaeDepartureMapper.selectusername(new Long(Sorlist.getStorageperson()));
//            for (String u:ulist){
//                i.setUsername(u);
//            }
            i.setSorCheckbounddetails(Sorlist);
        }
        if (list.size()>0){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return map;
    }
    @Override
    public void insert(IaeExtract iaeExtract){
        iaeExtractMapper.insert(iaeExtract);
    }
}
