package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.Application;
import com.wd.paas.generator.newdsl.input.dsl.ApplicationDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface ApplicationDslConvert extends BaseConvert<ApplicationDsl, Application> {

    ApplicationDslConvert INSTANCE = Mappers.getMapper(ApplicationDslConvert.class);
}
