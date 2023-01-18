package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.generator.generate.element.ASTApplication;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface ApplicationDslConvert extends BaseConvert<ApplicationDsl, ASTApplication> {

    ApplicationDslConvert INSTANCE = Mappers.getMapper(ApplicationDslConvert.class);
}
