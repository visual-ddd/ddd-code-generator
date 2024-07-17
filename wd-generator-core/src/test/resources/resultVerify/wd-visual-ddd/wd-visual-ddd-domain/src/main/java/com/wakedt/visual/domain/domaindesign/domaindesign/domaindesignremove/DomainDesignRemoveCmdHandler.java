package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 删除业务域-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignRemoveCmdHandler {

    @Resource
    private DomainDesignRepository repository;

    public void handle(DomainDesignRemoveCmd removeCmd) {
        log.info("删除业务域-指令处理器:{}", removeCmd);

        DomainDesign domainDesign = repository.find(removeCmd.getId());
        domainDesign.domainDesignRemove(removeCmd);

        repository.remove(domainDesign);

    }
}