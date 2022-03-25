package com.wake.generator.client.cola.dto;

import java.util.List;
import lombok.Data;

/**
 * 字段属性Dto
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:36
 * @since 1.0
 */
@Data
public class FieldDto {

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
