package com.wd.paas.generator.newdsl.visitor.element;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.visitor.visitor.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用元素
 *
 * @author zhuxueliang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Application extends CompositeElement {

    private Info info;

    private Versionable versionable;

    private String packageName;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
