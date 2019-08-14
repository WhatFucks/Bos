package com.hsq.service;

import com.hsq.entity.BasShuttleBus;

import java.util.Map;

public interface BasShuttleBusService {

    /**
     * 查询所有 分页 模糊查询
     * @param basShuttleBus
     * @param page
     * @param limit
     * @return
     */
    public Map basShuttleBusAll(BasShuttleBus basShuttleBus, Integer page, Integer limit);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteById(Integer id);

    /**
     * 添加
     * @param basShuttleBus
     * @return
     */
    public void add(BasShuttleBus basShuttleBus);

    /**
     * 根据id修改
     * @param basShuttleBus
     * @return
     */
    public void updateById(BasShuttleBus basShuttleBus);

}
