package com.wakedt.visual.application.domain.applicationversion;

/**
 * 应用版本-聚合根-仓储接口
 */
public interface ApplicationVersionRepository {

    ApplicationVersion save(ApplicationVersion applicationVersion);

    ApplicationVersion update(ApplicationVersion applicationVersion);

    void remove(ApplicationVersion applicationVersion);

    ApplicationVersion find(Long id);

}
