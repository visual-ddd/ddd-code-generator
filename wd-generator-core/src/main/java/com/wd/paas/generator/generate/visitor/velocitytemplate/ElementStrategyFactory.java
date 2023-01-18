package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.enums.ElementTypeEnum;
import com.wd.paas.generator.generate.element.*;
import com.wd.paas.generator.generate.visitor.velocitytemplate.strategy.*;

/**
 * @author shimmer
 */
public class ElementStrategyFactory {
    
    public static ElementStrategy getInstance(Element element) {
        ElementTypeEnum type = ElementTypeEnum.of(element.getClass().getSimpleName());
        switch (type) {
            case APPLICATION :
                return new ApplicationStrategy((ASTApplication) element);
            case BUSINESS_DOMAIN:
                return new BusinessDomainStrategy((ASTBusinessDomain) element);
            case AGGREGATE:
                return new AggregationStrategy((ASTAggregate) element);
            case VALUE_OBJECT:
                return new ValueObjectStrategy((ASTValueObject) element);
            case COMMAND:
                return new CommandStrategy((ASTCommand) element);
            case ENUM:
                return new EnumStrategy((ASTEnum) element);
            case ENTITY:
                return new EntityStrategy((ASTEntity) element);
            case DEFAULT:
                return new DefaultStrategy();
            default:
                throw new IllegalStateException("element type is empty.");
        }
    }
}
