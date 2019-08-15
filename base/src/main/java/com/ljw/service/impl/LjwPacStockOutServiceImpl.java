package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.PacStockout;
import com.ljw.entity.PacStockoutExample;
import com.ljw.mapper.LjwPacStockoutMapper;
import com.ljw.service.PacStockOutService;
import com.lyb.entity.SysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LjwPacStockOutServiceImpl implements PacStockOutService {
    @Autowired
    private LjwPacStockoutMapper ljwPacStockoutMapper;

    @Override
    public Map<String,Object> select(Integer warehousetype,String warehouseorderno, Integer page, Integer limit){
        PacStockoutExample example=new PacStockoutExample();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        Map<String,Object> map=new HashMap<>();
        PacStockoutExample.Criteria criteria=example.createCriteria();
        if (warehouseorderno!=null && warehouseorderno.trim()!=""){
            criteria.andWarehouseordernoLike("%"+warehouseorderno+"%");
        }
        if (warehousetype!=null){
            criteria.andWarehousetypeEqualTo(warehousetype);
        }
        List<PacStockout> list=ljwPacStockoutMapper.selectByExample(example);
        if (list!=null) {
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return map;
    }
    @Override
    public void insert(PacStockout pacStockout){

        ljwPacStockoutMapper.insert(pacStockout);
    }
    @Override
    public void update(PacStockout pacStockout){ljwPacStockoutMapper.updateByPrimaryKey(pacStockout);}
//    @Override
//    public List<SysDept> findByNameUserAndRoleAndMenu(Long delptId){
//        List<SysDept> ojb=pacStockoutMapper.findByNameUserAndRoleAndMenu(delptId);
//       return ojb;
//    }
    @Override
    public String WarehouseOrderNo(){
        return ljwPacStockoutMapper.WarehouseOrderNo();
    }
    @Override
    public String transportationOrderNo(){
        return ljwPacStockoutMapper.transportationOrderNo();
    }
    @Override
    public List<SysDept> list(){
        return ljwPacStockoutMapper.list();
    }
    @Override
    public String selectdept(Long deptid){
        return ljwPacStockoutMapper.selectdept(deptid);
    }
}
