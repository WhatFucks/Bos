package com.sor.mapper;

import com.sor.entity.SorAbnormalExample;
import com.sor.entity.SorAbnormal;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorAbnormalMapper {

    @Select("select id,launchdate,launchperson,launchcompany,abnormaltype,transferint,cargoint,packageint,hedgeabnint,abostate,handledate from sor_abnormal ")
    List<SorAbnormal> listAll();

    @Update("update sor_abnormal set abostate=1 where id=#{id}")
    void updateById(String id);

    @Delete("delete  from sor_abnormal where id=#{id}")
    void deleteById(String id);

    @Select("select id,LaunchDate,launchperson,launchcompany,AbnormalType,TransferInt,CargoInt,PackageInt,HedgeAbnInt,AboState,HandleDate from sor_abnormal where id=#{id} ")
    SorAbnormal findById(String id);

    long countByExample(SorAbnormalExample example);

    int deleteByExample(SorAbnormalExample example);

    int insert(SorAbnormal record);

    int insertSelective(SorAbnormal record);

    List<SorAbnormal> selectByExample(SorAbnormalExample example);

    int updateByExampleSelective(@Param("record") SorAbnormal record, @Param("example") SorAbnormalExample example);

    int updateByExample(@Param("record") SorAbnormal record, @Param("example") SorAbnormalExample example);
}