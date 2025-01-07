package com.wakedt.visual.bizdomain.application.domain.application;

/**
 * 应用-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface ApplicationRepository {

    Application save(Application application);

    Application update(Application application);

    void remove(Application application);

    Application find(Long id);

}
