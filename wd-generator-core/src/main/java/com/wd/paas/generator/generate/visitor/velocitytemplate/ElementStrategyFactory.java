package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.enums.ElementTypeEnum;
import com.wd.paas.generator.generate.element.*;
import com.wd.paas.generator.generate.visitor.velocitytemplate.strategy.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author shimmer
 */
@Slf4j
public class ElementStrategyFactory {

    public static ElementStrategy getInstance(ElementNode element) {
        ElementTypeEnum type = ElementTypeEnum.of(element.getClass().getSimpleName());
        switch (type) {
            case APPLICATION:
                return new ApplicationStrategy((ApplicationNode) element);
            case BUSINESS_DOMAIN:
                return new BusinessDomainStrategy((BusinessDomainNode) element);
            case AGGREGATE:
                return new AggregationStrategy((AggregateNode) element);
            case APPLICATION_ROOT:
                return new AggregationRootStrategy((AggregateRootNode) element);
            case VALUE_OBJECT:
                return new ValueObjectStrategy((ValueObjectNode) element);
            case COMMAND:
                return new CommandStrategy((CommandNode) element);
            case ENUM:
                return new EnumStrategy((EnumNode) element);
            case ENTITY:
                return new EntityStrategy((EntityNode) element);
            case OBJECT_MAPPER:
                return new ObjectMapperStrategy((ObjectMapperNode) element);
            case QUERY:
                return new QueryStrategy((QueryNode) element);
            case DTO:
                return new DTOStrategy((DtoNode) element);
            case DATA_OBJECT:
                return new DataObjectStrategy((DataObjectNode) element);
            case BUSINESS_SCENARIO:
                return new BusinessScenarioStrategy((BusinessScenarioNode) element);
            case BUSINESS_QUERY:
                return new BusinessQueryStrategy((BusinessQueryNode) element);
            case BUSINESS_DTO:
                return new BusinessDTOStrategy((BusinessDTONode) element);
            case DEFAULT:
                log.debug("没有找到对应的处理类型：{}", element.getClass());
                return new DefaultStrategy();
            default:
                throw new IllegalStateException("element type is empty.");
        }
    }
}
