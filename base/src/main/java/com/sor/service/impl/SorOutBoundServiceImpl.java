package com.sor.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysUser;
import com.sor.entity.SorOutBound;
import com.sor.entity.SorOutBoundDetails;
import com.sor.entity.SorOutBoundExample;
import com.sor.entity.SorOutBoundType;
import com.sor.mapper.SorOutBoundMapper;
import com.sor.mapper.SorStorageDetailsMapper;
import com.sor.mapper.SorStorageMapper;
import com.sor.service.SorOutBoundService;
import com.sor.entity.*;
import com.sor.mapper.SorOutBoundDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SorOutBoundServiceImpl implements SorOutBoundService {
    @Autowired
    private SorOutBoundMapper sorOutBoundMapper;

    @Autowired
    private SorOutBoundDetailsMapper sorOutBoundDetailsMapper;

    @Autowired
    private SorStorageDetailsMapper sorStorageDetailsMapper;

    @Autowired
    private SorStorageMapper sorStorageMapper;

    @Override
    public List<SorOutBoundType> SorOutBoundTypeList() {
        return sorOutBoundMapper.typeList();
    }

    /**
     * 新增出库和出库交接单
     * @param sorOutBound
     */
    @Override
    public void insertSorOutBount(SorOutBound sorOutBound) {
        sorOutBound.setId("CKJJD"+new Date().getTime());

        if(sorOutBound!=null){
            for(SorOutBoundDetails sd: sorOutBound.getDomains()){
                if(sd!=null){
                    if(sd.getIsdoublestorage()==null){
                        sd.setIsdoublestorage(false);
                    }
                    if(sd.getIsnextstorage()==null){
                        sd.setIsdoublestorage(false);
                    }
                    sd.setSorOutBoundId(sorOutBound.getId());
                    sorOutBoundDetailsMapper.insert(sd);
                    // 新增出库的时候，修改单号的出库交接单
                   SorStorageDetails sorStorageDetails= sorStorageDetailsMapper.getDetailById(sd.getId());
                    sorStorageDetails.setOutboundid(sorOutBound.getId());
                    sorStorageDetailsMapper.updateByIdUpdateout(sorStorageDetails);

                }
            }

            sorOutBoundMapper.insert(sorOutBound);
        }
    }

    @Override
    public void updateSorOutBount(SorOutBound sorOutBound) {
        SorOutBoundExample example = new SorOutBoundExample();
        SorOutBoundExample.Criteria criteria = example.createCriteria();
        if(sorOutBound!=null){
            if(sorOutBound.getId()!=null){
                criteria.andIdLike("%"+sorOutBound.getId()+"%");
            }
            // 还可以添加其他属性的条件
        }
        sorOutBoundMapper.updateByExampleSelective(sorOutBound,example);
    }

    @Override
    public void deletesorOutBount(String id) {
        sorOutBoundMapper.deleteToSorOutBound(id);
    }

    /**
     * 分页条件查询
     * @param sorOutBound
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public Map pageOutBound(SorOutBound sorOutBound, Integer pageSize, Integer pageNum) {
        SorOutBoundExample example = new SorOutBoundExample();
        SorOutBoundExample.Criteria criteria = example.createCriteria();
        if(sorOutBound!=null){
            if(sorOutBound.getId()!=null){
                criteria.andIdLike("%"+sorOutBound.getId()+"%");
            }
            // 还可以添加其他属性的条件
        }

        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(pageSize,pageNum);
        List<SorOutBound> list =  sorOutBoundMapper.selectByExample(example);
        for(SorOutBound storage : list){
          SorOutBoundType sorOutBoundType= sorOutBoundMapper.getTypeBy(storage.getHandovertype());
          storage.setTypeName(sorOutBoundType.getTypeName());
          SysUser user =sorStorageMapper.getnameByid(storage.getAcceptperson());
            storage.setAcceptPersonUsername(user.getUsername());
            SysUser user2 =sorStorageMapper.getnameByid(storage.getDeliveryperson());
            storage.setDeliveryPersonUsername(user2.getUsername());
        }
        PageInfo page = new PageInfo(list);
        map.put("items",list);
        map.put("total",page.getTotal());
        return map;
    }
}
