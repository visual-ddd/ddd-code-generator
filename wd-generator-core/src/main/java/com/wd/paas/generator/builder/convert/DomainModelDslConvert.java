package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.DomainModelDsl;
import com.wd.paas.generator.generate.element.DomainModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DomainModelDslConvert extends BaseConvert<DomainModelDsl, DomainModel> {

    DomainModelDslConvert INSTANCE = Mappers.getMapper(DomainModelDslConvert.class);
}
