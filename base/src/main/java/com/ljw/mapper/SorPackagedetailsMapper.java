package com.ljw.mapper;

import com.ljw.entity.SorPackagedetails;
import com.ljw.entity.SorPackagedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SorPackagedetailsMapper {
    long countByExample(SorPackagedetailsExample example);

    int deleteByExample(SorPackagedetailsExample example);

    int insert(SorPackagedetails record);

    int insertSelective(SorPackagedetails record);

    List<SorPackagedetails> selectByExample(SorPackagedetailsExample example);

    int updateByExampleSelective(@Param("record") SorPackagedetails record, @Param("example") SorPackagedetailsExample example);

    int updateByExample(@Param("record") SorPackagedetails record, @Param("example") SorPackagedetailsExample example);

    @Select("select ImportantHints from sor_packagedetails")
    public List<String> select();
}
