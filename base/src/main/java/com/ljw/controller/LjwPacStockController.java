package com.ljw.controller;

import com.ljw.entity.PacStock;
import com.ljw.entity.PacStockitem;
import com.ljw.service.PacStockOutService;
import com.ljw.service.LjwPacStockService;
import com.lyb.entity.SysUser;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("stockljw")
public class LjwPacStockController {
    @Autowired
    private LjwPacStockService ljwPacStockService;
    @Autowired
    private PacStockOutService pacStockOutService;
    @RequestMapping("list")
    //入库分页
    public ResponseResult list(Integer reservoirtype,String warehouseno, Integer page, Integer limit, HttpSession session){
        ResponseResult result=new ResponseResult();
        String i = ljwPacStockService.selectBytransport();
        String param = i.substring(3);
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        String MaxNo = "YSD"+resluts;
        Map<String,Object> map =ljwPacStockService.select(reservoirtype,warehouseno,page,limit);
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        String dept=pacStockOutService.selectdept(new Long(loginUser.getDeptId()));
        if (map!=null){
            result.getData().putAll(map);
            result.getData().put("ulist",loginUser.getUsername());
            result.getData().put("uid",loginUser.getId());
            result.getData().put("MaxNo",MaxNo);
            result.getData().put("Dept",dept);
        }
        return result;
    }
    //入库添加
    @RequestMapping("insert")
    public ResponseResult insert(PacStock pacStock){
        ResponseResult result=new ResponseResult();
        String i = ljwPacStockService.selectByWarehouseno();
        String param = i.substring(2);
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        String MaxNo = "PK"+resluts;
        pacStock.setWarehouseno(MaxNo);
        pacStock.setStatus(1);
        pacStock.setDrawertime(new Date());
        ljwPacStockService.insert(pacStock);
        result.getData().put("message","添加成功");
        result.getData().put("type","success");
        result.getData().put("title","成功");
        return result;
    }
    //入库修改
    @RequestMapping("update")
    public ResponseResult update(PacStock pacStock){
        ResponseResult result=new ResponseResult();
        pacStock.setStatus(0);
        pacStock.setDrawertime(new Date());
        ljwPacStockService.update(pacStock);
        result.getData().put("message","修改成功");
        result.getData().put("title","成功");
        result.getData().put("type","success");
        return result;
    }
    //查询入库明细
    @RequestMapping("itemsList")
    public ResponseResult itemsList(String warehouseno){
        ResponseResult result=new ResponseResult();
        List<PacStockitem> list=ljwPacStockService.Stockitemlist(warehouseno);
        if (list!=null){
            result.getData().put("ItemsList",list);
        }
        return result;
    }
}
