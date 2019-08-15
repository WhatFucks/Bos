package com.ljw.mapper;

import com.ljw.entity.PacStockoutitem;
import com.ljw.entity.PacStockoutitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PacStockoutitemMapper {
    long countByExample(PacStockoutitemExample example);

    int deleteByExample(PacStockoutitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PacStockoutitem record);

    int insertSelective(PacStockoutitem record);

    List<PacStockoutitem> selectByExample(PacStockoutitemExample example);

    PacStockoutitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PacStockoutitem record, @Param("example") PacStockoutitemExample example);

    int updateByExample(@Param("record") PacStockoutitem record, @Param("example") PacStockoutitemExample example);

    int updateByPrimaryKeySelective(PacStockoutitem record);

    int updateByPrimaryKey(PacStockoutitem record);

    @Select("select * from pac_stockoutitem where WarehouseOrderNo=#{WarehouseOrderNo}")
    public List<PacStockoutitem> outitem(String WarehouseOrderNo);
}
