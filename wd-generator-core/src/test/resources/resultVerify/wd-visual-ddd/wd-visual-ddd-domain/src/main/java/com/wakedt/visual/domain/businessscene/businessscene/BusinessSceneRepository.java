package com.wakedt.visual.domain.businessscene.businessscene;

/**
 * 维护业务场景及版本的领域-聚合根-仓储接口
 */
public interface BusinessSceneRepository {

    BusinessScene save(BusinessScene businessScene);

    BusinessScene update(BusinessScene businessScene);

    void remove(BusinessScene businessScene);

    BusinessScene find(Long id);

}
