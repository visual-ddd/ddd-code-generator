package com.wd.paas.generator.builder.convert;

import com.wd.paas.generator.generate.element.DomainModel;
import com.wd.paas.generator.input.DomainModelDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DomainModelDslConvert extends BaseConvert<DomainModelDsl, DomainModel> {

    DomainModelDslConvert INSTANCE = Mappers.getMapper(DomainModelDslConvert.class);
}
