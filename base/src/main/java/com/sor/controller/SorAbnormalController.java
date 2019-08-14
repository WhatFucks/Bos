package com.sor.controller;

import com.sor.entity.SorAbnormal;
import com.sor.service.SorAbnormalService;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("sorAbnormal")
@RestController
public class SorAbnormalController {
    @Autowired
    private SorAbnormalService sorAbnormalService;


    @RequestMapping("listAll")
    public ResponseResult listAll(){
        ResponseResult result = new ResponseResult();
        result.getData().put("listAll",sorAbnormalService.listAll());
        return  result;
    }

    /**
     * 新增异常
     * @return
     */
    @RequestMapping("insertToSorAbnormal")
    public ResponseResult insertSorAbnormal(@RequestBody SorAbnormal sorAbnormal){
        ResponseResult result = new ResponseResult();
        if(sorAbnormal.getHedgeabnint()!=null){
          SorAbnormal sorAbnormal1=  sorAbnormalService.findById(sorAbnormal.getHedgeabnint());
            if(sorAbnormal1!=null){
                if(sorAbnormal1.getId().equals(sorAbnormal.getHedgeabnint())){
                    sorAbnormalService.updateById(sorAbnormal1.getId());
                    result.getData().put("message","对冲异常成功");
                }
            }
        }else{
            sorAbnormalService.insertSorAbnormal(sorAbnormal);
            result.getData().put("message","新增成功");
        }
        return  result;
    }
}
