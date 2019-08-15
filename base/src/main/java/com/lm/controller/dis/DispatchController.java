package com.lm.controller.dis;

import com.lm.entity.dis.BasAssociatemember;
import com.lm.entity.dis.BasZoneInfo;
import com.lm.entity.dis.Dispatch;
import com.lm.service.acc.AccWorkOrderService;
import com.lm.service.acc.BasAssociatememberService;
import com.lm.service.acc.BasZoneInfoService;
import com.lm.util.note.PhoneCodeChong;
import com.lm.util.note.PhoneCodeXiao;
import com.lm.util.note.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("dis")
public class DispatchController {
    private static String code;
    @Autowired
    private AccWorkOrderService accWorkOrderService;
    @Autowired
    private BasZoneInfoService basZoneInfoService;
    @Autowired
    private BasAssociatememberService basAssociatememberService;
    // 调度  查询
    @RequestMapping("selectDispatch")
    public ResponseResult selectDispatch(String JobNo,String TelPhone, Integer page, Integer limit){
        List<BasZoneInfo> zoneList = basZoneInfoService.list(); // 获取所有的定区编码
        List<BasAssociatemember> smallPartList = basAssociatememberService.list(); // 获取所有的小件员
        Dispatch dispatch=new Dispatch();
        if(JobNo!=null&&!JobNo.equals("")){
            dispatch.setJobNo(JobNo);
        }
        if(TelPhone!=null&&!TelPhone.equals("")){
            dispatch.setTelPhone(TelPhone);
        }
        Map map= accWorkOrderService.selectDispatch(dispatch,page,limit);
        ResponseResult result=new ResponseResult();
        result.getData().put("zoneList",zoneList);
        result.getData().put("smallPartList",smallPartList);
        result.getData().putAll(map);
        basZoneInfoService.list();
        return result;
    }
    // 重发
    @RequestMapping("resend")
    public  ResponseResult resend(Dispatch dispatch){
        PhoneCodeChong phoneCodeChong = new PhoneCodeChong();
        phoneCodeChong.getPhonemsg(dispatch.getTelPhone(),dispatch.getAwBusinessNoticeNo());
        ResponseResult result = new ResponseResult();
        result.getData().put("title","成功");
        result.getData().put("message","重发成功");
        return result;
    }
    // 转单 查询所以的定区编号
    @RequestMapping("transfers")
    public ResponseResult transfers(Integer zonecode, Integer empno){
      ResponseResult result = new ResponseResult();
      BasZoneInfo basZoneInfo =  basZoneInfoService.ByIdSelect(zonecode); // 根据小件员id 查询
      PhoneCodeXiao phoneCode = new PhoneCodeXiao();
      code = phoneCode.getPhonemsg(basZoneInfo.getTelphone());
      result.getData().put("title", "成功");
      result.getData().put("message", "转单成功");
      return result;
    }
}
