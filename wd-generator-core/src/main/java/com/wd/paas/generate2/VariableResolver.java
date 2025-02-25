package com.wd.paas.generate2;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.context.Context;

/**
 * 变量解析工具
 */
public class VariableResolver {

    // 元素属性前缀
    private static final String ELEMENT_PROP_PREFIX = "element.";

    public void resolveVariables(DslElement element, TemplateMeta template, Context context) {
        // 遍历变量映射，解析变量
        template.getVariables().forEach(mapping -> {
            Object value = resolveSingleVariable(element, mapping);
            context.put(mapping.getTarget(), processValue(value, mapping));
        });
    }

    private Object processValue(Object rawValue, TemplateMeta.VariableMapping mapping) {
        if (mapping.getConverter() != null) {
//            return ConverterRegistry.getConverter(mapping.getConverter())
//                    .convert(rawValue);
        }
        return rawValue;
    }

    private Object resolveSingleVariable(DslElement element, TemplateMeta.VariableMapping mapping) {
        if (mapping.getSourceType() == null) {
            if (mapping.getSource() == null) {
                // 默认从 variables 动态属性集取值，简化配置
                String propPath = "variables." + mapping.getTarget();
                return resolveNestedProperty(element, propPath);
            }
            return DirectVariableResolver.resolveDirectValue(element, mapping.getSource());
        }
        switch (mapping.getSourceType()) {
            case DIRECT:
                return DirectVariableResolver.resolveDirectValue(element, mapping.getSource());
            case ELEMENT_PROP:
                return resolveElementProp(element, mapping);
            case FUNCTION:
                // TODO 函数执行器
//                return FunctionExecutor.execute(mapping.getSourceExpression(), element);
            default:
                return mapping.getSource();
        }
    }

    private Object resolveElementProp(DslElement element, TemplateMeta.VariableMapping mapping) {
        String propPath = mapping.getSource()
            .replace(ELEMENT_PROP_PREFIX, StringUtils.EMPTY);
        return resolveNestedProperty(element, propPath);
    }

    public Object resolveNestedProperty(DslElement element, String propPath) {
        try {
            return PropertyUtils.getNestedProperty(element, propPath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get nested property", e);
        }
    }
}
