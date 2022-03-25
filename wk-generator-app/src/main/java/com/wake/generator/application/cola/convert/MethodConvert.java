package com.wake.generator.application.cola.convert;

import com.wake.generator.application.cola.entity.Field;
import com.wake.generator.application.cola.entity.Method;
import com.wake.generator.client.cola.dto.FieldDto;
import com.wake.generator.client.cola.dto.MethodDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 方法信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface MethodConvert extends BaseConvert<MethodDto, Method>{

    MethodConvert MAPPER = Mappers.getMapper(MethodConvert.class);

}
