package com.lm.mapper.dis;

import com.lm.entity.dis.BasZoneInfo;
import com.lm.entity.dis.BasZoneInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BasZoneInfoMapper {
  @Select("select * from bas_zoneinfo where id=#{id}")
    BasZoneInfo ByIdSelect(Integer id);
    long countByExample(BasZoneInfoExample example);

    int deleteByExample(BasZoneInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasZoneInfo record);

    int insertSelective(BasZoneInfo record);

    List<BasZoneInfo> selectByExample(BasZoneInfoExample example);

    BasZoneInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasZoneInfo record, @Param("example") BasZoneInfoExample example);

    int updateByExample(@Param("record") BasZoneInfo record, @Param("example") BasZoneInfoExample example);

    int updateByPrimaryKeySelective(BasZoneInfo record);

    int updateByPrimaryKey(BasZoneInfo record);
}
