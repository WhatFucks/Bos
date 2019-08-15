package com.ljw.service.impl;

import com.ljw.entity.SorCheckbounddetails;
import com.ljw.mapper.SorCheckbounddetailsMapper;
import com.ljw.service.SorCheckbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorCheckbounddetailsServiceImpl implements SorCheckbounddetailsService {
    @Autowired
    private SorCheckbounddetailsMapper sorCheckbounddetailsMapper;
    public List<SorCheckbounddetails> select (){
        return sorCheckbounddetailsMapper.select();
    }
    @Override
    public SorCheckbounddetails selectById (String id){
        return sorCheckbounddetailsMapper.selectById(id);
    }
}
