package com.wake.generator.client.manage.dto;

import lombok.Data;

import java.util.List;

/**
 * 聚合
 *
 * @author ZhuXueLiang
 * @date 2022/7/20
 * @since 1.0
 */
@Data
public class AggregationDto {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

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
    private List<FieldDto> fieldList;

    /**
     * 方法列表
     */
    private List<MethodDto> methodList;

}
