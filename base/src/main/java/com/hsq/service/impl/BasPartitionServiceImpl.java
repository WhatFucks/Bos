package com.hsq.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsq.entity.BasPartition;
import com.hsq.entity.BasPartitionExample;
import com.hsq.mapper.BasPartitionMapper;
import com.hsq.service.BasPartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BasPartitionServiceImpl implements BasPartitionService {

    @Autowired
    private BasPartitionMapper basPartitionMapper;


    /**
     * 分页  模糊查询  查询所有
     * @param basPartition
     * @param page
     * @param limit
     * @return
     */
    @Override
    public Map basPartitionAll(BasPartition basPartition, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        Page p = PageHelper.startPage(page,limit,true);
        BasPartitionExample example = new BasPartitionExample();
        if (basPartition!=null && basPartition.getProvince()!=null&&basPartition.getProvince()!=""){
            example.createCriteria().andProvinceLike("%"+basPartition.getProvince()+"%");
        }
        List<BasPartition> list= basPartitionMapper.selectByExample(example);
        map.put("row",list);
        map.put("total",p.getTotal());
        return map;
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        basPartitionMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id修改
     * @param basPartition
     */
    @Override
    public void updateById(BasPartition basPartition) {
        basPartitionMapper.updateByPrimaryKeySelective(basPartition);
    }

    /**
     * 添加
     * @param basPartition
     */
    @Override
    public void add(BasPartition basPartition) {
        basPartitionMapper.insertSelective(basPartition);
    }
}
