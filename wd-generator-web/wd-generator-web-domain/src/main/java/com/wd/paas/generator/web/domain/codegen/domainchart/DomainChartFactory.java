package com.wd.paas.generator.web.domain.codegen.domainchart;

import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate.DomainChartCreateCmd;
import org.springframework.stereotype.Component;

/**
 * 领域图谱-聚合根-工厂
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class DomainChartFactory {

    public DomainChart getInstance(DomainChartCreateCmd cmd) {
        DomainChart domainChart = new DomainChart();
        domainChart.setProjectId(cmd.getProjectId());
        domainChart.setDomainName(cmd.getDomainName());
        domainChart.setDomainDesc(cmd.getDomainDesc());
        domainChart.setChartXmlUrl(cmd.getChartXmlUrl());
        domainChart.setDomainAuthor(cmd.getDomainAuthor());
        return domainChart;
    }
}
