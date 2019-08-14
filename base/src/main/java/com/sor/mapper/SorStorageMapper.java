package com.sor.mapper;

import com.lyb.entity.SysUser;
import com.sor.entity.SorStorageExample;
import com.sor.entity.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SorStorageMapper {

    @Delete("delete from sor_storage where id=#{id}")
    void deleteStorage(String id);

    @Select("select id,AcceptDate,AcceptPerson,AcceptCompany,DeliveryPerson,AcceptCompany,DeliveryPerson,DeliveryCompany from sor_storage")
    List<SorStorage> pageList();
    @Select("select id,username from sys_user where id=#{id}")
    SysUser getnameByid(Integer id);

    @Select("select id,username,status from sys_user")
    List<SysUser> userlist();

    @Select("select id,username from sys_user where id=#{id}")
    SysUser findById(Integer id);

    long countByExample(SorStorageExample example);

    int deleteByExample(SorStorageExample example);

    int insert(SorStorage record);

    int insertSelective(SorStorage record);

    List<SorStorage> selectByExample(SorStorageExample example);

    int updateByExampleSelective(@Param("record") SorStorage record, @Param("example") SorStorageExample example);

    int updateByExample(@Param("record") SorStorage record, @Param("example") SorStorageExample example);
}