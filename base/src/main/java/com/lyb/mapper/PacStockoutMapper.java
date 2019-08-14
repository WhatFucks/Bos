package com.lyb.mapper;

import com.lyb.entity.PacStockout;
import com.lyb.entity.PacStockoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PacStockoutMapper {
    long countByExample(PacStockoutExample example);

    int deleteByExample(PacStockoutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PacStockout record);

    int insertSelective(PacStockout record);

    List<PacStockout> selectByExample(PacStockoutExample example);

    PacStockout selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PacStockout record, @Param("example") PacStockoutExample example);

    int updateByExample(@Param("record") PacStockout record, @Param("example") PacStockoutExample example);

    int updateByPrimaryKeySelective(PacStockout record);

    int updateByPrimaryKey(PacStockout record);
}