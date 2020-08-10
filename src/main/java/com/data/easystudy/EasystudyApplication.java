package com.data.easystudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 8.5-v1开辟新的分支
 */
@SpringBootApplication
@EnableAsync
@MapperScan("com.data.easystudy.mapper")
public class EasystudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasystudyApplication.class, args);
    }

}
