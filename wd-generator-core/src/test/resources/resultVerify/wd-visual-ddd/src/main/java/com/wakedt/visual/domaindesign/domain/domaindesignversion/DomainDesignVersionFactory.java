package com.wakedt.visual.domaindesign.domain.domaindesignversion;

import com.wakedt.visual.domaindesign.app.cmd.domaindesignversioncreate.DomainDesignVersionCreateCmd;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionfork.DomainDesignVersionForkCmd;
import org.springframework.stereotype.Component;

/**
 * 业务域版本-聚合根-工厂
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
