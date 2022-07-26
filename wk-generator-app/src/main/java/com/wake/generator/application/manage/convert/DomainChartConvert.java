package com.wake.generator.application.manage.convert;

import com.wake.generator.application.BaseConvert;
import com.wake.generator.client.manage.dto.DomainChartDto;
import com.wake.generator.infra.manage.repository.model.DomainChartDo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface DomainChartConvert extends BaseConvert<DomainChartDto, DomainChartDo> {

    DomainChartConvert MAPPER = Mappers.getMapper(DomainChartConvert.class);

}
