package com.ljw.service;

import com.ljw.entity.PacStock;
import com.ljw.entity.PacStockitem;

import java.util.List;
import java.util.Map;

public interface LjwPacStockService {
    public Map<String,Object> select(Integer reservoirtype, String warehouseno, Integer page, Integer limit);
    public void delete(Integer id);
    public void update(PacStock pacStock);
    public void insert(PacStock pacStock);
    public PacStock selectById(Integer id);
    public String selectByWarehouseno();
    public List<PacStockitem> Stockitemlist(String warehouseno);
    public String selectBytransport();
    public List<PacStock> Stocklist();
}
