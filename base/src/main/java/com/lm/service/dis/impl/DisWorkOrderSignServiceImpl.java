package com.lm.service.dis.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lm.entity.dis.DisWorkOrderSign;
import com.lm.entity.dis.DisWorkOrderSignExample;
import com.lm.mapper.dis.DisWorkOrderSignMapper;
import com.lm.service.dis.DisWorkOrderSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DisWorkOrderSignServiceImpl implements DisWorkOrderSignService {
  @Autowired
  private DisWorkOrderSignMapper disWorkOrderSignMapper;

  @Override
  public DisWorkOrderSign SelectSelectMaxNo() {
    return disWorkOrderSignMapper.SelectSelectMaxNo();
  }

  @Override
  public Map getList(Integer page, Integer limit) {
    DisWorkOrderSignExample example=new DisWorkOrderSignExample();
    DisWorkOrderSignExample.Criteria criteria=example.createCriteria();
    Page p= PageHelper.startPage(page,limit,true);
    Map<String,Object> map=new HashMap<>();
    disWorkOrderSignMapper.selectByExample(example);
    map.put("items",p.getResult());
    map.put("total",p.getTotal());
    return map;
  }

  @Override
  public void insert(DisWorkOrderSign disWorkOrderSign) {
    disWorkOrderSignMapper.insert(disWorkOrderSign);
  }

  @Override
  public void update(DisWorkOrderSign disWorkOrderSign) {
    disWorkOrderSignMapper.updateByPrimaryKeySelective(disWorkOrderSign);
  }

  @Override
  public void delete(Integer id) {
    disWorkOrderSignMapper.deleteByPrimaryKey(id);
  }
}
