package com.sor.service.impl;


import com.sor.service.SorOutBoundDetailsService;
import com.sor.entity.SorOutBoundDetails;
import com.sor.mapper.SorOutBoundDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorOutBoundDetailsServiceImpl implements SorOutBoundDetailsService {
    @Autowired
    private SorOutBoundDetailsMapper sorOutBoundDetailsMapper;

    @Override
    public List<SorOutBoundDetails> list(String id) {
        return sorOutBoundDetailsMapper.list(id);
    }
}
