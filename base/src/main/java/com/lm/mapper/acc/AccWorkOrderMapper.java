package com.lm.mapper.acc;

import com.lm.entity.acc.Acc;
import com.lm.entity.acc.AccWorkOrder;
import com.lm.entity.acc.AccWorkOrderExample;
import com.lm.entity.dis.Dispatch;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccWorkOrderMapper {
    // 获取最后一行 获得编号
    @Select("select * from acc_workorder order by id desc limit 1")
    AccWorkOrder SelectMaxNo();

    // 根据业务通知单号 最后一行
    @Select("select * from acc_workorder WHERE BusinessNoticeNo=#{dh} order by id desc limit 1 ")
    AccWorkOrder ByNoSelect(String dh);

    // 根据业务通知单号 查询
    @Select("select * from acc_workorder WHERE BusinessNoticeNo=#{dh}")
    List<AccWorkOrder> ByNoSelectAll(String dh);

    // 根据业务通知单号 删除
    @Delete("delete from acc_workorder where BusinessNoticeNo=#{dh} and Pickupstatus=1")
    int SelectByNoDelete(String dh);

    // 查询工作单
    List<Acc> SelectAccWorkOrder();
    // 查询 调度
    List<Dispatch> selectDispatch(Dispatch dispatch);

    long countByExample(AccWorkOrderExample example);

    int deleteByExample(AccWorkOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccWorkOrder record);

    int insertSelective(AccWorkOrder record);

    List<AccWorkOrder> selectByExample(AccWorkOrderExample example);

    AccWorkOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccWorkOrder record, @Param("example") AccWorkOrderExample example);

    int updateByExample(@Param("record") AccWorkOrder record, @Param("example") AccWorkOrderExample example);

    int updateByPrimaryKeySelective(AccWorkOrder record);

    int updateByPrimaryKey(AccWorkOrder record);
}