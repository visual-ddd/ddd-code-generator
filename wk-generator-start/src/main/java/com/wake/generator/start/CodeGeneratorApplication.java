package com.wake.generator.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成器启动类
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 14:33
 * @since 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.wake.generator.*"})
@MapperScan({"com.wake.generator.infra.*.repository.mapper"})
public class CodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
    }

}
