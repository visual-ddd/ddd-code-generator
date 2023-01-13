package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class CommandParameterDsl implements ElementBuildable {

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

    @Override
    public Element build() {
        return null;
    }
}
