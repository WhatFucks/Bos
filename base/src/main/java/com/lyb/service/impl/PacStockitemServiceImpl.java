package com.lyb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.PacStockitem;
import com.lyb.entity.PacStockitemExample;
import com.lyb.general.PageEntity;
import com.lyb.mapper.PacStockitemMapper;
import com.lyb.service.PacStockitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PacStockitemServiceImpl implements PacStockitemService {
    @Autowired
    private PacStockitemMapper pacStockitemMapper;

    @Override
    public Map<String,Object> getPacStockItemList(PageEntity page, PacStockitem stockitem) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(page.getPageNum(),page.getPageSize(),true);
        PacStockitemExample example = null;
        if(stockitem != null){
            example = new PacStockitemExample();
            if(stockitem.getGoodsname() != null && stockitem.getGoodsname().trim() !=""){
                example.createCriteria().andGoodsnameLike("%"+stockitem.getGoodsname()+"%");
            }
            if(stockitem.getWarehouseno() != null && stockitem.getWarehouseno().trim() != ""){
                example.createCriteria().andWarehousenoLike("%"+stockitem.getWarehouseno()+"%");
            }
            if(stockitem.getStatus() != null){
                example.createCriteria().andStatusEqualTo(stockitem.getStatus());
            }
        }
        List<PacStockitem> list = pacStockitemMapper.selectByExample(example);
        PageInfo info = new PageInfo(list);
        map.put("items",info.getList());
        map.put("total",info.getTotal());
        return map;
    }
}
