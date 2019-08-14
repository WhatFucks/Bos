package com.sor.mapper;

import com.sor.entity.SorOutBound;
import com.sor.entity.SorOutBoundType;
import com.sor.entity.SorOutBoundExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SorOutBoundMapper {

    @Delete("delete from SOR_OutBound where id=#{id}")
    void deleteToSorOutBound(String id);

    @Select("select id,typeName from sor_OutBoundType where id=#{id}")
    SorOutBoundType getTypeBy(Integer id);

    @Select("select id,typeName from sor_OutBoundType")
    List<SorOutBoundType> typeList();

    @Select("select id,HandoverType,Line,Direction,AcceptPerson,Carriers,DeliveryPerson,DeliveryCompany,DeliveryDate,EnterPerson,EnterDate from sor_outbound where id like #{id}")
    List<SorOutBound> pageList(SorOutBound sorOutBound);

    long countByExample(SorOutBoundExample example);

    int deleteByExample(SorOutBoundExample example);

    int insert(SorOutBound record);

    int insertSelective(SorOutBound record);

    List<SorOutBound> selectByExample(SorOutBoundExample example);

    int updateByExampleSelective(@Param("record") SorOutBound record, @Param("example") SorOutBoundExample example);

    int updateByExample(@Param("record") SorOutBound record, @Param("example") SorOutBoundExample example);
}