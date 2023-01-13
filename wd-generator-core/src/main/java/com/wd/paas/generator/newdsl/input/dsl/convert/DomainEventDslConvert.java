package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.DomainEvent;
import com.wd.paas.generator.newdsl.input.dsl.DomainEventDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DomainEventDslConvert extends BaseConvert<DomainEventDsl, DomainEvent> {

    DomainEventDslConvert INSTANCE = Mappers.getMapper(DomainEventDslConvert.class);
}
