package com.wakedt.visual.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.wakedata.common.mq.annotation.EnableMessageCenter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * DDD可视化开发平台-启动类
 *
 * @author visual-ddd
 * @since 1.0
 */
@EnableMessageCenter
@SpringBootApplication(scanBasePackages = {"com.wakedt.visual"})
@MapperScan("com.wakedt.visual.infrastructure.*.repository.mapper")
@EntityScan(basePackages = {"com.wakedt.visual.infrastructure.*.repository.model"})
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
