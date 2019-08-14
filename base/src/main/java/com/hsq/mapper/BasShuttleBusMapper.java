package com.hsq.mapper;

import com.hsq.entity.BasShuttleBus;
import com.hsq.entity.BasShuttleBusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasShuttleBusMapper {
    long countByExample(BasShuttleBusExample example);

    int deleteByExample(BasShuttleBusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasShuttleBus record);

    int insertSelective(BasShuttleBus record);

    List<BasShuttleBus> selectByExample(BasShuttleBusExample example);

    BasShuttleBus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasShuttleBus record, @Param("example") BasShuttleBusExample example);

    int updateByExample(@Param("record") BasShuttleBus record, @Param("example") BasShuttleBusExample example);

    int updateByPrimaryKeySelective(BasShuttleBus record);

    int updateByPrimaryKey(BasShuttleBus record);
}
