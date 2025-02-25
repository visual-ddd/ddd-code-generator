package com.wd.paas.generate2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板元数据定义
 */
@Data
public class TemplateMeta {

    // 模板类型标识（对应DSL元素类型）
    private String type;

    // 模板描述
    private String description;

    // Velocity模板文件路径
    private String template;

    // 输出路径规则（支持Velocity表达式）
    private String output;

    // 是否启用（可动态关闭模板）
    private boolean enabled = true;

    // 依赖的其他模板类型（用于生成顺序控制）
    private List<String> dependencies = new ArrayList<>();

    // 变量映射规则
    private List<VariableMapping> variables = new ArrayList<>();

    // 嵌套结构支持（示例配置见后续）
    private List<TemplateMeta> subTemplates;

    // 嵌套配置类
    @Data
    public static class VariableMapping {
        private String target;
        private String source;
        private SourceType sourceType;
        private String converter;

        public enum SourceType {
            DIRECT, ELEMENT_PROP, FUNCTION
        }
    }

}
