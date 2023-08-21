package com.wakedt.visual.universallanguage.domain.universallanguage;

import com.wakedt.visual.universallanguage.app.cmd.create.UniversalLanguageCreateCmd;
import org.springframework.stereotype.Component;

/**
 * 统一语言-聚合根-工厂
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
