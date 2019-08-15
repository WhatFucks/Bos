package com.ljw.mapper;

import com.ljw.entity.SorCheckbounddetails;
import com.ljw.entity.SorCheckbounddetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SorCheckbounddetailsMapper {
    long countByExample(SorCheckbounddetailsExample example);

    int deleteByExample(SorCheckbounddetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(SorCheckbounddetails record);

    int insertSelective(SorCheckbounddetails record);

    List<SorCheckbounddetails> selectByExample(SorCheckbounddetailsExample example);

    SorCheckbounddetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SorCheckbounddetails record, @Param("example") SorCheckbounddetailsExample example);

    int updateByExample(@Param("record") SorCheckbounddetails record, @Param("example") SorCheckbounddetailsExample example);

    int updateByPrimaryKeySelective(SorCheckbounddetails record);

    int updateByPrimaryKey(SorCheckbounddetails record);

    @Select("select * from sor_checkbounddetails")
    public List<SorCheckbounddetails> select();

    @Select("select * from sor_checkbounddetails where id=#{id}")
    public SorCheckbounddetails selectById(String id);
}
