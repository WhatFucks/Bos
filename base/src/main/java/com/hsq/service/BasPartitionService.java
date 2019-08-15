package com.hsq.service;

import com.hsq.entity.BasPartition;

import java.util.Map;

public interface BasPartitionService {

        /**
         * 查询所有 分页 模糊查询
         * @param basPartition
         * @param page
         * @param limit
         * @return
         */
        public Map basPartitionAll(BasPartition basPartition, Integer page, Integer limit);

        /**
         * 根据id删除
         * @param id
         * @return
         */
        public void deleteById(Integer id);

        /**
         * 添加
         * @param basPartition
         * @return
         */
        public void add(BasPartition basPartition);

        /**
         * 根据id修改
         * @param basPartition
         * @return
         */
        public void updateById(BasPartition basPartition);

}
