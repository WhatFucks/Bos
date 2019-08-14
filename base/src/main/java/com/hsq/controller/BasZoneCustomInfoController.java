package com.hsq.controller;

import com.hsq.entity.BasZoneCustomInfo;
import com.hsq.service.BasZoneCustomInfoService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("zonecustominfo")
public class BasZoneCustomInfoController {

    @Autowired
    private BasZoneCustomInfoService basZoneInfoServiceImplHsq;

    //  ---------- 查看列表
    @RequestMapping("findByZid")
    public ResponseResult findByZid(Integer id){
        ResponseResult result=new ResponseResult();
        result.getData().putAll(basZoneInfoServiceImplHsq.findByZid(id));
        return result;
    }

    @RequestMapping("delete2")
    public ResponseResult delete2(Integer id){
        basZoneInfoServiceImplHsq.deleteById(id);
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("add2")
    public ResponseResult add2(BasZoneCustomInfo basZoneCustomInfo){
        ResponseResult result = new ResponseResult();
        basZoneInfoServiceImplHsq.add2(basZoneCustomInfo);
        return result;
    }

    @RequestMapping("update2")
    public ResponseResult update2(BasZoneCustomInfo basZoneCustomInfo){
        ResponseResult result = new ResponseResult();
        basZoneInfoServiceImplHsq.update2(basZoneCustomInfo);
        return result;
    }
}
