package com.lj.controller.reportforms;

import com.lj.service.reportforms.VehicleService;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping("selectVehicle")
    public ResponseResult selectVehicle(){
        ResponseResult result=new ResponseResult();
        int[] a=vehicleService.selectVehicle();
        result.getData().put("vehicle",a);
        return  result;
    }
}
