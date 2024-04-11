package com.lilin.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by LILIN on 2024/3/16/15:34:51
 * 每隔一段时间爆出一个运行时异常，测试日志系统的错误报警系统
 */
//@Component
public class ScheduledException {
    //一天执行一次
    @Scheduled(fixedDelay = 24 * 60 * 60 * 1000)
    public void ThrowCustomizeException() {
        throw new RuntimeException("这是一个测试异常，用来测试日志系统异常检测功能!");
    }
}
