package com.util;

import com.lyb.entity.SysDept;
import java.util.ArrayList;
import java.util.List;

public class SysDeptGroupUtil {
    private SysDeptGroupUtil(){}
    /**
     * 查找一级部门
     * @param list
     * @return
     */
    public static List<SysDept> getFirstDept(List<SysDept> list){
        //定义一个集合，放一级部门
        List<SysDept> firstList = new ArrayList<SysDept>();
        for(SysDept m:list) {
            // 父级部门的id为0的是一级部门
            if(m.getParentId().longValue()==0) {
                //调用下面的递归方法查找所有的子部门
                m.setChildren(getItems(m.getId(),list));
                //一级部门加入到集合
                firstList.add(m);
            }
        }
        return firstList;
    }

    /**
     * 根据一级部门的id查找里面所有的子部门，包含递归算法
     * @param pid
     * @param list
     * @return
     */
    private static List<SysDept> getItems(Integer pid,List<SysDept> list){
        List<SysDept> secondList = new ArrayList<SysDept>();
        for(SysDept m:list) {
            //是一级部门，不需要加进去
            if(m.getParentId().longValue()==0) {
                continue;
            }
            //如果当前部门的父id和传过来的一致，就可以直接加到集合里
            //Long类型对象比较相等需要使用longValue获取之后再来比较
            if(m.getParentId() == pid) {
                m.setChildren(getItems(m.getId(),list));
                secondList.add(m);
            }
        }
        return secondList;
    }
}