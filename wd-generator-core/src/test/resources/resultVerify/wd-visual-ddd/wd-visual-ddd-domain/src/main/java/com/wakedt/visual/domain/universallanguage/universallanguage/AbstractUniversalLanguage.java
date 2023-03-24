package com.wakedt.visual.domain.universallanguage.universallanguage;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 维护系统中统一语言的领域-聚合根
 */
@Data
public abstract class AbstractUniversalLanguage {

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

    /** 所属唯一标识(组织/团队的主键id) */
    private Long identity;

}