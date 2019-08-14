package com.sor.service;

import com.sor.entity.SorCheckBound;

import java.util.Map;

public interface SorCheckBoundService {



    /**
     * 根据id删除盘库信息
     * @param id
     */
    public void deleteCheckBound(String id);

    /**
     * 修改盘库信息
     * @param sorCheckBound
     */
    public void updateCheckBound(SorCheckBound sorCheckBound);

    /**
     * 新增盘库信息
     * @param sorCheckBound
     */
    public void insertCheckBound(SorCheckBound sorCheckBound);

    /**
     * 分页条件查询
     * @param sorCheckBound
     * @param pageSize
     * @param pageNum
     * @return
     */
    public Map sorCheckBoundPageList(SorCheckBound sorCheckBound, Integer pageSize, Integer pageNum);
}
