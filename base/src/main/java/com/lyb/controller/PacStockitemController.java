package com.lyb.controller;

import com.lyb.entity.PacStockitem;
import com.lyb.general.PageEntity;
import com.lyb.general.ResponseResult;
import com.lyb.service.PacStockitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("pacStockitem")
@RestController
public class PacStockitemController {
    @Autowired
    private PacStockitemService pacStockitemService;

    /**
     * 包装信息查询（带分页）
     * @param page
     * @param stockitem
     * @return
     */
    @RequestMapping("getPacStockItemList")
    public ResponseResult getPacStockItemList(PageEntity page, PacStockitem stockitem){
        ResponseResult result = new ResponseResult();
        result.setData(pacStockitemService.getPacStockItemList(page,stockitem));
        return result;
    }
}
