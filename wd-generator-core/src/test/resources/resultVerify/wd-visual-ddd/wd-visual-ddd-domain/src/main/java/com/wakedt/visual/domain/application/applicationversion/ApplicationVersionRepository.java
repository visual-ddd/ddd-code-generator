package com.wakedt.visual.domain.application.applicationversion;

/**
 * 应用版本-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public interface ApplicationVersionRepository {

    /**
     * 存储
     *
     * @param applicationVersion 应用版本
     * @return ApplicationVersion
     */
    ApplicationVersion save(ApplicationVersion applicationVersion);

    /**
     * 更新
     *
     * @param applicationVersion 应用版本
     * @return ApplicationVersion
     */
    ApplicationVersion update(ApplicationVersion applicationVersion);

    /**
     * 删除
     *
     * @param applicationVersion 应用版本
     */
    void remove(ApplicationVersion applicationVersion);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return ApplicationVersion
     */
    ApplicationVersion find(Long id);

}
