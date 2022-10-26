package com.wd.paas.generator.web.domain.codegen.domainchart.ChartXmlUpdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 更新图谱云文件-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChartXmlUpdateEvent extends BaseDomainEvent {

    /** 领域图谱id */
    private Long id;

    /** 图谱xml文件内容 */
    private String chartXml;

    public ChartXmlUpdateEvent(ChartXmlUpdateCmd cmd
    ) {
        this.id = cmd.getId();
        this.chartXml = cmd.getChartXml();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.domainchart.ChartXmlUpdate}";
    }

}
