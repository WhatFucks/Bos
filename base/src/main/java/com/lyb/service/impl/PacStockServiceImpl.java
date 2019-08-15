package com.lyb.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.*;
import com.lyb.general.PageEntity;
import com.lyb.mapper.PacStockMapper;
import com.lyb.service.PacStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PacStockServiceImpl implements PacStockService {
    @Autowired
    private PacStockMapper pacStockMapper;
    @Override
    public Map<String, Object> getPacStockList(PageEntity page, PacStock stock) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(page.getPageNum(),page.getPageSize(),true);
        PacStockExample example = null;
        if(stock != null){
            example = new PacStockExample();
            // 入库单号
            if(stock.getWarehouseno() != null && stock.getWarehouseno().trim() != ""){
                example.createCriteria().andWarehousenoEqualTo(stock.getWarehouseno());
            }
            // 运输单号
            if(stock.getTransport() != null && stock.getTransport().trim() != ""){
                example.createCriteria().andTransportEqualTo(stock.getTransport());
            }
            // 入库类型
            if(stock.getReservoirtype() != null){
                example.createCriteria().andReservoirtypeEqualTo(stock.getReservoirtype());
            }
            // 状态
            if(stock.getStatus() != null){
                example.createCriteria().andStatusEqualTo(stock.getStatus());
            }
        }
        List<PacStock> list = pacStockMapper.selectByExample(example);
        PageInfo info = new PageInfo(list);
        map.put("items",info.getList());
        map.put("total",info.getTotal());
        return map;
    }

    @Override
    public Boolean addPacStock(PacStock stock) {
        boolean success = false;
        int count = pacStockMapper.insertSelective(stock);
        if(count > 0){
            success = true;
        }
        return success;
    }

    @Override
    public Boolean updatePacStock(PacStock stock) {
        boolean success = false;
        int count = pacStockMapper.updateByPrimaryKeySelective(stock);
        if(count > 0){
            success = true;
        }
        return success;
    }

    @Override
    public String getWarehouseNo() {
        String MaxWarehouseNo = pacStockMapper.getMaxWarehouseNo();
        String num = MaxWarehouseNo.substring(MaxWarehouseNo.indexOf("K")+1);
        return "RK"+(Integer.parseInt(num)+1);
    }

    @Override
    public String getTransport() {
        String Transport = pacStockMapper.getMaxTransport();
        String num = Transport.substring(Transport.indexOf("D")+1);
        return "YSD"+(Integer.parseInt(num)+1);
    }

}
