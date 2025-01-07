package com.wakedt.visual.bizdomain.organization.domain.organization;

/**
 * 组织-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface OrganizationRepository {

    Organization save(Organization organization);

    Organization update(Organization organization);

    void remove(Organization organization);

    Organization find(Long id);

}
