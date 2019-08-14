package com.hsq.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsq.entity.BasDeliveryStandard;
import com.hsq.entity.BasDeliveryStandardExample;
import com.hsq.mapper.BasDeliveryStandardMapper;
import com.hsq.service.BasDeliveryStandardService;
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
public class BasDeliveryStandardServiceImpl implements BasDeliveryStandardService {

    @Autowired
    private BasDeliveryStandardMapper basDeliveryStandardMapper;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysDeptService sysDeptService;


    /**
     * 分页  模糊查询  查询所有
     * @param basDeliveryStandard
     * @param page
     * @param limit
     * @return
     */
    @Override
    public Map basDeliveryStandardAll(BasDeliveryStandard basDeliveryStandard, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        Page p = PageHelper.startPage(page,limit,true);
        BasDeliveryStandardExample example = new BasDeliveryStandardExample();
        if (basDeliveryStandard!=null && basDeliveryStandard.getName()!=null&&basDeliveryStandard.getName()!=""){
            example.createCriteria().andNameLike("%"+basDeliveryStandard.getName()+"%");
        }
        List<BasDeliveryStandard> list= basDeliveryStandardMapper.selectByExample(example);
        for(BasDeliveryStandard bd : list){
            SysUser sysUser= sysUserService.findById(Integer.valueOf(bd.getOperatorid()));
            bd.setUser(sysUser);
            SysDept sysDept= sysDeptService.findById(Integer.valueOf(bd.getOperationunitid()));
            bd.setDept(sysDept);
        }
        map.put("row",list);
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public void deleteById(Long id) {
        basDeliveryStandardMapper.deleteByPrimaryKey(Integer.parseInt(id.toString()));
    }

    @Override
    public void add(BasDeliveryStandard basDeliveryStandard) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basDeliveryStandard.setOperatorid(Math.toIntExact(sysUser.getId()));
        basDeliveryStandard.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basDeliveryStandard.setOperationtime(new Date());
        basDeliveryStandardMapper.insertSelective(basDeliveryStandard);
    }

    @Override
    public void updateById(BasDeliveryStandard basDeliveryStandard) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basDeliveryStandard.setOperatorid(Math.toIntExact(sysUser.getId()));
        basDeliveryStandard.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basDeliveryStandard.setOperationtime(new Date());
        basDeliveryStandardMapper.updateByPrimaryKeySelective(basDeliveryStandard);
    }

    @Override
    public boolean selectByName(String dname) {
        BasDeliveryStandardExample example = new BasDeliveryStandardExample();
        example.createCriteria().andNameEqualTo(dname);
        List<BasDeliveryStandard> list = basDeliveryStandardMapper.selectByExample(example);
        if (list != null && list.size()==1){
            return false;
        }
        return true;
    }
}
