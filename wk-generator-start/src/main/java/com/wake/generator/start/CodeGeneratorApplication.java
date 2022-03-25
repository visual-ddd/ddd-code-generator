package com.wake.generator.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成器启动类
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:52
 * @since 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.wake.generator.*"})
public class CodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
    }

}
