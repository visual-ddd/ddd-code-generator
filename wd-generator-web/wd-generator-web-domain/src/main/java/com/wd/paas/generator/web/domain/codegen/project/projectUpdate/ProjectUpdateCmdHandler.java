package com.wd.paas.generator.web.domain.codegen.project.projectUpdate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.project.Project;
import com.wd.paas.generator.web.domain.codegen.project.ProjectFactory;
import com.wd.paas.generator.web.domain.codegen.project.ProjectRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 更新项目信息-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ProjectUpdateCmdHandler {

    @Resource
    private ProjectRepository repository;
    @Resource
    private ProjectFactory factory;

    public void handle(ProjectUpdateCmd cmd) {
        Project project = repository.selectProjectById(cmd.getId());
        project.modify(cmd);
        repository.updateProject(project);

        DomainEventPublisher.getInstance()
            .postAfterCommit(new ProjectUpdateEvent(cmd));
    }
}