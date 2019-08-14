package com.ljw.mapper;

import com.ljw.entity.PacStock;
import com.ljw.entity.PacStockExample;
import java.util.List;

import com.ljw.entity.PacStockitem;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LjwPacStockMapper {
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

    @Select("select warehouseno from pac_stock order by id desc limit 1")
    public String selectByWarehouseno();

    @Select("select transport from pac_stock order by id desc limit 1")
    public String selectBytransport();

    public List<PacStock> selectByStockAndStockItem(String warehouseno);

    @Select("select * from pac_stockitem where warehouseno=#{warehouseno}")
    public List<PacStockitem> Stockitemlist(String warehouseno);

    @Select("select * from pac_stock")
    public List<PacStock> list();

}
