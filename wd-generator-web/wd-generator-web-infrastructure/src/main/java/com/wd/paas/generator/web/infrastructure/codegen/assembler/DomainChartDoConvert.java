package com.wd.paas.generator.web.infrastructure.codegen.assembler;

import com.wakedata.common.mybatis.convert.BaseConvert;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.DomainChartDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 领域图谱和DO转换器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Mapper
public interface DomainChartDoConvert extends
    BaseConvert<DomainChart, DomainChartDO> {

    DomainChartDoConvert INSTANCE = Mappers.getMapper(DomainChartDoConvert.class);
}
