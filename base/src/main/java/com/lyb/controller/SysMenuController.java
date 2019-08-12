package com.lyb.controller;

import com.lyb.entity.SysMenu;
import com.lyb.entity.SysUser;
import com.lyb.general.*;
import com.lyb.service.SysMenuService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("menu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 查询所有菜单以及角色已有的菜单
     * @param id
     * @return
     */
    @RequestMapping("getMenus")
    public ResponseResult getMenus(Integer id){
        ResponseResult result = new ResponseResult();
        List<SysMenu> roleMenu = sysMenuService.findMenuByRoleID(id);
        List<SysMenu> menus = sysMenuService.findAll();
        List<TransferEntity> list1 = new ArrayList<>();
        List<TransferEntity> list2 = new ArrayList<>();
        for(int i=0;i<roleMenu.size();i++){
            TransferEntity t = new TransferEntity();
            t.setKey(roleMenu.get(i).getId());
            t.setLabel(roleMenu.get(i).getName());
            list1.add(t);
        }
        for(int i=0;i<menus.size();i++){
            TransferEntity t = new TransferEntity();
            t.setKey(menus.get(i).getId());
            t.setLabel(menus.get(i).getName());
            list2.add(t);
        }
        result.getData().put("roleMenuList",list1);
        result.getData().put("menuList",list2);
        return result;
    }

    /**
     * 菜单分页
     * @param entity
     * @return
     */
    @RequestMapping("findAllMenu")
    public ResponseResult findAllMenu(PageEntity entity){
        ResponseResult result = new ResponseResult();
        result.setData(sysMenuService.findAllMenu(entity));
        result.getData().put("menuList",sysMenuService.findAll());
        return result;
    }

    /**
     * 添加菜单
     * @param menu
     * @return
     */
    @RequestMapping("addMenu")
    public ResponseResult addMenu(SysMenu menu){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        // 获得角色字符串集合
        if(loginUser!=null){
            menu.setCreateBy(loginUser.getUsername());
            // 创建时间
            menu.setCreateTime(new Date());
        }
        boolean success = sysMenuService.addMenu(menu);
        result.getData().put("success",success);
        return result;
    }

    /**
     * 删除菜单
     * @param id
     * @return
     */
    @RequestMapping("deleteMenu")
    public ResponseResult deleteMenu(Integer id){
        ResponseResult result = new ResponseResult();
        boolean flag = sysMenuService.isExistSubset(id);
        if(flag){
            result.getData().put("msg","该菜单下还有子菜单，如需删除请先删除子菜单！");
        }else{
            boolean success = sysMenuService.deleteMenu(id);
            result.getData().put("success",success);
        }
        return result;
    }

    /**
     * 修改菜单
     * @param menu
     * @return
     */
    @RequestMapping("updateMenu")
    public ResponseResult updateMenu(SysMenu menu){
        ResponseResult result = new ResponseResult();
        if(menu.getId() != null){
            Subject subject = SecurityUtils.getSubject();
            Session session = subject.getSession();
            SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
            if(loginUser!=null){
                // 最后更改人
                menu.setLastUpdateBy(loginUser.getUsername());
                // 最后更改时间
                menu.setLastUpdateTime(new Date());
            }
        }
        boolean success = sysMenuService.updateMenu(menu);
        result.getData().put("success",success);
        return result;
    }

    @RequestMapping("allotMenus")
    public ResponseResult allotMenus(AllotMenu menus){
        boolean success = false;
        ResponseResult result = new ResponseResult();
        sysMenuService.deleteRoleAndMenuByRoleID(menus.getRid());
        List<RoleAndMenu> list = new ArrayList<>();
        for(int i=0;i<menus.getMids().length;i++){
            RoleAndMenu r = new RoleAndMenu();
            r.setRid(menus.getRid());
            r.setMid(menus.getMids()[i]);
            list.add(r);
        }
        int count = sysMenuService.insertRoleAndMenu(list);
        if(count > 0){
            success = true;
        }
        result.getData().put("success",success);
        return result;
    }
}
