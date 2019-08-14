package com.lm.mapper.acc;

import com.lm.entity.acc.AccBusinessAdmissibility;
import com.lm.entity.acc.AccBusinessAdmissibilityExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccBusinessAdmissibilityMapper {
    long countByExample(AccBusinessAdmissibilityExample example);

    int deleteByExample(AccBusinessAdmissibilityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccBusinessAdmissibility record);

    int insertSelective(AccBusinessAdmissibility record);

    List<AccBusinessAdmissibility> selectByExample(AccBusinessAdmissibilityExample example);

    AccBusinessAdmissibility selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccBusinessAdmissibility record, @Param("example") AccBusinessAdmissibilityExample example);

    int updateByExample(@Param("record") AccBusinessAdmissibility record, @Param("example") AccBusinessAdmissibilityExample example);

    int updateByPrimaryKeySelective(AccBusinessAdmissibility record);

    int updateByPrimaryKey(AccBusinessAdmissibility record);
    @Select("select BusinessNoticeNo from acc_businessadmissibility order by id desc limit 1")
    String SelectMaxNo();
}