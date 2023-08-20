package com.wakedt.visual.domain.domaindesign.domaindesignversion;

/**
 * 业务域版本-聚合根-仓储接口
 */
public interface DomainDesignVersionRepository {

    DomainDesignVersion save(DomainDesignVersion domainDesignVersion);

    DomainDesignVersion update(DomainDesignVersion domainDesignVersion);

    void remove(DomainDesignVersion domainDesignVersion);

    DomainDesignVersion find(Long id);

}
