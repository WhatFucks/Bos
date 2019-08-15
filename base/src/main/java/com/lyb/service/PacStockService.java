package com.lyb.service;

import com.lyb.entity.PacStockitem;
import com.lyb.entity.PacStock;
import com.lyb.general.PageEntity;

import java.util.List;
import java.util.Map;

public interface PacStockService {
    //lyb
    public Map<String,Object> getPacStockList(PageEntity page, PacStock stock);
    public String getWarehouseNo();
    public String getTransport();
    public Boolean addPacStock(PacStock stock);
    public Boolean updatePacStock(PacStock stock);

}
