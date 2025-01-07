package com.wakedt.visual.bizdomain.businessscene.domain.businessscene;

/**
 * 业务场景-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface BusinessSceneRepository {

    BusinessScene save(BusinessScene businessScene);

    BusinessScene update(BusinessScene businessScene);

    void remove(BusinessScene businessScene);

    BusinessScene find(Long id);

}
