package com.sor.mapper;

import com.sor.entity.SorCheckBound;
import com.sor.entity.SorCheckBoundExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SorCheckBoundMapper {


    @Delete("delete from SOR_CheckBound where id=#{id}")
    void deleteCheckBound(String id);

    long countByExample(SorCheckBoundExample example);

    int deleteByExample(SorCheckBoundExample example);

    int insert(SorCheckBound record);

    int insertSelective(SorCheckBound record);

    List<SorCheckBound> selectByExample(SorCheckBoundExample example);

    int updateByExampleSelective(@Param("record") SorCheckBound record, @Param("example") SorCheckBoundExample example);

    int updateByExample(@Param("record") SorCheckBound record, @Param("example") SorCheckBoundExample example);
}