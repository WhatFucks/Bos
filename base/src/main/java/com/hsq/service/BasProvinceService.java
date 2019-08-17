package com.hsq.service;

import com.hsq.entity.BasProvince;

import java.util.List;

public  interface BasProvinceService {

    //跟据父级id查询省市区
    public List<BasProvince> selectByPid(Integer pid);

    public List<BasProvince> selectById(Integer id);

    /**
     * 根据id查询成市
     * @param id
     * @return
     */
    public BasProvince geyById(Integer id);
}
