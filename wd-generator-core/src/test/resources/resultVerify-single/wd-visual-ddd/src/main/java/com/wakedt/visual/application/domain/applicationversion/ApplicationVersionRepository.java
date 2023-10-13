package com.wakedt.visual.application.domain.applicationversion;

/**
 * 应用版本-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public interface ApplicationVersionRepository {

    ApplicationVersion save(ApplicationVersion applicationVersion);

    ApplicationVersion update(ApplicationVersion applicationVersion);

    void remove(ApplicationVersion applicationVersion);

    ApplicationVersion find(Long id);

}
