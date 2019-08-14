package com.sor.service;

import com.sor.entity.SorOutBound;
import com.sor.entity.SorOutBoundType;

import java.util.List;
import java.util.Map;

public interface SorOutBoundService {

    public List<SorOutBoundType> SorOutBoundTypeList();

    public void insertSorOutBount(SorOutBound sorOutBound);

    public void updateSorOutBount(SorOutBound sorOutBound);

    public void deletesorOutBount(String id);

    public Map pageOutBound(SorOutBound sorOutBound, Integer pageSize, Integer pageNum);
}
