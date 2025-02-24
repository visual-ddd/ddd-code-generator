package com.wd.paas.generate2;

import lombok.Data;

/**
 * 模板变量映射规则
 */
@Data
public class VariableMapping {

    // 模板中的变量名（Velocity中使用）
    private String targetVar;
    
    // 数据来源类型：DIRECT|ELEMENT_PROP|FUNCTION
    private SourceType sourceType = SourceType.ELEMENT_PROP;
    
    // 数据来源表达式（根据sourceType解析）
    private String sourceExpression;
    
    // 数据类型转换器（如Date→String）
    private String typeConverter;

    public enum SourceType {
        DIRECT,         // 直接值
        ELEMENT_PROP,   // 元素属性（支持嵌套）
        FUNCTION        // 自定义函数
    }
}
