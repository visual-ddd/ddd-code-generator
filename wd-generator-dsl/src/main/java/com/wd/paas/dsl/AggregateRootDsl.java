package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.MethodInfo;
import com.wd.paas.common.PropertyInfo;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class AggregateRootDsl {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("abstract")
    private Boolean isAbstract;

    @SerializedName("id")
    private PropertyInfo id;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    @SerializedName("methods")
    private List<MethodInfo> methodList;
}
