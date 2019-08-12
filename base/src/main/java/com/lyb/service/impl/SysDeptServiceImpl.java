package com.lyb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysDept;
import com.lyb.entity.SysDeptExample;
import com.lyb.general.PageEntity;
import com.lyb.mapper.SysDeptMapper;
import com.lyb.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysDeptServiceImpl implements SysDeptService {
    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public List<SysDept> findAllSysDept() {
        return sysDeptMapper.selectByExample(null);
    }

    @Override
    public Boolean isExistSubset(Integer id) {
        boolean flag = false;
        SysDeptExample example = new SysDeptExample();
        example.createCriteria().andParentIdEqualTo(id);
        List<SysDept> list = sysDeptMapper.selectByExample(example);
        if(list != null && list.size() > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Map<String, Object> deptPaging(PageEntity entity) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(entity.getPageNum(),entity.getPageSize(),true);
        SysDeptExample example = null;
        if(entity.getName() != null && entity.getName().trim() != ""){
            example = new SysDeptExample();
            example.createCriteria().andNameLike("%"+entity.getName()+"%");
        }
        List<SysDept> list = sysDeptMapper.selectByExample(example);
        PageInfo info = new PageInfo(list);
        map.put("items",info.getList());
        map.put("total",info.getTotal());
        return map;
    }

    @Override
    public boolean addSysDept(SysDept sysDept) {
        boolean flag = false;
        if(sysDeptMapper.insertSelective(sysDept) >0){
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean deleteSysDept(Integer id) {
        boolean flag = false;
        SysDept dept = sysDeptMapper.selectByPrimaryKey(id);
        if(dept !=null){
            dept.setDelFlag(-1);
        }
        if(sysDeptMapper.updateByPrimaryKeySelective(dept) >0){
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean updateSysDept(SysDept sysDept) {
        boolean flag = false;
        if(sysDeptMapper.updateByPrimaryKeySelective(sysDept) >0){
            flag = true;
        }
        return flag;
    }

    @Override
    public SysDept findSysDeptByID(Integer id) {
        return sysDeptMapper.selectByPrimaryKey(id);
    }
}
