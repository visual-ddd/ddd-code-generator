package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 接口信息
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfo extends Named {

    /**
     * 扩展的接口列表
     */
    @SerializedName("implements")
    private List<InterfaceInfo> implementList;

    /**
     * 接口属性
     */
    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    /**
     * 接口方法, 支持方法重载
     */
    @SerializedName("methods")
    private List<MethodInfo> methodInfoList;
}
