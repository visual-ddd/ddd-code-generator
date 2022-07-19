package com.wake.generator.client.cola.dto;

import com.wake.generator.client.cola.dto.test.Field;
import com.wake.generator.client.cola.dto.test.Method;
import com.wake.generator.client.common.DomainShapeEnum;
import java.util.List;
import lombok.Data;

/**
 * 领域图形DTO
 *
 * @author ZhuXueLiang
 * @date 2022/3/25
 * @since 1.0
 */
@Data
public class DomainShapeDto {

    private static final long serialVersionUID = -1551254242524216902L;

    /**
     * 主键
     */
    private String id;

    /**
     * 图形类型
     *
     * @see DomainShapeEnum
     */
    private DomainShapeEnum shapeType;

    /**
     * 名称
     */
    private String name;

    /**
     * 参数列表
     */
    private List<Field> fieldList;

    /**
     * 方法列表
     */
    private List<Method> methodList;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 所属聚合
     */
    private DomainShapeDto parentAggregation;

    /**
     * 所属action包名称
     */
    private String actionName;

}
