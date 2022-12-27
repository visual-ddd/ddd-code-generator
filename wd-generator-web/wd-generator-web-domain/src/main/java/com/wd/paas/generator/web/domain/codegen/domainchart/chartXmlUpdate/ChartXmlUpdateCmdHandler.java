package com.wd.paas.generator.web.domain.codegen.domainchart.chartXmlUpdate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartFactory;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import com.wd.paas.generator.web.domain.codegen.domainchart.chartXmlUpdate.ChartXmlUpdateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate.DomainChartCreateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate.DomainChartCreateEvent;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 更新图谱云文件-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ChartXmlUpdateCmdHandler {

    @Resource
    private DomainChartRepository repository;

    public void handle(ChartXmlUpdateCmd cmd) {
        DomainChart domainChart = repository.selectDomainChartById(cmd.getId());
        domainChart.setChartXml(cmd.getChartXml());
        repository.updateChartXml(domainChart);

        DomainEventPublisher.getInstance()
            .postAfterCommit(new ChartXmlUpdateEvent(cmd));
    }
}