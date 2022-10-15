package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 更新领域图谱-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainChartUpdateEvent extends BaseDomainEvent {

    /** 项目id */
    private Long projectId;

    /** 领域图谱id */
    private Long id;

    /** 领域作者 */
    private String domainAuthor;

    /** 领域名 */
    private String domainName;

    /** 领域描述 */
    private String domainDesc;

    /** 图谱xml存储URL地址 */
    private String chartXmlUrl;

    public DomainChartUpdateEvent(DomainChartUpdateCmd cmd
    ) {
        this.projectId = cmd.getProjectId();
        this.id = cmd.getId();
        this.domainAuthor = cmd.getDomainAuthor();
        this.domainName = cmd.getDomainName();
        this.domainDesc = cmd.getDomainDesc();
        this.chartXmlUrl = cmd.getChartXmlUrl();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.domainchart.domainChartUpdate}";
    }

}
