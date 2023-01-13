package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import lombok.Data;

/***
 * @author wangchensheng
 */
@Data
public class RuleDsl implements ElementBuildable {

    private String name;

    private String description;

    @Override
    public Element build() {
        return null;
    }
}
