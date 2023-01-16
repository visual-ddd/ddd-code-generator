package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.DomainEvent;
import com.wd.paas.generator.newdsl.input.dsl.convert.DomainEventDslConvert;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class DomainEventDsl implements ElementBuildable {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    @Override
    public DomainEvent build() {
        return DomainEventDslConvert.INSTANCE.dto2Do(this);
    }
}
