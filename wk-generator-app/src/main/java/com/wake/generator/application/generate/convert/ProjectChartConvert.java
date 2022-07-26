package com.wake.generator.application.generate.convert;

import com.wake.generator.application.BaseConvert;
import com.wake.generator.application.generate.entity.DomainChart;
import com.wake.generator.client.generete.dto.DomainChartGenerateDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 项目信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface ProjectChartConvert extends BaseConvert<DomainChartGenerateDto, DomainChart> {

    ProjectChartConvert MAPPER = Mappers.getMapper(ProjectChartConvert.class);

}
