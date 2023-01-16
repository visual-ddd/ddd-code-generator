package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.MethodInfo;
import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.ValueObject;
import com.wd.paas.generator.newdsl.input.dsl.convert.ValueObjectDslConvert;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class ValueObjectDsl implements ElementBuildable {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    @SerializedName("methods")
    private List<MethodInfo> methodList;

    @Override
    public ValueObject build() {
        return ValueObjectDslConvert.INSTANCE.dto2Do(this);
    }
}
