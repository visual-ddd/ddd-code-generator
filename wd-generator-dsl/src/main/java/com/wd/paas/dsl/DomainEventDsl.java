package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.PropertyInfo;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class DomainEventDsl {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

}
