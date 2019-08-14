package com.hsq.mapper;

import com.hsq.entity.BasBasicArchivesEntry;
import com.hsq.entity.BasBasicArchivesEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BasBasicArchivesEntryMapper {
    long countByExample(BasBasicArchivesEntryExample example);

    int deleteByExample(BasBasicArchivesEntryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasBasicArchivesEntry record);

    int insertSelective(BasBasicArchivesEntry record);

    List<BasBasicArchivesEntry> selectByExample(BasBasicArchivesEntryExample example);

    BasBasicArchivesEntry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasBasicArchivesEntry record, @Param("example") BasBasicArchivesEntryExample example);

    int updateByExample(@Param("record") BasBasicArchivesEntry record, @Param("example") BasBasicArchivesEntryExample example);

    int updateByPrimaryKeySelective(BasBasicArchivesEntry record);

    int updateByPrimaryKey(BasBasicArchivesEntry record);

}
