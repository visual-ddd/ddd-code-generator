package com.wd.paas.generator.web.domain.codegen.project.projectRemove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.project.ProjectRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 删除项目及项目下的领域图谱-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ProjectRemoveCmdHandler {

    @Resource
    private ProjectRepository repository;

    public void handle(ProjectRemoveCmd cmd) {
        repository.deleteProjectById(cmd.getId());

        DomainEventPublisher.getInstance()
            .postAfterCommit(new ProjectRemoveEvent(cmd));
    }
}