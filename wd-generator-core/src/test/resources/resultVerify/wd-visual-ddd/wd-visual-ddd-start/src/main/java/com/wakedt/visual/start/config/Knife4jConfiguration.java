package com.wakedt.visual.start.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Swagger文档配置
 *
 * @author visual-ddd
 * @since 1.0
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Resource
    private Environment environment;

    private String contextPath;

    private static final String BASE_PACKAGE = "com.wakedt.visual";

    @PostConstruct
    public void init() {
        contextPath = environment.getProperty("server.servlet.context-path");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("DDD可视化开发平台 (Power by visual-ddd generator)")
                .description("DDD可视化开发平台\n\nIDEA代码生成插件接入文档：\nhttp://www.wakedata.net/pages/viewpage.action?pageId=34999420")
                .termsOfServiceUrl("/")
                .version("0.0.1-SNAPSHOT")
                .contact(new Contact("开发云", "https://ddd.wakedt.cn", ""))
                .build();
    }

    @Bean(value = "allApi")
    public Docket allRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("DDD可视化开发平台-全部API")
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.ant(contextPath + "/**"))
                .build();
    }

    @Bean(value = "rpcApi")
    public Docket groupRpcRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("DDD可视化开发平台-rpc端API")
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.ant(contextPath + "/rpc/**"))
                .build();
    }

    @Bean(value = "webApi")
    public Docket groupWebRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("DDD可视化开发平台-web端API")
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.ant(contextPath + "/web/**"))
                .build();
    }

    @Bean(value = "appApi")
    public Docket groupAppRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("DDD可视化开发平台-小程序API")
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.ant(contextPath + "/app/**"))
                .build();
    }

}