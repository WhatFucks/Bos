package com.sor.controller;

import com.sor.entity.SorPackageDetails;
import com.sor.service.SorPackageDetailsService;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("sorPackageDetail")
@RestController
public class SorPackageDetailController {
    @Autowired
    private SorPackageDetailsService sorPackageDetailsService;

    @RequestMapping("detailListById")
    public ResponseResult detailListById(String id){
        ResponseResult result = new ResponseResult();
       List<SorPackageDetails> list= sorPackageDetailsService.findById(id);
       result.getData().put("listById",list);
       return result;
    }
}
