package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.DataObjectReferenceDsl;
import com.wd.paas.generator.generate.element.ASTDataObjectReference;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DataObjectReferenceDslConvert extends BaseConvert<DataObjectReferenceDsl, ASTDataObjectReference> {

    DataObjectReferenceDslConvert INSTANCE = Mappers.getMapper(DataObjectReferenceDslConvert.class);
}
