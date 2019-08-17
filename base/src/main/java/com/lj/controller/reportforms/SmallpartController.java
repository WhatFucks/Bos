package com.lj.controller.reportforms;


import com.lj.service.reportforms.SmallpartService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("smallpart")
public class SmallpartController {

    @Autowired
    private SmallpartService smallpartService;

    @RequestMapping("selectSmallpart")
    @ResponseBody
    public ResponseResult selectSmallpart(){
        ResponseResult result=new ResponseResult();
        int[] a=smallpartService.selectSmall();
        result.getData().put("dataSmall",a);
        return  result;
    }
}
