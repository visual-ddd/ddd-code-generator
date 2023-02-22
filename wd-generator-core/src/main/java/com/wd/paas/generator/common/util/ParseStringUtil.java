package com.wd.paas.generator.common.util;

import com.wd.paas.common.ParameterInfo;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年02月08日 19:13:34
 */
public class ParseStringUtil {

    /**
     * 提取方法返回参数中的对象类型
     *
     * @param type 方法返回参数
     * @return 对象类型
     */
    public static String extractObjectType(String type) {
        String strings;
        if (StringUtils.contains(type,",")){
            strings = StringUtils.substringAfterLast(type, ",");
            return StringUtils.substringBefore(extractObjectType(strings),">");
        }
        if (StringUtils.contains(type,"<")){
            strings = StringUtils.substringAfterLast(type, "<");
            return StringUtils.substringBefore(extractObjectType(strings),">");
        }
        return type;
    }

    /**
     * 解析参数列表为字符串
     *
     * @param parameterInfoList 参数列表
     * @return 例如：String str1, String str2, String str3
     */
    public static String extractMethodParameterList (List<ParameterInfo> parameterInfoList){

        if (parameterInfoList.isEmpty()){
            return "";
        }

        List<String> parameterList = new ArrayList<>();
        for (ParameterInfo parameterInfo : parameterInfoList) {
            String concat = parameterInfo.getType().concat(" ").concat(parameterInfo.getName());
            parameterList.add(concat);
        }
        return StringUtils.join(parameterList, ", ");
    }

}
