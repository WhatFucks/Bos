package com.hsq.mapper;

import com.hsq.entity.BasZoneCustomInfo;
import com.hsq.entity.BasZoneCustomInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasZoneCustomInfoMapper {
    long countByExample(BasZoneCustomInfoExample example);

    int deleteByExample(BasZoneCustomInfoExample example);

    int deleteByPrimaryKey(Integer customcode);

    int insert(BasZoneCustomInfo record);

    int insertSelective(BasZoneCustomInfo record);

    List<BasZoneCustomInfo> selectByExample(BasZoneCustomInfoExample example);

    BasZoneCustomInfo selectByPrimaryKey(Integer customcode);

    int updateByExampleSelective(@Param("record") BasZoneCustomInfo record, @Param("example") BasZoneCustomInfoExample example);

    int updateByExample(@Param("record") BasZoneCustomInfo record, @Param("example") BasZoneCustomInfoExample example);

    int updateByPrimaryKeySelective(BasZoneCustomInfo record);

    int updateByPrimaryKey(BasZoneCustomInfo record);
}
