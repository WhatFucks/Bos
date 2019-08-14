package com.lyb.mapper;

import com.lyb.entity.AccWorksheet;
import com.lyb.entity.AccWorksheetExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccWorksheetMapper {
    @Select("select * from acc_worksheet where WorkSheetNo = #{WorkSheetNo}")
    AccWorksheet selectByWorkSheetNo(String JobNo);

    long countByExample(AccWorksheetExample example);

    int deleteByExample(AccWorksheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccWorksheet record);

    int insertSelective(AccWorksheet record);

    List<AccWorksheet> selectByExample(AccWorksheetExample example);

    AccWorksheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccWorksheet record, @Param("example") AccWorksheetExample example);

    int updateByExample(@Param("record") AccWorksheet record, @Param("example") AccWorksheetExample example);

    int updateByPrimaryKeySelective(AccWorksheet record);

    int updateByPrimaryKey(AccWorksheet record);
}