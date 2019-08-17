package com.lj.service.impl.reportforms;


import com.lj.mapper.reportforms.SmallpartMapper;
import com.lj.service.reportforms.SmallpartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmallpartServiceImpl implements SmallpartService {

    @Autowired
    private SmallpartMapper smallpartMapper;

    @Override
    public int[] selectSmall() {
        return smallpartMapper.selectSmall();
    }
}
