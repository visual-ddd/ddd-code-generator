package com.wakedt.visual.domain.application.applicationversion.applicationversionpublish;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 发布应用版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class ApplicationVersionPublishCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;

    public void handle(ApplicationVersionPublishCmd updateCmd) {
        ApplicationVersion applicationVersion = repository.find(updateCmd.getId());
        applicationVersion.applicationVersionPublish(updateCmd);

        /* TODO CheckDependencyPublished(关联依赖已发布) 检查关联的业务场景、业务域是否发布 */

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(applicationVersion);

    }
}