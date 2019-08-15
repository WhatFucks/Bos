package com.ljw.service.impl;

import com.ljw.entity.PacPackaging;
import com.ljw.entity.PacStockitem;
import com.ljw.mapper.LjwPacStockitemMapper;
import com.ljw.service.LjwPacStockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjwPacStockItemServiceImpl implements LjwPacStockItemService {
    @Autowired
    private LjwPacStockitemMapper ljwPacStockitemMapper;
    @Override
    public void insertitem(PacStockitem pacStockitem){
        ljwPacStockitemMapper.insert(pacStockitem);
    }
    @Override
    public void updateitem(PacStockitem pacStockitem){
        ljwPacStockitemMapper.updateByPrimaryKey(pacStockitem);
    }
    @Override
    public List<PacPackaging> selectItemName(){
        return ljwPacStockitemMapper.selectItemName();
    }
}
