package com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignremove;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.*;

/**
 * 删除业务域-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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