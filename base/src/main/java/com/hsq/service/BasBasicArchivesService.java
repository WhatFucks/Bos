package com.hsq.service;

import com.hsq.entity.BasBasicArchives;

import java.util.Map;

public interface BasBasicArchivesService {

    /**
     * 查询所有 分页 模糊查询
     * @param basBasicArchives
     * @param page
     * @param limit
     * @return
     */
    public Map basBasicArchivesAll(BasBasicArchives basBasicArchives, Integer page, Integer limit);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public void deleteById(Long id);

    /**
     * 添加
     * @param basBasicArchives
     * @return
     */
    public void add(BasBasicArchives basBasicArchives);

    /**
     * 根据id修改
     * @param basBasicArchives
     * @return
     */
    public void updateById(BasBasicArchives basBasicArchives);

    /**
     * 查询数据库已拥有名字
     * @param dname
     * @return
     */
    public boolean selectByName(String dname);


}
