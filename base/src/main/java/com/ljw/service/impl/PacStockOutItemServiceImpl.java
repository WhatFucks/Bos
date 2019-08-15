package com.ljw.service.impl;

import com.ljw.entity.PacStockoutitem;
import com.ljw.mapper.PacStockoutitemMapper;
import com.ljw.service.PacStockOutItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacStockOutItemServiceImpl implements PacStockOutItemService {
    @Autowired
    private PacStockoutitemMapper pacStockoutitemMapper;
    @Override
    public List<PacStockoutitem> outitem(String WarehouseOrderNo){
        return pacStockoutitemMapper.outitem(WarehouseOrderNo);
    }
    @Override
    public void insert(PacStockoutitem pacStockoutitem){
        pacStockoutitemMapper.insert(pacStockoutitem);
    }
    @Override
    public void update(PacStockoutitem pacStockoutitem){
        pacStockoutitemMapper.updateByPrimaryKey(pacStockoutitem);
    }
}
