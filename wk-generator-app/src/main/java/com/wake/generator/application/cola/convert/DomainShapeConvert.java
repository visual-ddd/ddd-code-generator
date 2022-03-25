package com.wake.generator.application.cola.convert;

import com.wake.generator.application.cola.entity.DomainShape;
import com.wake.generator.client.cola.dto.DomainShapeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 图形信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface DomainShapeConvert extends BaseConvert<DomainShapeDto, DomainShape> {

    DomainShapeConvert MAPPER = Mappers.getMapper(DomainShapeConvert.class);

}
