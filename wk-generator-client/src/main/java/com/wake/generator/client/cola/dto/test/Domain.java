package com.wake.generator.client.cola.dto.test;

import lombok.Data;

import java.util.List;
@Data
public class Domain {
    /**
     * 名称
     */
    private String name;

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
