package com.lm.controller.dis;

import com.lm.entity.dis.DisWorkOrderSign;
import com.lm.service.dis.DisWorkOrderSignService;
import com.lm.util.note.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("workordersign")
public class DisWorkOrderSignController {
  @Autowired
  private DisWorkOrderSignService disWorkOrderSignService;
  // 查询所有
  @RequestMapping("list")
  public ResponseResult list(Integer page, Integer limit){
    Map map= disWorkOrderSignService.getList(page,limit);
    ResponseResult result=new ResponseResult();
    result.getData().putAll(map);
    return result;
  }
  // 新增
  @RequestMapping("add")
  public ResponseResult add(DisWorkOrderSign disWorkOrderSign){
    DisWorkOrderSign dis = disWorkOrderSignService.SelectSelectMaxNo();
    String i = dis.getWorkorderid(); // 最后一行工作单
    System.out.println("最后一行GZDID号为:" + i);
    String param = i.substring(5); // 从第三位开始截取
    int s = Integer.parseInt(param);
    s = ++s;
    s = s == 1000 ? 1 : s;   //这里将规定最大数字设定为小于1000
    String resluts = s >= 10 ? (s >= 100 ? s + "" : "0" + s) : "00" + s; // 计算 转型
    System.out.println(resluts);
    ResponseResult result = new ResponseResult();
    disWorkOrderSign.setWorkorderid("GZDID"+resluts);// 工作单Id
    disWorkOrderSign.setInvalidatemark(2);// 作废标记 1是 2否
    disWorkOrderSign.setInputpersoncode(19);// 录入人 编号
    disWorkOrderSign.setAbnormalmark("无异常");
    disWorkOrderSign.setInputtime(new Date());
    disWorkOrderSign.setSigntime(new Date());
    disWorkOrderSignService.insert(disWorkOrderSign);
    result.getData().put("title","成功");
    result.getData().put("message","新增成功");
    return result;
  }
  // 修改
  @RequestMapping("update")
  public ResponseResult update(DisWorkOrderSign disWorkOrderSign){
    ResponseResult result = new ResponseResult();
    disWorkOrderSign.setInputtime(new Date());
    disWorkOrderSign.setSigntime(new Date());
    disWorkOrderSignService.update(disWorkOrderSign);
    result.getData().put("title","成功");
    result.getData().put("message","修改成功");
    return result;
  }
  //取消签收录入-确认
  @RequestMapping("affirm")
  public ResponseResult affirm(DisWorkOrderSign disWorkOrderSign){
    disWorkOrderSign.setId(disWorkOrderSign.getId());
    disWorkOrderSign.setConfirm("已确认");// 申请单的状态置为“是”
    disWorkOrderSign.setSignformark("否");// 修改签收标志设置为“否
    disWorkOrderSign.setInvalidatemark(1);// 签收记录打上作废标记；
    ResponseResult result = new ResponseResult();
    disWorkOrderSignService.update(disWorkOrderSign);
    result.getData().put("title","成功");
    result.getData().put("message","确认成功");
    return result;
  }
  //取消签收录入-作废
  @RequestMapping("deletes")
  public ResponseResult deletes(DisWorkOrderSign disWorkOrderSign){
    disWorkOrderSignService.delete(disWorkOrderSign.getId());
    ResponseResult result = new ResponseResult();
    result.getData().put("title","成功");
    result.getData().put("message","作废成功");
    return result;
  }

  // 日期转换
  @org.springframework.web.bind.annotation.InitBinder
  public void InitBinder(WebDataBinder binder, WebRequest request)
  {
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    CustomDateEditor editor = new CustomDateEditor(df,true);//参数为true表示允许为空值
    binder.registerCustomEditor(Date.class, editor);
  }

}
