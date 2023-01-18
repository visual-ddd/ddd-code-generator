package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClassInfo extends Info {

    /**
     * 继承, 默认为 null
     */
    @SerializedName("extends")
    private ClassInfo extendsClass;

    /**
     * 扩展的接口列表，默认为 []
     */
    @SerializedName("implements")
    private List<InterfaceInfo> interfaceList;

    /**
     * 抽象类，默认为false
     */
    @SerializedName("abstract")
    private Boolean isAbstract;

    /**
     * 类实例属性
     */
    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    /**
     * 类实例方法, 支持方法重载
     */
    @SerializedName("methods")
    private List<MethodInfo> methodList;

    /**
     * 类静态属性
     */
    @SerializedName("classProperties")
    private List<PropertyInfo> classPropertyList;

    /**
     * 类实例方法, 支持方法重载
     */
    @SerializedName("classMethods")
    private List<MethodInfo> classMethodList;
}
