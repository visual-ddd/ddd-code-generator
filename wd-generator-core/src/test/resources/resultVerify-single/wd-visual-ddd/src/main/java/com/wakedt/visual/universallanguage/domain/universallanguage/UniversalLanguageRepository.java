package com.wakedt.visual.universallanguage.domain.universallanguage;

/**
 * 统一语言-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public interface UniversalLanguageRepository {

    UniversalLanguage save(UniversalLanguage universalLanguage);

    UniversalLanguage update(UniversalLanguage universalLanguage);

    void remove(UniversalLanguage universalLanguage);

    UniversalLanguage find(Long id);

}
