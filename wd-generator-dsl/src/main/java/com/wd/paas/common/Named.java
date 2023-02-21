package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 基本信息 - 通用属性
 *
 * @author shimmer
 */
@Data
public class Named {

    /**
     * 元素唯一标识
     */
    @SerializedName("uuid")
    private String identity;

    /**
     * 标题（中文名）
     */
    @SerializedName("title")
    private String title;

    /**
     * 名称（英文名）
     */
    @SerializedName("name")
    private String name;

    /**
     * 描述
     */
    @SerializedName("description")
    private String description;

    /**
     * 拓展信息
     */
    @SerializedName("meta")
    private MetaInfo meta;
}
