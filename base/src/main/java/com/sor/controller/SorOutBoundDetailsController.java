package com.sor.controller;

import com.sor.service.SorOutBoundDetailsService;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sorOutBoundDetails")
public class SorOutBoundDetailsController {
    @Autowired
    private SorOutBoundDetailsService sorOutBoundDetailsService;


    /**
     * 根据出库交接单查询明细
     * @param id
     * @return
     */
    @RequestMapping("list")
    public ResponseResult list(String id){
        ResponseResult result = new ResponseResult();
        result.getData().put("sorOutBoundlist",sorOutBoundDetailsService.list(id));
        return  result;
    }
}
