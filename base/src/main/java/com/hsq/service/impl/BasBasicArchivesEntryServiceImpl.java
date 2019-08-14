package com.hsq.service.impl;

import com.hsq.entity.*;
import com.hsq.mapper.BasBasicArchivesEntryMapper;
import com.hsq.service.BasBasicArchivesEntryService;
import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import com.lyb.service.SysDeptService;
import com.lyb.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BasBasicArchivesEntryServiceImpl implements BasBasicArchivesEntryService {

    @Autowired
    private BasBasicArchivesEntryMapper basBasicArchivesEntryMapper;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysDeptService sysDeptService;


    @Override
    public BasBasicArchivesEntry findById(Integer id) {
        return basBasicArchivesEntryMapper.selectByPrimaryKey(id);
    }

    @Override
    public Map findByPid(Integer id) {
        Map<String,Object> map = new HashMap<>();
        BasBasicArchivesEntryExample example = new BasBasicArchivesEntryExample();
        example.createCriteria().andParentidEqualTo(id);
        List<BasBasicArchivesEntry> list =  basBasicArchivesEntryMapper.selectByExample(example);
        for(BasBasicArchivesEntry bd : list){
            SysUser sysUser= sysUserService.findById(bd.getOperatorid());
            bd.setUser(sysUser);
            SysDept sysDept= sysDeptService.findById(bd.getOperationunitid());
            bd.setDept(sysDept);
        }
        map.put("items",list);
        return map;
    }


    @Override
    public void deleteBasById(Long id) {
        basBasicArchivesEntryMapper.deleteByPrimaryKey(Integer.parseInt(id.toString()));
    }

    @Override
    public void addBas(BasBasicArchivesEntry basBasicArchivesEntry) {

        basBasicArchivesEntryMapper.insertSelective(basBasicArchivesEntry);
    }

    @Override
    public void updateBasById(BasBasicArchivesEntry basBasicArchivesEntry) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basBasicArchivesEntry.setOperatorid(Math.toIntExact(sysUser.getId()));
        basBasicArchivesEntry.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basBasicArchivesEntry.setOperationtime(new Date());
        basBasicArchivesEntryMapper.updateByPrimaryKeySelective(basBasicArchivesEntry);
    }

}
