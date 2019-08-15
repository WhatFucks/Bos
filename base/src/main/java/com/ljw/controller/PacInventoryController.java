package com.ljw.controller;

import com.ljw.service.PacInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.util.ResponseResult;
import java.util.Map;

@RestController
@RequestMapping("tory")
public class PacInventoryController {
    @Autowired
    private PacInventoryService pacInventoryService;
    @RequestMapping("list")
    //库存查询
    public ResponseResult list(String goodsnumber, String affiliatedunit, Integer page, Integer limit){
        ResponseResult result=new ResponseResult();
        Map<String,Object> map = pacInventoryService.select(goodsnumber,affiliatedunit,page,limit);
        if (map!=null){
            result.getData().putAll(map);
        }
        return result;
    }
}
