package com.wakedt.visual.domain.domaindesign.domaindesign;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesigncreate.DomainDesignCreateCmd;

/**
 * 业务域-聚合根-工厂
 */
@Component
public class DomainDesignFactory {

    public DomainDesign getInstance(DomainDesignCreateCmd createCmd) {
        DomainDesign instance = new DomainDesign();
        instance.setName(createCmd.getName());
        instance.setTeamId(createCmd.getTeamId());
        instance.setIdentity(createCmd.getIdentity());
        instance.setDescription(createCmd.getDescription());
        /* TODO 指令字段不匹配 createCmd.getStartVersion(); */
        return instance;
    }

}
