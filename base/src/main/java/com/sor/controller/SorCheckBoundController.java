package com.sor.controller;

import com.sor.entity.SorCheckBound;
import com.sor.service.SorCheckBoundService;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("sorCheckBound")
@RestController
public class SorCheckBoundController {
    @Autowired
    private SorCheckBoundService sorCheckBoundService;

    /**
     * 新增出库信息及出库详情
     * @param sorCheckBound
     * @return
     */
    @RequestMapping("insertCheckBound")
    public ResponseResult insertCheckBound(@RequestBody SorCheckBound sorCheckBound){
        ResponseResult result = new ResponseResult();
        sorCheckBoundService.insertCheckBound(sorCheckBound);
        result.getData().put("message","新增成功");
        return  result;
    }

    /**
     * 根据id删除出库信息
     * @param id
     * @return
     */
    @RequestMapping("deleteCheckBound")
    public ResponseResult deleteCheckBound(String id){
        ResponseResult result = new ResponseResult();
        sorCheckBoundService.deleteCheckBound(id);
        result.getData().put("message","删除成功");
        return  result;
    }

    /**
     * 修改
     * @param sorCheckBound
     * @return
     */
    @RequestMapping("updateCheckBound")
    public ResponseResult updateCheckBound(@RequestBody SorCheckBound sorCheckBound){
        ResponseResult result = new ResponseResult();
        sorCheckBoundService.updateCheckBound(sorCheckBound);
        result.getData().put("message","修改成功");
        return  result;
    }

    /**
     * 分页查询
     * @param sorCheckBound
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping("list")
    public ResponseResult pageList(SorCheckBound sorCheckBound,Integer pageSize, Integer pageNum){
        ResponseResult result = new ResponseResult();
        Map map = sorCheckBoundService.sorCheckBoundPageList(sorCheckBound,pageSize,pageNum);
        result.setData(map);
        return  result;

    }
}
