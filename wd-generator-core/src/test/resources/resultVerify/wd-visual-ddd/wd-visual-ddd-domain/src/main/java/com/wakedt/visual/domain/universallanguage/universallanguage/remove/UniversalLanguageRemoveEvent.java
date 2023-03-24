package com.wakedt.visual.domain.universallanguage.universallanguage.remove;

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
public class UniversalLanguageRemoveEvent extends BaseDomainEvent {
    
    /** 统一语言 ID */
    private Long id;
    
    public UniversalLanguageRemoveEvent() {}

    public UniversalLanguageRemoveEvent(UniversalLanguageRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
