package com.wakedt.visual.universallanguage.domain.universallanguage;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.universallanguage.app.cmd.create.UniversalLanguageCreateCmd;

/**
 * 统一语言-聚合根-工厂
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
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
