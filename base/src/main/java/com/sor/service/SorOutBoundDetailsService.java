package com.sor.service;

import com.sor.entity.SorOutBoundDetails;

import java.util.List;

public interface SorOutBoundDetailsService {
    /**
     * 根据出库交接单查询详情
     * @param id
     * @return
     */
    public List<SorOutBoundDetails> list(String id);
}
