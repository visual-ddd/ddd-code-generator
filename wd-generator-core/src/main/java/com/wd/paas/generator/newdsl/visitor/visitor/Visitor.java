package com.wd.paas.generator.newdsl.visitor.visitor;

import com.wd.paas.generator.newdsl.visitor.element.Application;
import com.wd.paas.generator.newdsl.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.visitor.element.BusinessScenario;

/**
 * 访问者, 提供元素的操作方法
 *
 * @author shimmer
 */
public abstract class Visitor {

    public abstract void visit(Application application);

    public abstract void visit(BusinessDomain businessDomain);

    public abstract void visit(BusinessScenario businessScenario);
}
