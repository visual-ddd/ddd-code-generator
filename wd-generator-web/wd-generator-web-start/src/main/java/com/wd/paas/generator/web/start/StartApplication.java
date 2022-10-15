package com.wd.paas.generator.web.start;

import com.wakedata.common.mq.annotation.EnableMessageCenter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * wd-generator-web项目启动类
 *
 * @author ZhuXueLiang
 * @date 2022/10/15 10:05:57
 */
@EnableMessageCenter
@SpringBootApplication(scanBasePackages = {"com.wd.paas.generator.web"})
@MapperScan("com.wd.paas.generator.web.infrastructure.*.repository.mapper")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
