package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove;

import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesign;
import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesignRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 删除业务域-指令处理器
 */
@Component
public class DomainDesignRemoveCmdHandler {

    @Resource
    private DomainDesignRepository repository;

    public void handle(DomainDesignRemoveCmd removeCmd) {
        DomainDesign domainDesign = repository.find(removeCmd.getId());
        domainDesign.domainDesignRemove(removeCmd);

        repository.remove(domainDesign);

       // DomainEventPublisher.getInstance().postAfterCommit(new DomainDesignRemoveEvent(removeCmd));
    }
}