package com.wake.generator.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang  com.wakedata.wk.cola
 */
@SpringBootApplication(scanBasePackages = {"com.wakedata.wk.cola", "com.alibaba.cola","com.wakedata.common.es"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
