package com.wake.generator.application.generate.convert;

import com.wake.generator.application.BaseConvert;
import com.wake.generator.application.generate.entity.Method;
import com.wake.generator.client.generete.dto.MethodDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 方法信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface MethodConvert extends BaseConvert<MethodDto, Method> {

    MethodConvert MAPPER = Mappers.getMapper(MethodConvert.class);

}
