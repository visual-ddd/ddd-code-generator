package com.wd.paas.generator.web.domain.codegen.domainchart.codeGenerate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 生成代码-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CodeGenerateEvent extends BaseDomainEvent {

    /** 项目id */
    private Long projectId;

    /** 需要生成的领域图谱ID */
    private List<Long> domainChartIdList;

    public CodeGenerateEvent(CodeGenerateCmd cmd
    ) {
        this.projectId = cmd.getProjectId();
        this.domainChartIdList = cmd.getDomainChartIdList();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.domainchart.codeGenerate}";
    }

}
