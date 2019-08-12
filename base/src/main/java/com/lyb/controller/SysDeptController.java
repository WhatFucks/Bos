package com.lyb.controller;

import com.lyb.entity.SysDept;
import com.lyb.entity.SysUser;
import com.lyb.general.PageEntity;
import com.lyb.general.ResponseResult;
import com.lyb.service.SysDeptService;
import com.lyb.util.SysDeptGroupUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("dept")
public class SysDeptController {
    @Autowired
    private SysDeptService sysDeptService;

    /**
     * 查询所有部门信息 有层级
     * @return
     */
    @RequestMapping("findAllDept")
    public ResponseResult findAllDept(){
        ResponseResult result = new ResponseResult();
        List<SysDept> groupList =  SysDeptGroupUtil.getFirstDept(sysDeptService.findAllSysDept());
        result.getData().put("items",groupList);
        return result;
    }

    /**
     * 查询所有部门信息 无层级
     * @return
     */
    @RequestMapping("findAllDept2")
    public ResponseResult findAllDept2(){
        ResponseResult result = new ResponseResult();
        result.getData().put("items",sysDeptService.findAllSysDept());
        return result;
    }

    /**
     * 查询所有部门信息 分页
     * @param entity
     * @return
     */
    @RequestMapping("deptPaging")
    public ResponseResult deptPaging(PageEntity entity){
        ResponseResult result = new ResponseResult();
        result.setData(sysDeptService.deptPaging(entity));
        return result;
    }

    /**
     * 添加部门
     * @param dept
     * @return
     */
    @RequestMapping("addDept")
    public ResponseResult addDept(SysDept dept){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        // 获得角色字符串集合
        if(loginUser!=null){
            dept.setCreateBy(loginUser.getUsername());
            // 创建时间
            dept.setCreateTime(new Date());
        }
        ResponseResult result = new ResponseResult();
        boolean flag = sysDeptService.addSysDept(dept);
        result.getData().put("success",flag);
        return result;
    }

    /**
     * 删除部门
     * @param id
     * @return
     */
    @RequestMapping("deleteDeptByID")
    public ResponseResult deleteDeptByID(Integer id){
        ResponseResult result = new ResponseResult();
        boolean flag = sysDeptService.isExistSubset(id);
        if(flag){
            result.getData().put("msg","该部门下还有子部门，如需删除请先删除子部门！");
        }else{
            boolean success = sysDeptService.deleteSysDept(id);
            result.getData().put("success",success);
        }
        return result;
    }

    /**
     * 修改部门
     * @param dept
     * @return
     */
    @RequestMapping("updateDeptByID")
    public ResponseResult updateDeptByID(SysDept dept){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        // 获得角色字符串集合
        if(loginUser!=null){
            // 最后更改人
            dept.setLastUpdateBy(loginUser.getUsername());
            // 最后更改时间
            dept.setLastUpdateTime(new Date());
        }
        boolean success = sysDeptService.updateSysDept(dept);
        result.getData().put("success",success);
        return result;
    }
}
