package com.wakedt.visual.domain.businessscene.businesssceneversion;

/**
 * 业务场景版本-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public interface BusinessSceneVersionRepository {

    /**
     * 存储
     *
     * @param businessSceneVersion 业务场景版本
     * @return BusinessSceneVersion
     */
    BusinessSceneVersion save(BusinessSceneVersion businessSceneVersion);

    /**
     * 更新
     *
     * @param businessSceneVersion 业务场景版本
     * @return BusinessSceneVersion
     */
    BusinessSceneVersion update(BusinessSceneVersion businessSceneVersion);

    /**
     * 删除
     *
     * @param businessSceneVersion 业务场景版本
     */
    void remove(BusinessSceneVersion businessSceneVersion);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return BusinessSceneVersion
     */
    BusinessSceneVersion find(Long id);

}
