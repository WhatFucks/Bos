package com.lyb.mapper;

import com.lyb.entity.PacPackaging;
import com.lyb.entity.PacPackagingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PacPackagingMapper {
    long countByExample(PacPackagingExample example);

    int deleteByExample(PacPackagingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PacPackaging record);

    int insertSelective(PacPackaging record);

    List<PacPackaging> selectByExample(PacPackagingExample example);

    PacPackaging selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PacPackaging record, @Param("example") PacPackagingExample example);

    int updateByExample(@Param("record") PacPackaging record, @Param("example") PacPackagingExample example);

    int updateByPrimaryKeySelective(PacPackaging record);

    int updateByPrimaryKey(PacPackaging record);
}