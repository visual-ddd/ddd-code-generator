package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartFactory;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 创建领域图谱-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class DomainChartCreateCmdHandler {

    @Resource
    private DomainChartRepository repository;
    @Resource
    private DomainChartFactory factory;

    public void handle(DomainChartCreateCmd cmd) {
        Long id = repository.insertDomainChart(factory.getInstance(cmd));

//        DomainEventPublisher.getInstance().postAfterCommit(new DomainChartCreateEvent(cmd, id));
    }
}