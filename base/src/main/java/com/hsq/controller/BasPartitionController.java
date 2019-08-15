package com.hsq.controller;

import com.hsq.entity.BasPartition;
import com.hsq.service.BasPartitionService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("baspartition")
public class BasPartitionController {

    @Autowired
    private BasPartitionService basPartitionService;

    @RequestMapping("list")
    public ResponseResult list(BasPartition basPartition, Integer page, Integer limit){
        Map<String,Object> map = basPartitionService.basPartitionAll(basPartition,page,limit);
        ResponseResult result = new ResponseResult();
        result.getData().putAll(map);
        return result;
    }

    @RequestMapping("deleteById")
    public ResponseResult deleteById(Integer id){
        basPartitionService.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(BasPartition basPartition){
        ResponseResult result = new ResponseResult();
        basPartitionService.add(basPartition);
        return result;
    }

    @PostMapping("updateById")
    public ResponseResult updateById(BasPartition basPartition){
        ResponseResult result = new ResponseResult();
        basPartitionService.updateById(basPartition);
        return result;
    }


    @org.springframework.web.bind.annotation.InitBinder
    public void InitBinder(WebDataBinder binder, WebRequest request)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(df,true);//参数为true表示允许为空值
        binder.registerCustomEditor(Date.class, editor);
    }
}
