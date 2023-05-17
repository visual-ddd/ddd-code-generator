package com.wd.paas.generator.common.util;

import org.apache.commons.lang3.StringUtils;

public class TypeConvertor {

    /**
     * 转换属性类型
     */
    public static String convertFileType(String type) {
        if (StringUtils.isBlank(type)) {
            return "Object";
        }
        switch (type.toLowerCase()) {
            case "int":
            case "integer":
                return "Integer";
            case "long":
            case "bigint":
                return "Long";
            case "boolean":
                return "Boolean";
            case "decimal":
            case "number":
            case "float":
                return "Float";
            case "double":
                return "Double";
            case "date":
            case "datetime":
            case "timestamp":
                return "LocalDateTime";
            case "string":
            case "varchar":
            case "object":
            case "json":
                return "String";
            default:
                return type;
        }
    }

}