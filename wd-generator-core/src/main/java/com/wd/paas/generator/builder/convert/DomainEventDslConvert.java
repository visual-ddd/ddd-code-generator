package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.DomainEventDsl;
import com.wd.paas.generator.generate.element.ASTDomainEvent;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DomainEventDslConvert extends BaseConvert<DomainEventDsl, ASTDomainEvent> {

    DomainEventDslConvert INSTANCE = Mappers.getMapper(DomainEventDslConvert.class);
}
