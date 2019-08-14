package com.hsq.service.impl;

import com.hsq.entity.LogTrack;
import com.hsq.mapper.LogTrackMapper;
import com.hsq.service.LogTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogTrackServiceImpl implements LogTrackService {

    @Autowired
    private LogTrackMapper logTrackMapper;

    @Override
    public LogTrack findById(Integer id) {
        return logTrackMapper.selectByPrimaryKey(id);
    }
}
