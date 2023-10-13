package com.wakedt.visual.domain.domaindesign.domaindesignversion;

/**
 * 业务域版本-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
public interface DomainDesignVersionRepository {

    /**
     * 存储
     *
     * @param domainDesignVersion 业务域版本
     * @return DomainDesignVersion
     */
    DomainDesignVersion save(DomainDesignVersion domainDesignVersion);

    /**
     * 更新
     *
     * @param domainDesignVersion 业务域版本
     * @return DomainDesignVersion
     */
    DomainDesignVersion update(DomainDesignVersion domainDesignVersion);

    /**
     * 删除
     *
     * @param domainDesignVersion 业务域版本
     */
    void remove(DomainDesignVersion domainDesignVersion);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return DomainDesignVersion
     */
    DomainDesignVersion find(Long id);

}
