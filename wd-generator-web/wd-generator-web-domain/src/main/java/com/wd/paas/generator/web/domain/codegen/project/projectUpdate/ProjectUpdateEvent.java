package com.wd.paas.generator.web.domain.codegen.project.projectUpdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 更新项目信息-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProjectUpdateEvent extends BaseDomainEvent {

    /** 项目id */
    private Long id;

    /** 所属用户 */
    private Long userId;

    /** 项目名 */
    private String projectName;

    /** 包路径 */
    private String packagePath;

    /** 项目版本号 */
    private String projectVersion;

    /** 项目描述 */
    private String projectDesc;

    /** 项目作者 */
    private String projectAuthor;

    public ProjectUpdateEvent(ProjectUpdateCmd cmd
    ) {
        this.id = cmd.getId();
        this.userId = cmd.getUserId();
        this.projectName = cmd.getProjectName();
        this.packagePath = cmd.getPackagePath();
        this.projectVersion = cmd.getProjectVersion();
        this.projectDesc = cmd.getProjectDesc();
        this.projectAuthor = cmd.getProjectAuthor();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.project.projectUpdate}";
    }

}
