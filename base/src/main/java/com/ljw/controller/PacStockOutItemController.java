package com.ljw.controller;

import com.ljw.entity.PacInventory;
import com.ljw.entity.PacStockoutitem;
import com.ljw.service.PacInventoryService;
import com.ljw.service.PacStockOutItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.util.ResponseResult;
import java.util.List;

@RestController
@RequestMapping("outitem")
public class PacStockOutItemController {
    @Autowired
    private PacStockOutItemService pacStockOutItemService;

    @Autowired
    private PacInventoryService pacInventoryService;
    @RequestMapping("list")
    //出库详情
    public ResponseResult list(String warehouseorderno){
        ResponseResult result=new ResponseResult();
        List<PacStockoutitem> list= pacStockOutItemService.outitem(warehouseorderno);
        System.out.println(list);
        if (list.size()>0){
            result.getData().put("OutItemList",list);
        }
        return result;
    }
    @RequestMapping("insert")
    //出库详情添加
    public ResponseResult insert(PacStockoutitem pacStockoutitem){
        ResponseResult result=new ResponseResult();
        List<PacInventory> list=pacInventoryService.Listinventory(pacStockoutitem.getGoodsname());
        if (list.size()>0){
            for(PacInventory p:list){
                if (pacStockoutitem.getStorageoutnum()<=p.getStocknum()){
                    pacStockoutitem.setStatus(1);
                    pacStockOutItemService.insert(pacStockoutitem);
                    result.getData().put("message","添加成功");
                    result.getData().put("title","成功");
                    result.getData().put("type","success");
                    p.setStocknum(p.getStocknum()-pacStockoutitem.getStorageoutnum());
                    pacInventoryService.update(p);
                }else{
                    result.getData().put("message","出库数量不能大于库存数量");
                    result.getData().put("title","提示");
                    result.getData().put("type","warning");
                }
                if(p.getStocknum()<=10){
                    result.getData().put("message","该【"+p.getGoodsname()+"】库存数量不足,请及时采购");
                    result.getData().put("title","提示");
                    result.getData().put("type","warning");
                }
            }
        }else {
            result.getData().put("message","添加失败,库存没有【"+pacStockoutitem.getGoodsname()+"】该货物");
            result.getData().put("title","提示");
            result.getData().put("type","warning");
        }

        return result;
    }
    @RequestMapping("update")
    //出库详情修改
    public ResponseResult update(PacStockoutitem pacStockoutitem){
        ResponseResult result=new ResponseResult();
        List<PacInventory> list=pacInventoryService.Listinventory(pacStockoutitem.getGoodsname());
        if (list.size()>0){
            for (PacInventory p:list){
                if(pacStockoutitem.getStorageoutnum()<=p.getStocknum()){
                    pacStockoutitem.setStatus(1);
                    pacStockOutItemService.update(pacStockoutitem);
                    result.getData().put("message","修改成功");
                    result.getData().put("title","成功");
                    result.getData().put("type","success");
                    p.setStocknum(p.getStocknum()-pacStockoutitem.getStorageoutnum());
                    pacInventoryService.update(p);
                    if(p.getStocknum()<=10){
                        result.getData().put("message","该【"+p.getGoodsname()+"】库存数量不足,请及时采购");
                        result.getData().put("title","提示");
                        result.getData().put("type","warning");
                    }
                }else {
                    result.getData().put("message","不能超出库存数量");
                    result.getData().put("title","提示");
                    result.getData().put("type","warning");
                }
            }
        }else {
            result.getData().put("message","修改失败,库存没有【"+pacStockoutitem.getGoodsname()+"】该货物");
            result.getData().put("title","提示");
            result.getData().put("type","warning");
        }
        return result;
    }
}
