package com.wakedt.visual.domain.universallanguage.universallanguage;

import com.wakedt.visual.domain.universallanguage.universallanguage.modify.UniversalLanguageModifyCmd;
import com.wakedt.visual.domain.universallanguage.universallanguage.remove.UniversalLanguageRemoveCmd;

/**
 * 统一语言-聚合根能力
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