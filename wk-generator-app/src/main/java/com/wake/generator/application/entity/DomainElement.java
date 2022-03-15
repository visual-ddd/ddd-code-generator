package com.wake.generator.application.entity;


import com.wake.generator.application.constant.DomainElementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>Description: 元素信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 10:02
 */
@Slf4j
@Data
public class DomainElement {

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
     * 模型文件列表
     */
    private List<ModelFile> modelFiles = new ArrayList<>();

    /**
     * 所属聚合
     */
    private DomainElement parentAggregation;

    /**
     * 所属action包名称
     */
    private String actionName;

    /**
     * 元素类型
     */
    private DomainElementType elementType;

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
