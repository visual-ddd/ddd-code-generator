package com.wd.paas.generator.web.domain.codegen.project.projectRemove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 删除项目及项目下的领域图谱-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProjectRemoveEvent extends BaseDomainEvent {

    /** 项目id */
    private Long id;

    public ProjectRemoveEvent(ProjectRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.project.projectRemove}";
    }

}
