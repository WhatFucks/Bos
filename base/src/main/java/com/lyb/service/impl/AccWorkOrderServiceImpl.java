package com.lyb.service.impl;

import com.lyb.mapper.AccWorkOrderMapper;
import com.lyb.service.AccWorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccWorkOrderServiceImpl implements AccWorkOrderService {

    @Autowired
    private AccWorkOrderMapper accWorkOrderMapper;

}
