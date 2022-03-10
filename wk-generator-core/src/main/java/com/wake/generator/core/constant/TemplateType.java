package com.wake.generator.core.constant;

import lombok.Getter;

/**
 * <p>Title: TemplateType</p>
 * <p>Description: 模板类型</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 16:13
 */
@Getter
public enum TemplateType {

    /**
     * 类文件
     */
    CLASS("class", "Class.java.vm"),

    /**
     * 接口文件
     */
    INTERFACE("interface", "Interface.java.vm"),
    ;

    private final String name;
    private final String url;

    TemplateType(String name, String url) {
        this.name = name;
        this.url = url;
    }

}
