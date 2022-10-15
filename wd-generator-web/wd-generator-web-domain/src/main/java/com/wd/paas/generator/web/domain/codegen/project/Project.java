package com.wd.paas.generator.web.domain.codegen.project;

import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.domain.codegen.project.projectUpdate.ProjectUpdateCmd;
import java.util.List;

/**
 * 项目-聚合根-能力
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
public class Project extends AbstractProject {

     /** 过滤领域图谱信息 */
    @Override
    public List<DomainChart> filterDomainChartList(List<Long> domainIds){
        // Do Something
        return null;
    }

    public void modify(ProjectUpdateCmd cmd) {
        this.setUserId(cmd.getUserId());
        this.setProjectName(cmd.getProjectName());
        this.setProjectDesc(cmd.getProjectDesc());
        this.setProjectVersion(cmd.getProjectVersion());
        this.setProjectAuthor(cmd.getProjectAuthor());
        this.setPackagePath(cmd.getPackagePath());
    }
}