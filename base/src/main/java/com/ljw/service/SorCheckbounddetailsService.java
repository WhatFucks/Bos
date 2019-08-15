package com.ljw.service;

import com.ljw.entity.SorCheckbounddetails;

import java.util.List;

public interface SorCheckbounddetailsService {
    public List<SorCheckbounddetails> select();
    public SorCheckbounddetails selectById(String id);
}
