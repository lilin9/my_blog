package com.lilin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * Created by LiLin on 2022/9/3/14:38:50
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@EnableScheduling       //开启定时任务
@ComponentScan(value = {"com.plumelog", "com.lilin"})
@MapperScan("com.lilin.mapper")
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
