package com.wd.paas.generator.newdsl.convert;

import com.wd.paas.generator.newdsl.dsl.ApplicationDsl;
import com.wd.paas.generator.newdsl.visitor.element.Application;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface ApplicationConvert extends BaseConvert<ApplicationDsl, Application> {

    ApplicationConvert INSTANCE = Mappers.getMapper(ApplicationConvert.class);
}
