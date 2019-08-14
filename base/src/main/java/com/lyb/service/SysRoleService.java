package com.lyb.service;

import com.lyb.entity.SysRole;
import com.lyb.entity.SysUser;
import com.lyb.general.PageEntity;
import com.lyb.general.UserAndRole;

import java.util.List;
import java.util.Map;

public interface SysRoleService {

     Boolean startRole(Integer id);

     Map<String,Object> findAllSysRole(PageEntity entity);

     SysRole findSysRoleByID(Integer ID);

     Boolean addSysRole(SysRole sysRole);

     Boolean updateSysRoleByID(SysRole sysRole);

     Boolean deleteSysRoleByID(Integer id);

     List<SysUser> findUserByRoleID(Integer id);

     List<SysRole> findAllRole();

     List<SysRole> findRolesByUserID(Integer id);

     int insertUserRoles(List<UserAndRole> ur);

     int deleteRolesByUserID(Integer uid);
}
