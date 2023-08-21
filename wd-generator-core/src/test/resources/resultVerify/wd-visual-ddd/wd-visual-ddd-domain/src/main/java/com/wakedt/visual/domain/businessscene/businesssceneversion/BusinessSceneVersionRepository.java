package com.wakedt.visual.domain.businessscene.businesssceneversion;

/**
 * 业务场景版本-聚合根-仓储接口
 */
public interface BusinessSceneVersionRepository {

    BusinessSceneVersion save(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion update(BusinessSceneVersion businessSceneVersion);

    void remove(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion find(Long id);

}
