package com.sor.service.impl;


import com.lyb.entity.SysUser;
import com.sor.entity.SorCheckBoundDetails;
import com.sor.entity.SorCheckBoundDetailsCargoType;
import com.sor.mapper.SorCheckBoundDetailsMapper;
import com.sor.mapper.SorStorageMapper;
import com.sor.service.SorCheckBoundDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorCheckBoundDetailsServiceImpl implements SorCheckBoundDetailsService {

    @Autowired
    private SorCheckBoundDetailsMapper sorCheckBoundDetailsMapper;
    @Autowired
    private SorStorageMapper sorStorageMapper;

    @Override
    public List<SorCheckBoundDetailsCargoType> typeList() {
        return sorCheckBoundDetailsMapper.listType();
    }

    /**
     * 根据id查询盘库详情
     * @param id
     * @return
     */
    @Override
    public List<SorCheckBoundDetails> listById(String id) {
        List<SorCheckBoundDetails> list=sorCheckBoundDetailsMapper.listById(id);
        for(SorCheckBoundDetails sd: list){
            // 类型
            SorCheckBoundDetailsCargoType type= sorCheckBoundDetailsMapper.listTypeById(sd.getCargotype());
            sd.setTypeName(type.getName());
            // 名字
          SysUser user= sorStorageMapper.findById(sd.getStorageperson());
          sd.setPersonName(user.getUsername());
        }
        return list;
    }
}
