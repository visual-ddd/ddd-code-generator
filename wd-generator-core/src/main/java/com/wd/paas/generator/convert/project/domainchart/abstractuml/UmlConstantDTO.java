package com.wd.paas.generator.convert.project.domainchart.abstractuml;

import lombok.Data;

/**
 * 字段常量
 *
 * @author ZhuXueLiang
 * @since 1.0
 */
@Data
public class UmlConstantDTO {

    /**
     * classId
     */
    private String classId;

    /**
     * 常量名称
     */
    private String name;

    /**
     * 常量值
     */
    private String code;

    /**
     * 常量描述
     */
    private String desc;

    /**
     * 注释
     */
    private String note;

}
