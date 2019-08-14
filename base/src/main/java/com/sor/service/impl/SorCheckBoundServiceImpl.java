package com.sor.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysUser;
import com.sor.mapper.SorCheckBoundDetailsMapper;
import com.sor.mapper.SorStorageMapper;
import com.sor.service.SorCheckBoundService;
import com.sor.entity.SorCheckBound;
import com.sor.entity.SorCheckBoundDetails;
import com.sor.entity.SorCheckBoundExample;
import com.sor.mapper.SorCheckBoundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SorCheckBoundServiceImpl implements SorCheckBoundService {

    @Autowired
    private SorCheckBoundMapper sorCheckBoundMapper;

    @Autowired
    private SorCheckBoundDetailsMapper sorCheckBoundDetailsMapper;

    @Autowired
    private SorStorageMapper sorStorageMapper;



    @Override
    public void deleteCheckBound(String id) {
        sorCheckBoundMapper.deleteCheckBound(id);
    }

    @Override
    public void updateCheckBound(SorCheckBound sorCheckBound) {
        SorCheckBoundExample example = new SorCheckBoundExample();
        sorCheckBoundMapper.updateByExampleSelective(sorCheckBound,example);
    }

    /**
     * 新增盘库及盘库详情
     * @param sorCheckBound
     */
    @Override
    public void insertCheckBound(SorCheckBound sorCheckBound) {
        sorCheckBound.setCheckdate(new Date());
        sorCheckBound.setScanid(sorCheckBound.getCargosum()/2+2);
        sorCheckBound.setId("PK"+new Date().getTime());
        if(sorCheckBound.getDomains()!=null){
            for(SorCheckBoundDetails sd:sorCheckBound.getDomains()){
                if(sd!=null){
                    sd.setVolume(sd.getWeight()/2);
                    sd.setCheckId(sorCheckBound.getId());
                    sd.setStorageperson(Integer.valueOf(sorCheckBound.getCheckperson()));
                    sorCheckBoundDetailsMapper.insert(sd);
                }
            }
        }
                sorCheckBoundMapper.insert(sorCheckBound);
    }

    /**
     * 条件分页查询
     * @param sorCheckBound
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public Map sorCheckBoundPageList(SorCheckBound sorCheckBound,Integer pageSize, Integer pageNum) {
        SorCheckBoundExample example = new SorCheckBoundExample();
        SorCheckBoundExample.Criteria criteria = example.createCriteria();
        if(sorCheckBound!=null){
            if(sorCheckBound.getId()!=null){
                criteria.andIdLike("%"+sorCheckBound.getId()+"%");
            }
            // 还可以添加其他属性的条件
        }
        Map<String,Object> map = new HashMap<>();

        PageHelper.startPage(pageSize,pageNum);
        List<SorCheckBound> list =  sorCheckBoundMapper.selectByExample(example);
        for(SorCheckBound sd:list){
          SysUser user= sorStorageMapper.findById(Integer.valueOf(sd.getCheckperson()));
            sd.setCheckName(user.getUsername());
        }
        PageInfo page = new PageInfo(list);
        map.put("items",list);
        map.put("total",page.getTotal());
        return map;
    }
}
