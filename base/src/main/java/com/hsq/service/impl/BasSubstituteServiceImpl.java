package com.hsq.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsq.entity.*;
import com.hsq.mapper.BasSubstituteMapper;
import com.hsq.service.BasSubstituteService;
import com.lyb.entity.SysDept;
import com.lyb.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BasSubstituteServiceImpl implements BasSubstituteService {

    @Autowired
    private BasSubstituteMapper basSubstituteMapper;

    @Autowired
    private SysDeptService sysDeptService;
    /**
     * 分页  模糊查询  查询所有
     * @param basSubstitute
     * @param page
     * @param limit
     * @return
     */
    @Override
    public Map basSubstituteAll(BasSubstitute basSubstitute, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        Page p = PageHelper.startPage(page,limit,true);
        BasSubstituteExample example = new BasSubstituteExample();
        if (basSubstitute!=null && basSubstitute.getEmpname()!=null&&basSubstitute.getEmpname()!=""){
            example.createCriteria().andEmpnameLike("%"+basSubstitute.getEmpname()+"%");
        }
        List<BasSubstitute> list= basSubstituteMapper.selectByExample(example);

        for(BasSubstitute bd : list) {
            SysDept sysDept = sysDeptService.findById(Integer.valueOf(bd.getSubordinateunit()));
            bd.setDept(sysDept);
        }
        map.put("row",list);
        map.put("total",p.getTotal());
        return map;
    }

    /**
     * 根据id软删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        basSubstituteMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id修改
     * @param basSubstitute
     */
    @Override
    public void updateById(BasSubstitute basSubstitute) {
        basSubstituteMapper.updateByPrimaryKeySelective(basSubstitute);
    }

    /**
     * 添加
     * @param basSubstitute
     */
    @Override
    public void add(BasSubstitute basSubstitute) {
        basSubstituteMapper.insertSelective(basSubstitute);
    }

}
