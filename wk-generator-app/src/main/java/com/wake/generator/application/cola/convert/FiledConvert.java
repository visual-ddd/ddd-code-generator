package com.wake.generator.application.cola.convert;

import com.wake.generator.client.cola.dto.test.Field;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 字段信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface FiledConvert extends BaseConvert<Field, com.wake.generator.application.cola.entity.Field>{

    FiledConvert MAPPER = Mappers.getMapper(FiledConvert.class);

}
