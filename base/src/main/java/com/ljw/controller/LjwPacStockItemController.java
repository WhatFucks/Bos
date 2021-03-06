package com.ljw.controller;

import com.ljw.entity.PacInventory;
import com.ljw.entity.PacPackaging;
import com.ljw.entity.PacStockitem;
import com.ljw.service.PacInventoryService;
import com.ljw.service.LjwPacPackagingService;
import com.ljw.service.LjwPacStockItemService;
import com.ljw.service.PacStockOutService;
import com.lyb.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.util.ResponseResult;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("item")
public class LjwPacStockItemController {
    @Autowired
    private LjwPacStockItemService ljwPacStockItemService;

    @Autowired
    private LjwPacPackagingService ljwPacPackagingService;

    @Autowired
    private PacInventoryService pacInventoryService;

    @Autowired
    private PacStockOutService pacStockOutService;
    //添加入库详情
    @RequestMapping("insert")
    public ResponseResult insert(PacStockitem pacStockitem, HttpSession session){
        ResponseResult result=new ResponseResult();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        String delpt=pacStockOutService.selectdept(new Long(loginUser.getDeptId()));
        //根据入库详情的货物名称查询包装材料表
        List<PacPackaging> list= ljwPacPackagingService.selectPackaging(pacStockitem.getGoodsname());

        // PacPackaging pacPackaging= ljwPacStockItemService.selectcode(pacStockitem.getGoodscode(),pacStockitem.getGoodsname());
//        if (pacPackaging!=null){
//
//        }
        if (list.size()>0){
            //添加入库详情
            pacStockitem.setWarehouseno(pacStockitem.getWarehouseno());
            pacStockitem.setStatus(1);
            ljwPacStockItemService.insertitem(pacStockitem);
            result.getData().put("message","添加成功");
            result.getData().put("title","成功");
            result.getData().put("type","success");
            PacInventory pacInventory=new PacInventory();
            PacInventory Plist=pacInventoryService.Listinventory(pacStockitem.getGoodsname());
            //判断库存是否有相同的货物名称
            if (Plist!=null){
                //如果货物相同修改金额、数量、价钱
                Integer sun=Plist.getStocknum()+pacStockitem.getStoragenum();
                Plist.setSpecifications(pacStockitem.getSpecifications());
                Plist.setMoney(pacStockitem.getPlannedprice()*sun);
                Plist.setStocknum(Plist.getStocknum()+pacStockitem.getStoragenum());
                Plist.setPlannedprice(pacStockitem.getPlannedprice());
                pacInventoryService.update(Plist);
            }else {
                //添加库存
                pacInventory.setGoodsname(pacStockitem.getGoodsname());
                pacInventory.setGoodsnumber(pacStockitem.getGoodscode());
                pacInventory.setStocknum(pacStockitem.getStoragenum());
                pacInventory.setPlannedprice(pacStockitem.getPlannedprice());
                pacInventory.setSpecifications(pacStockitem.getSpecifications());
                pacInventory.setAffiliatedunit(delpt);
                pacInventory.setMoney(pacStockitem.getPlannedprice() *pacStockitem.getStoragenum());
                pacInventory.setType(pacStockitem.getType());
                pacInventory.setMeasure("台");
                pacInventoryService.insert(pacInventory);
            }
        }else{
            result.getData().put("message","添加失败,没有【"+pacStockitem.getGoodsname()+"】此包装盒!");
            result.getData().put("title","提示");
            result.getData().put("type","warning");
        }
        return result;
    }
    //修改入库详情
    @RequestMapping("update")
    public ResponseResult update(PacStockitem pacStockitem){
        ResponseResult result=new ResponseResult();
        List<PacPackaging> list= ljwPacPackagingService.selectPackaging(pacStockitem.getGoodsname());

        //判断材料管理是否有该货物名称
        if (list.size()>0){
            PacInventory Plist=pacInventoryService.Listinventory(pacStockitem.getGoodsname());
            //如果货物相同修改金额、数量、价钱
            if (Plist!=null){
                //数量
                Integer sun=Plist.getStocknum()+pacStockitem.getStoragenum();
                Plist.setSpecifications(pacStockitem.getSpecifications());
                Plist.setMoney(pacStockitem.getPlannedprice()*sun);
                Plist.setStocknum(Plist.getStocknum()+pacStockitem.getStoragenum());
                Plist.setPlannedprice(pacStockitem.getPlannedprice());
                pacInventoryService.update(Plist);

                ljwPacStockItemService.updateitem(pacStockitem);
                result.getData().put("message","修改成功");
                result.getData().put("title","成功");
                result.getData().put("type","success");
            }
        }else {
            result.getData().put("message","修改失败,没有【"+pacStockitem.getGoodsname()+"】此包装盒!");
            result.getData().put("title","提示");
            result.getData().put("type","warning");
        }
        return result;
    }
//    @RequestMapping("selectpacking")
//    public ResponseResult selectpacking(String GoodsCode){
//        System.out.println("GoodsCode=="+GoodsCode);
//        ResponseResult result=new ResponseResult();
//        PacPackaging pacPackaging=ljwPacStockItemService.selectcode(GoodsCode);
//        System.out.println("pacPackaging=="+pacPackaging);
//        if (pacPackaging!=null){
//            result.getData().put("Packs",pacPackaging);
//        }
//        return result;
//    }
}
