package com.hsq.controller;

import com.hsq.entity.BasArea;
import com.hsq.entity.BasProvince;
import com.hsq.service.BasAreaService;
import com.hsq.service.BasProvinceService;
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
@RequestMapping("basarea")
public class BasAreaController {

    @Autowired
    private BasAreaService basAreaService;

    @Autowired
    private BasProvinceService basProvinceService;
    @RequestMapping("list")
    public ResponseResult list(BasArea basArea, Integer page, Integer limit){
        Map<String,Object> map = basAreaService.basAreaAll(basArea,page,limit);
        ResponseResult result = new ResponseResult();
        result.getData().putAll(map);
        return result;
    }

    @RequestMapping("deleteById")
    public ResponseResult deleteById(Integer id){
        basAreaService.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(BasArea basArea){
        ResponseResult result = new ResponseResult();
        BasProvince basProvince = basProvinceService.geyById(Integer.valueOf(basArea.getProvince()));
        basArea.setProvince(basProvince.getName());

        BasProvince basProvince1 = basProvinceService.geyById(Integer.valueOf(basArea.getCity()));
        basArea.setCity(basProvince1.getName());

        BasProvince basProvince2 = basProvinceService.geyById(Integer.valueOf(basArea.getCounty()));
        basArea.setCounty(basProvince2.getName());
        basArea.setEntryunitid(String.valueOf(1));
        basArea.setComplementunitid(String.valueOf(1));
        basAreaService.add(basArea);
        return result;
    }

    @PostMapping("updateById")
    public ResponseResult updateById(BasArea basArea){
        ResponseResult result = new ResponseResult();
        basAreaService.updateById(basArea);
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
