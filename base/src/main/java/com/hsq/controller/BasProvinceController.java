package com.hsq.controller;

import com.hsq.service.BasProvinceService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("basProvince")
public class BasProvinceController {
    @Autowired
    private BasProvinceService basProvinceService;

    @RequestMapping("selectByPid")
    public ResponseResult selectByPid(Integer pid){
        ResponseResult result=new ResponseResult();
        result.getData().put("items",basProvinceService.selectByPid(pid));
        return result;
    }

}
