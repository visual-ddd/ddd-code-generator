package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate;

import com.wd.paas.generator.newdsl.generate.visitor.element.Application;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy.ApplicationStrategy;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy.BusinessDomainStrategy;

/**
 * @author shimmer
 */
public class ElementStrategyFactory {
    
    public static ElementStrategy getInstance(Element element) {
        if (element instanceof Application) {
            return new ApplicationStrategy((Application) element);
        } else if (element instanceof BusinessDomain) {
            return new BusinessDomainStrategy((BusinessDomain) element);
        }
        throw new IllegalArgumentException("element type is empty.");
    }
}
