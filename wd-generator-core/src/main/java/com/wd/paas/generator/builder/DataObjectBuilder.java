package com.wd.paas.generator.builder;

import com.wd.paas.common.DataPropertyInfo;
import com.wd.paas.dsl.DataObjectDsl;
import com.wd.paas.generator.builder.convert.DataObjectDslConvert;
import com.wd.paas.generator.generate.element.ASTDataObject;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class DataObjectBuilder {
    static ASTDataObject build(DataObjectDsl dataObjectDsl) {

        List<DataPropertyInfo> dataPropertyList = dataObjectDsl.getDataPropertyList();
        dataPropertyList.forEach(dataPropertyInfo -> dataPropertyInfo.setDataType(convertFileType(dataPropertyInfo.getDataType())));


        return DataObjectDslConvert.INSTANCE.dto2Do(dataObjectDsl);
    }

    /**
     * 转换属性类型
     */
    public static String convertFileType(String type){
        String result = "Object";
        if(StringUtils.isEmpty(type)){
            return result;
        }
        type = type.toLowerCase();
        switch (type){
            case "int":
            case "integer":
            case "tinyint":
            case "smallint":
                result = "Integer";
                break;
            case "long":
            case "bigint":
                result = "Long";
                break;
            case "boolean":
                result = "Boolean";
                break;
            case "decimal":
            case "number":
            case "float":
            case "double":
                result = "Double";
                break;
            case "date":
            case "datetime":
            case "timestamp":
                result = "Date";
                break;
            case "string":
            case "varchar":
                result = "String";
                break;
            case "object":
                result = "Object";
                break;
            case "array":
            case "array<object>":
                result = "List<Object>";
                break;
            case "array<string>":
                result = "List<String>";
                break;
            case "array<integer>":
                result = "List<Integer>";
                break;
            case "array<number>":
                result = "List<Double>";
                break;
            case "array<boolean>":
                result = "List<Boolean>";
                break;
            default:

                break;
        }
        return result;
    }

}