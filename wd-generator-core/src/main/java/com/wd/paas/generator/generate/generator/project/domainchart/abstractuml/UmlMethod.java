package com.wd.paas.generator.generate.generator.project.domainchart.abstractuml;

import lombok.Data;

/**
 * 方法信息
 *
 * @author ZhuXueLiang
 * @since 1.0
 */
@Data
public class UmlMethod {

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
}
