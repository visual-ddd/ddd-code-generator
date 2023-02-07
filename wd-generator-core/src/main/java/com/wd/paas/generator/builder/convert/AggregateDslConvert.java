package com.wd.paas.generator.builder.convert;

import com.wd.paas.common.enums.RepositoryTypeEnumConvert;
import com.wd.paas.dsl.AggregateDsl;
import com.wd.paas.generator.generate.element.ASTAggregate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper(uses = {
        RepositoryTypeEnumConvert.class
})
public interface AggregateDslConvert extends BaseConvert<AggregateDsl, ASTAggregate> {

    AggregateDslConvert INSTANCE = Mappers.getMapper(AggregateDslConvert.class);
}
