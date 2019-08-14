package com.lj.service.logistics;

import com.lj.entity.logistics.BiglogLogisticscontroltable;
import com.lj.entity.logistics.BiglogLogisticscontroltable2;
import java.util.List;
import java.util.Map;

public interface BiglogLogisticscontroltableService {

    //查询工作单号
    public String selectWorkSheetNo();
    //查询货票号
    public  String selectWaybillID();
    //查询所有物流员工部门
    public Map biglogLogisticscontroltableList(BiglogLogisticscontroltable biglogLogisticscontroltable, Integer page, Integer limit);

    //添加物流
    public void biglogLogisticscontroltableAdd(BiglogLogisticscontroltable biglogLogisticscontroltable);

    //修改物流
    public  void biglogLogisticscontroltableUpdate(BiglogLogisticscontroltable2 biglogLogisticscontroltable);

    //删除物流
    public  void  biglogLogisticscontroltableDelete(Integer id);

}
