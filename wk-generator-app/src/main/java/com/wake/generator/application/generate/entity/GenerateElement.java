package com.wake.generator.application.generate.entity;

import com.google.common.base.CaseFormat;
import com.wake.generator.application.generate.common.GenerateElementTypeEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 领域图谱中,需要进行代码生成的元素
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:40
 * @see GenerateElementTypeEnum 元素类型
 * @since 1.0
 */
@Slf4j
@Data
public class GenerateElement {

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
    private GenerateElement parentAggregation;

    /**
     * 所属action包名称
     */
    private String actionName;

    /**
     * 元素类型
     *
     * @see GenerateElementTypeEnum
     */
    private GenerateElementTypeEnum shapeType;

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

    /**
     * 类名转小写加下划线
     */
    public String getLowerUnderscoreName() {
        return CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE)
            .convert(this.name);
    }

}
