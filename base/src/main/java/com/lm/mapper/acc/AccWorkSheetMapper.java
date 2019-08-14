package com.lm.mapper.acc;

import com.lm.entity.acc.AccWorkSheet;
import com.lm.entity.acc.AccWorkSheetExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccWorkSheetMapper {
    // 根据 工作单编号 查询 所有
    @Select("select * from acc_worksheet where WorkSheetNo=#{WorksheetNo}")
    List<AccWorkSheet> ByWorksheetNoSelect(String WorksheetNo);

    long countByExample(AccWorkSheetExample example);

    int deleteByExample(AccWorkSheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccWorkSheet record);

    int insertSelective(AccWorkSheet record);

    List<AccWorkSheet> selectByExample(AccWorkSheetExample example);

    AccWorkSheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccWorkSheet record, @Param("example") AccWorkSheetExample example);

    int updateByExample(@Param("record") AccWorkSheet record, @Param("example") AccWorkSheetExample example);

    int updateByPrimaryKeySelective(AccWorkSheet record);

    int updateByPrimaryKey(AccWorkSheet record);
}