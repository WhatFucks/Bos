package com.ljw.controller;

import com.ljw.entity.PacStockout;
import com.ljw.service.PacStockOutService;
import com.lyb.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.util.ResponseResult;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("stockout")
public class LjwPacStockOutController {

    @Autowired
    private PacStockOutService pacStockOutService;

    @RequestMapping("list")
    //出库条件分页
    public ResponseResult list(Integer warehousetype, String warehouseorderno, Integer page, Integer limit, HttpSession session){
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        ResponseResult result=new ResponseResult();
        String sysDepts=pacStockOutService.selectdept(new Long(loginUser.getDeptId()));
        //运输单号
        String i = pacStockOutService.transportationOrderNo();
        String param = i.substring(3);
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        String HGI = "HGI"+resluts;
        Map<String,Object> map = pacStockOutService.select(warehousetype,warehouseorderno,page,limit);
        if (map!=null){
            result.getData().putAll(map);
            result.getData().put("ulist",loginUser.getUsername());
            result.getData().put("uid",loginUser.getId());
            result.getData().put("deptId",loginUser.getDeptId());
            result.getData().put("HGI",HGI);
            result.getData().put("menu",sysDepts);
        }
        return result;
    }
    @RequestMapping("insert")
    //出库添加
    public ResponseResult insert(PacStockout pacStockout,HttpSession session){
        ResponseResult result=new ResponseResult();
        //出库号
        String g = pacStockOutService.WarehouseOrderNo();
        System.out.println("出库号="+g);
        String params = g.substring(3);
        int s2=Integer.parseInt(params);
        s2=++s2;
        s2=s2==1000?1:s2;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts2=s2>=10?(s2>=100?s2+"":"0"+s2):"00"+s2; // 计算 转型
        String CK = "CK1"+resluts2;
        pacStockout.setBillingtime(new Date());
        pacStockout.setRecipienttime(new Date());
        pacStockout.setWarehouseorderno(CK);
        pacStockOutService.insert(pacStockout);
        result.getData().put("message","添加成功");
        result.getData().put("title","成功");
        result.getData().put("type","success");
        return result;
    }
    @RequestMapping("update")
    //出库修改
    public ResponseResult update(PacStockout pacStockout){
        ResponseResult result=new ResponseResult();
        pacStockOutService.update(pacStockout);
        result.getData().put("message","修改成功");
        result.getData().put("title","成功");
        result.getData().put("type","success");
        return result;
    }
}
