package com.lyb.controller;

import com.lyb.entity.AccWorksheet;
import com.lyb.entity.RetReturnlist;
import com.lyb.entity.SysUser;
import com.lyb.general.PageEntity;
import com.lyb.service.AccWorksheetService;
import com.util.ResponseResult;
import com.lyb.service.RetReturnlistService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("retReturnlist")
public class RetReturnlistController {
    @Autowired
    private RetReturnlistService retReturnlistService;


    @Autowired
    private AccWorksheetService accWorksheetService;
    /**
     * 查询所有返货单
     * @param page
     * @param ret
     * @return
     */
    @RequestMapping("getRetReturnlist")
    public ResponseResult getRetReturnlist(PageEntity page, RetReturnlist ret){
        ResponseResult result = new ResponseResult();
        result.setData(retReturnlistService.getRetReturnlist(page,ret));
        return result;
    }

    /**
     * 添加返货单
     * @param ret
     * @return
     */
    @RequestMapping("addRetReturnlist")
    public ResponseResult addRetReturnlist(RetReturnlist ret){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        AccWorksheet accWorksheet = accWorksheetService.selectByWorksheetNo(ret.getWorksheetno());
        boolean success = false;
        if(accWorksheet != null){
            boolean flag = retReturnlistService.isExistRetReturnlist(ret.getWorksheetno());
            if(flag){
                result.setMessage("该工作单已存在于返货列表中！");
            }else{
                // 申请单号
                ret.setApplicationno(retReturnlistService.getApplicationNo());
                if(loginUser != null ){
                    // 接收单位
                    ret.setReceivegunit(loginUser.getDeptId());
                    // 作废标志 否
                    ret.setInvalidatesign(1);
                    // 返货单位
                    ret.setReturnunit(loginUser.getDeptId());
                    // 进港单位
                    ret.setEntryunit(loginUser.getDeptId());
                    // 进港时间
                    ret.setEntrytime(new Date());
                    // 录入时间
                    ret.setRecordingtime(new Date());
                    // 录入单位
                    ret.setEntryunit(loginUser.getDeptId());
                    // 录入人
                    ret.setPersonname(loginUser.getUsername());
                    // 自动确认标志 默认否
                    ret.setIdentificationsign(1);
                    success = retReturnlistService.addRetReturnlist(ret);
                }
            }
        }else{
            result.setMessage("工作单不存在，请输入正确的工作单后重试！");
        }
        result.getData().put("success",success);
        return result;
    }

    /**
     * 修改返货单
     * @param ret
     * @return
     */
    @RequestMapping("updateRetReturnlist")
    public ResponseResult updateRetReturnlist(RetReturnlist ret){
        ResponseResult result = new ResponseResult();
        result.getData().put("success",retReturnlistService.updateRetReturnlist(ret));
        return result;
    }

    /**
     * 作废返货单
     * @param id
     * @return
     */
    @RequestMapping("deleteRetReturnlist")
    public ResponseResult deleteRetReturnlist(Integer id){
        ResponseResult result = new ResponseResult();
        result.getData().put("success",retReturnlistService.deleteRetReturnlist(id));
        return result;
    }

    /**
     * 拒绝返货
     * @param id
     * @return
     */
    @RequestMapping("refuse")
    public ResponseResult refuse(Integer id){
        ResponseResult result = new ResponseResult();
        result.getData().put("success",retReturnlistService.refuse(id));
        return result;
    }

    /**
     * 同意返货
     * @param id
     * @return
     */
    @RequestMapping("confirm")
    public ResponseResult confirm(Integer id){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        RetReturnlist ret = retReturnlistService.findByID(id);
        if(loginUser != null){
            if(ret != null){
                // 确认时间
                ret.setConfirmationtime(new Date());
                // 确认单位
                ret.setConfirmationunit(loginUser.getId());
                // 确认人
                ret.setConfirmationpersonname(loginUser.getUsername());
            }
        }
        result.getData().put("success",retReturnlistService.confirm(ret));
        return result;
    }
}
