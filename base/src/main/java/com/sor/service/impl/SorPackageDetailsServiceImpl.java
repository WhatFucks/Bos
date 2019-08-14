package com.sor.service.impl;


import com.sor.entity.SorPackageDetails;
import com.sor.service.SorPackageDetailsService;
import com.sor.mapper.SorPackageDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorPackageDetailsServiceImpl implements SorPackageDetailsService {

    @Autowired
    private SorPackageDetailsMapper sorPackageDetailsMapper;

    @Override
    public List<SorPackageDetails> findById(String id) {

        return sorPackageDetailsMapper.listById(id);
    }
}
