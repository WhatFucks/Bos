package com.sor.controller;

import com.sor.entity.SorStorage;
import com.sor.service.SorStorageDetailsService;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("sorStorageDetails")
@RestController
public class SorStorageDetailsController {
    @Autowired
    private SorStorageDetailsService sorStorageDetailsService;

    /**
     * 根据单号id查询信息
     * @param id
     * @return
     */
    @RequestMapping("getByWorkId")
    public ResponseResult getByWorkId(String id){
        ResponseResult result = new ResponseResult();
        result.getData().put("worck",sorStorageDetailsService.getByworksheetId(id));
        return  result;
    }

    /**
     * 库存查询
     * @return
     */
    @RequestMapping("queryStorageDetail")
    public ResponseResult queryStorageDetail(SorStorage sorStorage, Integer pageSize, Integer pageNum){
        ResponseResult result = new ResponseResult();
        result.setData(sorStorageDetailsService.queryDetailAll(sorStorage,pageSize,pageNum));
        return  result;
    }

    @RequestMapping("findByStorageId")
    public ResponseResult findByStorageId(String id){
        ResponseResult result = new ResponseResult();
        result.getData().put("storageDetail",sorStorageDetailsService.findByStorageId(id));
        return result;
    }
}
