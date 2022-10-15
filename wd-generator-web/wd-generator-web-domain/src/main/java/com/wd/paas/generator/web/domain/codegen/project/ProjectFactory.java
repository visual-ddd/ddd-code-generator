package com.wd.paas.generator.web.domain.codegen.project;

import com.wd.paas.generator.web.domain.codegen.project.projectCreate.ProjectCreateCmd;
import org.springframework.stereotype.Component;

/**
 * 项目-聚合根-工厂
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ProjectFactory {

    public Project getInstance(ProjectCreateCmd cmd) {
        Project project = new Project();
        project.setUserId(cmd.getUserId());
        project.setProjectName(cmd.getProjectName());
        project.setProjectDesc(cmd.getProjectDesc());
        project.setProjectVersion(cmd.getProjectVersion());
        project.setProjectAuthor(cmd.getProjectAuthor());
        project.setPackagePath(cmd.getPackagePath());
        return project;
    }
}
