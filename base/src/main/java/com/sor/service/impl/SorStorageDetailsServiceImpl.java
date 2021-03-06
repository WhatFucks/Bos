package com.sor.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sor.entity.SorOutBoundDetails;
import com.sor.entity.SorStorage;
import com.sor.entity.SorStorageDetails;
import com.sor.entity.SorWorksheet;
import com.sor.service.SorStorageDetailsService;
import com.sor.mapper.SorOutBoundDetailsMapper;
import com.sor.mapper.SorStorageDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SorStorageDetailsServiceImpl implements SorStorageDetailsService {
    @Autowired
    private SorStorageDetailsMapper sorStorageDetailsMapper;

    @Autowired
    private SorOutBoundDetailsMapper sorOutBoundDetailsMapper;

    /**
     * 根据id查询单号
     * @param id
     * @return
     */
    @Override
    public SorWorksheet getByworksheetId(String id) {

      SorStorageDetails sorStorageDetails=  sorStorageDetailsMapper.getDetailById(id);
        SorWorksheet sorWorksheet=new SorWorksheet();

        // 先查询入库详情表，如果有该单号
     if(sorStorageDetails != null){
         sorWorksheet.setWorkSheetNo(sorStorageDetails.getId());
         sorWorksheet.setWeight(BigDecimal.valueOf(sorStorageDetails.getWeight()));
         sorWorksheet.setJobNo(sorStorageDetails.getPackageid());
         sorWorksheet.setStowageRequirements(sorStorageDetails.getOutboundid());
     }else{
         sorWorksheet=sorStorageDetailsMapper.getByWorksheetId(id);
         // 否则就查询上游包装过来的
         sorWorksheet=sorStorageDetailsMapper.getByWorksheetId(id);
         if(sorWorksheet==null){
             sorWorksheet=null;
         }else{
             sorWorksheet.setJobNo("");
             sorWorksheet.setStowageRequirements("");
         }
     }
      return sorWorksheet;
    }

    /**
     * 根据id查询单号
     * @param id
     * @return
     */
    @Override
    public SorWorksheet getByworksheetIdHB(String id) {
        SorWorksheet sorWorksheet=new SorWorksheet();
         sorWorksheet=sorStorageDetailsMapper.getByWorksheetId(id);
        // 先查询入库详情表，如果有该单号
        if(sorWorksheet != null){
            // 否则就查询上游包装过来的
            sorWorksheet.setJobNo("");

        }else{
            SorStorageDetails sorStorageDetails=  sorStorageDetailsMapper.getDetailById(id);
            sorWorksheet.setWorkSheetNo(sorStorageDetails.getId());
            sorWorksheet.setWeight(BigDecimal.valueOf(sorStorageDetails.getWeight()));
            sorWorksheet.setJobNo(sorStorageDetails.getPackageid());
            sorWorksheet.setStowageRequirements(sorStorageDetails.getOutboundid());
        }
        return sorWorksheet;
    }

    @Override
    public Map queryDetailAll(SorStorage sorStorage, Integer pageSize, Integer pageNum) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(pageSize,pageNum);

        // 出库
        List<SorOutBoundDetails> listOut=sorOutBoundDetailsMapper.listToWeight();
        // 入库
        List<SorStorageDetails> listStorage=sorStorageDetailsMapper.sorStorageDetail();
        // 库存
        List<SorStorageDetails> list=new ArrayList<>();

        // 过滤掉出库的单号
        for(SorStorageDetails ss: listStorage){
            boolean f=true;
            for(SorOutBoundDetails sd: listOut){
                if(sd.getId()==ss.getId()){
                    f=false;
                }
            }
            if(f){
                if(ss.getState()==0){
                    ss.setStateName("中转入库");
                }else if(ss.getState()==1){
                    ss.setStateName("二次入库");
                }else if(ss.getState()==2){
                    ss.setStateName("初始入库");
                }else{
                    ss.setStateName("有货无单");
                }
                list.add(ss);
            }
        }


        PageInfo page = new PageInfo(list);
        map.put("items",list);
        map.put("total",page.getTotal());
        return map;
    }

    /**
     * 新增入库详情
     * @param list
     */
    @Override
    public void insertSorStorageDetailsBySorStorageId(SorStorage sorStorage,List<SorStorageDetails> list) {
        SorStorageDetails sds=new SorStorageDetails();
        sds.setStorageid(sorStorage.getId());

        for(SorStorageDetails sd:list){
            sd.setStorageid(sorStorage.getId());
           SorStorageDetails Dlist =sorStorageDetailsMapper.getDetailById(sd.getId());
// 如果系统里有该单号，那么就二次入库
               if(Dlist!=null && sd.getState()!=3){

                   if(sd.getState()==0 || sd.getState()==2 || sd.getState()==1){
                       sd.setState(1);
                       sorStorageDetailsMapper.updateDetailByIdTo1(sd);
                   }
// 否则，没有进入我们系统，我们就会给出初始入库
               }

               if(Dlist==null && sd.getState()!=3){
                   if(sd.getState()==2){
                       sorStorageDetailsMapper.insert(sd);
                   }else{
                       sd.setState(0);
                       sorStorageDetailsMapper.insert(sd);
                   }

               }



        }

    }

    /**
     * 根据入库交接单查询详情
     * @param storageid
     * @return
     */
    @Override
    public List<SorStorageDetails> findByStorageId(String storageid) {
        List<SorStorageDetails> list=sorStorageDetailsMapper.findByStorageId(storageid);
        for(SorStorageDetails sd : list){
            if(sd.getState()!=null){

                if(sd.getState()==0){
                    sd.setStateName("中转入库");
                }else if(sd.getState()==1){
                    sd.setStateName("二次入库");
                }else if(sd.getState()==2){
                    sd.setStateName("初始入库");
                }else if(sd.getState()==3){
                    sd.setStateName("有货无单");
                }else{
                    sd.setStateName("无单有货");
                }
            }

        }
        return list;
    }
}
