package com.hsq.service;

import com.hsq.entity.BasZoneCustomInfo;

import java.util.Map;

public interface BasZoneCustomInfoService {

    public BasZoneCustomInfo findById(Integer id);



    /**
     * 查看列表数据
     * @param pid
     * @return
     */
    public Map findByZid(Integer zid);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteById(Integer customcode);

    /**
     * 添加
     * @param basZoneCustomInfo
     * @return
     */
    public void add2(BasZoneCustomInfo basZoneCustomInfo);

    /**
     * 根据id修改
     * @param basZoneCustomInfo
     * @return
     */
    public void update2(BasZoneCustomInfo basZoneCustomInfo);
}
