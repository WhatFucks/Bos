package com.ljw.service;

import java.util.Map;

public interface IaeArrivalService {
    public Map<String,Object> select(String id, String workaddress, Integer page, Integer limit);
}
