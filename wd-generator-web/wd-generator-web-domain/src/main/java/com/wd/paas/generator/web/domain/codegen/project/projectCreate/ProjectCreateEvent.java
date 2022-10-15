package com.wd.paas.generator.web.domain.codegen.project.projectCreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 新增项目信息-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProjectCreateEvent extends BaseDomainEvent {

    /** 项目id */
    private Long id;

    /** 所属用户 */
    private Long userId;

    /** 项目名 */
    private String projectName;

    /** 项目描述 */
    private String projectDesc;

    /** 包路径 */
    private String packagePath;

    /** 项目版本号 */
    private String projectVersion;

    /** 项目作者 */
    private String projectAuthor;

    public ProjectCreateEvent(ProjectCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.userId = cmd.getUserId();
        this.projectName = cmd.getProjectName();
        this.projectDesc = cmd.getProjectDesc();
        this.packagePath = cmd.getPackagePath();
        this.projectVersion = cmd.getProjectVersion();
        this.projectAuthor = cmd.getProjectAuthor();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.project.projectCreate}";
    }

}
