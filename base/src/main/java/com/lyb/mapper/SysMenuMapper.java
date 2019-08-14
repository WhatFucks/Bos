package com.lyb.mapper;

import com.lyb.entity.SysMenu;
import com.lyb.entity.SysMenuExample;
import java.util.List;

import com.lyb.general.RoleAndMenu;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    int insertRoleAndMenu(List<RoleAndMenu> list);

    int deleteRoleAndMenuByRoleID(Integer roleId);

    List<SysMenu> findMenuByRoleID(Integer roleId);

    Integer countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}