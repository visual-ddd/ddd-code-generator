package com.wake.generator.application.cola.convert;

import com.wake.generator.application.cola.entity.Global;
import com.wake.generator.application.cola.entity.Method;
import com.wake.generator.client.cola.dto.GlobalDto;
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
public interface GlobalConvert extends BaseConvert<GlobalDto, Global>{

    GlobalConvert MAPPER = Mappers.getMapper(GlobalConvert.class);

}
