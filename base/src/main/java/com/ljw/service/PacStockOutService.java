package com.ljw.service;

import com.ljw.entity.PacStockout;
import com.lyb.entity.SysDept;

import java.util.List;
import java.util.Map;

public interface PacStockOutService {
    public Map<String,Object> select(Integer warehousetype, String warehouseorderno, Integer page, Integer limit);
    public void insert(PacStockout pacStockout);
    public void update(PacStockout pacStockout);
//    public List<SysDept> findByNameUserAndRoleAndMenu(Long delptId);
    public String WarehouseOrderNo();
    public String transportationOrderNo();
    public List<SysDept> list();
    public String selectdept(Long deptid);
}
