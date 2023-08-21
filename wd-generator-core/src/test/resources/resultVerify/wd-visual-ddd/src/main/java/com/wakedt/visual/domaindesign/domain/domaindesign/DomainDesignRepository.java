package com.wakedt.visual.domaindesign.domain.domaindesign;

/**
 * 业务域-聚合根-仓储接口
 */
public interface DomainDesignRepository {

    DomainDesign save(DomainDesign domainDesign);

    DomainDesign update(DomainDesign domainDesign);

    void remove(DomainDesign domainDesign);

    DomainDesign find(Long id);

}
