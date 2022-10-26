package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 删除领域图及云端文件-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainChartRemoveEvent extends BaseDomainEvent {

    /** 领域图谱id */
    private Long id;

    public DomainChartRemoveEvent(DomainChartRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.domainchart.domainChartRemove}";
    }

}
