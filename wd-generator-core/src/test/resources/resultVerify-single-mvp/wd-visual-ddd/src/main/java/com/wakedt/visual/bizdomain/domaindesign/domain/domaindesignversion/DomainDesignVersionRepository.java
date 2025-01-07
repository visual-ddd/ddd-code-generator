package com.wakedt.visual.bizdomain.domaindesign.domain.domaindesignversion;

/**
 * 业务域版本-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface DomainDesignVersionRepository {

    DomainDesignVersion save(DomainDesignVersion domainDesignVersion);

    DomainDesignVersion update(DomainDesignVersion domainDesignVersion);

    void remove(DomainDesignVersion domainDesignVersion);

    DomainDesignVersion find(Long id);

}
