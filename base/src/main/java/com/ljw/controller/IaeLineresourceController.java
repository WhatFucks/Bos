package com.ljw.controller;

import com.ljw.entity.IaeLineresource;
import com.ljw.service.IaeLineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.util.ResponseResult;
import java.util.Map;

@RestController
@RequestMapping("lineresource")
public class IaeLineresourceController {
    @Autowired
    private IaeLineresourceService iaeLineresourceService;
    @RequestMapping("list")
    public ResponseResult list(String id,String port,Integer page,Integer limit){
        ResponseResult result=new ResponseResult();
        Map<String,Object> map=iaeLineresourceService.select(id,port,page,limit);
        if (map.size()>0){
            result.getData().putAll(map);
        }
        return result;
    }
    @RequestMapping("listitems")
    public ResponseResult listitems(String id){
        ResponseResult result=new ResponseResult();
        IaeLineresource iaeLineresource= iaeLineresourceService.findById(id);
        result.getData().put("ListItems",iaeLineresource);
        return result;
    }
}
