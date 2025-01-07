package com.wakedt.visual.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * DDD可视化开发平台-启动类
 */
@SpringBootApplication(scanBasePackages = {"com.wakedt.visual"})
@MapperScan("com.wakedt.visual.bizdomain.*.infrastructure.repository.mapper")
@EntityScan(basePackages = {"com.wakedt.visual.bizdomain.*.infrastructure.repository.model"})
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
