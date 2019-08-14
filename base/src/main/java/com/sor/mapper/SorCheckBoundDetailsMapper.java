package com.sor.mapper;

import com.sor.entity.SorCheckBoundDetailsCargoType;
import com.sor.entity.SorCheckBoundDetailsExample;
import com.sor.entity.SorCheckBoundDetails;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SorCheckBoundDetailsMapper {


    // 查询详情里的类型
    @Select("select id,name from SOR_CheckBoundDetails_CargoType where id=#{id}")
    SorCheckBoundDetailsCargoType listTypeById(Integer id);

    @Select("select id,name from SOR_CheckBoundDetails_CargoType")
    List<SorCheckBoundDetailsCargoType> listType();

    @Select("select id,PackageID,CargoCount,Weight,Volume,CargoType,Direction,StoragePerson,StorageDate,checkId from sor_checkbounddetails where checkId=#{id}")
    List<SorCheckBoundDetails> listById(String id);

    long countByExample(SorCheckBoundDetailsExample example);

    int deleteByExample(SorCheckBoundDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(SorCheckBoundDetails record);

    int insertSelective(SorCheckBoundDetails record);

    List<SorCheckBoundDetails> selectByExample(SorCheckBoundDetailsExample example);

    SorCheckBoundDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SorCheckBoundDetails record, @Param("example") SorCheckBoundDetailsExample example);

    int updateByExample(@Param("record") SorCheckBoundDetails record, @Param("example") SorCheckBoundDetailsExample example);

    int updateByPrimaryKeySelective(SorCheckBoundDetails record);

    int updateByPrimaryKey(SorCheckBoundDetails record);
}