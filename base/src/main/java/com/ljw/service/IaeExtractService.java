package com.ljw.service;

import com.ljw.entity.IaeExtract;

import java.util.Map;

public interface IaeExtractService {
    public Map<String,Object> select(String id, String vehicleint, Integer page, Integer limit);
    public Map<String,Object> selectIae(String id, Integer page, Integer limit);
    public void insert(IaeExtract iaeExtract);
}
