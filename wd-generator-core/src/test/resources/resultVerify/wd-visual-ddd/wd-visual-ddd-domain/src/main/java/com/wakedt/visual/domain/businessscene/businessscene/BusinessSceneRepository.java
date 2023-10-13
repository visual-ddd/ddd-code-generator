package com.wakedt.visual.domain.businessscene.businessscene;

/**
 * 业务场景-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public interface BusinessSceneRepository {

    /**
     * 存储
     *
     * @param businessScene 业务场景
     * @return BusinessScene
     */
    BusinessScene save(BusinessScene businessScene);

    /**
     * 更新
     *
     * @param businessScene 业务场景
     * @return BusinessScene
     */
    BusinessScene update(BusinessScene businessScene);

    /**
     * 删除
     *
     * @param businessScene 业务场景
     */
    void remove(BusinessScene businessScene);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return BusinessScene
     */
    BusinessScene find(Long id);

}
