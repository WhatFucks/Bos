package com.lm.mapper.dis;

import com.lm.entity.dis.DisWorkOrderSign;
import com.lm.entity.dis.DisWorkOrderSignExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DisWorkOrderSignMapper {
    // 查询最后一行数据
    @Select("select * from Dis_WorkOrderSign order by id desc limit 1")
    DisWorkOrderSign SelectSelectMaxNo();

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
