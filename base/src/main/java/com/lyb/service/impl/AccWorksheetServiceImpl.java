package com.lyb.service.impl;

import com.lyb.entity.AccWorksheet;
import com.lyb.mapper.AccWorksheetMapper;
import com.lyb.service.AccWorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccWorksheetServiceImpl implements AccWorksheetService {
    @Autowired
    private AccWorksheetMapper accWorksheetMapper;

    @Override
    public AccWorksheet selectByWorksheetNo(String worksheetno) {
        return accWorksheetMapper.selectByWorkSheetNo(worksheetno);
    }
}
