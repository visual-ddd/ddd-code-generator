package com.wd.paas.generator.web.domain.codegen.domainchart;

import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate.DomainChartUpdateCmd;

/**
 * 领域图谱-聚合根-能力
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
public class DomainChart extends AbstractDomainChart {

    public void modify(DomainChartUpdateCmd cmd) {
        this.setId(cmd.getId());
        this.setDomainName(cmd.getDomainName());
        this.setDomainDesc(cmd.getDomainDesc());
        this.setChartXmlUrl(cmd.getChartXmlUrl());
        this.setDomainAuthor(cmd.getDomainAuthor());
    }
}