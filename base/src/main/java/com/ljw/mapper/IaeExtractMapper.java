package com.ljw.mapper;

import com.ljw.entity.IaeExtract;
import com.ljw.entity.IaeExtractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IaeExtractMapper {
    long countByExample(IaeExtractExample example);

    int deleteByExample(IaeExtractExample example);

    int deleteByPrimaryKey(String id);

    int insert(IaeExtract record);

    int insertSelective(IaeExtract record);

    List<IaeExtract> selectByExample(IaeExtractExample example);

    IaeExtract selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IaeExtract record, @Param("example") IaeExtractExample example);

    int updateByExample(@Param("record") IaeExtract record, @Param("example") IaeExtractExample example);

    int updateByPrimaryKeySelective(IaeExtract record);

    int updateByPrimaryKey(IaeExtract record);
}