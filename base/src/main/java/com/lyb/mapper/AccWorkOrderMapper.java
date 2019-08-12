package com.lyb.mapper;

import com.lyb.entity.AccWorkOrder;
import com.lyb.entity.AccWorkOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccWorkOrderMapper {

    long countByExample(AccWorkOrderExample example);

    int deleteByExample(AccWorkOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccWorkOrder record);

    int insertSelective(AccWorkOrder record);

    List<AccWorkOrder> selectByExample(AccWorkOrderExample example);

    AccWorkOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccWorkOrder record, @Param("example") AccWorkOrderExample example);

    int updateByExample(@Param("record") AccWorkOrder record, @Param("example") AccWorkOrderExample example);

    int updateByPrimaryKeySelective(AccWorkOrder record);

    int updateByPrimaryKey(AccWorkOrder record);
}