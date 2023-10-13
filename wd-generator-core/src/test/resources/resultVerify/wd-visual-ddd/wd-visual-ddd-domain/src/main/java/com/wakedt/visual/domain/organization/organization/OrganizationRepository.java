package com.wakedt.visual.domain.organization.organization;

/**
 * 组织-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public interface OrganizationRepository {

    /**
     * 存储
     *
     * @param organization 组织
     * @return Organization
     */
    Organization save(Organization organization);

    /**
     * 更新
     *
     * @param organization 组织
     * @return Organization
     */
    Organization update(Organization organization);

    /**
     * 删除
     *
     * @param organization 组织
     */
    void remove(Organization organization);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return Organization
     */
    Organization find(Long id);

}
