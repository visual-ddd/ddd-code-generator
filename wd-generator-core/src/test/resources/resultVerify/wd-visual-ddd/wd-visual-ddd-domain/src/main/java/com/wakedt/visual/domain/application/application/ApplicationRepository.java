package com.wakedt.visual.domain.application.application;

/**
 * 应用-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
public interface ApplicationRepository {

    /**
     * 存储
     *
     * @param application 应用
     * @return Application
     */
    Application save(Application application);

    /**
     * 更新
     *
     * @param application 应用
     * @return Application
     */
    Application update(Application application);

    /**
     * 删除
     *
     * @param application 应用
     */
    void remove(Application application);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return Application
     */
    Application find(Long id);

}
