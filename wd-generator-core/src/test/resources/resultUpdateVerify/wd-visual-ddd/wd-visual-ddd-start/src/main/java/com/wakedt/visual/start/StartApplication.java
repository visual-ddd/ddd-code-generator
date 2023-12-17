package com.wakedt.visual.start;

import com.wakedata.common.mq.annotation.EnableMessageCenter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * DDD可视化开发平台-启动类
 *
 * @author visual-ddd
 * @since 1.0
 */
@EnableMessageCenter
@EnableFeignClients(basePackages = {"com.wakedt.visual.client.*"})
@SpringBootApplication(scanBasePackages = {"com.wakedt.visual"})
@MapperScan("com.wakedt.visual.infrastructure.*.repository.mapper")
@EntityScan(basePackages = {"com.wakedt.visual.infrastructure.*.repository.model"})
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
