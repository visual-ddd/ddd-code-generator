package com.wakedt.visual.domain.businessscene.businessscene;

/**
 * 业务场景-聚合根-仓储接口
 */
public interface BusinessSceneRepository {

    BusinessScene save(BusinessScene businessScene);

    BusinessScene update(BusinessScene businessScene);

    void remove(BusinessScene businessScene);

    BusinessScene find(Long id);

}
