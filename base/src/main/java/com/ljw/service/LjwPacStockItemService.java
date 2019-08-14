package com.ljw.service;

import com.ljw.entity.PacPackaging;
import com.ljw.entity.PacStockitem;

import java.util.List;

public interface LjwPacStockItemService {
    public void insertitem(PacStockitem pacStockitem);
    public void updateitem(PacStockitem pacStockitem);
    public List<PacPackaging> selectItemName();
}
