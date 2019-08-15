package com.ljw.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ljw.entity.PacPackaging;
import com.ljw.entity.PacPackagingExample;
import com.ljw.mapper.LjwPacPackagingMapper;
import com.ljw.service.LjwPacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class LjwPacPackagingServiceImpl implements LjwPacPackagingService {
    @Autowired
    private LjwPacPackagingMapper ljwPacPackagingMapper;
    @Override
    public Map<String,Object> select(String itemcode,String itemname, Integer page, Integer limit){
        Map<String,Object> map=new HashMap<>();
        PageHelper helper=new PageHelper();
        Page p=helper.startPage(page,limit);
        PacPackagingExample example=new PacPackagingExample();
        PacPackagingExample.Criteria criteria=example.createCriteria();
        if (itemcode!=null && itemcode.trim()!=""){
            criteria.andItemcodeLike("%"+itemcode+"%");
        }
        if (itemname!=null && itemname.trim()!=""){
            criteria.andItemnameLike("%"+itemname+"%");
        }
        criteria.andStatusEqualTo(1);
        List<PacPackaging> list=ljwPacPackagingMapper.selectByExample(example);
        if (list!=null){
            map.put("total",p.getTotal());
            map.put("items",list);
        }
        return map;
    }
    @Override
    public void insert(PacPackaging pacPackaging){
        ljwPacPackagingMapper.insert(pacPackaging);
    }
    @Override
    public void update(PacPackaging pacPackaging){
        ljwPacPackagingMapper.updateByPrimaryKey(pacPackaging);
    }
    @Override
    public void delete(Integer id){
        PacPackagingExample example=new PacPackagingExample();
        PacPackagingExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(id);
        ljwPacPackagingMapper.deleteByExample(example);
    }
    @Override
    public PacPackaging selectById(Integer id){
        return ljwPacPackagingMapper.selectByPrimaryKey(id);
    }
    @Override
    public String selectMaxItemCode(){
        String s=ljwPacPackagingMapper.selectByMaxItemCode();
        return s;
    }
    @Override
    public List<PacPackaging> selectPackaging(String itemname){
        return  ljwPacPackagingMapper.selectPackaging(itemname);
    }
    @Override
    public Set<PacPackaging> selectSpecifications(){
        return ljwPacPackagingMapper.selectSpecifications();
    }
}
