package com.sor.service;

import com.sor.entity.SorAbnormal;

import java.util.List;

public interface SorAbnormalService {


    public List<SorAbnormal> listAll();

    /**
     * 对冲修改状态
     * @param id
     */
    public void updateById(String id);
    /**
     * 根据id删除异常编号
     * @param id
     * @return
     */
    public void deleteById(String id);

    /**
     * 根据id查询异常信息
     * @param id
     * @return
     */
    public SorAbnormal findById(String id);

    public void insertSorAbnormal(SorAbnormal sorAbnormal);
}
