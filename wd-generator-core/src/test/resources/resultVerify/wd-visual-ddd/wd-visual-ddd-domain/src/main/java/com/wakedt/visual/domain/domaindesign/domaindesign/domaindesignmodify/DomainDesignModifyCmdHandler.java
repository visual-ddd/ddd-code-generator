package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify;

import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesign;
import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesignRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 编辑业务域-指令处理器
 */
@Component
public class DomainDesignModifyCmdHandler {

    @Resource
    private DomainDesignRepository repository;

    public void handle(DomainDesignModifyCmd updateCmd) {
        DomainDesign domainDesign = repository.find(updateCmd.getId());
        domainDesign.domainDesignModify(updateCmd);

        repository.update(domainDesign);

       // DomainEventPublisher.getInstance().postAfterCommit(new DomainDesignModifyEvent(updateCmd));
    }
}