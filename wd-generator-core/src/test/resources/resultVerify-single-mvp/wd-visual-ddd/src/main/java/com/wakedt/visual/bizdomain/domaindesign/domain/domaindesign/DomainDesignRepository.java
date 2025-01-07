package com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign;

/**
 * 业务域-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface DomainDesignRepository {

    DomainDesign save(DomainDesign domainDesign);

    DomainDesign update(DomainDesign domainDesign);

    void remove(DomainDesign domainDesign);

    DomainDesign find(Long id);

}
