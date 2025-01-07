package com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesigncreate.DomainDesignCreateCmd;

/**
 * 业务域-聚合根-工厂
 *
 * @author visual-ddd
 * @since 1.0
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
