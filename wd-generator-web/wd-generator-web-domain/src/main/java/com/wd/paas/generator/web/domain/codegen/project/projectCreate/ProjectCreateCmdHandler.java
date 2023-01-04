package com.wd.paas.generator.web.domain.codegen.project.projectCreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.project.ProjectFactory;
import com.wd.paas.generator.web.domain.codegen.project.ProjectRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 新增项目信息-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ProjectCreateCmdHandler {

    @Resource
    private ProjectRepository repository;
    @Resource
    private ProjectFactory factory;

    public Long handle(ProjectCreateCmd cmd) {
        Long id = repository.insertProject(factory.getInstance(cmd));

//        DomainEventPublisher.getInstance().postAfterCommit(new ProjectCreateEvent(cmd, id));
        return id;
    }
}