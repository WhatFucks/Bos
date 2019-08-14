package com.lm.mapper.acc;

import com.lm.entity.acc.DisDispatchHistory;
import com.lm.entity.acc.DisDispatchHistoryExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DisDispatchHistoryMapper {
  @Select("select * from Dis_DispatchHistory order by id desc limit 1")
    DisDispatchHistory SelectMaxNo();
    long countByExample(DisDispatchHistoryExample example);

    int deleteByExample(DisDispatchHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DisDispatchHistory record);

    int insertSelective(DisDispatchHistory record);

    List<DisDispatchHistory> selectByExample(DisDispatchHistoryExample example);

    DisDispatchHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DisDispatchHistory record, @Param("example") DisDispatchHistoryExample example);

    int updateByExample(@Param("record") DisDispatchHistory record, @Param("example") DisDispatchHistoryExample example);

    int updateByPrimaryKeySelective(DisDispatchHistory record);

    int updateByPrimaryKey(DisDispatchHistory record);
}
