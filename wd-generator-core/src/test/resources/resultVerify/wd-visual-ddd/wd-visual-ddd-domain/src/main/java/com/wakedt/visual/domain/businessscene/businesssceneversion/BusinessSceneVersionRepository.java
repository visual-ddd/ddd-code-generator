package com.wakedt.visual.domain.businessscene.businesssceneversion;

/**
 * 描述业务场景版本信息-聚合根-仓储接口
 */
public interface BusinessSceneVersionRepository {

    BusinessSceneVersion save(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion update(BusinessSceneVersion businessSceneVersion);

    void remove(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion find(Long id);

}
