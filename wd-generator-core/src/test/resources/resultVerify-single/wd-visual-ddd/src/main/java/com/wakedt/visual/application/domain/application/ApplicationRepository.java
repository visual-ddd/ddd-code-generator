package com.wakedt.visual.application.domain.application;

/**
 * 应用-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public interface ApplicationRepository {

    Application save(Application application);

    Application update(Application application);

    void remove(Application application);

    Application find(Long id);

}
