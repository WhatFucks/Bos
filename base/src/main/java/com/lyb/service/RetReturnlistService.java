package com.lyb.service;

import com.lyb.entity.RetReturnlist;
import com.lyb.general.PageEntity;

import java.util.Map;

public interface RetReturnlistService {
    public Map<String,Object> getRetReturnlist(PageEntity page, RetReturnlist ret);
    public Boolean addRetReturnlist(RetReturnlist ret);
    public Boolean updateRetReturnlist(RetReturnlist ret);
    public Boolean deleteRetReturnlist(Integer id);
    public Boolean confirm(RetReturnlist ret);
    public Boolean refuse(Integer id);
    public RetReturnlist findByID(Integer id);
    public String getApplicationNo();
    public Boolean isExistRetReturnlist(String worksheetno);
}
