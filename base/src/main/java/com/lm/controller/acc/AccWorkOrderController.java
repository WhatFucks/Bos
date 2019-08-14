package com.lm.controller.acc;

import com.lm.entity.acc.AccWorkOrder;
import com.lm.service.acc.AccWorkOrderService;
import com.lm.util.note.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("accworkorder")
public class AccWorkOrderController {
    @Autowired
    private AccWorkOrderService accWorkOrderService;
    @RequestMapping("list")
    public ResponseResult list(String workSheetNo, String wsJobNo, Integer page, Integer limit){
        Map map= accWorkOrderService.SelectAccWorkOrder(workSheetNo,wsJobNo,page,limit);
        ResponseResult result=new ResponseResult();
        result.getData().putAll(map);
        return result;
    }
    @RequestMapping("SortingCodeAll")
    public ResponseResult SortingCodeAll(){
        List<AccWorkOrder> list = accWorkOrderService.SortingCodeAll();
        ResponseResult result=new ResponseResult();
        result.getData().put("AllFdbm",list);
        return result;
    }

}
