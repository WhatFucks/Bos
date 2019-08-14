package com.lm.service.acc.impl;

import com.lm.entity.acc.BasAssociatemember;
import com.lm.mapper.acc.BasAssociatememberMapper;
import com.lm.service.acc.BasAssociatememberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasAssociatememberServiceImpl implements BasAssociatememberService {
    @Autowired
    private BasAssociatememberMapper basAssociatememberMapper;
    @Override
    public List<BasAssociatemember> list() {
        return basAssociatememberMapper.selectByExample(null);
    }
}
