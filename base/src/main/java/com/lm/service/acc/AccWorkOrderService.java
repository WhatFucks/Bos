package com.lm.service.acc;

import com.lm.entity.acc.AccWorkOrder;
import com.lm.entity.dis.Dispatch;

import java.util.List;
import java.util.Map;

public interface AccWorkOrderService {
    //添加工单
    public void insert(AccWorkOrder accWorkOrder);
    //修改工单
    public void update(AccWorkOrder accWorkOrder);
    //删除工单
    public void delete(int id);
    // 获取最大编号 实体
    AccWorkOrder SelectMaxNo();
    // 根据业务通知单号
    AccWorkOrder ByNoSelect(String dh);
    // 根据业务通知单号 查询
    List<AccWorkOrder> ByNoSelectAll(String dh);
    // 根据业务通知单号 删除
    int SelectByNoDelete(String dh);
    // 查询工作单
    Map SelectAccWorkOrder(String workSheetNo, String wsJobNo, Integer page, Integer limit);
    // 调度查询
    Map selectDispatch(Dispatch dispatch, Integer page, Integer limit);
    // 查询所有
    List<AccWorkOrder> SortingCodeAll();
}
