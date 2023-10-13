package com.wakedt.visual.domain.domaindesign.domaindesign;

/**
 * 业务域-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public interface DomainDesignRepository {

    /**
     * 存储
     *
     * @param domainDesign 业务域
     * @return DomainDesign
     */
    DomainDesign save(DomainDesign domainDesign);

    /**
     * 更新
     *
     * @param domainDesign 业务域
     * @return DomainDesign
     */
    DomainDesign update(DomainDesign domainDesign);

    /**
     * 删除
     *
     * @param domainDesign 业务域
     */
    void remove(DomainDesign domainDesign);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return DomainDesign
     */
    DomainDesign find(Long id);

}
