package com.boot.crm.springBoot.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
@Component
public class Scheduler1Task {
    private int count = 0;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//    @Scheduled(cron = "*/6 * * * * ?")
    private void process(){
        System.out.println("开启定时任务运行:"+(count++));
    }
//    @Scheduled(fixedRate = 6000)
    private void reportCurrentTime(){
        System.out.println("现在时间是："+sdf.format(new Date()));
    }
}
