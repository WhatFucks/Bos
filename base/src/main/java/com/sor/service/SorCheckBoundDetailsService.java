package com.sor.service;

import com.sor.entity.SorCheckBoundDetails;
import com.sor.entity.SorCheckBoundDetailsCargoType;

import java.util.List;

public interface SorCheckBoundDetailsService {

    public List<SorCheckBoundDetailsCargoType> typeList();

    // 根据盘库id查询盘库详情
    public List<SorCheckBoundDetails> listById(String id);


}
