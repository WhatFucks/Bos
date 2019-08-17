package com.ljw.controller;

import com.ljw.entity.IaeExtract;
import com.ljw.service.IaeDepartureService;
import com.ljw.service.IaeExtractService;
import com.ljw.service.SorPackagedetailsService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("extract")
public class IaeExtractController {
    @Autowired
    private IaeExtractService iaeExtractService;

    @Autowired
    private SorPackagedetailsService sorPackagedetailsService;
    @RequestMapping("list")
    public ResponseResult list(String id ,String vehicleint, Integer page, Integer limit){
        ResponseResult result=new ResponseResult();
        Map<String,Object> map=iaeExtractService.select(id,vehicleint,page,limit);
        if (map.size()>0){
          result.getData().putAll(map);
        }
        return  result;
    }
    @RequestMapping("IaeList")
    public ResponseResult IaeList(String id, Integer page, Integer limit){
        ResponseResult result=new ResponseResult();
        Map<String,Object> map=iaeExtractService.selectIae(id,page,limit);
        if (map.size()>0){
            result.getData().putAll(map);
        }
        return result;
    }
    @RequestMapping("add")
    public ResponseResult insert(IaeExtract iaeExtract){
        ResponseResult result=new ResponseResult();
        List<String> list=sorPackagedetailsService.select();
        for (String name:list){
            iaeExtract.setImportanthints(name);
        }
        iaeExtract.setEstimatedate(new Date());
        iaeExtractService.insert(iaeExtract);
        result.getData().put("message","添加成功");
        result.getData().put("title","成功");
        result.getData().put("type","success");
        return result;
    }
}
