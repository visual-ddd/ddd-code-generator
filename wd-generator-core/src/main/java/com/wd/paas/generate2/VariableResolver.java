package com.wd.paas.generate2;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 变量解析工具
 */
public class VariableResolver {

    // 元素属性前缀
    private static final String ELEMENT_PROP_PREFIX = "element.";
    
    public Map<String, Object> resolveVariables(DslElement element, TemplateMeta template) {
        Map<String, Object> context = new HashMap<>();

        // 遍历变量映射，解析变量
        template.getVariableMappings().forEach(mapping -> {
            Object value = resolveSingleVariable(element, mapping);
            context.put(mapping.getTargetVar(), value);
        });
        
        return context;
    }
    
    private Object resolveSingleVariable(DslElement element, VariableMapping mapping) {
        switch (mapping.getSourceType()) {
            case DIRECT:
                return mapping.getSourceExpression();
            case ELEMENT_PROP:
                String propPath = mapping.getSourceExpression()
                    .replace(ELEMENT_PROP_PREFIX, StringUtils.EMPTY);
                return resolveNestedProperty(element, propPath);
            case FUNCTION:
                // TODO 函数执行器
//                return FunctionExecutor.execute(mapping.getSourceExpression(), element);
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Object resolveNestedProperty(DslElement element, String propPath) {
        try {
            return PropertyUtils.getNestedProperty(element, propPath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get nested property", e);
        }
    }
}
