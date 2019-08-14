package com.ljw.controller;

import com.ljw.service.IaeArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.util.ResponseResult;
import java.util.Map;

@RestController
@RequestMapping("arrival")
public class IaeArrivalController {
    @Autowired
    private IaeArrivalService iaeArrivalService;
    @RequestMapping("list")
    public ResponseResult list(String id,String workaddress, Integer page, Integer limit){
        ResponseResult result=new ResponseResult();
        Map<String,Object> map=iaeArrivalService.select(id,workaddress,page,limit);
        if (map.size()>0){
            result.getData().putAll(map);
        }
        return result;
    }
}
