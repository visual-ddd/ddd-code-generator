package com.wakedt.visual.bizdomain.application.domain.applicationversion;

/**
 * 应用版本-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface ApplicationVersionRepository {

    ApplicationVersion save(ApplicationVersion applicationVersion);

    ApplicationVersion update(ApplicationVersion applicationVersion);

    void remove(ApplicationVersion applicationVersion);

    ApplicationVersion find(Long id);

}
