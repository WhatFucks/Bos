package com.lyb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysUser;
import com.lyb.entity.SysUserExample;
import com.lyb.general.PageEntity;
import com.lyb.mapper.SysUserMapper;
import com.lyb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public String getUserNo() {
        String maxUserNo = sysUserMapper.getMaxUserNo();
        String num = maxUserNo.substring(maxUserNo.indexOf("H")+1);
        return "GH"+(Integer.parseInt(num)+1);
    }

    @Override
    public SysUser findById(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public SysUser findUserByUserName(String username) {
        List<SysUser> list = sysUserMapper.findUserByNameAndRoleAndMenu(username);
        if(list !=null && list.size() == 1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public Map<String,Object> findAllUser(PageEntity entity){
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(entity.getPageNum(),entity.getPageSize());
        SysUserExample example = new SysUserExample();
        // 用户名模糊查询
        if(entity.getName()!=null && entity.getName().trim()!=""){
            example.createCriteria().andUsernameLike("%"+entity.getName()+"%");
        }

        List<SysUser> list = sysUserMapper.selectByExample(example);
        PageInfo page = new PageInfo(list);
        map.put("items",page.getList());
        map.put("total",page.getTotal());
        return map;
    }

    @Override
    public SysUser findUserByNameAndPassword(SysUser sysUser) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(sysUser.getUsername());
        example.createCriteria().andPasswordEqualTo(sysUser.getPassword());
        List<SysUser> list = sysUserMapper.selectByExample(example);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<String> findRolesByUserID(Integer ID) {
        return sysUserMapper.findRolesByUserID(ID);
    }

    @Override
    public Boolean addUser(SysUser user) {
        boolean flag = false;
        int count = sysUserMapper.insertSelective(user);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean updateUserByID(SysUser user) {
        boolean flag = false;
        int count = sysUserMapper.updateByPrimaryKeySelective(user);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean startUser(Integer id) {
        boolean flag = false;
        SysUser user = sysUserMapper.selectByPrimaryKey(id);
        if(user != null){
            user.setDelFlag(0);
        }
        int count = sysUserMapper.updateByPrimaryKeySelective(user);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean deleteUserByID(Integer id) {
        boolean flag = false;
        SysUser user = sysUserMapper.selectByPrimaryKey(id);
        user.setDelFlag(-1);
        int count = sysUserMapper.updateByPrimaryKeySelective(user);
        if(count > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public SysUser findUserByID(Integer ID) {
        return sysUserMapper.selectByPrimaryKey(ID);
    }
}
