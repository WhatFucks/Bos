package com.lj.mapper.reportforms;

import com.lj.entity.reportforms.Smallpart;
import com.lj.entity.reportforms.SmallpartExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SmallpartMapper {
    //查询小件员的数量
    @Select("select smallpartcount from small_part")
    public int[] selectSmall();

    int countByExample(SmallpartExample example);

    int deleteByExample(SmallpartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Smallpart record);

    int insertSelective(Smallpart record);

    List<Smallpart> selectByExample(SmallpartExample example);

    Smallpart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Smallpart record, @Param("example") SmallpartExample example);

    int updateByExample(@Param("record") Smallpart record, @Param("example") SmallpartExample example);

    int updateByPrimaryKeySelective(Smallpart record);

    int updateByPrimaryKey(Smallpart record);
}