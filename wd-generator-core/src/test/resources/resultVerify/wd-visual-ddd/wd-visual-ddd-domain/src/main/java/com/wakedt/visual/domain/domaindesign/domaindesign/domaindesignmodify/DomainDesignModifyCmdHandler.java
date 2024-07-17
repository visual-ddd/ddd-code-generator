package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 编辑业务域-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignModifyCmdHandler {

    @Resource
    private DomainDesignRepository repository;

    public void handle(DomainDesignModifyCmd updateCmd) {
        log.info("编辑业务域-指令处理器:{}", updateCmd);

        DomainDesign domainDesign = repository.find(updateCmd.getId());
        domainDesign.domainDesignModify(updateCmd);

        repository.update(domainDesign);

    }
}