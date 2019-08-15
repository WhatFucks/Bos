package com.hsq.mapper;

import com.hsq.entity.BasDeliveryStandard;
import com.hsq.entity.BasDeliveryStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasDeliveryStandardMapper {

    long countByExample(BasDeliveryStandardExample example);

    int deleteByExample(BasDeliveryStandardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasDeliveryStandard record);

    int insertSelective(BasDeliveryStandard record);

    List<BasDeliveryStandard> selectByExample(BasDeliveryStandardExample example);

    BasDeliveryStandard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasDeliveryStandard record, @Param("example") BasDeliveryStandardExample example);

    int updateByExample(@Param("record") BasDeliveryStandard record, @Param("example") BasDeliveryStandardExample example);

    int updateByPrimaryKeySelective(BasDeliveryStandard record);

    int updateByPrimaryKey(BasDeliveryStandard record);
}
