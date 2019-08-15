package com.ljw.mapper;

import com.ljw.entity.IaeTimeinput;
import com.ljw.entity.IaeTimeinputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IaeTimeinputMapper {
    long countByExample(IaeTimeinputExample example);

    int deleteByExample(IaeTimeinputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IaeTimeinput record);

    int insertSelective(IaeTimeinput record);

    List<IaeTimeinput> selectByExample(IaeTimeinputExample example);

    IaeTimeinput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IaeTimeinput record, @Param("example") IaeTimeinputExample example);

    int updateByExample(@Param("record") IaeTimeinput record, @Param("example") IaeTimeinputExample example);

    int updateByPrimaryKeySelective(IaeTimeinput record);

    int updateByPrimaryKey(IaeTimeinput record);
}