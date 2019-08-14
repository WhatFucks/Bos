package com.lj.controller.sys;

import com.lj.entity.sys.SysDept;
import com.lj.service.sys.SysDeptService;
import com.lj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("dept")
public class SysDeptController {

    @Autowired
     private SysDeptService sysDeptService;

    @RequestMapping("groupDept")
    public ResponseResult groupDept(){
        ResponseResult result=new ResponseResult();
        result.getData().put("deptList",sysDeptService.groupDept());
        return result;
    }

    //查询全部
    @RequestMapping("deptList")
    public ResponseResult deptList(SysDept sysDept, Integer page, Integer limit){
        ResponseResult result=new ResponseResult();
        Map map=sysDeptService.deptList(sysDept,page,limit);
        result.getData().putAll(map);
        return  result;
    }

    //添加部门
    @RequestMapping("deptAdd")
    public ResponseResult deptAdd(SysDept sysDept){
        ResponseResult result=new ResponseResult();
        sysDeptService.deptAdd(sysDept);
        result.getData().put("message","添加成功");
        return result;
    }

    //修改部门
    @RequestMapping("deptUpdate")
    public ResponseResult deptUpdate(SysDept sysDept){
       ResponseResult result= new ResponseResult();
       sysDeptService.deptUpdate(sysDept);
       result.getData().put("message","修改成功");
       return result;
    }

    //删除
    @RequestMapping("deleteDept")
    public ResponseResult deleteDept(SysDept sysDept){
        ResponseResult result=new ResponseResult();
        sysDeptService.deptDelete(sysDept);
        result.getData().put("message","修改成功");
        return result;
    }


}
