package com.wd.paas.generator.web.infrastructure.codegen.assembler;

import com.wakedata.common.mybatis.convert.BaseConvert;
import com.wd.paas.generator.web.domain.codegen.project.Project;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.ProjectDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 项目和DO转换器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Mapper
public interface ProjectDoConvert extends
    BaseConvert<Project, ProjectDO> {

    ProjectDoConvert INSTANCE = Mappers.getMapper(ProjectDoConvert.class);
}
