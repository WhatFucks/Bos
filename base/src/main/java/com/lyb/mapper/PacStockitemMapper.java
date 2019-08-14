package com.lyb.mapper;

import com.lyb.entity.PacStockitem;
import com.lyb.entity.PacStockitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PacStockitemMapper {
    long countByExample(PacStockitemExample example);

    int deleteByExample(PacStockitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PacStockitem record);

    int insertSelective(PacStockitem record);

    List<PacStockitem> selectByExample(PacStockitemExample example);

    PacStockitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PacStockitem record, @Param("example") PacStockitemExample example);

    int updateByExample(@Param("record") PacStockitem record, @Param("example") PacStockitemExample example);

    int updateByPrimaryKeySelective(PacStockitem record);

    int updateByPrimaryKey(PacStockitem record);
}