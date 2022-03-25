package com.wake.generator.application.cola.convert;

import com.wake.generator.application.cola.entity.Field;
import com.wake.generator.client.cola.dto.FieldDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 字段信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface FiledConvert extends BaseConvert<FieldDto, Field>{

    FiledConvert MAPPER = Mappers.getMapper(FiledConvert.class);

}
