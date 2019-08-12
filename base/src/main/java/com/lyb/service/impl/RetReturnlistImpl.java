package com.lyb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.RetReturnlist;
import com.lyb.entity.RetReturnlistExample;
import com.lyb.general.PageEntity;
import com.lyb.mapper.RetReturnlistMapper;
import com.lyb.service.RetReturnlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RetReturnlistImpl implements RetReturnlistService {
    @Autowired
    private RetReturnlistMapper retReturnlistMapper;

    @Override
    public Map<String, Object> getRetReturnlist(PageEntity page, RetReturnlist ret) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(page.getPageNum(),page.getPageSize(),true);
        RetReturnlistExample example = null;
        if(ret != null){
            example = new RetReturnlistExample();
            // 申请单号
            if(ret.getApplicationno() != null && ret.getApplicationno().trim() != ""){
                example.createCriteria().andApplicationnoLike("%"+ret.getApplicationno()+"%");
            }
            // 工作单号
            if(ret.getWorksheetno() != null && ret.getWorksheetno().trim() != ""){
                example.createCriteria().andWorksheetnoLike("%"+ret.getWorksheetno()+"%");
            }
            // 作废标志
            if(ret.getInvalidatesign() != null ){
                example.createCriteria().andInvalidatesignEqualTo(ret.getInvalidatesign());
            }
            // 返货处理状态(申请单状态)
            if(ret.getTreatmentstate() != null){
                example.createCriteria().andTreatmentstateEqualTo(ret.getTreatmentstate());
            }
            // 返货执行状态
            if(ret.getApreturnstatus() != null){
                example.createCriteria().andApreturnstatusEqualTo(ret.getApreturnstatus());
            }
        }
        List<RetReturnlist> list = retReturnlistMapper.selectByExample(example);
        PageInfo info = new PageInfo(list);
        map.put("items",info.getList());
        map.put("total",info.getTotal());
        return map;
    }

    @Override
    public Boolean addRetReturnlist(RetReturnlist ret) {
        boolean success = false;
        ret.setTreatmentstate(1);
        ret.setApreturnstatus(1);
        int count = retReturnlistMapper.insertSelective(ret);
        if(count > 0){
            success = true;
        }
        return success;
    }

    @Override
    public Boolean updateRetReturnlist(RetReturnlist ret) {
        boolean success = false;
        int count = retReturnlistMapper.updateByPrimaryKeySelective(ret);
        if(count > 0){
            success = true;
        }
        return success;
    }

    @Override
    public Boolean deleteRetReturnlist(Integer id) {
        boolean success = false;
        RetReturnlist ret = retReturnlistMapper.selectByPrimaryKey(id);
        if(ret != null){
            ret.setInvalidatesign(2);
            int count = retReturnlistMapper.updateByPrimaryKeySelective(ret);
            if(count > 0){
                success = true;
            }
        }
        return success;
    }

    /**
     * 确认返货
     * @param id
     * @return
     */
    @Override
    public Boolean confirm(Integer id) {
        boolean success = false;
        RetReturnlist ret = retReturnlistMapper.selectByPrimaryKey(id);
        if(ret != null){
            ret.setTreatmentstate(2);
            int count = retReturnlistMapper.updateByPrimaryKeySelective(ret);
            if(count > 0){
                success = true;
            }
        }
        return success;
    }

    /**
     * 拒绝返货
     * @param id
     * @return
     */
    @Override
    public Boolean refuse(Integer id) {
        boolean success = false;
        RetReturnlist ret = retReturnlistMapper.selectByPrimaryKey(id);
        if(ret != null){
            ret.setTreatmentstate(3);
            int count = retReturnlistMapper.updateByPrimaryKeySelective(ret);
            if(count > 0){
                success = true;
            }
        }
        return success;
    }
}
