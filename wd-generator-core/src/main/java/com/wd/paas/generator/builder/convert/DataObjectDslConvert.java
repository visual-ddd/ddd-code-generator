package com.wd.paas.generator.builder.convert;

import com.wd.paas.common.enums.IndexTypeConvert;
import com.wd.paas.dsl.DataObjectDsl;
import com.wd.paas.generator.generate.element.ASTDataObject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper(uses = {
        IndexTypeConvert.class,
})
public interface DataObjectDslConvert extends BaseConvert<DataObjectDsl, ASTDataObject> {

    DataObjectDslConvert INSTANCE = Mappers.getMapper(DataObjectDslConvert.class);
}
