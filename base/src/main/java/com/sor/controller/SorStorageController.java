package com.sor.controller;//package com.com.xr.controller;

import com.lyb.entity.SysUser;
import com.sor.service.SorAbnormalService;
import com.sor.entity.SorAbnormal;
import com.sor.entity.SorStorage;
import com.sor.entity.SorStorageDetails;
import com.sor.service.SorStorageService;
import com.sor.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("storage")
@RestController
public class SorStorageController {
    @Autowired
    private SorStorageService sorStorageService;

    @Autowired
    private SorAbnormalService sorAbnormalService;

    @RequestMapping("deleteSorStorage")
    public ResponseResult deleteSorStorage(String id){
        ResponseResult result = new ResponseResult();
        sorStorageService.deleteStorage(id);
        result.getData().put("message","删除成功");
        return  result;
    }

    /**
     * 修改
     * @param sorStorage
     * @return
     */
    @RequestMapping("updateSorStorage")
    public ResponseResult updateSorStorage(@RequestBody SorStorage sorStorage){
        ResponseResult result = new ResponseResult();
        sorStorageService.updateStorage(sorStorage);
        result.getData().put("message","修改成功");
        return  result;
    }

    /**
     * 重量计算
     * @return
     */
    @RequestMapping("getByWeights")
    public ResponseResult getByWeights(){
        ResponseResult result = new ResponseResult();
        result.setData(sorStorageService.getByWeights());
        return result;
    }
    /**
     * 新增入库及入库详情
     * @param sorStorage
     * @param session
     * @return
     */
    @RequestMapping("insertsorStorage")
    public ResponseResult insertsorStorage(@RequestBody  SorStorage sorStorage, HttpSession session){
       SysUser user= (SysUser) session.getAttribute("loginUser");
        ResponseResult result = new ResponseResult();
        sorStorageService.insertSorStorage(sorStorage,sorStorage.getDomains());
        result.getData().put("message","新增入库信息成功");
        // 入库详情
       List<SorStorageDetails> list= sorStorage.getDomains();
       for(SorStorageDetails sd: list){
           if(sd.getId()==null && sd.getState()!=null){
               SorAbnormal sorAbnormal = new SorAbnormal();
               sorAbnormal.setAbostate(2);
               sorAbnormal.setAbnormaltype(2);
               sorAbnormal.setLaunchperson(user.getUsername());
               sorAbnormal.setLaunchcompany(sorStorage.getAcceptcompany());
               sorAbnormal.setPackageint(sd.getPackageid());
               sorAbnormal.setTransferint(sd.getOutboundid());
               sorAbnormalService.insertSorAbnormal(sorAbnormal);
               result.getData().put("message","新增异常信息成功");
           }

           if(sd.getState()==null && sd.getId()!=null){
               SorAbnormal sorAbnormal2 = new SorAbnormal();
               sorAbnormal2.setAbostate(2);
               sorAbnormal2.setAbnormaltype(1);
               sorAbnormal2.setCargoint(sd.getId());
               SysUser user1=sorStorageService.findById(sorStorage.getAcceptperson());
               sorAbnormal2.setLaunchperson(user1.getUsername());
               sorAbnormal2.setLaunchcompany(sorStorage.getAcceptcompany());
               sorAbnormal2.setPackageint(sd.getPackageid());
               sorAbnormal2.setTransferint(sd.getOutboundid());
               if(sd.getOutboundid()!=null){
                   sd.setState(3);
               }
               sorAbnormalService.insertSorAbnormal(sorAbnormal2);
               result.getData().put("message","新增异常信息成功");
           }
       }

        return result;
    }
    @RequestMapping("userselect")
    public ResponseResult userlist(){
        ResponseResult result = new ResponseResult();
        result.getData().put("userlist",sorStorageService.userlist());
        return result;
    }
    /**
     * 分页条件查询
     * @param sorStorage
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping("list")
    public ResponseResult list(SorStorage sorStorage, Integer pageSize, Integer pageNum){
        ResponseResult result = new ResponseResult();
        result.setData(sorStorageService.pageList(sorStorage,pageSize,pageNum));
        return  result;
    }
}
