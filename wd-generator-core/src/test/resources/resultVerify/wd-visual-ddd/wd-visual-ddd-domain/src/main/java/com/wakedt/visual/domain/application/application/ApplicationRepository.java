package com.wakedt.visual.domain.application.application;

/**
 * 维护应用及版本的领域-聚合根-仓储接口
 */
public interface ApplicationRepository {

    Application save(Application application);

    Application update(Application application);

    void remove(Application application);

    Application find(Long id);

}
