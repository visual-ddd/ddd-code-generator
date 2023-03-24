package com.wakedt.visual.domain.universallanguage.universallanguage.create;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UniversalLanguageCreateEvent extends BaseDomainEvent {
    
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
    
    public UniversalLanguageCreateEvent() {}

    public UniversalLanguageCreateEvent(UniversalLanguageCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.conception = cmd.getConception();
        this.englishName = cmd.getEnglishName();
        this.definition = cmd.getDefinition();
        this.languageType = cmd.getLanguageType();
        this.restraint = cmd.getRestraint();
        this.example = cmd.getExample();
        this.identity = cmd.getIdentity();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
