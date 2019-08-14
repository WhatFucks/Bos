package com.sor.controller;

import com.sor.service.SorPackageService;
import com.sor.entity.SorPackage;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("sorPackage")
public class SorPackageController {
    @Autowired
    private SorPackageService sorPackageService;

    /**
     * 根据id拆包
     * @param id
     * @return
     */
    @RequestMapping("chaiCheck")
    public ResponseResult chaiCheck(String id){
        ResponseResult result = new ResponseResult();
        sorPackageService.chaiCheck(id);
        result.getData().put("message","拆包成功");
        return  result;
    }

    /**
     * 拆包，根据id查询信息
     * @param id
     * @return
     */
    @RequestMapping("queryAllById")
    public ResponseResult queryAllById(String id){
        ResponseResult result = new ResponseResult();
        result.getData().put("dynamicValidateForm",sorPackageService.queryAllById(id));
        return  result;
    }


    /**
     * 新增合包信息及合包详情
     * @param sorPackage
     * @return
     */
    @RequestMapping("insertPackage")
    public ResponseResult insertPackage(@RequestBody SorPackage sorPackage){
        ResponseResult result = new ResponseResult();
        sorPackageService.insertPackage(sorPackage);
        result.getData().put("message","新增成功");
        return  result;
    }

    /**
     * 分页条件查询
     * @param sorPackage
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping("packageList")
    public ResponseResult packageList(SorPackage sorPackage, Integer pageSize, Integer pageNum){
        ResponseResult result = new ResponseResult();
       Map map= sorPackageService.pageList(sorPackage,pageSize,pageNum);
        result.setData(map);
        return result;
    }
}
