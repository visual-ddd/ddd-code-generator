package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import lombok.Data;

/***
 * @author wangchensheng
 */
@Data
public class SourceDsl implements ElementBuildable {

    private String type;

    @Override
    public Element build() {
        return null;
    }
}
