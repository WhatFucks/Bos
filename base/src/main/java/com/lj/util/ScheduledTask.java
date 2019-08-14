package com.lj.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class ScheduledTask {
    Logger logger = LoggerFactory.getLogger(ScheduledTask.class);

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    /**
     * 从当前方法开始执行后5s再次执行
     */
//    @Scheduled(fixedDelay= 5000)
//    public void scheduledTask2() throws InterruptedException {
//        logger.info("当前时间为：{}", simpleDateFormat.format(new Date()));
//        Thread.sleep(3000L);
//    }


}
