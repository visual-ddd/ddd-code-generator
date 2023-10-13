package com.wakedt.visual.domaindesign.domain.domaindesignversion;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversioncreate.DomainDesignVersionCreateCmd;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionfork.DomainDesignVersionForkCmd;

/**
 * 业务域版本-聚合根-工厂
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class DomainDesignVersionFactory {

    public DomainDesignVersion getInstance(DomainDesignVersionCreateCmd createCmd) {
        DomainDesignVersion instance = new DomainDesignVersion();
        instance.setDomainDesignId(createCmd.getDomainDesignId());
        instance.setStartVersion(createCmd.getStartVersion());
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        instance.setDescription(createCmd.getDescription());
        return instance;
    }

    public DomainDesignVersion getInstance(DomainDesignVersionForkCmd createCmd) {
        DomainDesignVersion instance = new DomainDesignVersion();
        /* TODO 指令字段不匹配 createCmd.getStartVersionId(); */
        instance.setCurrentVersion(createCmd.getCurrentVersion());
        instance.setDescription(createCmd.getDescription());
        return instance;
    }

}
