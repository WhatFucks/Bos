package com.ljw.service.impl;

import com.ljw.mapper.SorPackagedetailsMapper;
import com.ljw.service.SorPackagedetailsService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorPackagedetailsServiceImpl implements SorPackagedetailsService {
    @Autowired
    private SorPackagedetailsMapper sorPackagedetailsMapper;
    @Override
    public List<String> select(){
        return sorPackagedetailsMapper.select();
    }
}
