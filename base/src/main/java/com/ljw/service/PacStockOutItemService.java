package com.ljw.service;

import com.ljw.entity.PacStockoutitem;

import java.util.List;

public interface PacStockOutItemService {
    public List<PacStockoutitem> outitem(String WarehouseOrderNo);
    public void insert(PacStockoutitem pacStockoutitem);
    public void update(PacStockoutitem pacStockoutitem);
}
