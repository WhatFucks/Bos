package com.hsq.service;

import com.hsq.entity.BasDeliveryStandard;

import java.util.Map;

public interface BasDeliveryStandardService {
    /**
     * 查询所有 分页 模糊查询
     * @param basDeliveryStandard
     * @param page
     * @param limit
     * @return
     */
    public Map basDeliveryStandardAll(BasDeliveryStandard basDeliveryStandard, Integer page, Integer limit);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteById(Long id);

    /**
     * 添加
     * @param basDeliveryStandard
     * @return
     */
    public void add(BasDeliveryStandard basDeliveryStandard);

    /**
     * 根据id修改
     * @param basDeliveryStandard
     * @return
     */
    public void updateById(BasDeliveryStandard basDeliveryStandard);

    /**
     * 查询数据库已拥有角色名
     * @param dname
     * @return
     */
    public boolean selectByName(String dname);


}
