package com.lm.controller.dis;

import com.lm.entity.acc.AccBusinessAdmissibility;
import com.lm.entity.acc.AccWorkOrder;
import com.lm.entity.dis.DisDispatchHistory;
import com.lm.service.acc.AccBusinessAdmissibilityService;
import com.lm.service.acc.AccWorkOrderService;
import com.lm.service.acc.DisDispatchhistoryService;
import com.lm.util.note.PhoneCodeXiao;
import com.lm.util.note.PhoneCodeXin;
import com.lm.util.note.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("disdispatchhistory")
public class DisDispatchhistoryController {
    private static String code;
    @Autowired
    private DisDispatchhistoryService disDispatchhistoryService;
    @Autowired
    private AccWorkOrderService accWorkOrderService;
    @Autowired
    private AccBusinessAdmissibilityService accBusinessAdmissibilityService;
    // 分配
    @RequestMapping("affirm")
    public ResponseResult affirm(String id,String tel,String deptId, String sortingCode){
        DisDispatchHistory dis = disDispatchhistoryService.SelectMaxNo(); // 获取最后一列的数据
        int sequence = dis.getDispatchsequence();
        int t = Integer.parseInt(deptId);
        ResponseResult result = new ResponseResult();
        // 只填写单位信息，则将该业务单分配单位中录入的厅点。生成一条调度历史信息。
        if (sortingCode==null||sortingCode==""){
            DisDispatchHistory disDispatchHistory = new DisDispatchHistory();
            disDispatchHistory.setDispatchsequence(sequence+1);
            disDispatchHistory.setTransferredunit(t);
            disDispatchHistory.setOperatorid(1);
            disDispatchHistory.setOperationunitid(1);
            disDispatchHistory.setOperationtime(new Date());
            disDispatchHistory.setRemark("无");
            disDispatchHistory.setStatus(0);
            disDispatchHistory.setReason("无");
            disDispatchhistoryService.insert(disDispatchHistory);
            result.getData().put("title","成功");
            result.getData().put("message","分配成功");
            return result;
        }else { //填写了分拣编码，则将该业务单分配给所对应得小件员。生成一条调度历史信息。
            DisDispatchHistory disDispatchHistory = new DisDispatchHistory();
            disDispatchHistory.setDispatchsequence(sequence+1);
            disDispatchHistory.setTransferredunit(t);
            disDispatchHistory.setOperatorid(1);
            disDispatchHistory.setOperationunitid(1);
            disDispatchHistory.setOperationtime(new Date());
            disDispatchHistory.setRemark("无");
            disDispatchHistory.setStatus(0);
            disDispatchHistory.setReason("无");
            disDispatchhistoryService.insert(disDispatchHistory);
            // 同时生成一条新工单。
            AccWorkOrder aw = accWorkOrderService.SelectMaxNo(); // 获取最好一列的数据
            String i = aw.getJobno();
            System.out.println("最后一行工单号为:"+i);
            String param = i.substring(3); // 从第三位开始截取
            int s=Integer.parseInt(param);
            s=++s;
            s=s==1000?1:s;   //这里将规定最大数字设定为小于1000  如果对生成的数字没有特定要求可以注释掉    我这里没有要求所以进行了注释
            String resluts=s>=10?(s>=100?s+"":"0"+s):"00"+s; // 计算 转型
            PhoneCodeXin phoneCode = new PhoneCodeXin();
            code = phoneCode.getPhonemsg(tel);
            AccWorkOrder accWorkOrder = new AccWorkOrder();
            accWorkOrder.setBusinessnoticeno(id); // 业务通知单号
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
            result.getData().put("title","成功");
            result.getData().put("message","分配成功");
            return result;
        }
    }
    // 退回
    @RequestMapping("back")
    public ResponseResult back(DisDispatchHistory disDispatchHistory){
        ResponseResult result = new ResponseResult();
        DisDispatchHistory dis = new DisDispatchHistory();
        dis.setReason(disDispatchHistory.getReason());
        dis.setStatus(2);
        dis.setOperationtime(new Date());
        disDispatchhistoryService.update(dis);
        result.getData().put("title","成功");
        result.getData().put("message","退回成功");
        return result;
    }
    // 销单
    @RequestMapping("MeltSingle")
    public ResponseResult MeltSingle(AccBusinessAdmissibility aba) {
        List<AccWorkOrder> list = accWorkOrderService.ByNoSelectAll(aba.getBusinessnoticeno());
        AccWorkOrder awo = accWorkOrderService.ByNoSelect(aba.getBusinessnoticeno()); // 根据业务通知单号 查询 获得到最大的追单次数
        AccWorkOrder accWorkOrder = new AccWorkOrder();
        AccWorkOrder aw = accWorkOrderService.SelectMaxNo(); // 获取最后一列的数据
        String i = aw.getJobno();
        System.out.println("最后一行工单号为:" + i);
        String param = i.substring(3); // 从第三位开始截取
        int s = Integer.parseInt(param);
        s = ++s;
        s = s == 1000 ? 1 : s;   //这里将规定最大数字设定为小于1000
        String resluts = s >= 10 ? (s >= 100 ? s + "" : "0" + s) : "00" + s; // 计算 转型
        ResponseResult result = new ResponseResult();
        for (AccWorkOrder ao : list) {
            if (ao.getPickupstatus() == 1) { // 如果此时取件状态为“新单”，生成取件状态为“已注销”工单
                accWorkOrder.setBusinessnoticeno(aba.getBusinessnoticeno()); // 业务通知单号
                accWorkOrder.setJobno("GDH" + resluts); // 工单号
                accWorkOrder.setJobtype(3); // 工单类型 1:新,2:追,3:销
                accWorkOrder.setPickupstatus(0); //  取件状态 1:新单,2:已通知,3:已确认
                accWorkOrder.setShortmessageint(000000);// 短信序号
                accWorkOrder.setWorkgenerationtime(new Date());// 工单生成时间
                accWorkOrder.setAftersinglenum(awo.getAftersinglenum() + 1); // 追单次数
                accWorkOrder.setSmallmembernum(2);// 小件员编号
                accWorkOrder.setPickupunit(2); // 取件单位
                accWorkOrder.setPickuptime(new Date()); // 取件时间
                accWorkOrder.setSortingcode("W4321");// 分拣编码
                accWorkOrderService.insert(accWorkOrder);
                accBusinessAdmissibilityService.delete(aba.getId());
                result.getData().put("title", "成功");
                result.getData().put("message", "销单成功");
            }
            if (ao.getPickupstatus() == 2 || ao.getPickupstatus() == 3) {  //此时取件状态为”已通知”或”已确认”, 生成取件状态为“已注销”工单,还要发送销单短信。
                PhoneCodeXiao phoneCode = new PhoneCodeXiao();
                code = phoneCode.getPhonemsg(aba.getTelphone());
                accWorkOrder.setBusinessnoticeno(aba.getBusinessnoticeno()); // 业务通知单号
                accWorkOrder.setJobno("GDH" + resluts); // 工单号
                accWorkOrder.setJobtype(3); // 工单类型 1:新,2:追,3:销
                accWorkOrder.setPickupstatus(0); //  取件状态 1:新单,2:已通知,3:已确认
                accWorkOrder.setShortmessageint(0000);// 短信序号
                accWorkOrder.setWorkgenerationtime(new Date());// 工单生成时间
                accWorkOrder.setAftersinglenum(awo.getAftersinglenum() + 1); // 追单次数
                accWorkOrder.setSmallmembernum(2);// 小件员编号
                accWorkOrder.setPickupunit(2); // 取件单位
                accWorkOrder.setPickuptime(new Date()); // 取件时间
                accWorkOrder.setSortingcode("W4321");// 分拣编码
                accWorkOrderService.insert(accWorkOrder);
                accBusinessAdmissibilityService.delete(aba.getId());
                result.getData().put("title", "成功");
                result.getData().put("message", "销单成功");
            }
            if (ao.getPickupstatus() == 4) {
                result.getData().put("title", "失败");
                result.getData().put("message", "已取件不能进行销单");
            }else {
                result.getData().put("title", "失败");
                result.getData().put("message", "不能进行销单");
            }
        }
        return result;
    }
}
