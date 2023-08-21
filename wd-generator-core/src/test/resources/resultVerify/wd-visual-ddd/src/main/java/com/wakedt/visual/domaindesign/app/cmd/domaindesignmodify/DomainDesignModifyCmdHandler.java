package com.wakedt.visual.domaindesign.app.cmd.domaindesignmodify;

import com.wakedt.visual.domaindesign.domain.domaindesign.DomainDesign;
import com.wakedt.visual.domaindesign.domain.domaindesign.DomainDesignRepository;
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
    }
}