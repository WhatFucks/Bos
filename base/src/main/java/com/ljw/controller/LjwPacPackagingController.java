package com.ljw.controller;

import com.ljw.entity.PacInventory;
import com.ljw.entity.PacPackaging;
import com.ljw.service.PacInventoryService;
import com.ljw.service.LjwPacPackagingService;
import com.lyb.entity.SysUser;
import com.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("packaging")
public class LjwPacPackagingController {
    @Autowired
    private LjwPacPackagingService ljwPacPackagingService;

    @Autowired
    private PacInventoryService pacInventoryService;
    @RequestMapping("list")
    //包装材料分页查询
    public ResponseResult list (String itemcode,String itemname, Integer page, Integer limit, HttpSession session){
         ResponseResult result=new ResponseResult();
        String i = ljwPacPackagingService.selectMaxItemCode();
        String param = i.substring(2);
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        String MaxNo = "AF"+resluts;
        Map<String,Object> map=ljwPacPackagingService.select(itemcode,itemname,page,limit);
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        if (map != null){
            result.getData().putAll(map);
            result.getData().put("ulist",loginUser.getUsername());
            result.getData().put("uid",loginUser.getId());
            result.getData().put("MaxNo",MaxNo);
        }
        return result;
    }
    @RequestMapping("delete")
//    包装材料删除
    public ResponseResult delete(Integer id,HttpSession session){
        ResponseResult result=new ResponseResult();
        SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
        PacPackaging list=ljwPacPackagingService.selectById(id);
        PacInventory troylist=pacInventoryService.Listinventory(list.getItemname());
        if (troylist!=null){
            result.getData().put("message","库存里有【"+list.getItemname()+"】该货物，不能作废");
            result.getData().put("title","提示");
            result.getData().put("type","warning");
        }else {
            list.setInvalidatename(loginUser.getUsername());
            list.setStatus(0);
            list.setInvalidatetime(new Date());
            ljwPacPackagingService.update(list);
            result.getData().put("message","作废成功");
            result.getData().put("title","成功");
            result.getData().put("type","success");
        }
        return result;
    }
    @RequestMapping("update")
    //包装材料修改
    public ResponseResult update(PacPackaging pacPackaging){
        ResponseResult result=new ResponseResult();
        pacPackaging.setOperationtime(new Date());
        ljwPacPackagingService.update(pacPackaging);
        result.getData().put("message","修改成功");
        result.getData().put("type","success");
        result.getData().put("title","成功");
        return result;
    }
    @RequestMapping("insert")
    //包装材料添加 accBusinessAdmissibilityService
    public ResponseResult insert(PacPackaging pacPackaging){
        ResponseResult result=new ResponseResult();
        pacPackaging.setOperationtime(new Date());
        pacPackaging.setStatus(1);
        ljwPacPackagingService.insert(pacPackaging);
        result.getData().put("message","添加成功");
        result.getData().put("type","success");
        result.getData().put("title","成功");
        return result;
    }
    @RequestMapping("Specificationslist")
    public ResponseResult Specificationslist(){
        ResponseResult result=new ResponseResult();
        Set<PacPackaging> set=ljwPacPackagingService.selectSpecifications();
        if (set.size()>0){
            result.getData().put("SetList",set);
        }
        return result;
    }
}
