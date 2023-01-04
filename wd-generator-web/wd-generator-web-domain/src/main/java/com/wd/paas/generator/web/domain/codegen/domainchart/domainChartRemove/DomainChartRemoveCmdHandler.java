package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 删除领域图及云端文件-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class DomainChartRemoveCmdHandler {

    @Resource
    private DomainChartRepository repository;

    public void handle(DomainChartRemoveCmd cmd) {
        repository.deleteDomainChartById(cmd.getId());

//        DomainEventPublisher.getInstance().postAfterCommit(new DomainChartRemoveEvent(cmd));
    }
}