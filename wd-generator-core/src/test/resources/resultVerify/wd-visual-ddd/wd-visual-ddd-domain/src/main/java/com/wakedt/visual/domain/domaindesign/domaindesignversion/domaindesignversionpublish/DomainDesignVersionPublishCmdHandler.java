package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 发布业务域版本-指令处理器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Component
public class DomainDesignVersionPublishCmdHandler {

    @Resource
    private DomainDesignVersionRepository repository;

    public void handle(DomainDesignVersionPublishCmd updateCmd) {
        DomainDesignVersion domainDesignVersion = repository.find(updateCmd.getId());
        domainDesignVersion.domainDesignVersionPublish(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(domainDesignVersion);

    }
}