package com.wakedt.visual.universallanguage.domain.universallanguage;

import com.wakedt.visual.universallanguage.app.cmd.modify.UniversalLanguageModifyCmd;
import com.wakedt.visual.universallanguage.app.cmd.remove.UniversalLanguageRemoveCmd;
import lombok.Data;

/**
 * 统一语言-聚合根
 */
@Data
public class UniversalLanguage {

    /** 统一语言 ID */
    private Long id;

    /** 概念 */
    private String conception;

    /** 英文名 */
    private String englishName;

    /** 定义 */
    private String definition;

    /** 统一语言类型 */
    private LanguageType languageType;

    /** 约束 */
    private String restraint;

    /** 举例 */
    private String example;

    /** 所属唯一标识 */
    private Long identity;

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