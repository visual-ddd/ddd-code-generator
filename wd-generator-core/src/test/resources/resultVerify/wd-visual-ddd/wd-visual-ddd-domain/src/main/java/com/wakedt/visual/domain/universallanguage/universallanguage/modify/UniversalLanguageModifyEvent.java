package com.wakedt.visual.domain.universallanguage.universallanguage.modify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.universallanguage.universallanguage.*;

/**
 * 编辑统一语言-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UniversalLanguageModifyEvent extends BaseDomainEvent {
    
    /** 统一语言 ID */
    private Long id;

    /** 概念 */
    private String conception;

    /** 英文名 */
    private String englishName;

    /** 定义 */
    private String definition;

    /** 约束 */
    private String restraint;

    /** 举例 */
    private String example;

    /** 所属唯一标识(组织/团队的主键id) */
    private Long identity;
    
    public UniversalLanguageModifyEvent() {}

    public UniversalLanguageModifyEvent(UniversalLanguageModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.conception = cmd.getConception();
        this.englishName = cmd.getEnglishName();
        this.definition = cmd.getDefinition();
        this.restraint = cmd.getRestraint();
        this.example = cmd.getExample();
        this.identity = cmd.getIdentity();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
