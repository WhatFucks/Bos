package com.lm.mapper.acc;

import com.lm.entity.acc.DisWorkOrderSign;
import com.lm.entity.acc.DisWorkOrderSignExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DisWorkOrderSignMapper {
    long countByExample(DisWorkOrderSignExample example);

    int deleteByExample(DisWorkOrderSignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DisWorkOrderSign record);

    int insertSelective(DisWorkOrderSign record);

    List<DisWorkOrderSign> selectByExample(DisWorkOrderSignExample example);

    DisWorkOrderSign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DisWorkOrderSign record, @Param("example") DisWorkOrderSignExample example);

    int updateByExample(@Param("record") DisWorkOrderSign record, @Param("example") DisWorkOrderSignExample example);

    int updateByPrimaryKeySelective(DisWorkOrderSign record);

    int updateByPrimaryKey(DisWorkOrderSign record);
}
