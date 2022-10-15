package com.wd.paas.generator.web.app.codegen.project.assember;

import com.wd.paas.generator.web.app.BaseConvert;
import com.wd.paas.generator.web.client.codegen.project.dto.ProjectDTO;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.ProjectDO;
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
public interface ProjectDTOConvert extends
    BaseConvert<ProjectDTO, ProjectDO> {

    ProjectDTOConvert INSTANCE = Mappers.getMapper(ProjectDTOConvert.class);
}