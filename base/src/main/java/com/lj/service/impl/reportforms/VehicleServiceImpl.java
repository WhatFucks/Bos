package com.lj.service.impl.reportforms;

import com.lj.mapper.reportforms.VehicleMapper;
import com.lj.service.reportforms.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleMapper vehicleMapper;

    @Override
    public int[] selectVehicle() {
        return vehicleMapper.selectVehicle();
    }
}
