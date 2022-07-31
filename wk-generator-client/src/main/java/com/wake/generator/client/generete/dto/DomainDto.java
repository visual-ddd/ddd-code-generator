package com.wake.generator.client.generete.dto;

import com.wake.generator.client.generete.common.DomainShapeEnum;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 需要进行代码生成的元素
 *
 * @author ZhuXueLiang
 * @date 2022/7/20
 * @since 1.0
 */
@Data
public class DomainDto {

    private static final long serialVersionUID = 1L;

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
    private List<FieldDto> fieldList = new ArrayList<>();

    /**
     * 方法列表
     */
    private List<MethodDto> methodList = new ArrayList<>();

    /**
     * 所属action包名称
     */
    private String actionName;

    /**
     * 类型
     */
    private DomainShapeEnum type;

    /**
     * 所属聚合
     */
    private DomainDto parentAggregation;

}
