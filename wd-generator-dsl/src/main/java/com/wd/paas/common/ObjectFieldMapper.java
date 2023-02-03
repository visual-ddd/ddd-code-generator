package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 属性映射规则
 */
@Data
public class ObjectFieldMapper {

    /**
     * 原始字段
     */
    @SerializedName("sourceField")
    private String sourceField;

    /**
     * 目标字段
     */
    @SerializedName("targetField")
    private String targetField;
}
