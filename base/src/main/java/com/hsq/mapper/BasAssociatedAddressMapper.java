package com.hsq.mapper;

import com.hsq.entity.BasAssociatedAddress;
import com.hsq.entity.BasAssociatedAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasAssociatedAddressMapper {
    long countByExample(BasAssociatedAddressExample example);

    int deleteByExample(BasAssociatedAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasAssociatedAddress record);

    int insertSelective(BasAssociatedAddress record);

    List<BasAssociatedAddress> selectByExample(BasAssociatedAddressExample example);

    BasAssociatedAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasAssociatedAddress record, @Param("example") BasAssociatedAddressExample example);

    int updateByExample(@Param("record") BasAssociatedAddress record, @Param("example") BasAssociatedAddressExample example);

    int updateByPrimaryKeySelective(BasAssociatedAddress record);

    int updateByPrimaryKey(BasAssociatedAddress record);
}
