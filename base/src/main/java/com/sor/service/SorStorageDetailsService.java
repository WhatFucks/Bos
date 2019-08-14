package com.sor.service;

import com.sor.entity.SorStorage;
import com.sor.entity.SorStorageDetails;
import com.sor.entity.SorWorksheet;

import java.util.List;
import java.util.Map;

public interface SorStorageDetailsService {

    public SorWorksheet getByworksheetId(String id);

    public Map queryDetailAll(SorStorage sorStorage, Integer pageSize, Integer pageNum);
    /**
     * 新增入库时新增入库详情
     * @param list
     */
    public void insertSorStorageDetailsBySorStorageId(List<SorStorageDetails> list);
    /**
     * 根据入库交接单查询入库详情
     * @param storageid
     * @return
     */
    public List<SorStorageDetails> findByStorageId(String storageid);
}
