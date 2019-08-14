package com.hsq.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsq.entity.BasArea;
import com.hsq.entity.BasAreaExample;
import com.hsq.mapper.BasAreaMapper;
import com.hsq.service.BasAreaService;
import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import com.lyb.service.SysDeptService;
import com.lyb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BasAreaServiceImpl implements BasAreaService {

    @Autowired
    private BasAreaMapper basAreaMapper;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysDeptService sysDeptService;
    /**
     * 分页  模糊查询  查询所有
     * @param basArea
     * @param page
     * @param limit
     * @return
     */
    @Override
    public Map basAreaAll(BasArea basArea, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        Page p = PageHelper.startPage(page,limit,true);
        BasAreaExample example = new BasAreaExample();
        if (basArea!=null && basArea.getProvince()!=null&&basArea.getProvince()!=""){
            example.createCriteria().andProvinceLike("%"+basArea.getProvince()+"%");
        }
        List<BasArea> list= basAreaMapper.selectByExample(example);

        for(BasArea bd : list) {
            SysUser sysUser = sysUserService.findById(Integer.valueOf(bd.getEntryunitid()));
            bd.setUser(sysUser);
            SysDept sysDept = sysDeptService.findById(Integer.valueOf(bd.getComplementunitid()));
            bd.setDept(sysDept);
        }
        map.put("row",list);
        map.put("total",p.getTotal());
        return map;
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        basAreaMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id修改
     * @param basArea
     */
    @Override
    public void updateById(BasArea basArea) {
        basAreaMapper.updateByPrimaryKeySelective(basArea);
    }

    /**
     * 添加
     * @param basArea
     */
    @Override
    public void add(BasArea basArea) {
        basAreaMapper.insertSelective(basArea);
    }
}
