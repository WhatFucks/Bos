package com.hsq.mapper;

import com.hsq.entity.BasBasicArchives;
import com.hsq.entity.BasBasicArchivesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasBasicArchivesMapper {
    long countByExample(BasBasicArchivesExample example);

    int deleteByExample(BasBasicArchivesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasBasicArchives record);

    int insertSelective(BasBasicArchives record);

    List<BasBasicArchives> selectByExample(BasBasicArchivesExample example);

    BasBasicArchives selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasBasicArchives record, @Param("example") BasBasicArchivesExample example);

    int updateByExample(@Param("record") BasBasicArchives record, @Param("example") BasBasicArchivesExample example);

    int updateByPrimaryKeySelective(BasBasicArchives record);

    int updateByPrimaryKey(BasBasicArchives record);
}
