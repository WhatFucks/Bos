package com.sor.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyb.entity.SysUser;
import com.sor.entity.*;
import com.sor.mapper.SorAbnormalMapper;
import com.sor.mapper.SorOutBoundDetailsMapper;
import com.sor.mapper.SorStorageDetailsMapper;
import com.sor.mapper.SorStorageMapper;
import com.sor.service.SorAbnormalService;
import com.sor.service.SorStorageDetailsService;
import com.sor.service.SorStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SorStorageServiceImpl implements SorStorageService {

    @Autowired
    private SorStorageMapper sorStorageMapper;

    @Autowired
    private SorStorageDetailsService sorStorageDetailsService;

    @Autowired
    private SorStorageDetailsMapper sorStorageDetailsMapper;

    @Autowired
    private SorAbnormalService sorAbnormalService;

    @Autowired
    private SorOutBoundDetailsMapper sorOutBoundDetailsMapper;

    @Autowired
    private SorAbnormalMapper sorAbnormalMapper;


    @Override
    public void deleteStorage(String id) {
        sorStorageMapper.deleteStorage(id);
    }

    /**
     * 修改入库信息
     * @param sorStorage
     */
    @Override
    public void updateStorage(SorStorage sorStorage) {
        SorStorageExample example = new SorStorageExample();
        SorStorageExample.Criteria criteria = example.createCriteria();
        if(sorStorage!=null){
            if(sorStorage.getId()!=null){
                criteria.andIdLike("%"+sorStorage.getId()+"%");
            }
            // 还可以添加其他属性的条件
        }
        sorStorageMapper.updateByExampleSelective(sorStorage,example);
    }

    /**
     * 计算重量
     * @return
     */
    @Override
    public Map getByWeights() {
        Double outWeights=0.0;

        Double storWeights=0.0;
        Map<String,Object> map = new HashMap<>();
        List<SorOutBoundDetails> outList=sorOutBoundDetailsMapper.listToWeight();
        for(SorOutBoundDetails sb:outList){
            if(sb.getWeight()!=null){
                outWeights+=sb.getWeight();
            }
        }

        List<SorStorageDetails> storList=sorStorageDetailsMapper.findByStorageIdWeight();
        for(SorStorageDetails sd: storList){
            if(sd.getWeight()!=null){
                storWeights+=sd.getWeight();
            }
        }
        outWeights=outWeights/1000;
        storWeights=storWeights/1000;
        map.put("outWeights",outWeights);
        map.put("storWeights",storWeights);
        return map;
    }

    @Override
    public SysUser findById(Integer id) {
        return sorStorageMapper.findById(id);
    }

    @Override
    public List<SysUser> userlist() {
        return sorStorageMapper.userlist();
    }

    /**
     * 新增入库及入库详情以及异常处理
     * @param sorStorage
     * @param list
     */
    @Override
    public void insertSorStorage(SorStorage sorStorage, List<SorStorageDetails> list) {


        for(SorStorageDetails sd : list){

            SorAbnormal sorAbnormal = new SorAbnormal();

            if(sd.getId()!=null && sd.getState()==3){

                // 监控异常
                sorAbnormal.setLaunchdate(new Date());
                SysUser user=sorStorageMapper.findById(sorStorage.getAcceptperson());
                sorAbnormal.setLaunchperson(user.getUsername());
                sorAbnormal.setLaunchcompany(sorStorage.getAcceptcompany());
                if(sd.getId()==null){
                    sorAbnormal.setAbnormaltype(1);
                }else{
                    sorAbnormal.setAbnormaltype(2);
                }
                sorAbnormal.setTransferint(sd.getOutboundid());
                sorAbnormal.setCargoint(sd.getId());
                sorAbnormal.setPackageint(sd.getPackageid());
                sorAbnormalMapper.insert(sorAbnormal);

            }else{
                sd.setStorageid(sorStorage.getId());
            }
        }
        sorStorageMapper.insert(sorStorage);
        sorStorageDetailsService.insertSorStorageDetailsBySorStorageId(list);
    }

    @Override
    public Map pageList(SorStorage sorStorage, Integer pageSize, Integer pageNum) {


//        SorStorageExample example = new SorStorageExample();
//        SorStorageExample.Criteria criteria = example.createCriteria();
//        if(sorStorage!=null){
//            if(sorStorage.getId()!=null){
//                criteria.andIdLike("%"+sorStorage.getId()+"%");
//            }
//            // 还可以添加其他属性的条件
//        }
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(pageSize,pageNum);

        List<SorStorage> list =  sorStorageMapper.pageList();
        for(SorStorage storage : list){
            SysUser user =sorStorageMapper.getnameByid(storage.getAcceptperson());
            storage.setAcceptusername(user.getUsername());
            SysUser user2 =sorStorageMapper.getnameByid(storage.getDeliveryperson());
            storage.setDeliveryusername(user2.getUsername());
        }
        PageInfo page = new PageInfo(list);
        map.put("items",list);
        map.put("total",page.getTotal());

        return map;

    }
}
