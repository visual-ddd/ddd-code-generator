package com.wakedt.visual.domain.universallanguage.universallanguage;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.universallanguage.universallanguage.create.UniversalLanguageCreateCmd;

/**
 * 统一语言-聚合根-工厂
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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
