package com.ljw.mapper;

import com.ljw.entity.IaeDeparture;
import com.ljw.entity.IaeDepartureExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface IaeDepartureMapper {
    long countByExample(IaeDepartureExample example);

    int deleteByExample(IaeDepartureExample example);

    int deleteByPrimaryKey(String id);

    int insert(IaeDeparture record);

    int insertSelective(IaeDeparture record);

    List<IaeDeparture> selectByExample(IaeDepartureExample example);

    IaeDeparture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IaeDeparture record, @Param("example") IaeDepartureExample example);

    int updateByExample(@Param("record") IaeDeparture record, @Param("example") IaeDepartureExample example);

    int updateByPrimaryKeySelective(IaeDeparture record);

    int updateByPrimaryKey(IaeDeparture record);

    @Select("select username from sys_user where id=#{id}")
    public List<String> selectusername(Long id);


}
