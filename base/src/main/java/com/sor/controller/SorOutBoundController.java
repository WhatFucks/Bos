package com.sor.controller;

import com.sor.entity.SorOutBound;
import com.sor.service.SorOutBoundService;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RequestMapping("sorOutBound")
@RestController
public class SorOutBoundController {
    @Autowired
    private SorOutBoundService sorOutBoundService;


    /**
     * 查询线路类型
     * @param
     * @return
     */
    @RequestMapping("ListToSorOutBoundType")
    public ResponseResult ListToSorOutBoundType(){
        ResponseResult result = new ResponseResult();
        result.getData().put("ListToSorOutBoundType",sorOutBoundService.SorOutBoundTypeList());
        return  result;
    }



    /**
     * 新增入库信息
     * @param sorOutBound
     * @return
     */
    @RequestMapping("insertsorStorage")
    public ResponseResult insertsorStorage(@RequestBody SorOutBound sorOutBound, HttpSession session){
        ResponseResult result = new ResponseResult();
        sorOutBoundService.insertSorOutBount(sorOutBound);
        result.getData().put("message","新增成功");
        return  result;
    }

    /**
     * 修改入库信息
     * @param sorOutBound
     * @return
     */
    @RequestMapping("updateToSorOutBound")
    public ResponseResult updateToSorOutBound(@RequestBody SorOutBound sorOutBound){
        ResponseResult result = new ResponseResult();
        sorOutBoundService.updateSorOutBount(sorOutBound);
        result.getData().put("message","修改成功");
        return  result;
    }

    /**
     * 根据id删除入库信息
     * @param id
     * @return
     */
    @RequestMapping("deleteTosoroutBound")
    public ResponseResult deleteTosoroutBound(String id){
        ResponseResult result = new ResponseResult();
        sorOutBoundService.deletesorOutBount(id);
        result.getData().put("message","删除成功");
        return  result;
    }

    /**
     * 分页条件查询
     * @return
     */
    @RequestMapping("list")
    public ResponseResult pageList(SorOutBound sorOutBound,Integer pageSize, Integer pageNum){
        ResponseResult result = new ResponseResult();
        Map map = sorOutBoundService.pageOutBound(sorOutBound,pageSize,pageNum);
        result.setData(map);
        return  result;
    }

}
