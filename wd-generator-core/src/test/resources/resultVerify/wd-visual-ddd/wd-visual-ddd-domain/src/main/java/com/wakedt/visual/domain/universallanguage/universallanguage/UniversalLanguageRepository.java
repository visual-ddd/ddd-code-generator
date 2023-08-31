package com.wakedt.visual.domain.universallanguage.universallanguage;

/**
 * 统一语言-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0
 */
public interface UniversalLanguageRepository {

    /**
     * 存储
     *
     * @param universalLanguage 统一语言
     * @return UniversalLanguage
     */
    UniversalLanguage save(UniversalLanguage universalLanguage);

    /**
     * 更新
     *
     * @param universalLanguage 统一语言
     * @return UniversalLanguage
     */
    UniversalLanguage update(UniversalLanguage universalLanguage);

    /**
     * 删除
     *
     * @param universalLanguage 统一语言
     */
    void remove(UniversalLanguage universalLanguage);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return UniversalLanguage
     */
    UniversalLanguage find(Long id);

}
