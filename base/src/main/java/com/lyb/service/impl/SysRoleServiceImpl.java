package com.lyb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysRole;
import com.lyb.entity.SysRoleExample;
import com.lyb.entity.SysUser;
import com.lyb.general.AllotRoles;
import com.lyb.general.PageEntity;
import com.lyb.general.UserAndRole;
import com.lyb.mapper.SysRoleMapper;
import com.lyb.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> findRolesByUserID(Integer id) {
        return sysRoleMapper.findRolesByUserID(id);
    }

    @Override
    public int deleteRolesByUserID(Integer uid) {
        return sysRoleMapper.deleteRolesByUserID(uid);
    }

    @Override
    public int insertUserRoles(List<UserAndRole> ur) {
        return sysRoleMapper.insertUserRoles(ur);
    }

    @Override
    public List<SysRole> findAllRole() {
        return sysRoleMapper.selectByExample(null);
    }

    @Override
    public Boolean startRole(Integer id) {
        boolean flag = false;
        SysRole role = sysRoleMapper.selectByPrimaryKey(id);
        if(role != null){
            role.setDelFlag(0);
        }
        int count = sysRoleMapper.updateByPrimaryKeySelective(role);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Map<String, Object> findAllSysRole(PageEntity entity) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(entity.getPageNum(),entity.getPageSize(),true);
        SysRoleExample example = new SysRoleExample();
        if(entity.getName()!=null && entity.getName().trim()!=""){
            example.createCriteria().andNameLike("%"+entity.getName()+"%");
        }
        example.setOrderByClause("create_time desc");
        List<SysRole> list = sysRoleMapper.selectByExample(example);
        PageInfo page = new PageInfo(list);
        map.put("items",page.getList());
        map.put("total",page.getTotal());
        return map;
    }

    @Override
    public SysRole findSysRoleByID(Integer ID) {
        return sysRoleMapper.selectByPrimaryKey(ID);
    }

    @Override
    public Boolean addSysRole(SysRole sysRole) {
        boolean flag = false;
        int count = sysRoleMapper.insertSelective(sysRole);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean updateSysRoleByID(SysRole sysRole) {
        boolean flag = false;
        int count = sysRoleMapper.updateByPrimaryKeySelective(sysRole);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean deleteSysRoleByID(Integer id) {
        boolean flag = false;
        SysRole role = sysRoleMapper.selectByPrimaryKey(id);
        if(role!=null){
            role.setDelFlag(-1);
            int count = sysRoleMapper.updateByPrimaryKeySelective(role);
            if(count > 0){
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public List<SysUser> findUserByRoleID(Integer id) {
        return sysRoleMapper.findUserByRoleID(id);
    }
}
