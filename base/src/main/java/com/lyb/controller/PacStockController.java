package com.lyb.controller;

import com.lyb.entity.PacStockitem;
import com.ljw.service.PacStockOutService;
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

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("stock")
public class PacStockController {
    @Autowired
    private PacStockService pacStockService;
//    @Autowired
//    private PacStockOutService pacStockOutService;
//    @RequestMapping("list")
//    //入库分页
//    public ResponseResult list(Integer reservoirtype,String warehouseno, Integer page, Integer limit, HttpSession session){
//        ResponseResult result=new ResponseResult();
//        String i = pacStockService.selectBytransport();
//        String param = i.substring(3);
//        int s=Integer.parseInt(param);
//        s=++s;
//        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
//        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
//        String MaxNo = "YSD"+resluts;
//        Map<String,Object> map =pacStockService.select(reservoirtype,warehouseno,page,limit);
//        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
//        String dept=pacStockOutService.selectdept(new Long(loginUser.getDeptId()));
//        if (map!=null){
//            result.getData().putAll(map);
//            result.getData().put("ulist",loginUser.getUsername());
//            result.getData().put("uid",loginUser.getId());
//            result.getData().put("MaxNo",MaxNo);
//            result.getData().put("Dept",dept);
//        }
//        return result;
//    }
//    //入库添加
//    @RequestMapping("insert")
//    public ResponseResult insert(com.ljw.entity.PacStock pacStock){
//        ResponseResult result=new ResponseResult();
//        String i = pacStockService.selectByWarehouseno();
//        String param = i.substring(2);
//        int s=Integer.parseInt(param);
//        s=++s;
//        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
//        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
//        String MaxNo = "PK"+resluts;
//        pacStock.setWarehouseno(MaxNo);
//        pacStock.setStatus(0);
//        pacStock.setDrawertime(new Date());
//        pacStockService.insert(pacStock);
//        result.getData().put("message","添加成功");
//        result.getData().put("type","success");
//        result.getData().put("title","成功");
//        return result;
//    }
//    //入库修改
//    @RequestMapping("update")
//    public ResponseResult update(com.ljw.entity.PacStock pacStock){
//        ResponseResult result=new ResponseResult();
//        pacStock.setStatus(0);
//        pacStock.setDrawertime(new Date());
//        pacStockService.update(pacStock);
//        result.getData().put("message","修改成功");
//        result.getData().put("title","成功");
//        result.getData().put("type","success");
//        return result;
//    }
//    //查询入库明细
//    @RequestMapping("itemsList")
//    public ResponseResult itemsList(String warehouseno){
//        ResponseResult result=new ResponseResult();
////        List<PacStockitem> list=pacStockService.Stockitemlist(warehouseno);
//        List<PacStockitem> list=pacStockService.Stockitemlist(warehouseno);
//        if (list!=null){
//            result.getData().put("ItemsList",list);
//        }
//        return result;
//    }

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
