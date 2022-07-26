package com.wake.generator.application.generate.entity;

import lombok.Data;

import java.util.List;

/**
 * 方法信息
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:41
 * @since 1.0
 */
@Data
public class Method {

    /**
     * 方法名称
     */
    private String name;

    /**
     * 修饰符
     */
    private String modifier;

    /**
     * 方法返回值类型
     */
    private String returnType;

    /**
     * 方法参数
     */
    private String attributeLabel;

    /**
     * 注释
     */
    private String description;

    /**
     * 注解列表
     */
    private List<String> annotations;

}
