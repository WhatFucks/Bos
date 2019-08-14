package com.lm.service.acc.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lm.entity.acc.AccWorkOrder;
import com.lm.entity.dis.Dispatch;
import com.lm.mapper.acc.AccWorkOrderMapper;
import com.lm.service.acc.AccWorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccWorkOrderServiceImpl implements AccWorkOrderService {

    @Autowired
    private AccWorkOrderMapper accWorkOrderMapper;


    @Override
    public void insert(AccWorkOrder accWorkOrder) {
        accWorkOrderMapper.insert(accWorkOrder);
    }

    @Override
    public void update(AccWorkOrder accWorkOrder) {
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public AccWorkOrder SelectMaxNo() {
        AccWorkOrder i =  accWorkOrderMapper.SelectMaxNo();
        return i;
    }

    @Override
    public AccWorkOrder ByNoSelect(String dh) {
        AccWorkOrder accWorkOrder = accWorkOrderMapper.ByNoSelect(dh);
        return  accWorkOrder;
    }

    @Override
    public List<AccWorkOrder> ByNoSelectAll(String dh) {
        return accWorkOrderMapper.ByNoSelectAll(dh);
    }

    @Override
    public int SelectByNoDelete(String dh) {
        return accWorkOrderMapper.SelectByNoDelete(dh);
    }

    @Override
    public Map SelectAccWorkOrder(String workSheetNo,String wsJobNo,Integer page, Integer limit) {
        Page p= PageHelper.startPage(page,limit,true);
        Map<String,Object> map=new HashMap<>();
        accWorkOrderMapper.SelectAccWorkOrder();
        map.put("items",p.getResult());
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public Map selectDispatch(Dispatch dispatch,Integer page, Integer limit) {
        Page p= PageHelper.startPage(page,limit,true);
        Map<String,Object> maps=new HashMap<>();
        accWorkOrderMapper.selectDispatch(dispatch);
        System.out.println(p.getResult());
        maps.put("items",p.getResult());
        maps.put("total",p.getTotal());
        return maps;
    }

    @Override
    public List<AccWorkOrder> SortingCodeAll() {
        return accWorkOrderMapper.selectByExample(null);
    }
}
