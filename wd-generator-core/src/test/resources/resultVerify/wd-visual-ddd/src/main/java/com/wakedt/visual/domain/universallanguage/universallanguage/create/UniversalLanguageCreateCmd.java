package com.wakedt.visual.domain.universallanguage.universallanguage.create;

import com.wakedt.visual.domain.universallanguage.universallanguage.LanguageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增统一语言-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversalLanguageCreateCmd {

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

}