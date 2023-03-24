package com.wakedt.visual.domain.universallanguage.universallanguage;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.universallanguage.universallanguage.create.UniversalLanguageCreateCmd;

/**
 * 维护系统中统一语言的领域-聚合根-工厂
 */
@Component
public class UniversalLanguageFactory {

    public UniversalLanguage getInstance(UniversalLanguageCreateCmd createCmd) {
        UniversalLanguage instance = new UniversalLanguage();
        instance.setConception(createCmd.getConception());
        instance.setEnglishName(createCmd.getEnglishName());
        instance.setDefinition(createCmd.getDefinition());
        instance.setLanguageType(createCmd.getLanguageType());
        instance.setRestraint(createCmd.getRestraint());
        instance.setExample(createCmd.getExample());
        instance.setIdentity(createCmd.getIdentity());
        return instance;
    }

}
