package com.lyb.mapper;

import com.lyb.entity.SysUser;
import com.lyb.entity.SysUserExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface SysUserMapper {
    // 根据电话查询
    @Select("select * from sys_user where mobile=#{tel}")
    SysUser ByTelSelect(String tel);
    String getMaxUserNo();

    List<SysUser> findUserByNameAndRoleAndMenu(String username);

    List<String> findRolesByUserID(Integer id);

    Integer countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}