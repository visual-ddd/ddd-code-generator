package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 发布业务域版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignVersionPublishCmdHandler {

    @Resource
    private DomainDesignVersionRepository repository;

    public void handle(DomainDesignVersionPublishCmd updateCmd) {
        log.info("发布业务域版本-指令处理器:{}", updateCmd);

        DomainDesignVersion domainDesignVersion = repository.find(updateCmd.getId());
        domainDesignVersion.domainDesignVersionPublish(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(domainDesignVersion);

    }
}