package com.lm.service.acc.impl;

import com.lm.entity.acc.AccWorkSheet;
import com.lm.mapper.acc.AccWorkSheetMapper;
import com.lm.service.acc.AccWorkSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccWorkSheetServiceImpl implements AccWorkSheetService {
    @Autowired
    private AccWorkSheetMapper accWorkSheetMapper;

    @Override
    public List<AccWorkSheet> ByWorksheetNoSelect(String WorksheetNo) {
        return accWorkSheetMapper.ByWorksheetNoSelect(WorksheetNo);
    }

    @Override
    public void insert(AccWorkSheet accWorkSheet) {
        accWorkSheetMapper.insert(accWorkSheet);
    }
}
