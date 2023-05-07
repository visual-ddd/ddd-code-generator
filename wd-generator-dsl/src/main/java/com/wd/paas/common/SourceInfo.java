package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 命令/查询的触发来源信息
 *
 * @author wangchensheng
 */
@Data
public class SourceInfo {

    /**
     * 类型
     */
    @SerializedName("type")
    private String type;

    /**
     * 值
     */
    @SerializedName("value")
    private Object value;

}
