package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.generate.element.*;
import com.wd.paas.generator.generate.visitor.velocitytemplate.strategy.*;
import com.wd.paas.generator.constant.ElementTypeEnum;

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
            case AENUM:
                return new EnumStrategy((AEnum) element);
            case ENTITY:
                return new EntityStrategy((Entity) element);
            case DEFAULT:
                return new DefaultStrategy();
            default:
                throw new IllegalStateException("element type is empty.");
        }
    }
}
