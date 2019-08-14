package com.lyb.mapper;

import com.lyb.entity.SysRole;
import com.lyb.entity.SysRoleExample;
import java.util.List;

import com.lyb.entity.SysUser;
import com.lyb.general.AllotRoles;
import com.lyb.general.UserAndRole;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    int deleteRolesByUserID(int uid);

    int insertUserRoles(List<UserAndRole> ur);

    List<SysRole> findRolesByUserID(Integer id);

    List<SysUser> findUserByRoleID(Integer id);

    Integer countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}