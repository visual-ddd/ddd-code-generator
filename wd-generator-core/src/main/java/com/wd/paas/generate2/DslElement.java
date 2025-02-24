package com.wd.paas.generate2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * DSL元素（最小生成单元）
 * 优化后扁平化处理
 * 通过动态属性集替代继承体系，减少节点类型维护成本
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DslElement {

    // 元素唯一标识
    private String id;

    // 元素类型（AGGREGATE/ENTITY等）
    private String type;

    // 元素名称
    private String name;

    // 包路径
    private String rootPackage;

    // 父元素引用
    private DslElement parent;

    // 显式引用列表
    private List<DSLReference> references;

    // 所属模型
    private DSLModel model;

    // 动态属性集
    private Map<String, Object> properties;

    // 直接关联子元素
    private List<DslElement> children;


    public void addReference(DSLReference newReference) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(newReference);
    }

}