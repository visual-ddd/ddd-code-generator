package com.wd.paas.generator.web.domain.codegen.domainchart.chartUpdate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 更新云端图谱文件-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ChartUpdateCmdHandler {

    @Resource
    private DomainChartRepository repository;

    public void handle(ChartUpdateCmd cmd) {

        DomainEventPublisher.getInstance()
            .postAfterCommit(new ChartUpdateEvent(cmd));
    }
}