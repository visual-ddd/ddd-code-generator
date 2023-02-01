package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.DataModelDsl;
import com.wd.paas.generator.generate.element.ASTDataModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface DataModelDslConvert extends BaseConvert<DataModelDsl, ASTDataModel> {

    DataModelDslConvert INSTANCE = Mappers.getMapper(DataModelDslConvert.class);
}
