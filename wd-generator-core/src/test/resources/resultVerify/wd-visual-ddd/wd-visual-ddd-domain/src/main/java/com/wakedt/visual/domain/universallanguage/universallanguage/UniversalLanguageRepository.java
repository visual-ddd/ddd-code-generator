package com.wakedt.visual.domain.universallanguage.universallanguage;

/**
 * 维护系统中统一语言的领域-聚合根-仓储接口
 */
public interface UniversalLanguageRepository {

    UniversalLanguage save(UniversalLanguage universalLanguage);

    UniversalLanguage update(UniversalLanguage universalLanguage);

    void remove(UniversalLanguage universalLanguage);

    UniversalLanguage find(Long id);

}
