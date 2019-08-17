package com.hsq.service.impl;

import com.hsq.entity.BasProvince;
import com.hsq.entity.BasProvinceExample;
import com.hsq.mapper.BasProvinceMapper;
import com.hsq.service.BasProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasProvinceServiceImpl implements BasProvinceService {

    @Autowired
    private BasProvinceMapper basProvinceMapper;
    @Override
    public List<BasProvince> selectByPid(Integer pid) {
        BasProvinceExample example=new BasProvinceExample();
        BasProvinceExample.Criteria criteria=example.createCriteria();
        criteria.andParentidEqualTo(pid);
        return   basProvinceMapper.selectByExample(example);
    }

    @Override
    public List<BasProvince> selectById(Integer id) {
        BasProvinceExample example=new BasProvinceExample();
        BasProvinceExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(id);
        return basProvinceMapper.selectByExample(example);
    }

    /**
     * 根据id查询成市
     * @param id
     * @return
     */
    @Override
    public BasProvince geyById(Integer id) {
        return basProvinceMapper.selectByPrimaryKey(id);
    }


}
