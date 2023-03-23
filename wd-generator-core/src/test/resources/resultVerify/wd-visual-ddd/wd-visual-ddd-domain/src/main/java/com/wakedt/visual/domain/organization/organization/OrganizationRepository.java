package com.wakedt.visual.domain.organization.organization;

/**
 * 组织结构管理的领域-聚合根-仓储接口
 */
public interface OrganizationRepository {

    Organization save(Organization organization);

    Organization update(Organization organization);

    void remove(Organization organization);

    Organization find(Long id);

}
