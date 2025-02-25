package com.wd.paas.generate2;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DirectVariableResolver {
    private static final Pattern PLACEHOLDER_PATTERN = Pattern.compile("\\$\\{(.*?)}");
    
    public static Object resolveDirectValue(DslElement element, String expression) {
        Matcher matcher = PLACEHOLDER_PATTERN.matcher(expression);
        StringBuffer result = new StringBuffer();
        
        while (matcher.find()) {
            String placeholder = matcher.group(1);
            Object value = getNestedProperty(element, placeholder);
            matcher.appendReplacement(result, Matcher.quoteReplacement(value.toString()));
        }
        matcher.appendTail(result);
        
        return result.toString();
    }

    private static Object getNestedProperty(DslElement element, String propertyPath) {
        String[] parts = propertyPath.split("\\.");
        Object current = element;
        
        for (String part : parts) {
            if (current instanceof DslElement) {
                current = getElementProperty((DslElement) current, part);
            } else if (current instanceof Map) {
                current = ((Map<?, ?>) current).get(part);
            } else {
                throw new VariableResolveException("无法解析属性路径: " + propertyPath);
            }
            
            if (current == null) {
                throw new VariableResolveException("属性不存在: " + propertyPath);
            }
        }
        return current;
    }

    private static Object getElementProperty(DslElement element, String propertyName) {
        try {
            // 优先通过Getter方法获取
            String getterName = "get" + StringUtils.capitalize(propertyName);
            Method method = element.getClass().getMethod(getterName);
            return method.invoke(element);
        } catch (NoSuchMethodException e) {
            // 尝试从properties Map获取
            return element.getVariables().get(propertyName);
        } catch (Exception e) {
            throw new VariableResolveException("属性访问失败: " + propertyName, e);
        }
    }

}

class VariableResolveException extends RuntimeException {
    public VariableResolveException(String message) {
        super("变量解析失败: " + message);
    }

    public VariableResolveException(String message, Throwable cause) {
        super("变量解析失败: " + message, cause);
    }
}

