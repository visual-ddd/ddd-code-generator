package com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignmodify;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.*;

/**
 * 编辑业务域-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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