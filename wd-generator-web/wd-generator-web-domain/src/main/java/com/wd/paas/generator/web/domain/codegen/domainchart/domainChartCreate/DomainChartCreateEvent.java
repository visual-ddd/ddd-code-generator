package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 创建领域图谱-指令事件
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainChartCreateEvent extends BaseDomainEvent {

    /** 主键id */
    private Long id;

    /** 项目id */
    private Long projectId;

    /** 领域作者 */
    private String domainAuthor;

    /** 图谱xml存储URL地址 */
    private String chartXmlUrl;

    /** 领域描述 */
    private String domainDesc;

    /** 领域名 */
    private String domainName;

    public DomainChartCreateEvent(DomainChartCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.projectId = cmd.getProjectId();
        this.domainAuthor = cmd.getDomainAuthor();
        this.chartXmlUrl = cmd.getChartXmlUrl();
        this.domainDesc = cmd.getDomainDesc();
        this.domainName = cmd.getDomainName();
    }

    @Override
    public String eventCode() {
        return "${event.wd-generator-web.codegen.domainchart.domainChartCreate}";
    }

}
