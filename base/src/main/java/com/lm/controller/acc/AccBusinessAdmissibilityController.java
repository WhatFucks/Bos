package com.lm.controller.acc;

import com.lm.entity.acc.AccBusinessAdmissibility;
import com.lm.entity.acc.AccWorkOrder;
import com.lm.service.acc.AccBusinessAdmissibilityService;
import com.lm.service.acc.AccWorkOrderService;
import com.lm.util.note.PhoneCodeXiao;
import com.lm.util.note.PhoneCodeXin;
import com.lm.util.note.PhoneCodeZhui;
import com.lm.util.note.ResponseResult;
import com.lyb.entity.SysUser;
import com.lyb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("acc")
public class AccBusinessAdmissibilityController {
    private static String code;
    @Autowired
    private AccBusinessAdmissibilityService accBusinessAdmissibilityService;
    @Autowired
    private AccWorkOrderService accWorkOrderService;
    @Autowired
    private SysUserService sysUserService;
    /**
     * 查询所以业务受理
     */
    @RequestMapping("list")
    public ResponseResult getList(String BusinessNoticeNo, String CustomCode, Integer page, Integer limit){
        String i = accBusinessAdmissibilityService.SelectMaxNo();
        String param = i.substring(3);
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        String MaxNo = "Wyn"+resluts;
        Map map= accBusinessAdmissibilityService.list(BusinessNoticeNo,CustomCode,page,limit);
        ResponseResult result=new ResponseResult();
        result.getData().putAll(map);
        result.getData().put("MaxNo",MaxNo);
        return result;
    }
    // 添加
    @RequestMapping("add")
    public ResponseResult  insert(AccBusinessAdmissibility accBusinessAdmissibility){
        /**
         * 获取最后一行数据
         */
        AccWorkOrder aw = accWorkOrderService.SelectMaxNo(); // 获取最好一列的数据
        String i = aw.getJobno();
        System.out.println("最后一行工单号为:"+i);
        String param = i.substring(3); // 从第三位开始截取
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型

        PhoneCodeXin phoneCode = new PhoneCodeXin();
        code = phoneCode.getPhonemsg(accBusinessAdmissibility.getTelphone());

        AccWorkOrder accWorkOrder = new AccWorkOrder();
        accWorkOrder.setBusinessnoticeno(accBusinessAdmissibility.getBusinessnoticeno()); // 业务通知单号
        accWorkOrder.setJobno("GDH"+resluts); // 工单号
        accWorkOrder.setJobtype(1); // 工单类型 1:新,2:追,3:销
        accWorkOrder.setPickupstatus(2); //  取件状态 1:新单,2:已通知,3:已确认
        int yzm = Integer.parseInt( code );
        accWorkOrder.setShortmessageint(yzm);// 短信序号
        accWorkOrder.setWorkgenerationtime(new Date());// 工单生成时间
        accWorkOrder.setAftersinglenum(0); // 追单次数
        accWorkOrder.setSmallmembernum(2);// 小件员编号
        accWorkOrder.setPickupunit(2); // 取件单位
        accWorkOrder.setPickuptime( new Date()); // 取件时间
        accWorkOrder.setSortingcode("W1234");// 分拣编码
        accWorkOrderService.insert(accWorkOrder);

        ResponseResult result=new ResponseResult();
        accBusinessAdmissibility.setReservationtime(new Date());
        accBusinessAdmissibility.setRepickuptime(new Date());
        accBusinessAdmissibility.setPickerinfo(1);
        accBusinessAdmissibility.setSendaddress("湖南省长沙岳麓区枫林三路五栋一单元");
        accBusinessAdmissibility.setProcessingunit(1);
        accBusinessAdmissibility.setNotificationsource(1);
        accBusinessAdmissibility.setCustomnomodifyflag(0);
        accBusinessAdmissibility.setSingletype("货物");
        accBusinessAdmissibility.setPackagesnum(1);
        accBusinessAdmissibilityService.insert(accBusinessAdmissibility);
        result.getData().put("title","成功");
        result.getData().put("message","添加成功");
        return result;
    }
    // 追单
    @RequestMapping("ChaseSingle")
    public  ResponseResult ChaseSingle(AccBusinessAdmissibility ba){
        /**
         * 获取最后一行数据
         */
        AccWorkOrder aw = accWorkOrderService.SelectMaxNo(); // 获取最好一列的数据
        String i = aw.getJobno();
        System.out.println("最后一行工单号为:"+i);
        String param = i.substring(3); // 从第三位开始截取
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        /**
         * 阿里云短信
         */
        PhoneCodeZhui phoneCode = new PhoneCodeZhui();
        code = phoneCode.getPhonemsg(ba.getTelphone());
        /**
         * 赋值 返回
         */
        AccWorkOrder awo = accWorkOrderService.ByNoSelect(ba.getBusinessnoticeno()); // 根据业务通知单号 查询 获得到最大的追单次数
        AccWorkOrder accWorkOrder = new AccWorkOrder();
        accWorkOrder.setBusinessnoticeno(ba.getBusinessnoticeno()); // 业务通知单号
        accWorkOrder.setJobno("GDH"+resluts); // 工单号
        accWorkOrder.setJobtype(2); // 工单类型 1:新,2:追,3:销
        accWorkOrder.setPickupstatus(2); //  取件状态 1:新单,2:已通知,3:已确认
        int yzm = Integer.parseInt( code );
        accWorkOrder.setShortmessageint(yzm);// 短信序号
        accWorkOrder.setWorkgenerationtime(new Date());// 工单生成时间
        accWorkOrder.setAftersinglenum(awo.getAftersinglenum()+1); // 追单次数
        accWorkOrder.setSmallmembernum(2);// 小件员编号
        accWorkOrder.setPickupunit(2); // 取件单位
        accWorkOrder.setPickuptime( new Date()); // 取件时间
        accWorkOrder.setSortingcode("W4321");// 分拣编码
        accWorkOrderService.insert(accWorkOrder);
        ResponseResult result = new ResponseResult();
        result.getData().put("title","成功");
        result.getData().put("message","追单成功");
        return   result;
    }
    // 销单
    @RequestMapping("MeltSingle")
    public  ResponseResult MeltSingle(AccBusinessAdmissibility aba){
        List<AccWorkOrder> list =  accWorkOrderService.ByNoSelectAll(aba.getBusinessnoticeno());
        AccWorkOrder awo = accWorkOrderService.ByNoSelect(aba.getBusinessnoticeno()); // 根据业务通知单号 查询 获得到最大的追单次数
        AccWorkOrder accWorkOrder = new AccWorkOrder();
        AccWorkOrder aw = accWorkOrderService.SelectMaxNo(); // 获取最后一列的数据
        String i = aw.getJobno();
        System.out.println("最后一行工单号为:"+i);
        String param = i.substring(3); // 从第三位开始截取
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        ResponseResult result = new ResponseResult();
        for (AccWorkOrder ao: list){
            if (ao.getPickupstatus()==1){ // 如果此时取件状态为“新单”，生成取件状态为“已注销”工单
                accWorkOrder.setBusinessnoticeno(aba.getBusinessnoticeno()); // 业务通知单号
                accWorkOrder.setJobno("GDH"+resluts); // 工单号
                accWorkOrder.setJobtype(3); // 工单类型 1:新,2:追,3:销
                accWorkOrder.setPickupstatus(0); //  取件状态 1:新单,2:已通知,3:已确认
                int yzm = Integer.parseInt( code );
                accWorkOrder.setShortmessageint(yzm);// 短信序号
                accWorkOrder.setWorkgenerationtime(new Date());// 工单生成时间
                accWorkOrder.setAftersinglenum(awo.getAftersinglenum()+1); // 追单次数
                accWorkOrder.setSmallmembernum(2);// 小件员编号
                accWorkOrder.setPickupunit(2); // 取件单位
                accWorkOrder.setPickuptime( new Date()); // 取件时间
                accWorkOrder.setSortingcode("W4321");// 分拣编码
                accWorkOrderService.insert(accWorkOrder);
                accBusinessAdmissibilityService.delete(aba.getId());
                result.getData().put("title","成功");
                result.getData().put("message","销单成功");
             }
            if (ao.getPickupstatus()==2 || ao.getPickupstatus()==3 ){  // 4)此时取件状态为”已通知”或”已确认”, 生成取件状态为“已注销”工单,还要发送销单短信。
                PhoneCodeXiao phoneCode = new PhoneCodeXiao();
                code = phoneCode.getPhonemsg(aba.getTelphone());
                accWorkOrder.setBusinessnoticeno(aba.getBusinessnoticeno()); // 业务通知单号
                accWorkOrder.setJobno("GDH"+resluts); // 工单号
                accWorkOrder.setJobtype(3); // 工单类型 1:新,2:追,3:销
                accWorkOrder.setPickupstatus(0); //  取件状态 1:新单,2:已通知,3:已确认
                accWorkOrder.setShortmessageint(0000);// 短信序号
                accWorkOrder.setWorkgenerationtime(new Date());// 工单生成时间
                accWorkOrder.setAftersinglenum(awo.getAftersinglenum()+1); // 追单次数
                accWorkOrder.setSmallmembernum(2);// 小件员编号
                accWorkOrder.setPickupunit(2); // 取件单位
                accWorkOrder.setPickuptime( new Date()); // 取件时间
                accWorkOrder.setSortingcode("W4321");// 分拣编码
                accWorkOrderService.insert(accWorkOrder);
                accBusinessAdmissibilityService.delete(aba.getId());
                result.getData().put("title","成功");
                result.getData().put("message","销单成功");
            }
            if (ao.getPickupstatus()==4 ){
                result.getData().put("title","失败");
                result.getData().put("message","已取件不能进行销单");
            }
        }
        return result;
    }
    // 改单
    @RequestMapping("UpdateSingle")
    public  ResponseResult UpdateSingle(AccBusinessAdmissibility aba){
        ResponseResult result = new ResponseResult();
        aba.setReservationtime(new Date());
        aba.setRepickuptime(new Date());
        accBusinessAdmissibilityService.update(aba);// 修改业务通知单
        AccBusinessAdmissibility acc = new AccBusinessAdmissibility();
        accWorkOrderService.SelectByNoDelete(acc.getBusinessnoticeno()); // 根据业务业务通知单号 删除 工单表数据
        AccWorkOrder awo = accWorkOrderService.ByNoSelect(aba.getBusinessnoticeno()); // 根据业务通知单号 查询 获得到最大的追单次数

        AccWorkOrder aw = accWorkOrderService.SelectMaxNo(); // 获取最后一列的数据
        String i = aw.getJobno();
        System.out.println("最后一行工单号为:"+i);
        String param = i.substring(3); // 从第三位开始截取
        int s=Integer.parseInt(param);
        s=++s;
        s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
        String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
        //生成销工单
        AccWorkOrder accWorkOrder = new AccWorkOrder();
        accWorkOrder.setBusinessnoticeno(aba.getBusinessnoticeno()); // 业务通知单号
        accWorkOrder.setJobno("GDH"+resluts); // 工单号
        accWorkOrder.setJobtype(3); // 工单类型 1:新,2:追,3:销
        accWorkOrder.setPickupstatus(0); //  取件状态 1:新单,2:已通知,3:已确认
        accWorkOrder.setShortmessageint(0000);// 短信序号
        accWorkOrder.setWorkgenerationtime(new Date());// 工单生成时间
        accWorkOrder.setAftersinglenum(0); // 追单次数
        accWorkOrder.setSmallmembernum(2);// 小件员编号
        accWorkOrder.setPickupunit(2); // 取件单位
        accWorkOrder.setPickuptime( new Date()); // 取件时间
        accWorkOrder.setSortingcode("W4321");// 分拣编码
        accWorkOrderService.insert(accWorkOrder);
        // 生成一条新工单。
        PhoneCodeXin phoneCode = new PhoneCodeXin();
        code = phoneCode.getPhonemsg(aba.getTelphone());
        AccWorkOrder awor = accWorkOrderService.ByNoSelect(aba.getBusinessnoticeno()); // 根据业务通知单号 查询 获得到最大的追单次数
        AccWorkOrder accs = new AccWorkOrder();
        acc.setBusinessnoticeno(aba.getBusinessnoticeno()); // 业务通知单号
        accs.setJobno("GDH"+resluts); // 工单号
        accs.setJobtype(3); // 工单类型 1:新,2:追,3:销
        accs.setPickupstatus(1); //  取件状态 1:新单,2:已通知,3:已确认
        int yzm = Integer.parseInt( code );
        accWorkOrder.setShortmessageint(yzm);// 短信序号
        accs.setWorkgenerationtime(new Date());// 工单生成时间
        accs.setAftersinglenum(awor.getAftersinglenum()+1); // 追单次数
        accs.setSmallmembernum(2);// 小件员编号
        accs.setPickupunit(2); // 取件单位
        accs.setPickuptime( new Date()); // 取件时间
        accs.setSortingcode("W4321");// 分拣编码
        accWorkOrderService.insert(accWorkOrder);

        result.getData().put("title","成功");
        result.getData().put("message","改单成功");
        return  result;
    }
    @RequestMapping("lists")
    public ResponseResult getLists(String businessnoticeno, String customcode, Integer page, Integer limit){
        String i = accBusinessAdmissibilityService.SelectMaxNo();
        Map map= accBusinessAdmissibilityService.lists(businessnoticeno,customcode,page,limit);
        ResponseResult result=new ResponseResult();
        result.getData().putAll(map);
        return result;
    }
    // 根据电话号码查询
    @RequestMapping("ByTelSelect")
    public ResponseResult ByTelSelect(String telphone){
        SysUser sysUser = sysUserService.ByTelSelect(telphone);
        ResponseResult result = new ResponseResult();
        if (sysUser!=null){
            result.getData().put("user",sysUser);
        }
        return result;
    }
}
