package com.lm.service.acc;

import com.lm.entity.dis.DisDispatchHistory;

public interface DisDispatchhistoryService {
    public void insert(DisDispatchHistory disDispatchHistory);
    //修改工单
    public void update(DisDispatchHistory disDispatchHistory);
    DisDispatchHistory SelectMaxNo();
}
