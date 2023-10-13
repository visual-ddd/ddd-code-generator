package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 删除业务域-指令处理器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Component
public class DomainDesignRemoveCmdHandler {

    @Resource
    private DomainDesignRepository repository;

    public void handle(DomainDesignRemoveCmd removeCmd) {
        DomainDesign domainDesign = repository.find(removeCmd.getId());
        domainDesign.domainDesignRemove(removeCmd);

        repository.remove(domainDesign);

    }
}