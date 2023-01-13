package com.wd.paas.generator.newdsl.input.dsl;

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

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

    @Override
    public DomainEvent build() {
        return DomainEventDslConvert.INSTANCE.dto2Do(this);
    }
}
