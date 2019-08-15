package com.ljw.mapper;

import com.ljw.entity.IaeArrival;
import com.ljw.entity.IaeArrivalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

public interface IaeArrivalMapper {
    long countByExample(IaeArrivalExample example);

    int deleteByExample(IaeArrivalExample example);

    int deleteByPrimaryKey(String id);

    int insert(IaeArrival record);

    int insertSelective(IaeArrival record);

    List<IaeArrival> selectByExample(IaeArrivalExample example);

    IaeArrival selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IaeArrival record, @Param("example") IaeArrivalExample example);

    int updateByExample(@Param("record") IaeArrival record, @Param("example") IaeArrivalExample example);

    int updateByPrimaryKeySelective(IaeArrival record);

    int updateByPrimaryKey(IaeArrival record);

//    @Select("select * from iae_arrival where CargoAddress like #{}")
//    public List<IaeArrival> Orderlist(String CargoAddress);
}
