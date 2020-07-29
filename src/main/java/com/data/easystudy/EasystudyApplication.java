package com.data.easystudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * dev-2020-07-29 第一次开发 --合并主分支
 */
@SpringBootApplication
@EnableAsync
@MapperScan("com.data.easystudy.mapper")
public class EasystudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasystudyApplication.class, args);
    }

}
