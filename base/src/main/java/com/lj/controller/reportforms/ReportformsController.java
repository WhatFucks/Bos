package com.lj.controller.reportforms;

import com.lj.entity.reportforms.Reportforms;
import com.lj.service.reportforms.AccworkorderService;
import com.lj.service.reportforms.ReportformsService;
import com.lj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("reportforms")
public class ReportformsController {

    @Autowired
    private ReportformsService reportformsService;

    private AccworkorderService accworkorderService;

    //查询数据表格
    @RequestMapping("reportformsList")
    public @ResponseBody
    ResponseResult reportformsList(){
        ResponseResult result=new ResponseResult();
        List<Reportforms> list=reportformsService.selectReportforms();
        List<Integer> su=reportformsService.selectSucceed();
        List<Integer> de=reportformsService.selectDefeated();
        String[] wn=reportformsService.selectWattname();
        result.getData().put("dataOne",su);
        result.getData().put("dataTwo",de);
        result.getData().put("dataDay",wn);
        return result;
    }


}
