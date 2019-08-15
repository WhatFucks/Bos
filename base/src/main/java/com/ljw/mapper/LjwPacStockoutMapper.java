package com.ljw.mapper;

import com.ljw.entity.*;

import java.util.List;

import com.lyb.entity.SysDept;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LjwPacStockoutMapper {
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

    //根据登录名获取角色及权限
//    public List<SysDept> findByNameUserAndRoleAndMenu(Long delptId);

    @Select("select * from sys_dept")
    public List<SysDept> list();

    @Select("select WarehouseOrderNo from pac_stockout order by id desc limit 1")
    public String WarehouseOrderNo();

    @Select("select transportationOrderNo from pac_stockout order by id desc limit 1")
    public String transportationOrderNo();

    @Select("select name from sys_dept where id=#{id}")
    public String selectdept(Long deptid);


}
