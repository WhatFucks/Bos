package com.hsq.controller;

import com.hsq.entity.BasShuttleBus;
import com.hsq.service.BasShuttleBusService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("basShuttleBus")
public class BasShuttleBusController {

    @Autowired
    private BasShuttleBusService basShuttleBusService;

    /**
     * 时间解析
     * @param binder
     * @param request
     */
    @org.springframework.web.bind.annotation.InitBinder
    public void InitBinder(WebDataBinder binder, WebRequest request)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(df,true);//参数为true表示允许为空值
        binder.registerCustomEditor(Date.class, editor);
    }



    @PostMapping("list")
    public ResponseResult list(BasShuttleBus basShuttleBus, Integer page, Integer limit){
        Map<String,Object> map = basShuttleBusService.basShuttleBusAll(basShuttleBus,page,limit);
        ResponseResult result = new ResponseResult();
        result.getData().putAll(map);
        return result;
    }

    @RequestMapping("deleteById")
    public ResponseResult deleteById(Integer id){
        basShuttleBusService.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(BasShuttleBus basShuttleBus){
        ResponseResult result = new ResponseResult();
        basShuttleBus.setLineid(1);
        basShuttleBusService.add(basShuttleBus);
        return result;
    }

    @RequestMapping("updateById")
    public ResponseResult updateById(BasShuttleBus basShuttleBus){
        ResponseResult result = new ResponseResult();
        basShuttleBusService.updateById(basShuttleBus);
        return result;
    }
}
