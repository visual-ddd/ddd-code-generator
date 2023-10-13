package com.wakedt.visual.organization.domain.teammember;

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
 * 团队成员类型-枚举JSON转换器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public class MemberTypeConverter {

    public Integer convertToDatabaseColumn(MemberType memberType) {
        return memberType.getValue();
    }

    public MemberType convertToEntityAttribute(Integer value) {
        return BaseEnumUtil.getEnumByValue(value, MemberType.class);
    }

    public String convertToDatabaseColumn(List<MemberType> enumList) {
        JSONArray jsonArray = new JSONArray();
        for (MemberType enumType : Optional.ofNullable(enumList).orElse(Collections.emptyList())) {
            Integer value = convertToDatabaseColumn(enumType);
            jsonArray.add(value);
        }
        return jsonArray.toString();
    }

    public List<MemberType> convertToDatabaseColumn(String jsonArray) {
        List<MemberType> enumList = new ArrayList<>();
        List<Integer> values = JSONUtil.toList(jsonArray, Integer.class);
        for (Integer value : values) {
            enumList.add(convertToEntityAttribute(value));
        }
        return enumList;
    }
}