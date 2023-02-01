package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.DataObjectDsl;
import com.wd.paas.generator.generate.element.ASTDataObject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DataObjectDslConvert extends BaseConvert<DataObjectDsl, ASTDataObject> {

    DataObjectDslConvert INSTANCE = Mappers.getMapper(DataObjectDslConvert.class);
}
