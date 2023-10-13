package com.wakedt.visual.domain.universallanguage.universallanguage;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.universallanguage.universallanguage.modify.UniversalLanguageModifyCmd;
import com.wakedt.visual.domain.universallanguage.universallanguage.remove.UniversalLanguageRemoveCmd;

/**
 * 统一语言-聚合根能力
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public class UniversalLanguage extends AbstractUniversalLanguage {

    public void modify(UniversalLanguageModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setConception(updateCmd.getConception());
        this.setEnglishName(updateCmd.getEnglishName());
        this.setDefinition(updateCmd.getDefinition());
        this.setRestraint(updateCmd.getRestraint());
        this.setExample(updateCmd.getExample());
        this.setIdentity(updateCmd.getIdentity());
    }

    public void remove(UniversalLanguageRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }
}