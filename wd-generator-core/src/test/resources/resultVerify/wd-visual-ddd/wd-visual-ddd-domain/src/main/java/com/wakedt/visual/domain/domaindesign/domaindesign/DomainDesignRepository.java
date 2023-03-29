package com.wakedt.visual.domain.domaindesign.domaindesign;

/**
 * 维护业务域及版本的领域-聚合根-仓储接口
 */
public interface DomainDesignRepository {

    DomainDesign save(DomainDesign domainDesign);

    DomainDesign update(DomainDesign domainDesign);

    void remove(DomainDesign domainDesign);

    DomainDesign find(Long id);

}
