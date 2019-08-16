package com.hsq.mapper;

import com.hsq.entity.BasProvince;
import com.hsq.entity.BasProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasProvinceMapper {
    long countByExample(BasProvinceExample example);

    int deleteByExample(BasProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasProvince record);

    int insertSelective(BasProvince record);

    List<BasProvince> selectByExample(BasProvinceExample example);

    BasProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasProvince record, @Param("example") BasProvinceExample example);

    int updateByExample(@Param("record") BasProvince record, @Param("example") BasProvinceExample example);

    int updateByPrimaryKeySelective(BasProvince record);

    int updateByPrimaryKey(BasProvince record);
}