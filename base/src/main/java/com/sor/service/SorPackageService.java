package com.sor.service;

import com.sor.entity.SorPackage;

import java.util.Map;

public interface SorPackageService {

    public void chaiCheck(String id);

    /**
     * 根据id查询合包和合包信息
     * @param id
     * @return
     */
    public SorPackage queryAllById(String id);

    /**
     * 新增合包信息及合包详情
     * @param sorPackage
     */
    public void insertPackage(SorPackage sorPackage);
    /**
     * 分页查询
     * @param sorPackage
     * @param pageSize
     * @param pageNum
     * @return
     */
    public Map pageList(SorPackage sorPackage, Integer pageSize, Integer pageNum);
}
