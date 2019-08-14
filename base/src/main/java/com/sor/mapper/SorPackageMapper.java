package com.sor.mapper;

import com.sor.entity.SorPackage;
import com.sor.entity.SorPackageExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorPackageMapper {

    @Update("update sor_package set state=1 where id=#{id}")
    void chaiCheck(String id);

    SorPackage queryAllById(String id);

    long countByExample(SorPackageExample example);

    int deleteByExample(SorPackageExample example);

    int deleteByPrimaryKey(String id);

    int insert(SorPackage record);

    int insertSelective(SorPackage record);

    List<SorPackage> selectByExample(SorPackageExample example);

    SorPackage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SorPackage record, @Param("example") SorPackageExample example);

    int updateByExample(@Param("record") SorPackage record, @Param("example") SorPackageExample example);

    int updateByPrimaryKeySelective(SorPackage record);

    int updateByPrimaryKey(SorPackage record);
}