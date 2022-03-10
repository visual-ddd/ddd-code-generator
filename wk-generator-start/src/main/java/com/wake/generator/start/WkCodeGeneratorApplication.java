package com.wake.generator.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Title: WkCodeGeneratorApplication</p>
 * <p>Description: 代码生成器启动类</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 11:23
 */
@SpringBootApplication(scanBasePackages = {"com.wake.generator.*"})
public class WkCodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(WkCodeGeneratorApplication.class);
    }

}
