package com.ljw.service;

import com.ljw.entity.IaeLineresource;

import java.util.List;
import java.util.Map;

public interface IaeLineresourceService {
    public Map<String,Object> select(String itemcode, String port, Integer page, Integer limit);
    public IaeLineresource findById(String id);
}
