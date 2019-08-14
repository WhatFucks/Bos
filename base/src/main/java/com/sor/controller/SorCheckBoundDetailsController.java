package com.sor.controller;

import com.sor.service.SorCheckBoundDetailsService;
import com.sor.entity.SorCheckBoundDetails;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("sorCheckBoundDetails")
@RestController
public class SorCheckBoundDetailsController {
    @Autowired
    private SorCheckBoundDetailsService sorCheckBoundDetailsService;

    /**
     * 类型集合
     * @return
     */
    @RequestMapping("typeList")
    public ResponseResult typeList(){
        ResponseResult result = new ResponseResult();
        result.getData().put("typeList",sorCheckBoundDetailsService.typeList());
        return  result;
    }

    /**
     * 根据id查询详情
     * @param id
     * @return
     */
    @RequestMapping("detailList")
    public ResponseResult detailList(String id){
        ResponseResult result = new ResponseResult();
       List<SorCheckBoundDetails> list= sorCheckBoundDetailsService.listById(id);
        result.getData().put("listById",list);
        return  result;
    }
}
