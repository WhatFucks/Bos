package com.hsq.mapper;

import com.hsq.entity.BasArea;
import com.hsq.entity.BasAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasAreaMapper {
    long countByExample(BasAreaExample example);

    int deleteByExample(BasAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasArea record);

    int insertSelective(BasArea record);

    List<BasArea> selectByExample(BasAreaExample example);

    BasArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasArea record, @Param("example") BasAreaExample example);

    int updateByExample(@Param("record") BasArea record, @Param("example") BasAreaExample example);

    int updateByPrimaryKeySelective(BasArea record);

    int updateByPrimaryKey(BasArea record);
}
