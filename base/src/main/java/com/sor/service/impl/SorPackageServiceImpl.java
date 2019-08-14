package com.sor.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysUser;
import com.sor.entity.SorPackageDetails;
import com.sor.mapper.SorPackageMapper;
import com.sor.mapper.SorStorageMapper;
import com.sor.entity.SorPackage;
import com.sor.entity.SorPackageExample;
import com.sor.mapper.SorPackageDetailsMapper;
import com.sor.service.SorPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SorPackageServiceImpl implements SorPackageService {
    @Autowired
    private SorPackageMapper sorPackageMapper;

    @Autowired
    private SorPackageDetailsMapper sorPackageDetails;

    @Autowired
    private SorStorageMapper sorStorageMapper;

    @Override
    public void chaiCheck(String id) {
        sorPackageMapper.chaiCheck(id);
    }

    @Override
    public SorPackage queryAllById(String id) {
        return sorPackageMapper.queryAllById(id);
    }

    /**
     * 新增合包，以及合包新增
     * @param sorPackage
     */
    @Override
    public void insertPackage(SorPackage sorPackage) {
        sorPackage.setId("HBH"+new Date().getTime());
        // 计算 件数 重量 体积 票数
        int Cargo=0;
        Long Weights=new Long(0);
        Long Volume=new Long(0);
        int Ticket=0;
        if(sorPackage!=null){
            if(sorPackage.getDomains()!=null){
                for(SorPackageDetails sd:sorPackage.getDomains()){
                    // 从一的一方复制数据
                    sd.setService(sorPackage.getTimelimit());
                    sd.setDestination(sorPackage.getDestination());
                    sd.setPackageId(sorPackage.getId());
                    // 判断不能为空的计算
                    if(sd.getTicket()!=null && sd.getCargoint()!=null && sd.getWeight()!=null && sd.getVolume()!=null){
                        Cargo+=sd.getCargoint();
                        Weights+=sd.getWeight();
                        Volume+=sd.getVolume();
                        Ticket+=sd.getTicket();
                    }
                    sorPackageDetails.insert(sd);
                }
            }
            // 赋值总数
            sorPackage.setWeightsum(Weights);
            sorPackage.setVolumesum(Volume);
            sorPackage.setTicketsum(Ticket);
            sorPackage.setCargosum(Cargo);
            sorPackageMapper.insert(sorPackage);
        }

    }

    /**
     * 分页条件查下
     * @param sorPackage
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public Map pageList(SorPackage sorPackage, Integer pageSize, Integer pageNum) {
        SorPackageExample example = new SorPackageExample();
        SorPackageExample.Criteria criteria = example.createCriteria();
        if(sorPackage!=null){
            if(sorPackage.getId()!=null){
                criteria.andIdLike("%"+sorPackage.getId()+"%");
            }
            // 还可以添加其他属性的条件
        }
        Map<String,Object> map = new HashMap<>();

        PageHelper.startPage(pageSize,pageNum);
        List<SorPackage> list =  sorPackageMapper.selectByExample(example);
        for(SorPackage sd:list){
            SysUser user= sorStorageMapper.findById(sd.getPackageperson());
            sd.setPeroName(user.getUsername());
        }
        PageInfo page = new PageInfo(list);
        map.put("items",list);
        map.put("total",page.getTotal());
        return map;
    }
}
