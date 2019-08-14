package com.hsq.mapper;

import com.hsq.entity.BasPartition;
import com.hsq.entity.BasPartitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasPartitionMapper {
    long countByExample(BasPartitionExample example);

    int deleteByExample(BasPartitionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasPartition record);

    int insertSelective(BasPartition record);

    List<BasPartition> selectByExample(BasPartitionExample example);

    BasPartition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasPartition record, @Param("example") BasPartitionExample example);

    int updateByExample(@Param("record") BasPartition record, @Param("example") BasPartitionExample example);

    int updateByPrimaryKeySelective(BasPartition record);

    int updateByPrimaryKey(BasPartition record);
}
