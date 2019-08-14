package com.lm.service.acc.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lm.entity.acc.AccBusinessAdmissibility;
import com.lm.entity.acc.AccBusinessAdmissibilityExample;
import com.lm.mapper.acc.AccBusinessAdmissibilityMapper;
import com.lm.service.acc.AccBusinessAdmissibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("accBusinessAdmissibilityService")
public class AccBusinessAdmissibilityServiceImpl implements AccBusinessAdmissibilityService {

    @Autowired
    private AccBusinessAdmissibilityMapper accBusinessAdmissibilityMapper;

    @Override
    public Map list(String BusinessNoticeNo,String CustomCode, Integer page, Integer limit) {
        AccBusinessAdmissibilityExample example=new AccBusinessAdmissibilityExample();
        AccBusinessAdmissibilityExample.Criteria criteria=example.createCriteria();
        if(BusinessNoticeNo!=null&&BusinessNoticeNo!=""){
            criteria.andBusinessnoticenoLike("%"+BusinessNoticeNo+"%");
        }
        if(CustomCode!=null && CustomCode!=""){
            criteria.andCustomcodeLike("%"+CustomCode+"%");
        }
        Page p= PageHelper.startPage(page,limit,true);
        Map<String,Object> map=new HashMap<>();
        accBusinessAdmissibilityMapper.selectByExample(example);
        map.put("items",p.getResult());
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public Map lists(String businessnoticeno, String customcode, Integer page, Integer limit) {
        AccBusinessAdmissibilityExample example=new AccBusinessAdmissibilityExample();
        AccBusinessAdmissibilityExample.Criteria criteria=example.createCriteria();
        if(businessnoticeno!=null&&businessnoticeno!=""){
            criteria.andBusinessnoticenoLike("%"+businessnoticeno+"%");
        }
        if(customcode!=null && customcode!=""){
            criteria.andCustomcodeLike("%"+customcode+"%");
        }
        Page p= PageHelper.startPage(page,limit,true);
        Map<String,Object> map=new HashMap<>();
        accBusinessAdmissibilityMapper.selectByExample(example);
        map.put("items",p.getResult());
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public String SelectMaxNo() {
        return accBusinessAdmissibilityMapper.SelectMaxNo();
    }

    @Override
    public void insert(AccBusinessAdmissibility accBusinessAdmissibility) {
        accBusinessAdmissibilityMapper.insert(accBusinessAdmissibility);
    }

    @Override
    public int update(AccBusinessAdmissibility accBusinessAdmissibility) {
        return accBusinessAdmissibilityMapper.updateByPrimaryKeySelective(accBusinessAdmissibility);
    }

    @Override
    public void delete(int id) {
        accBusinessAdmissibilityMapper.deleteByPrimaryKey(id);
    }
}
