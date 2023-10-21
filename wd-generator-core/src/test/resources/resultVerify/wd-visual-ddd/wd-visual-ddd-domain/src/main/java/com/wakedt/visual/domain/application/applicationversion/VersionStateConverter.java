package com.wakedt.visual.domain.application.applicationversion;

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
 * 版本状态-枚举JSON转换器
 *
 * @author shimmer
 * @since 1.0
 */
public class VersionStateConverter {

    public String convertToDatabaseColumn(VersionState versionState) {
        return versionState.getValue();
    }

    public VersionState convertToEntityAttribute(String value) {
        return BaseEnumUtil.getEnumByValue(value, VersionState.class);
    }

    public String convertToDatabaseColumn(List<VersionState> enumList) {
        JSONArray jsonArray = new JSONArray();
        for (VersionState enumType : Optional.ofNullable(enumList).orElse(Collections.emptyList())) {
            String value = convertToDatabaseColumn(enumType);
            jsonArray.add(value);
        }
        return jsonArray.toString();
    }

    public List<VersionState> convertToDatabaseColumn(String jsonArray) {
        List<VersionState> enumList = new ArrayList<>();
        List<String> values = JSONUtil.toList(jsonArray, String.class);
        for (String value : values) {
            enumList.add(convertToEntityAttribute(value));
        }
        return enumList;
    }
}