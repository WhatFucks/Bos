package com.sor.service;//package lll.service;

import com.lyb.entity.SysUser;
import com.sor.entity.SorStorage;
import com.sor.entity.SorStorageDetails;

import java.util.List;
import java.util.Map;

public interface SorStorageService {


    // 删除
    public void deleteStorage(String id);

    // 修改
    public void updateStorage(SorStorage sorStorage);

    /**
     * 获取计算的重量集合
     * @return
     */
    public Map getByWeights();

    public SysUser findById(Integer id);

    public List<SysUser> userlist();
    /**
     * 新增入库信息
     * @param sorStorage
     */
    public void insertSorStorage(SorStorage sorStorage, List<SorStorageDetails> list);
    /**
     * 分页查询
     * @param sorStorage
     * @param pageSize
     * @param pageNum
     * @return
     */
    public Map pageList(SorStorage sorStorage, Integer pageSize, Integer pageNum);
}
