package com.wd.paas.generator.generate.generator.project.domainchart.abstractuml;

import lombok.Data;

/**
 * 字段属性
 *
 * @author ZhuXueLiang
 * @since 1.0
 */
@Data
public class UmlField {

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段类型
     */
    private String type;

    /**
     * 修饰符
     */
    private String modifier;

    /**
     * 注释
     */
    private String description;
}
