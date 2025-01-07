package com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage;

/**
 * 统一语言-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface UniversalLanguageRepository {

    UniversalLanguage save(UniversalLanguage universalLanguage);

    UniversalLanguage update(UniversalLanguage universalLanguage);

    void remove(UniversalLanguage universalLanguage);

    UniversalLanguage find(Long id);

}
