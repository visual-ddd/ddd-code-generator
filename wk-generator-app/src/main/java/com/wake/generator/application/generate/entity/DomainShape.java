package com.wake.generator.application.generate.entity;


import com.wake.generator.client.generete.common.DomainShapeEnum;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 图形信息
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:40
 * @since 1.0
 */
@Slf4j
@Data
public class DomainShape {

    /**
     * 名称
     */
    private String name;

    /**
     * 颜色标识
     */
    private String color;

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
     * 模型文件列表
     */
    private List<ModelFile> modelFiles = new ArrayList<>();

    /**
     * 所属聚合
     */
    private DomainShape parentAggregation;

    /**
     * 所属action包名称
     */
    private String actionName;

    /**
     * 元素类型
     * @see DomainShapeEnum
     */
    private DomainShapeEnum shapeType;

    /**
     * 获取输入路径和文件输出路径 Map
     *
     * @return 输入输出路径map
     */
    public Map<String, String> getModelMap() {
        Map<String, String> templateMap = new HashMap<>(8);
        for (ModelFile modelFile : modelFiles) {
            templateMap.put(modelFile.getTemplateUrl(), modelFile.getOutputUrl());
        }
        return templateMap;
    }

}
