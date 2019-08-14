package com.hsq.service;

import com.hsq.entity.BasArea;

import java.util.Map;

public interface BasAreaService {

    /**
     * 查询所有 分页 模糊查询
     * @param basArea
     * @param page
     * @param limit
     * @return
     */
    public Map basAreaAll(BasArea basArea, Integer page, Integer limit);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteById(Integer id);

    /**
     * 添加
     * @param basArea
     * @return
     */
    public void add(BasArea basArea);

    /**
     * 根据id修改
     * @param basArea
     * @return
     */
    public void updateById(BasArea basArea);
}
