package com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion;

/**
 * 业务场景版本-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface BusinessSceneVersionRepository {

    BusinessSceneVersion save(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion update(BusinessSceneVersion businessSceneVersion);

    void remove(BusinessSceneVersion businessSceneVersion);

    BusinessSceneVersion find(Long id);

}
