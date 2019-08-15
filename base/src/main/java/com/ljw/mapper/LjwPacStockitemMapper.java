package com.ljw.mapper;

import com.ljw.entity.PacPackaging;
import com.ljw.entity.PacStockitem;
import com.ljw.entity.PacStockitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LjwPacStockitemMapper {
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

    @Select("select ItemName from pac_packaging")
    public List<PacPackaging> selectItemName();
}
