package com.wd.paas.generator.web.infrastructure.codegen.repository;

import com.wd.paas.generator.web.domain.codegen.project.Project;
import com.wd.paas.generator.web.domain.codegen.project.ProjectRepository;
import com.wd.paas.generator.web.infrastructure.codegen.assembler.ProjectDoConvert;
import com.wd.paas.generator.web.infrastructure.codegen.repository.mapper.ProjectMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.ProjectDO;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 项目存储接口实现类
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Slf4j
@Component
public class ProjectRepositoryImpl implements ProjectRepository {

    @Resource
    private ProjectMapper mapper;

    @Override
    public Long insertProject(Project aggregation) {
        ProjectDO aggregationDO = ProjectDoConvert.INSTANCE.dto2Do(aggregation);
        mapper.insert(aggregationDO);
        return aggregationDO.getId();
    }

    @Override
    public void updateProject(Project aggregation) {
        mapper.updateById(ProjectDoConvert.INSTANCE.dto2Do(aggregation));
    }

    @Override
    public void deleteProjectById(Long id) {
        mapper.deleteById(id);
    }

    @Override
    public Project selectProjectById(Long id) {
        return ProjectDoConvert.INSTANCE.do2Dto(mapper.selectById(id));
    }
}
