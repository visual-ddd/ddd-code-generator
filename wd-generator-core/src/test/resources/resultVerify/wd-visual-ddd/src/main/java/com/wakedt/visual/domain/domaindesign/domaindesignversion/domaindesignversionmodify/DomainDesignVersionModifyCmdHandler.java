package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify;

import com.wakedt.visual.domain.domaindesign.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.DomainDesignVersionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 编辑业务域版本-指令处理器
 */
@Component
public class DomainDesignVersionModifyCmdHandler {

    @Resource
    private DomainDesignVersionRepository repository;

    public void handle(DomainDesignVersionModifyCmd updateCmd) {
        DomainDesignVersion domainDesignVersion = repository.find(updateCmd.getId());
        domainDesignVersion.domainDesignVersionModify(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(domainDesignVersion);

       // DomainEventPublisher.getInstance().postAfterCommit(new DomainDesignVersionModifyEvent(updateCmd));
    }
}