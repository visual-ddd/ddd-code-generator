package com.wake.generator.client.cola.dto.element;

import lombok.Data;

import java.util.List;

/**
 * 需要进行代码生成的元素
 */
@Data
public class Domain {

    /**
     * 名称
     */
    private String name;

    /**
     * 聚合颜色标识
     */
    private String color;

    /**
     * 描述
     */
    private String description;

    /**
     * 参数列表
     */
    private List<Field> fieldList;

    /**
     * 方法列表
     */
    private List<Method> methodList;

}
