package com.sor.mapper;

import com.sor.entity.SorOutBoundDetailsExample;
import com.sor.entity.SorOutBoundDetails;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SorOutBoundDetailsMapper {

    @Select("select * from SOR_OutBoundDetails")
    List<SorOutBoundDetails> listToWeight();

    @Select("select * from SOR_OutBoundDetails where sorOutBoundId=#{sorOutBoundId}")
    List<SorOutBoundDetails> list(String sorOutBoundId);

    long countByExample(SorOutBoundDetailsExample example);

    int deleteByExample(SorOutBoundDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(SorOutBoundDetails record);

    int insertSelective(SorOutBoundDetails record);

    List<SorOutBoundDetails> selectByExample(SorOutBoundDetailsExample example);

    SorOutBoundDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SorOutBoundDetails record, @Param("example") SorOutBoundDetailsExample example);

    int updateByExample(@Param("record") SorOutBoundDetails record, @Param("example") SorOutBoundDetailsExample example);

    int updateByPrimaryKeySelective(SorOutBoundDetails record);

    int updateByPrimaryKey(SorOutBoundDetails record);
}