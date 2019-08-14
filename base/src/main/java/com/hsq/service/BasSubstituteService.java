package com.hsq.service;

import com.hsq.entity.BasSubstitute;
import com.util.ResponseResult;

import java.util.Map;

public interface BasSubstituteService {
    /**
     * 查询所有 分页 模糊查询
     * @param basSubstitute
     * @param page
     * @param limit
     * @return
     */
    public Map basSubstituteAll(BasSubstitute basSubstitute, Integer page, Integer limit);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteById(Integer id);

    /**
     * 添加
     * @param basSubstitute
     * @return
     */
    public void add(BasSubstitute basSubstitute);

    /**
     * 根据id修改
     * @param basSubstitute
     * @return
     */
    public void updateById(BasSubstitute basSubstitute);

}
