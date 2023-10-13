package com.wakedt.visual.domaindesign.domain.domaindesignversion;

/**
 * 业务域版本-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public interface DomainDesignVersionRepository {

    DomainDesignVersion save(DomainDesignVersion domainDesignVersion);

    DomainDesignVersion update(DomainDesignVersion domainDesignVersion);

    void remove(DomainDesignVersion domainDesignVersion);

    DomainDesignVersion find(Long id);

}
