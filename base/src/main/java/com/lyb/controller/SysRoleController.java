package com.lyb.controller;

import com.lyb.entity.SysRole;
import com.lyb.entity.SysUser;
import com.lyb.general.*;
import com.lyb.service.SysRoleService;
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
@RequestMapping("role")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("allotRoles")
    public ResponseResult allotRoles(AllotRoles roles){
        List<UserAndRole> ur = new ArrayList<>();
        for(int i=0;i<roles.getRids().length;i++){
            UserAndRole u = new UserAndRole();
            u.setUid(roles.getUid());
            u.setRid(roles.getRids()[i]);
            ur.add(u);
        }
        ResponseResult result = new ResponseResult();
        boolean success = false;
        sysRoleService.deleteRolesByUserID(roles.getUid());
        int i = sysRoleService.insertUserRoles(ur);
        if( i > 0){
            success = true;
        }
        result.getData().put("success",success);
        return result;
    }

    /**
     * 查询所有角色与用户对应的角色
     * @param id
     * @return
     */
    @RequestMapping("getRoles")
    public ResponseResult getRoles(Integer id){
        List<SysRole> roleList = sysRoleService.findAllRole();
        List<SysRole> userRoleList = sysRoleService.findRolesByUserID(id);
        ResponseResult result = new ResponseResult();
        // 转换为前台el-transfer标签所需要的数据格式
        List<TransferEntity> list1 = new ArrayList<>();
        List<TransferEntity> list2 = new ArrayList<>();
        // 所有的角色
        for(int i = 0;i < roleList.size();i++){
            TransferEntity t = new TransferEntity();
            t.setKey(roleList.get(i).getId());
            t.setLabel(roleList.get(i).getName());
            list1.add(t);
        }
        // 用户已有的角色
        for(int i = 0;i < userRoleList.size();i++){
            TransferEntity t = new TransferEntity();
            t.setKey(userRoleList.get(i).getId());
            t.setLabel(userRoleList.get(i).getName());
            list2.add(t);
        }
        result.getData().put("roleList",list1);
        result.getData().put("userRoleList",list2);
        return result;
    }

    /**
     * 获取所有的角色并分页（带条件）
     * @param entity
     * @return
     */
    @RequestMapping("rolePaging")
    public ResponseResult getRoleList(PageEntity entity){
        ResponseResult result = new ResponseResult();
        result.setData(sysRoleService.findAllSysRole(entity));
        return result;
    }

    /**
     * 添加角色
     * @return
     */
    @RequestMapping("addRole")
    public ResponseResult addRole(SysRole role){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        // 获得角色字符串集合
        if(loginUser!=null){
            role.setCreateBy(loginUser.getUsername());
            // 创建时间
            role.setCreateTime(new Date());
        }
        boolean flag = sysRoleService.addSysRole(role);
        result.getData().put("success",flag);
        return result;
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    @RequestMapping("deleteRoleByID")
    public ResponseResult deleteRoleByID(Integer id){
        ResponseResult result = new ResponseResult();
        boolean  flag = false;
        List<SysUser> list = sysRoleService.findUserByRoleID(id);
        if(list != null && list.size() > 0){
            result.getData().put("success",flag);
            result.getData().put("msg","该角色正在被使用，不可删除！");
        }else{
            flag = sysRoleService.deleteSysRoleByID(id);
            result.getData().put("success",flag);
            result.getData().put("msg","删除成功！");
        }
        return result;
    }

    /**
     * 修改角色
     * @param role
     * @return
     */
    @RequestMapping("updateRoleByID")
    public ResponseResult updateRoleByID(SysRole role){
        Subject subject = SecurityUtils.getSubject();
        ResponseResult result = new ResponseResult();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        // 获得角色字符串集合
        if(loginUser!=null){
            // 最后更改人
            role.setLastUpdateBy(loginUser.getUsername());
            // 最后更改时间
            role.setLastUpdateTime(new Date());
        }
        boolean flag = sysRoleService.updateSysRoleByID(role);
        result.getData().put("success",flag);
        return result;
    }

    /**
     * 重新启用角色
     * @param id
     * @return
     */
    @RequestMapping("startRole")
    public ResponseResult startRole(Integer id){
        ResponseResult result = new ResponseResult();
        boolean flag = sysRoleService.startRole(id);
        result.getData().put("success",flag);
        return result;
    }
}
