package com.wakedt.visual.organization.domain.organization;

/**
 * 组织-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
public interface OrganizationRepository {

    Organization save(Organization organization);

    Organization update(Organization organization);

    void remove(Organization organization);

    Organization find(Long id);

}
