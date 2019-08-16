package com.lyb.controller;

import com.lyb.entity.SysUser;
import com.lyb.general.PageEntity;
import com.util.ResponseResult;
import com.lyb.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
public class SysUsersController {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 登录
     * @param sysUser
     * @return
     */
    @RequestMapping("login")
    public ResponseResult login(SysUser sysUser){
        ResponseResult result = new ResponseResult();
        UsernamePasswordToken token = new UsernamePasswordToken(sysUser.getUsername(), sysUser.getPassword());
        // 获得登录的主题
        Subject subject = SecurityUtils.getSubject();
        // 调用登录方法
        try{
            subject.login(token);
            result.getData().put("token",subject.getSession().getId());
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            result.setCode(20001);
            result.setMessage("登陆失败，请检查账号密码后重试！");
        }catch (UnknownAccountException e){
            e.printStackTrace();
            result.setCode(20001);
            result.setMessage("登陆失败，无角色数据！");
        }
        // 返回给前台的toke，唯一标识用户
        return result;
    }

    /**
     * 根据token 获取用户及对应的用户角色信息
     * @param token
     * @return
     */
    @RequestMapping("info")
    public ResponseResult getUserInfo(String token){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        if(token.equals(subject.getSession().getId().toString())){
            // 从shiro的session里获得保存的用户信息
            SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
            // 获得角色字符串集合
            List<String> roles = (List<String>) session.getAttribute("roles");
            if(loginUser!=null){
                // 根据用户获得角色字符串数组
                roles = sysUserService.findRolesByUserID(loginUser.getId());
                result.getData().put("roles",roles);
                result.getData().put("introduction",loginUser.getIntroduction());
                result.getData().put("avatar",loginUser.getAvatar());
                result.getData().put("name",loginUser.getUsername());
                return result;
            }
        }
        return null;
    }

    /**
     * 查询所有用户(可带条件) 分页
     * @param
     * @return
     */
    @RequestMapping("getUserList")
    public ResponseResult getUserList(PageEntity entity){
        ResponseResult result = new ResponseResult();
        result.setData(sysUserService.findAllUser(entity));
        return result;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("addUser")
    public ResponseResult addUser(SysUser user){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        // 获得角色字符串集合
        if(loginUser!=null){
            // 工号
            user.setUserNo(sysUserService.getUserNo());
            // 创建人
            user.setCreateBy(loginUser.getUsername());
            // 创建时间
            user.setCreateTime(new Date());
            // 默认状态
            user.setStatus(1);
        }
        //生成盐（部分，需要存入数据库中）
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
        //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
        String password = new Md5Hash(user.getPassword(),salt,2).toString();
        user.setSalt(salt);
        user.setPassword(password);
        ResponseResult result = new ResponseResult();
        boolean flag = sysUserService.addUser(user);
        result.getData().put("success",flag);
        return result;
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @RequestMapping("updateUserByID")
    public ResponseResult updateUser(SysUser user){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        // 获得角色字符串集合
        if(loginUser!=null){
            // 最后更改人
            user.setLastUpdateBy(loginUser.getUsername());
            // 最后更改时间
            user.setLastUpdateTime(new Date());
        }
        //生成盐（部分，需要存入数据库中）
        String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
        //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
        String password = new Md5Hash(user.getPassword(),salt,2).toString();
        user.setSalt(salt);
        user.setPassword(password);
        ResponseResult result = new ResponseResult();
        boolean flag = sysUserService.updateUserByID(user);
        result.getData().put("success",flag);
        return result;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("deleteUserByID")
    @RequiresPermissions("user:delete")// 需要删除的权限
    public ResponseResult deleteUser(Integer id){
        ResponseResult result = new ResponseResult();
        boolean flag = sysUserService.deleteUserByID(id);
        result.getData().put("success",flag);
        return result;
    }

    /**
     * 重新启用用户
     * @param id
     * @return
     */
    @RequestMapping("startUser")
    public ResponseResult startUser(Integer id){
        ResponseResult result = new ResponseResult();
        boolean flag = sysUserService.startUser(id);
        result.getData().put("success",flag);
        return result;
    }

    @RequestMapping("logout")
    public ResponseResult logout(){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        // 只需调用shiro的logout方法就可以了
        subject.logout();
        return result;
    }
}
