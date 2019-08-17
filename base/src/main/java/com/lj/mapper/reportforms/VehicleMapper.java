package com.lj.mapper.reportforms;

import com.lj.entity.reportforms.Vehicle;
import com.lj.entity.reportforms.VehicleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface VehicleMapper {
    //查询班车使用的情况
    @Select("select vehicleint from veh_icle")
    public int[] selectVehicle();

    int countByExample(VehicleExample example);

    int deleteByExample(VehicleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vehicle record);

    int insertSelective(Vehicle record);

    List<Vehicle> selectByExample(VehicleExample example);

    Vehicle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    int updateByExample(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    int updateByPrimaryKeySelective(Vehicle record);

    int updateByPrimaryKey(Vehicle record);
}