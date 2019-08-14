package com.sor.mapper;

import com.sor.entity.SorPackageDetails;
import com.sor.entity.SorPackageDetailsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SorPackageDetailsMapper {

    @Select("select id,warename,destination,ticket,actualcargoint,cargoint,weight,volume,service,importanthints,ask,inputtype,packageid from sor_packagedetails where packageid=#{id}")
    List<SorPackageDetails> listById(String id);

    long countByExample(SorPackageDetailsExample example);

    int deleteByExample(SorPackageDetailsExample example);

    int insert(SorPackageDetails record);

    int insertSelective(SorPackageDetails record);

    List<SorPackageDetails> selectByExample(SorPackageDetailsExample example);

    int updateByExampleSelective(@Param("record") SorPackageDetails record, @Param("example") SorPackageDetailsExample example);

    int updateByExample(@Param("record") SorPackageDetails record, @Param("example") SorPackageDetailsExample example);
}