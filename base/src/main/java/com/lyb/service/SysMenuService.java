package com.lyb.service;

import com.lyb.entity.SysMenu;
import com.lyb.general.PageEntity;
import com.lyb.general.RoleAndMenu;

import java.util.List;
import java.util.Map;

public interface SysMenuService {
    int insertRoleAndMenu(List<RoleAndMenu> list);

    int deleteRoleAndMenuByRoleID(Integer roleId);

    List<SysMenu> findMenuByRoleID(Integer roleId);

    List<SysMenu> findAll();

    Map<String,Object> findAllMenu(PageEntity entity);

    Boolean addMenu(SysMenu menu);

    Boolean deleteMenu(Integer id);

    Boolean updateMenu(SysMenu menu);

    Boolean startMenu(Integer id);

    Boolean isExistSubset(Integer id);
}
