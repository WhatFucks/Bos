package com.hsq.controller;

import com.hsq.service.BasZoneInfoService;
import com.lm.entity.dis.BasZoneInfo;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("zoneInfo")
public class BasZoneInfoController {

    @Autowired
    private BasZoneInfoService basZoneInfoService;

    @RequestMapping("list")
    public ResponseResult list(BasZoneInfo basZoneInfo, Integer page, Integer limit){
        Map<String,Object> map = basZoneInfoService.basZoneInfoAll(basZoneInfo,page,limit);
        ResponseResult result = new ResponseResult();
        result.getData().putAll(map);
        return result;
    }

    @RequestMapping("deleteById")
    public ResponseResult deleteById(Integer id){
        basZoneInfoService.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(BasZoneInfo basZoneInfo){
        ResponseResult result = new ResponseResult();
        basZoneInfo.setZonepeople(1);
        basZoneInfo.setSubordinateunit(1);
        basZoneInfoService.add(basZoneInfo);
        return result;
    }

    @PostMapping("updateById")
    public ResponseResult updateById(BasZoneInfo basZoneInfo){
        ResponseResult result = new ResponseResult();
        basZoneInfoService.updateById(basZoneInfo);
        return result;
    }


    @org.springframework.web.bind.annotation.InitBinder
    public void InitBinder(WebDataBinder binder, WebRequest request)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(df,true);//参数为true表示允许为空值
        binder.registerCustomEditor(Date.class, editor);
    }
}
