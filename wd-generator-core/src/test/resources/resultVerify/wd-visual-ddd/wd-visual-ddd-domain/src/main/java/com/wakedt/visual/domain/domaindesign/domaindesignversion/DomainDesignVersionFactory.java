package com.wakedt.visual.domain.domaindesign.domaindesignversion;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversioncreate.DomainDesignVersionCreateCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork.DomainDesignVersionForkCmd;

/**
 * 业务域版本-聚合根-工厂
 *
 * @author shimmer
 * @since 1.0
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
