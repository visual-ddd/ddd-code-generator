package com.wake.generator.application.cola.convert;

import com.wake.generator.application.cola.entity.ProjectChart;
import com.wake.generator.client.cola.dto.ProjectChartDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 项目信息转换器
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 18:24
 */
@Mapper
public interface ProjectChartConvert extends BaseConvert<ProjectChartDto, ProjectChart> {

    ProjectChartConvert MAPPER = Mappers.getMapper(ProjectChartConvert.class);

}
