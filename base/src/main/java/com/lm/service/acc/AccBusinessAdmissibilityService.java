package com.lm.service.acc;

import com.lm.entity.acc.AccBusinessAdmissibility;

import java.util.Map;

public interface AccBusinessAdmissibilityService {
    //查询所有业务受理
    public Map list(String BusinessNoticeNo, String CustomCode, Integer page, Integer limit);
    public Map lists(String businessnoticeno, String customcode, Integer page, Integer limit);
    public String SelectMaxNo();
    //添加业务受理
    public void insert(AccBusinessAdmissibility accBusinessAdmissibility);

    //修改业务受理
    public int update(AccBusinessAdmissibility accBusinessAdmissibility);

    //删除业务受理
    public void delete(int id);

}
