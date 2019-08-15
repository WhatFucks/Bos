package com.lyb.service;

import com.lyb.entity.SysDept;
import com.lyb.general.PageEntity;

import java.util.List;
import java.util.Map;

public interface SysDeptService {

    public SysDept findById(Integer id);

    public Boolean isExistSubset(Integer id);

    public Map<String,Object> deptPaging(PageEntity entity);

    public List<SysDept> findAllSysDept();

    public boolean addSysDept(SysDept sysDept);

    public boolean deleteSysDept(Integer id);

    public boolean updateSysDept(SysDept sysDept);

    public SysDept findSysDeptByID(Integer id);
}
