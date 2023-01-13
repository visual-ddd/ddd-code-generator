package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate;

import com.wd.paas.generator.newdsl.constant.ElementTypeEnum;
import com.wd.paas.generator.newdsl.generate.visitor.element.*;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy.*;

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
            case AGGREGATE:
                return new AggregationStrategy((Aggregate) element);
            case VALUE_OBJECT:
                return new ValueObjectStrategy((ValueObject) element);
            case COMMAND:
                return new CommandStrategy((Command) element);
            default:
                throw new IllegalStateException("element type is empty.");
        }
    }
}
