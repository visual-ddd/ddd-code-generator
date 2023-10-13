package com.wakedt.visual.businessscene.domain.businesssceneversion;

/**
 * 业务场景版本-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
public interface BusinessSceneVersionRepository {

    BusinessSceneVersion save(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion update(BusinessSceneVersion businessSceneVersion);

    void remove(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion find(Long id);

}
