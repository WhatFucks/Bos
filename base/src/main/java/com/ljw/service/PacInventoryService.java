package com.ljw.service;

import com.ljw.entity.PacInventory;
import com.ljw.entity.PacStockitem;

import java.util.List;
import java.util.Map;

public interface PacInventoryService {
    public Map<String,Object> select(String goodsnumber, String affiliatedunit, Integer page, Integer limit);
    public void insert(PacInventory pacInventory);
    public List<PacInventory> Listinventory(String goodsName);
    public void update(PacInventory pacInventory);
}
