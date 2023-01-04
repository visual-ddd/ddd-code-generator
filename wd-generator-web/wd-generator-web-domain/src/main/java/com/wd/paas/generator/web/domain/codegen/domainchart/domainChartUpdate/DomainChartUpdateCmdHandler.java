package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 更新领域图谱-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class DomainChartUpdateCmdHandler {

    @Resource
    private DomainChartRepository repository;

    public void handle(DomainChartUpdateCmd cmd) {
        DomainChart domainChart = repository.selectDomainChartById(cmd.getId());
        domainChart.modify(cmd);
        repository.updateDomainChart(domainChart);

//        DomainEventPublisher.getInstance().postAfterCommit(new DomainChartUpdateEvent(cmd));
    }
}