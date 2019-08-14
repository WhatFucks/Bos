package com.lj.service.reportforms;

public interface AccworkorderService {
    //查询工单表成功的
    public int succeedList();
    //查询工单表失败的
    public int defeatedList();
    //查询当前是几月
    public int dayList();

}
