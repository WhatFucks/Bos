package com.lyb.controller;

import com.lyb.entity.PacStock;
import com.lyb.entity.SysUser;
import com.lyb.general.PageEntity;
import com.util.ResponseResult;
import com.lyb.service.PacStockService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("stock")
public class PacStockController {
    @Autowired
    private PacStockService pacStockService;

    /**
     * 包装信息录入显示的数据列表（带条件分页）
     * @param page
     * @param stock
     * @return
     */
    @RequestMapping("getPacStockList")
    public ResponseResult getPacStockList(PageEntity page, PacStock stock){
        ResponseResult result = new ResponseResult();
        result.setData(pacStockService.getPacStockList(page,stock));
        return result;
    }

    /**
     * 添加包装信息
     * @param stock
     * @return
     */
    @RequestMapping("addPacStock")
    public ResponseResult addPacStock(PacStock stock){
        if(stock != null){
            stock.setTransport(pacStockService.getTransport());
            stock.setWarehouseno(pacStockService.getWarehouseNo());
            Subject subject = SecurityUtils.getSubject();
            Session session = subject.getSession();
            SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
            if(loginUser!=null){
                stock.setDrawerno(loginUser.getUserNo());
                stock.setDrawername(loginUser.getUsername());
                stock.setDrawertime(new Date());
                stock.setStatus(1);
            }
        }
        ResponseResult result = new ResponseResult();
        boolean success = pacStockService.addPacStock(stock);
        result.getData().put("success",success);
        return result;
    }

    /**
     * 修改包装信息
     * @param stock
     * @return
     */
    @RequestMapping("updatePacStock")
    public ResponseResult updatePacStock(PacStock stock){
        ResponseResult result = new ResponseResult();
        boolean success = pacStockService.updatePacStock(stock);
        result.getData().put("success",success);
        return result;
    }
}
