package com.wd.paas.generator.builder.convert;

import com.wd.paas.generator.generate.element.Aggregate;
import com.wd.paas.generator.input.AggregateDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface AggregateDslConvert extends BaseConvert<AggregateDsl, Aggregate> {

    AggregateDslConvert INSTANCE = Mappers.getMapper(AggregateDslConvert.class);
}
