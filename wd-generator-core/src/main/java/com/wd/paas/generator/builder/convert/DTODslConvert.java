package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.DtoDsl;
import com.wd.paas.generator.generate.element.ASTDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface DTODslConvert extends BaseConvert<DtoDsl, ASTDto> {

    DTODslConvert INSTANCE = Mappers.getMapper(DTODslConvert.class);
}
