package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate;

import com.wd.paas.generator.newdsl.constant.ElementTypeEnum;
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
        ElementTypeEnum type = ElementTypeEnum.of(element.getClass().getSimpleName());
        switch (type) {
            case APPLICATION :
                return new ApplicationStrategy((Application) element);
            case BUSINESS_DOMAIN:
                return new BusinessDomainStrategy((BusinessDomain) element);
            default:
                throw new IllegalStateException("element type is empty.");
        }
    }
}
