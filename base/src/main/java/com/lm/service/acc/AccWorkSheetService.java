package com.lm.service.acc;

import com.lm.entity.acc.AccWorkSheet;

import java.util.List;

public interface AccWorkSheetService {
    // 根据 工作单编号 查询 所有
    List<AccWorkSheet> ByWorksheetNoSelect(String WorksheetNo);
    // 增加 工作单
    public void insert(AccWorkSheet accWorkSheet);
}
