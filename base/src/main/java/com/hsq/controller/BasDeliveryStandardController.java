package com.hsq.controller;

import com.hsq.entity.BasDeliveryStandard;
import com.hsq.service.BasDeliveryStandardService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
/*@RequestMapping("basDeliveryStandard")*/
@RequestMapping("bas")
public class BasDeliveryStandardController {
    @Autowired
    private BasDeliveryStandardService basDeliveryStandardService;

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


    @RequestMapping("list")
    public ResponseResult list(BasDeliveryStandard basDeliveryStandard, Integer page, Integer limit){
        Map<String,Object> map = basDeliveryStandardService.basDeliveryStandardAll(basDeliveryStandard,page,limit);
        ResponseResult result = new ResponseResult();
        result.getData().putAll(map);
        return result;
    }

    @RequestMapping("deleteById")
    public ResponseResult deleteById(Long id){
        basDeliveryStandardService.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping(value = "add")
    public ResponseResult add(BasDeliveryStandard basDeliveryStandard){
        ResponseResult result = new ResponseResult();
        basDeliveryStandard.setOperationtime(new Date());
        basDeliveryStandardService.add(basDeliveryStandard);
        return result;
    }

    @RequestMapping("updateById")
    public ResponseResult updateById(BasDeliveryStandard basDeliveryStandard){
        ResponseResult result = new ResponseResult();
        basDeliveryStandard.setOperationtime(new Date());
        basDeliveryStandardService.updateById(basDeliveryStandard);
        return result;
    }

    @RequestMapping("selectByName")
    public ResponseResult selectByName(String dname){
        ResponseResult result = new ResponseResult();
        boolean flag = basDeliveryStandardService.selectByName(dname);
        result.getData().put("flag",flag);
        return result;
    }
}
