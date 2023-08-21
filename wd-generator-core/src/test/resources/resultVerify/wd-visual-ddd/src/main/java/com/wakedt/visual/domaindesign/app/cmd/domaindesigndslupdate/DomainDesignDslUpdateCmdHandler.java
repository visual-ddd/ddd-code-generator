package com.wakedt.visual.domaindesign.app.cmd.domaindesigndslupdate;

import com.wakedt.visual.domaindesign.domain.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.DomainDesignVersionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 更新业务域DSL-指令处理器
 */
@Component
public class DomainDesignDslUpdateCmdHandler {

    @Resource
    private DomainDesignVersionRepository repository;

    public void handle(DomainDesignDslUpdateCmd updateCmd) {
        DomainDesignVersion domainDesignVersion = repository.find(updateCmd.getId());
        domainDesignVersion.domainDesignDslUpdate(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(domainDesignVersion);
    }
}