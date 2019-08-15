package com.hsq.controller;

import com.hsq.entity.BasSubstitute;
import com.hsq.service.BasSubstituteService;
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
@RequestMapping("substitute")
public class BasSubstituteController {

    @Autowired
    private BasSubstituteService basSubstituteService;

    @org.springframework.web.bind.annotation.InitBinder
    public void InitBinder(WebDataBinder binder, WebRequest request)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(df,true);//参数为true表示允许为空值
        binder.registerCustomEditor(Date.class, editor);
    }

    @RequestMapping("list")
    public ResponseResult list(BasSubstitute basSubstitute, Integer page, Integer limit){
        Map<String,Object> map = basSubstituteService.basSubstituteAll(basSubstitute,page,limit);
        ResponseResult result = new ResponseResult();
        result.getData().putAll(map);
        return result;
    }

    @RequestMapping("deleteById")
    public ResponseResult deleteById(Integer id){
        basSubstituteService.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(BasSubstitute basSubstitute){
        ResponseResult result = new ResponseResult();
        basSubstitute.setSubordinateunit(1);
        basSubstituteService.add(basSubstitute);
        return result;
    }

    @PostMapping("updateById")
    public ResponseResult updateById(BasSubstitute basSubstitute){
        ResponseResult result = new ResponseResult();
        basSubstituteService.updateById(basSubstitute);
        return result;
    }

}
