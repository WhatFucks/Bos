package com.lyb.service;

import com.lyb.entity.PacStockitem;
import com.lyb.general.PageEntity;

import java.util.Map;

public interface PacStockitemService {
    public Map<String,Object> getPacStockItemList(PageEntity page, PacStockitem stockitem);
}
