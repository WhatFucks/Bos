package com.ljw.controller;

import com.ljw.service.IaeDepartureService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("departure")
public class IaeDepartureController {
    @Autowired
    private IaeDepartureService iaeDepartureService;
    @RequestMapping("list")
    public ResponseResult list(String id, String destination, Integer page, Integer limit){
        ResponseResult result=new ResponseResult();
        Map<String,Object> map=iaeDepartureService.select(id,destination,page,limit);
        if (map.size()>0 ){
            result.getData().putAll(map);
        }
        return result;
    }
}
