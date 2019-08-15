package com.hsq.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsq.entity.*;
import com.hsq.mapper.BasShuttleBusMapper;
import com.hsq.service.BasShuttleBusService;
import com.hsq.service.LogTrackService;
import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import com.lyb.service.SysDeptService;
import com.lyb.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BasShuttleBusServiceImpl implements BasShuttleBusService{


    @Autowired
    private BasShuttleBusMapper basShuttleBusMapper;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysDeptService sysDeptService;

    @Autowired
    private LogTrackService logTrackService;

    /**
     * 分页  模糊查询  查询所有
     * @param
     * @param page
     * @param limit
     * @return
     */
    @Override
    public Map basShuttleBusAll(BasShuttleBus basShuttleBus, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        Page p = PageHelper.startPage(page,limit,true);
        List<BasShuttleBus> list= basShuttleBusMapper.selectByExample(null);
        for(BasShuttleBus bd : list){
            SysUser sysUser= sysUserService.findById(Integer.valueOf(bd.getOperatorid()));
            bd.setUser(sysUser);
            SysDept sysDept= sysDeptService.findById(Integer.valueOf(bd.getOperationunitid()));
            bd.setDept(sysDept);
            LogTrack logTrack = logTrackService.findById(bd.getLineid());
            bd.setLogTrack(logTrack);
        }
        map.put("row",list);
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public void deleteById(Integer id) {
        basShuttleBusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(BasShuttleBus basShuttleBus) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basShuttleBus.setOperatorid(Math.toIntExact(sysUser.getId()));
        basShuttleBus.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basShuttleBus.setOperationtime(new Date());
        basShuttleBusMapper.insertSelective(basShuttleBus);
    }

    @Override
    public void updateById(BasShuttleBus basShuttleBus) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basShuttleBus.setOperatorid(Math.toIntExact(sysUser.getId()));
        basShuttleBus.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basShuttleBus.setOperationtime(new Date());
        basShuttleBusMapper.updateByPrimaryKeySelective(basShuttleBus);
    }

}
