package com.ljw.service;

import com.ljw.entity.PacPackaging;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface LjwPacPackagingService {
    public Map<String,Object> select(String itemcode, String itemname, Integer page, Integer limit);
    public void delete(Integer id);
    public void update(PacPackaging pacPackaging);
    public void insert(PacPackaging pacPackaging);
    public PacPackaging selectById(Integer id);
    public String selectMaxItemCode();
    public List<PacPackaging> selectPackaging(String itemname);
    public Set<PacPackaging> selectSpecifications();
}
