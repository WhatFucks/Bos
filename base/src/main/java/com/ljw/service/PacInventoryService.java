package com.ljw.service;

import com.ljw.entity.PacInventory;
import com.ljw.entity.PacStockitem;

import java.util.List;
import java.util.Map;

public interface PacInventoryService {
    public Map<String,Object> select(String goodsnumber, String goodsname, Integer page, Integer limit);
    public void insert(PacInventory pacInventory);
    public PacInventory Listinventory(String goodsName);
    public void update(PacInventory pacInventory);
}
