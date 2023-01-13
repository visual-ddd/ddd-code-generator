package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.Aggregate;
import com.wd.paas.generator.newdsl.input.dsl.AggregateDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface AggregateDslConvert extends BaseConvert<AggregateDsl, Aggregate> {

    AggregateDslConvert INSTANCE = Mappers.getMapper(AggregateDslConvert.class);
}
