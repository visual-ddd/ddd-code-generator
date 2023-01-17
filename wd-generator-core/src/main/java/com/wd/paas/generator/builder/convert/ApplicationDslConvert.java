package com.wd.paas.generator.builder.convert;

import com.wd.paas.generator.input.ApplicationDsl;
import com.wd.paas.generator.generate.element.Application;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface ApplicationDslConvert extends BaseConvert<ApplicationDsl, Application> {

    ApplicationDslConvert INSTANCE = Mappers.getMapper(ApplicationDslConvert.class);
}
