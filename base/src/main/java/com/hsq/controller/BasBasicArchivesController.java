package com.hsq.controller;

import com.hsq.entity.BasBasicArchives;
import com.hsq.service.BasBasicArchivesEntryService;
import com.hsq.service.BasBasicArchivesService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("basBasicArchives")
public class BasBasicArchivesController {

    @Autowired
    private BasBasicArchivesService basBasicArchivesService;


    @Autowired
    private BasBasicArchivesEntryService  basBasicArchivesEntryService;

    @RequestMapping("list")
    public ResponseResult list(BasBasicArchives basBasicArchives, Integer page, Integer limit){
        Map<String,Object> map = basBasicArchivesService.basBasicArchivesAll(basBasicArchives,page,limit);
        ResponseResult result = new ResponseResult();
        result.getData().putAll(map);
        return result;
    }

    @RequestMapping("deleteById")
    public ResponseResult deleteById(Long id){
        basBasicArchivesService.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(BasBasicArchives basBasicArchives){
        ResponseResult result = new ResponseResult();
        basBasicArchivesService.add(basBasicArchives);
        return result;
    }

    @RequestMapping("updateById")
    public ResponseResult updateById(BasBasicArchives basBasicArchives){
        ResponseResult result = new ResponseResult();
        basBasicArchivesService.updateById(basBasicArchives);
        return result;
    }

    @RequestMapping("selectByName")
    public ResponseResult selectByName(String dname){
        ResponseResult result = new ResponseResult();
        boolean flag = basBasicArchivesService.selectByName(dname);
        result.getData().put("flag",flag);
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
