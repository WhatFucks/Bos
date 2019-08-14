package com.ljw.mapper;

import com.ljw.entity.PacPackaging;
import com.ljw.entity.PacPackagingExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LjwPacPackagingMapper {
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

    @Select("select ItemCode from pac_packaging order by id desc limit 1")
    public String selectByMaxItemCode();

    @Select("select * from pac_packaging where ItemName=#{ItemName}")
    public List<PacPackaging> selectPackaging(String itemname);

    @Select("select Specifications from pac_packaging")
    public Set<PacPackaging> selectSpecifications();
}
