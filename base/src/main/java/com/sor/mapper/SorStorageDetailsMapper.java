package com.sor.mapper;

import com.sor.entity.SorStorageDetails;
import com.sor.entity.SorStorageDetailsExample;
import com.sor.entity.SorWorksheet;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorStorageDetailsMapper {


    /**
     * 根据id，修改入库状态
     * @param id
     * @return
     */
    @Update("update sor_storagedetails set State=2 where id=#{id}")
    SorStorageDetails updateDetailByIdTo2(String id);

    @Update("update sor_storagedetails set State=1 where id=#{id}")
    SorStorageDetails updateDetailByIdTo1(String id);

    @Update("update sor_storagedetails set State=0 where id=#{id}")
    SorStorageDetails updateDetailByIdTo0(String id);

    @Select("select id,PackageID,weight,OutBoundID,State,storageid from sor_storagedetails where id=#{id} ")
    SorStorageDetails getDetailById(String id);
    /**
     * 根据单号获取单号的信息
     * @return
     */
    @Select("select id,workSheetNo,jobNo,destination,productTime,Total,weight,stowageRequirements from acc_worksheet where WorkSheetNo=#{id}")
    SorWorksheet getByWorksheetId(String id);

    @Select("select * from sor_storagedetails")
    List<SorStorageDetails> sorStorageDetail();

    @Select("select id,PackageID,weight,OutBoundID,State,storageid from sor_storagedetails ")
    List<SorStorageDetails> findByStorageIdWeight();
    /**
     * 根据入库交接单查询详情
     * @param storageid
     * @return
     */
    @Select("select id,PackageID,weight,OutBoundID,State,storageid from sor_storagedetails where storageid=#{storageid}")
    List<SorStorageDetails> findByStorageId(String storageid);

    long countByExample(SorStorageDetailsExample example);

    int deleteByExample(SorStorageDetailsExample example);

    int insert(SorStorageDetails record);

    int insertSelective(SorStorageDetails record);

    List<SorStorageDetails> selectByExample(SorStorageDetailsExample example);

    int updateByExampleSelective(@Param("record") SorStorageDetails record, @Param("example") SorStorageDetailsExample example);

    int updateByExample(@Param("record") SorStorageDetails record, @Param("example") SorStorageDetailsExample example);
}