package com.wake.generator.adapter.dto;

import com.wake.generator.application.constant.DomainElementType;
import com.wake.generator.application.entity.Field;
import com.wake.generator.application.entity.Method;
import java.util.List;
import lombok.Data;

/**
 * <p>Title: DomainShapeDto</p>
 * <p>Description: Uml图形DTO</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/3 10:31
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
     * @see DomainElementType
     */
    private DomainElementType shapeType;

    /**
     * 同一聚合颜色标识
     */
    private String color;

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

}
