package com.lyb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysMenu;
import com.lyb.entity.SysMenuExample;
import com.lyb.general.PageEntity;
import com.lyb.general.RoleAndMenu;
import com.lyb.mapper.SysMenuMapper;
import com.lyb.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public int deleteRoleAndMenuByRoleID(Integer roleId) {
        return sysMenuMapper.deleteRoleAndMenuByRoleID(roleId);
    }

    @Override
    public int insertRoleAndMenu(List<RoleAndMenu> list) {
        return sysMenuMapper.insertRoleAndMenu(list);
    }

    @Override
    public List<SysMenu> findMenuByRoleID(Integer roleId) {
        return sysMenuMapper.findMenuByRoleID(roleId);
    }

    @Override
    public List<SysMenu> findAll() {
        return sysMenuMapper.selectByExample(null);
    }

    @Override
    public Map<String,Object> findAllMenu(PageEntity entity) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(entity.getPageNum(),entity.getPageSize(),true);
        SysMenuExample example = null;
        if(entity.getName()!=null && entity.getName().trim()!=""){
            example = new SysMenuExample();
            example.createCriteria().andNameLike("%"+entity.getName()+"%");
        }
        example.setOrderByClause("create_time desc");
        List<SysMenu> list = sysMenuMapper.selectByExample(example);
        PageInfo page = new PageInfo(list);
        map.put("items",page.getList());
        map.put("total",page.getTotal());
        return map;
    }

    @Override
    public Boolean addMenu(SysMenu menu) {
        boolean flag = false;
        int count = sysMenuMapper.insertSelective(menu);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean deleteMenu(Integer id) {
        boolean flag = false;
        SysMenu menu = sysMenuMapper.selectByPrimaryKey(id);
        if(menu != null){
            menu.setDelFlag(-1);
        }
        int count = sysMenuMapper.updateByPrimaryKeySelective(menu);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean updateMenu(SysMenu menu) {
        boolean flag = false;
        int count = sysMenuMapper.updateByPrimaryKeySelective(menu);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean startMenu(Integer id) {
        boolean flag = false;
        SysMenu menu = sysMenuMapper.selectByPrimaryKey(id);
        if(menu != null){
            menu.setDelFlag(0);
        }
        int count = sysMenuMapper.updateByPrimaryKeySelective(menu);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean isExistSubset(Integer id) {
        boolean flag = false;
        SysMenuExample example = new SysMenuExample();
        example.createCriteria().andParentIdEqualTo(id);
        List<SysMenu> menus = sysMenuMapper.selectByExample(example);
        if(menus != null && menus.size() >0 ){
            flag = true;
        }
        return flag;
    }
}
