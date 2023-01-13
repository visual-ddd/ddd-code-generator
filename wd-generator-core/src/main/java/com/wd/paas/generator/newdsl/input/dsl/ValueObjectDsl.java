package com.wd.paas.generator.newdsl.input.dsl;

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

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

    private List<MethodInfo> methodList;

    @Override
    public ValueObject build() {
        ValueObject ValueObject = ValueObjectDslConvert.INSTANCE.dto2Do(this);
        return ValueObject;
    }
}
