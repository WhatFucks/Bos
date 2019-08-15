package com.lyb.mapper;

import com.lyb.entity.PacStock;
import com.lyb.entity.PacStockExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PacStockMapper {
    String getMaxTransport();

    String getMaxWarehouseNo();

    long countByExample(PacStockExample example);

    int deleteByExample(PacStockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PacStock record);

    int insertSelective(PacStock record);

    List<PacStock> selectByExample(PacStockExample example);

    PacStock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PacStock record, @Param("example") PacStockExample example);

    int updateByExample(@Param("record") PacStock record, @Param("example") PacStockExample example);

    int updateByPrimaryKeySelective(PacStock record);

    int updateByPrimaryKey(PacStock record);

}
