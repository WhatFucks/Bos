package com.lyb.service;

import com.lyb.entity.SysUser;
import com.lyb.general.PageEntity;

import java.util.List;
import java.util.Map;

public interface SysUserService {
    public SysUser findUserByUserName(String username);

    public Boolean startUser(Integer id);

    public Map<String,Object> findAllUser(PageEntity entity);

    public SysUser findUserByNameAndPassword(SysUser sysUser);

    public SysUser findUserByID(Integer ID);

    public List<String> findRolesByUserID(Integer ID);

    public Boolean addUser(SysUser user);

    public Boolean updateUserByID(SysUser user);

    public Boolean deleteUserByID(Integer id);

    public String getUserNo();
}
