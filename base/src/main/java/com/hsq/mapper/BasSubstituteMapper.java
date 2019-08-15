package com.hsq.mapper;

import com.hsq.entity.BasSubstitute;
import com.hsq.entity.BasSubstituteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasSubstituteMapper {
    long countByExample(BasSubstituteExample example);

    int deleteByExample(BasSubstituteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasSubstitute record);

    int insertSelective(BasSubstitute record);

    List<BasSubstitute> selectByExample(BasSubstituteExample example);

    BasSubstitute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasSubstitute record, @Param("example") BasSubstituteExample example);

    int updateByExample(@Param("record") BasSubstitute record, @Param("example") BasSubstituteExample example);

    int updateByPrimaryKeySelective(BasSubstitute record);

    int updateByPrimaryKey(BasSubstitute record);
}
