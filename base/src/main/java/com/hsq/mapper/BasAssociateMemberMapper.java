package com.hsq.mapper;

import com.hsq.entity.BasAssociateMember;
import com.hsq.entity.BasAssociateMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasAssociateMemberMapper {
    long countByExample(BasAssociateMemberExample example);

    int deleteByExample(BasAssociateMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasAssociateMember record);

    int insertSelective(BasAssociateMember record);

    List<BasAssociateMember> selectByExample(BasAssociateMemberExample example);

    BasAssociateMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasAssociateMember record, @Param("example") BasAssociateMemberExample example);

    int updateByExample(@Param("record") BasAssociateMember record, @Param("example") BasAssociateMemberExample example);

    int updateByPrimaryKeySelective(BasAssociateMember record);

    int updateByPrimaryKey(BasAssociateMember record);
}
