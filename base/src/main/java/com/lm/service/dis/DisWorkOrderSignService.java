package com.lm.service.dis;

import com.lm.entity.dis.DisWorkOrderSign;

import java.util.Map;

public interface DisWorkOrderSignService {
  // 查询最后一行数据
  DisWorkOrderSign SelectSelectMaxNo();
   // 查询所有
  public Map getList(Integer page, Integer limit);
  //添加
  public void insert(DisWorkOrderSign disWorkOrderSign);
  //修改
  public void update(DisWorkOrderSign disWorkOrderSign);
  //删除
  public void delete(Integer id);
}
