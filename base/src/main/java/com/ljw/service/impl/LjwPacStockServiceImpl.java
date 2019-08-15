package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.*;
import com.ljw.mapper.LjwPacStockMapper;
import com.ljw.service.LjwPacStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class LjwPacStockServiceImpl implements LjwPacStockService {
    @Autowired
    private LjwPacStockMapper ljwPacStockMapper;
    @Override
    public Map<String,Object> select(Integer reservoirtype,String warehouseno, Integer page, Integer limit){
        Map<String,Object> map=new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        PacStockExample example=new PacStockExample();
        PacStockExample.Criteria criteria=example.createCriteria();
        if (reservoirtype!=null){
            criteria.andReservoirtypeEqualTo(reservoirtype);
        }
        if (warehouseno!=null && warehouseno.trim()!=""){
            criteria.andWarehousenoLike("%"+warehouseno+"%");
        }
        criteria.andStatusEqualTo(0);
        List<PacStock> list=ljwPacStockMapper.selectByExample(example);
//        List<PacStock> list=pacStockMapper.selectByStockAndStockItem("%"+warehouseno+"%");
        if (list!=null){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return map;
    }
    @Override
    public void insert(PacStock pacStock){
        ljwPacStockMapper.insert(pacStock);
    }
    @Override
    public void update(PacStock pacStock){
        ljwPacStockMapper.updateByPrimaryKey(pacStock);
    }
    @Override
    public void delete(Integer id){
        ljwPacStockMapper.deleteByPrimaryKey(id);
    }
    @Override
    public PacStock selectById(Integer id){
        return ljwPacStockMapper.selectByPrimaryKey(id);
    }
    @Override
    public String selectByWarehouseno(){ return ljwPacStockMapper.selectByWarehouseno(); }
    @Override
    public List<PacStockitem> Stockitemlist(String warehouseno){ List<PacStockitem> list=ljwPacStockMapper.Stockitemlist(warehouseno); return list; }
    @Override
    public String selectBytransport(){return ljwPacStockMapper.selectBytransport();}
    @Override
    public List<PacStock> Stocklist(){return ljwPacStockMapper.list();}
}
