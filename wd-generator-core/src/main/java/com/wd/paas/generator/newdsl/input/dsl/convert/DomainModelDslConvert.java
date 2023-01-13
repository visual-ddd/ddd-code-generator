package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.DomainModel;
import com.wd.paas.generator.newdsl.input.dsl.DomainModelDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DomainModelDslConvert extends BaseConvert<DomainModelDsl, DomainModel> {

    DomainModelDslConvert INSTANCE = Mappers.getMapper(DomainModelDslConvert.class);
}
