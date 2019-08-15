package com.hsq.service;

import com.hsq.entity.BasBasicArchivesEntry;

import java.util.List;
import java.util.Map;

public interface BasBasicArchivesEntryService {

    public BasBasicArchivesEntry findById(Integer id);

    /**
     * 查看列表数据
     * @param pid
     * @return
     */
    public Map findByPid(Integer pid);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteBasById(Long id);

    /**
     * 添加
     * @param basBasicArchivesEntry
     * @return
     */
    public void addBas(BasBasicArchivesEntry basBasicArchivesEntry);

    /**
     * 根据id修改
     * @param basBasicArchivesEntry
     * @return
     */
    public void updateBasById(BasBasicArchivesEntry basBasicArchivesEntry);

}
