package com.lj.service.impl.sys;

import com.lj.entity.sys.SysMenu;
import com.lj.entity.sys.SysMenuExample;
import com.lj.mapper.sys.SysMenuMapper;
import com.lj.service.sys.SysMenuService;
import com.lj.util.TreeNodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> menuList(SysMenu sysMenu) {
        SysMenuExample example=new SysMenuExample();
        SysMenuExample.Criteria criteria=example.createCriteria();
        if (sysMenu!=null){
            if (sysMenu.getName()!=null){
                criteria.andNameLike("%"+sysMenu.getName()+"%");
            }
        }
        List<SysMenu> list=sysMenuMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<SysMenu> menuListUtil(SysMenu sysMenu) {
        SysMenuExample example=new SysMenuExample();
        SysMenuExample.Criteria criteria=example.createCriteria();
        if (sysMenu!=null){
            if (sysMenu.getName()!=null){
                criteria.andNameLike("%"+sysMenu.getName()+"%");
            }
        }
        List<SysMenu> list=sysMenuMapper.selectByExample(example);
        TreeNodeUtil treeNodeUtil=new TreeNodeUtil();
        list=treeNodeUtil.getFatherMenu(list);
        return list;
    }
}
