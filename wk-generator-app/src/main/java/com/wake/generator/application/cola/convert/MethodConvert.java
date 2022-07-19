package com.wake.generator.application.cola.convert;

import com.wake.generator.client.cola.dto.element.Method;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 方法信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface MethodConvert extends BaseConvert<Method, com.wake.generator.application.cola.entity.Method>{

    MethodConvert MAPPER = Mappers.getMapper(MethodConvert.class);

}
