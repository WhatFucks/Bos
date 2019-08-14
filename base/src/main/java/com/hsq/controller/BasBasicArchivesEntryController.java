package com.hsq.controller;

import com.hsq.entity.BasBasicArchivesEntry;
import com.hsq.service.BasBasicArchivesEntryService;
import com.util.ResponseResult;
import com.lyb.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("basBasicArchivesEntry")
public class BasBasicArchivesEntryController {

    @Autowired
    private BasBasicArchivesEntryService basBasicArchivesEntryService;
    //  ---------- 查看列表
    @RequestMapping("findByPid")
    public ResponseResult findByPid(Integer id){
        ResponseResult result=new ResponseResult();
        result.getData().putAll(basBasicArchivesEntryService.findByPid(id));
        return result;
    }

    @RequestMapping("deleteBasById")
    public ResponseResult deleteBasById(Long id){
        basBasicArchivesEntryService.deleteBasById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("addBas")
    public ResponseResult addBas(BasBasicArchivesEntry basBasicArchivesEntry){
        ResponseResult result = new ResponseResult();
        Session session = SecurityUtils.getSubject().getSession();
        SysUser sysUser = (SysUser) session.getAttribute("USER_SESSION");
        basBasicArchivesEntry.setOperatorid(Math.toIntExact(sysUser.getId()));
        basBasicArchivesEntry.setOperationunitid(Math.toIntExact(sysUser.getDeptId()));
        basBasicArchivesEntry.setOperationtime(new Date());
        basBasicArchivesEntryService.addBas(basBasicArchivesEntry);
        return result;
    }

    @RequestMapping("updateBasById")
    public ResponseResult updateBasById(BasBasicArchivesEntry basBasicArchivesEntry){
        ResponseResult result = new ResponseResult();
        // basBasicArchives.setOperationtime(new Date());
        basBasicArchivesEntryService.updateBasById(basBasicArchivesEntry);
        return result;
    }



    /**
     * 时间解析
     * @param binder
     * @param request
     */
    @org.springframework.web.bind.annotation.InitBinder
    public void InitBinder(WebDataBinder binder, WebRequest request)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(df,true);//参数为true表示允许为空值
        binder.registerCustomEditor(Date.class, editor);
    }
}
