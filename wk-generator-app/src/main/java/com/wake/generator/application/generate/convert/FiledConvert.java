package com.wake.generator.application.generate.convert;

import com.wake.generator.application.BaseConvert;
import com.wake.generator.application.generate.entity.Field;
import com.wake.generator.client.generete.dto.FieldDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 字段信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface FiledConvert extends BaseConvert<FieldDto, Field> {

    FiledConvert MAPPER = Mappers.getMapper(FiledConvert.class);

}
