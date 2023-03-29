package com.wakedt.visual.domain.application.applicationversion;

/**
 * 描述应用版本信息-聚合根-仓储接口
 */
public interface ApplicationVersionRepository {

    ApplicationVersion save(ApplicationVersion applicationVersion);

    ApplicationVersion update(ApplicationVersion applicationVersion);

    void remove(ApplicationVersion applicationVersion);

    ApplicationVersion find(Long id);

}
