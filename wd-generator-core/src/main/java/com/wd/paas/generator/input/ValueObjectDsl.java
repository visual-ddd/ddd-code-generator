package com.wd.paas.generator.input;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.common.MethodInfo;
import com.wd.paas.generator.common.PropertyInfo;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class ValueObjectDsl {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    @SerializedName("methods")
    private List<MethodInfo> methodList;
}
