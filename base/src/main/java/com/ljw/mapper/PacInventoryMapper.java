package com.ljw.mapper;

import com.ljw.entity.PacInventory;
import com.ljw.entity.PacInventoryExample;
import java.util.List;

import com.ljw.entity.PacStockitem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PacInventoryMapper {
    long countByExample(PacInventoryExample example);

    int deleteByExample(PacInventoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PacInventory record);

    int insertSelective(PacInventory record);

    List<PacInventory> selectByExample(PacInventoryExample example);

    PacInventory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PacInventory record, @Param("example") PacInventoryExample example);

    int updateByExample(@Param("record") PacInventory record, @Param("example") PacInventoryExample example);

    int updateByPrimaryKeySelective(PacInventory record);

    int updateByPrimaryKey(PacInventory record);

    @Select("select * from pac_inventory where goodsName=#{goodsName}")
    public PacInventory Listinventory(String goodsName);
}
