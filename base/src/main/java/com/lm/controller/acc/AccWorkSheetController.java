package com.lm.controller.acc;

import com.lm.entity.acc.AccWorkSheet;
import com.lm.service.acc.AccWorkSheetService;
import com.lm.util.note.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accworksheet")
public class AccWorkSheetController {
    @Autowired
    private AccWorkSheetService accWorkSheetService;
    // 新增
    @RequestMapping("insert")
    public ResponseResult insert(AccWorkSheet accWorkSheet){
        ResponseResult result = new ResponseResult();
        List<AccWorkSheet> list = accWorkSheetService.ByWorksheetNoSelect(accWorkSheet.getWorksheetno());
        if (list.size()==0){
           accWorkSheetService.insert(accWorkSheet);
           result.getData().put("title","成功");
           result.getData().put("message","添加成功");
        }else {
            result.getData().put("title","失败");
            result.getData().put("message","工作单号已存在");
        }
        return result;
    }
}
