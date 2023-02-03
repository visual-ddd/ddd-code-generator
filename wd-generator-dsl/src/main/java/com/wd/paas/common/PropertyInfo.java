package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字段属性
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PropertyInfo extends Info {

    /**
     * 类型
     */
    @SerializedName("type")
    private String type;

    /**
     * 访问权限 protected/public/private
     */
    @SerializedName("access")
    private String access;
}
