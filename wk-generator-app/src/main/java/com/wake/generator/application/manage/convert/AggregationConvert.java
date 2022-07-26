package com.wake.generator.application.manage.convert;

import com.wake.generator.application.BaseConvert;
import com.wake.generator.client.manage.dto.AggregationDto;
import com.wake.generator.infra.manage.repository.model.AggregationDo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface AggregationConvert extends BaseConvert<AggregationDto, AggregationDo> {

    AggregationConvert MAPPER = Mappers.getMapper(AggregationConvert.class);

}
