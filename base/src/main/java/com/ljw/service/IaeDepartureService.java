package com.ljw.service;

import com.ljw.entity.SorCheckbounddetails;

import java.util.List;
import java.util.Map;

public interface IaeDepartureService {
    public Map<String,Object> select(String id, String destination, Integer page, Integer limit);
    public List<SorCheckbounddetails> list(String sid);
    public List<String> selectusername(Long id);
}
