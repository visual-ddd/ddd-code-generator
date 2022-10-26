package com.wd.paas.generator.web.app.codegen.domainchart.assember;

import com.wd.paas.generator.web.app.BaseConvert;
import com.wd.paas.generator.web.client.codegen.domainchart.dto.DomainChartDTO;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.DomainChartDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 带看单和DO转换器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022-09-14 20:11:34
 * @since 1.0
 */
@Mapper
public interface DomainChartDTOConvert extends
    BaseConvert<DomainChartDTO, DomainChartDO> {

    DomainChartDTOConvert INSTANCE = Mappers.getMapper(DomainChartDTOConvert.class);
}