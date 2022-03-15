package com.wake.generator.application.entity;

import java.util.List;
import lombok.Data;

/**
 * <p>Title: FieldDTO</p>
 * <p>Description: 字段属性</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 10:32
 */
@Data
public class Field {

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

    /**
     * 注解列表
     */
    private List<String> annotations;

}
