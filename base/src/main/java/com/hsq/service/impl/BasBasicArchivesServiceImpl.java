package com.hsq.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsq.entity.*;
import com.hsq.mapper.BasBasicArchivesMapper;
import com.hsq.service.BasBasicArchivesEntryService;
import com.hsq.service.BasBasicArchivesService;
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
public class BasBasicArchivesServiceImpl implements BasBasicArchivesService {

    @Autowired
    private BasBasicArchivesMapper basBasicArchivesMapper;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysDeptService sysDeptService;

    @Autowired
    private BasBasicArchivesEntryService basBasicArchivesEntryService;
    /**
     * 分页  模糊查询  查询所有
     * @param basBasicArchives
     * @param page
     * @param limit
     * @return
     */
    @Override
    public Map basBasicArchivesAll(BasBasicArchives basBasicArchives, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        Page p = PageHelper.startPage(page,limit,true);
        BasBasicArchivesExample example = new BasBasicArchivesExample();
        if (basBasicArchives!=null && basBasicArchives.getName()!=null&&basBasicArchives.getName()!=""){
            example.createCriteria().andNameLike("%"+basBasicArchives.getName()+"%");
        }
        List<BasBasicArchives> list= basBasicArchivesMapper.selectByExample(example);
        for(BasBasicArchives bd : list){
            SysUser sysUser= sysUserService.findById(Integer.valueOf(bd.getOperatorid()));
            bd.setUser(sysUser);
            SysDept sysDept= sysDeptService.findById(Integer.valueOf(bd.getOperationunitid()));
            bd.setDept(sysDept);
            BasBasicArchivesEntry bas = basBasicArchivesEntryService.findById(bd.getOperationunitid());
            bd.setBasBasicArchivesEntry(bas);
        }
        map.put("row",list);
        map.put("total",p.getTotal());
        return map;
    }

    @Override
    public void deleteById(Long id) {
        basBasicArchivesMapper.deleteByPrimaryKey(Integer.parseInt(id.toString()));
    }

    @Override
    public void add(BasBasicArchives basBasicArchives) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basBasicArchives.setOperatorid(Math.toIntExact(sysUser.getId()));
        basBasicArchives.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basBasicArchives.setOperationtime(new Date());
        basBasicArchivesMapper.insertSelective(basBasicArchives);
    }

    @Override
    public void updateById(BasBasicArchives basBasicArchives) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basBasicArchives.setOperatorid(Math.toIntExact(sysUser.getId()));
        basBasicArchives.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basBasicArchives.setOperationtime(new Date());
        basBasicArchivesMapper.updateByPrimaryKeySelective(basBasicArchives);
    }

    @Override
    public boolean selectByName(String dname) {
        BasBasicArchivesExample example = new BasBasicArchivesExample();
        example.createCriteria().andNameEqualTo(dname);
        List<BasBasicArchives> list = basBasicArchivesMapper.selectByExample(example);
        if (list != null && list.size()==1){
            return false;
        }
        return true;
    }

}
