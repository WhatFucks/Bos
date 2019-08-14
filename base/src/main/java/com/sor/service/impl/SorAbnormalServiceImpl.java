package com.sor.service.impl;


import com.sor.service.SorAbnormalService;
import com.sor.entity.SorAbnormal;
import com.sor.mapper.SorAbnormalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorAbnormalServiceImpl implements SorAbnormalService {

    @Autowired
    private SorAbnormalMapper sorAbnormalMapper;

    @Override
    public List<SorAbnormal> listAll() {
        return sorAbnormalMapper.listAll();
    }

    @Override
    public void updateById(String id) {
        sorAbnormalMapper.updateById(id);
    }

    @Override
    public void deleteById(String id) {
        sorAbnormalMapper.deleteById(id);
    }

    @Override
    public SorAbnormal findById(String id) {
        return sorAbnormalMapper.findById(id);
    }

    @Override
    public void insertSorAbnormal(SorAbnormal sorAbnormal) {
        sorAbnormalMapper.insert(sorAbnormal);
    }
}
