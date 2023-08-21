package com.wakedt.visual.organization.domain.organization;

/**
 * 组织-聚合根-仓储接口
 */
public interface OrganizationRepository {

    Organization save(Organization organization);

    Organization update(Organization organization);

    void remove(Organization organization);

    Organization find(Long id);

}
