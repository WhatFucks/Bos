package com.lm.service.acc.impl;

import com.lm.entity.acc.DisDispatchHistory;
import com.lm.mapper.acc.DisDispatchHistoryMapper;
import com.lm.service.acc.DisDispatchhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisDispatchhistoryServiceImpl implements DisDispatchhistoryService {
    @Autowired
    private DisDispatchHistoryMapper disDispatchHistoryMapper;
    @Override
    public void insert(DisDispatchHistory disDispatchHistory) {
        disDispatchHistoryMapper.insert(disDispatchHistory);
    }

    @Override
    public void update(DisDispatchHistory disDispatchHistory) {
      disDispatchHistoryMapper.updateByPrimaryKeySelective(disDispatchHistory);
    }

    @Override
    public DisDispatchHistory SelectMaxNo() {
      return disDispatchHistoryMapper.SelectMaxNo();
    }
}
