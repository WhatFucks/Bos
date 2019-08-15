package com.ljw.mapper;

import com.ljw.entity.IaeLineresource;
import com.ljw.entity.IaeLineresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IaeLineresourceMapper {
    long countByExample(IaeLineresourceExample example);

    int deleteByExample(IaeLineresourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(IaeLineresource record);

    int insertSelective(IaeLineresource record);

    List<IaeLineresource> selectByExample(IaeLineresourceExample example);

    IaeLineresource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IaeLineresource record, @Param("example") IaeLineresourceExample example);

    int updateByExample(@Param("record") IaeLineresource record, @Param("example") IaeLineresourceExample example);

    int updateByPrimaryKeySelective(IaeLineresource record);

    int updateByPrimaryKey(IaeLineresource record);
}