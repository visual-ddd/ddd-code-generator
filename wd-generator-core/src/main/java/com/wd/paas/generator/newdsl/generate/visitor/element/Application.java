package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 应用元素
 *
 * @author zhuxueliang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Application extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private List<PropertyInfo> meta;

    private String version;

    private String packageName;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
