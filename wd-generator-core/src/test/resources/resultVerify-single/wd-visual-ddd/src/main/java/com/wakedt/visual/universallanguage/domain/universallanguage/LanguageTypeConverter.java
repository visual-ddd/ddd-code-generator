package com.wakedt.visual.universallanguage.domain.universallanguage;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.wakedata.common.core.util.BaseEnumUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * 统一语言类型-枚举JSON转换器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public class LanguageTypeConverter {

    public Integer convertToDatabaseColumn(LanguageType languageType) {
        return languageType.getValue();
    }

    public LanguageType convertToEntityAttribute(Integer value) {
        return BaseEnumUtil.getEnumByValue(value, LanguageType.class);
    }

    public String convertToDatabaseColumn(List<LanguageType> enumList) {
        JSONArray jsonArray = new JSONArray();
        for (LanguageType enumType : Optional.ofNullable(enumList).orElse(Collections.emptyList())) {
            Integer value = convertToDatabaseColumn(enumType);
            jsonArray.add(value);
        }
        return jsonArray.toString();
    }

    public List<LanguageType> convertToDatabaseColumn(String jsonArray) {
        List<LanguageType> enumList = new ArrayList<>();
        List<Integer> values = JSONUtil.toList(jsonArray, Integer.class);
        for (Integer value : values) {
            enumList.add(convertToEntityAttribute(value));
        }
        return enumList;
    }
}