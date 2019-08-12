package com.lyb.controller;

import com.lyb.service.AccWorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accworkorder")
public class AccWorkOrderController {
    @Autowired
    private AccWorkOrderService accWorkOrderService;

}
