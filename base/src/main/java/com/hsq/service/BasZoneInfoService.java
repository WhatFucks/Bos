package com.hsq.service;


import com.lm.entity.dis.BasZoneInfo;

import java.util.List;
import java.util.Map;

public interface BasZoneInfoService {

    /**
     * 查询所有 分页 模糊查询
     * @param basZoneInfo
     * @param page
     * @param limit
     * @return
     */
    public Map basZoneInfoAll(BasZoneInfo basZoneInfo, Integer page, Integer limit);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteById(Integer id);

    /**
     * 添加
     * @param basZoneInfo
     * @return
     */
    public void add(BasZoneInfo basZoneInfo);

    /**
     * 根据id修改
     * @param basZoneInfo
     * @return
     */
    public void updateById(BasZoneInfo basZoneInfo);
}
